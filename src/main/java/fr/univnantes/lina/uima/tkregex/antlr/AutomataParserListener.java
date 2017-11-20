/*******************************************************************************
 * Copyright 2015-2017 - CNRS (Centre National de Recherche Scientifique)
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 *******************************************************************************/
package fr.univnantes.lina.uima.tkregex.antlr;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import fr.univnantes.lina.uima.tkregex.TokensRegex;
import fr.univnantes.lina.uima.tkregex.ae.RegexList;
import fr.univnantes.lina.uima.tkregex.ae.builtin.StringExactlyMatcher;
import fr.univnantes.lina.uima.tkregex.ae.builtin.StringIgnoreCaseMatcher;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexListener;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.*;
import fr.univnantes.lina.uima.tkregex.model.automata.Automaton;
import fr.univnantes.lina.uima.tkregex.model.automata.AutomatonFactory;
import fr.univnantes.lina.uima.tkregex.model.automata.AutomatonQuantifier;
import fr.univnantes.lina.uima.tkregex.model.automata.Rule;
import fr.univnantes.lina.uima.tkregex.model.matchers.*;
import fr.univnantes.lina.uima.tkregex.util.Files;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.uima.UIMAException;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.TypeSystem;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.fit.factory.TypeSystemDescriptionFactory;
import org.apache.uima.resource.metadata.TypeDescription;
import org.apache.uima.resource.metadata.TypeSystemDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class AutomataParserListener implements UimaTokenRegexListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(AutomataParserListener.class);


	private Map<String, AnnotationMatcher> shortcutMatchers;
	private Map<String, CustomMatcher> declaredJavaMatchers = new ConcurrentHashMap<>();
	private Map<String, TypeMatcher> typeMatchers = new ConcurrentHashMap<>();


	private Map<String, TypeDescription> typesByShortcut = new LinkedHashMap<>();

	private Optional<String[]> coveredTextArray = Optional.empty();
	private Optional<Path> customResourceDir = Optional.empty();

	public static final String OPTION_INLINE = "inline";
	private TypeSystem typeSystem = null;

	private List<String> OPTION_NAMES = ImmutableList.of(
			OPTION_INLINE
			);
	private Map<String, String> options = Maps.newHashMap();;
	
	private List<Rule> rules;

	private Parser parser;
	

	private boolean allowMatchingEmptySequences = false;


	private boolean inlineAllowed = true;

	private boolean inRule = false;
	
	private TypeSystemDescription typeSystemDescription = null;

	private TypeDescription mainIteratedType = null;

	public Map<String, CustomMatcher> getJavaMatchers() {
		return declaredJavaMatchers;
	}
	
	public List<Rule> getRules() {
		return ImmutableList.copyOf(this.rules);
	}
	
	public Map<String, AnnotationMatcher> getShortcutMatchers() {
		return shortcutMatchers;
	}
	
	public TypeDescription getMainIteraredType() {
		return mainIteratedType;
	}

	public List<TypeDescription> getIteratedTypeDescriptions() {
		List<TypeDescription> list = new ArrayList<>();
		list.add(mainIteratedType);
		for(TypeDescription td: typesByShortcut.values()) {
			if(td.getName().equals(mainIteratedType.getName()))
				continue;
			list.add(td);
		}
		return list;
	}

	public List<Type> getIteratedTypes() {
		return getIteratedTypeDescriptions().stream().map(this::toType).collect(toList());
	}



	public Map<String, TypeDescription> getIteratedTypeShortcuts() {
		return typesByShortcut;
	}

	/**
	 * The url of the resource being parsed
	 */
	private URL resourceUrl;

	public AutomataParserListener(Parser parser, URL resourceUrl) {
		super();
		this.parser = parser;
		this.resourceUrl = resourceUrl;
	}

	public void setCustomResourceDir(Path customResourceDir) {
		this.customResourceDir = Optional.of(customResourceDir);
	}

	public void setAllowOnlineMatcherDeclaration(
			boolean allowOnlineMatcherDeclaration) {
		this.inlineAllowed = allowOnlineMatcherDeclaration;
	}

	public Map<String, Set<String>> getResources() {
		return resources;
	}

	public void setAllowMatchingEmptySequences(
			boolean allowMatchingEmptySequences) {
		this.allowMatchingEmptySequences = allowMatchingEmptySequences;
	}


	@Override
	public void enterRuleDeclaration(RuleDeclarationContext ctx) {
		this.inRule  = true;
	}
	
	private Automaton toOrBanchingAutomaton(OrBranchingDeclarationContext ctx) {
		AutomatonQuantifier quantifier = ctx.quantifierDeclaration() != null ?
				parseQuantifier(ctx.quantifierDeclaration()) :
					AutomatonQuantifier.getOneOne();
		
		Automaton automaton = null;
		
		if(ctx.matcherDeclaration() != null)
			automaton = toMatcherDeclarationAutomaton(ctx.matcherDeclaration());
		else {
			List<Automaton> orAutomata = ctx.automatonDeclaration().stream()
					.map(this::toAutomaton)
					.collect(Collectors.toList());
			automaton = AutomatonFactory.createOrAutomaton(orAutomata);
		}
		return AutomatonFactory.createQuantifiedAutomaton(automaton, quantifier);
	}

	private void throwException(int line, int characterOffset, String message) {
		throw new AutomataParsingException(this.resourceUrl, line, characterOffset, message);
	}

	private <T> T throwException(ParserRuleContext ctx, String message) {
		throw new AutomataParsingException(this.resourceUrl, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), message);
	}


	private Automaton toMatcherDeclarationAutomaton(MatcherDeclarationContext ctx) {
		TerminalNode ignoreMatcher = ctx.IgnoreMatcher();
		boolean isIgnored = ignoreMatcher != null && ignoreMatcher.getText().equalsIgnoreCase("~");
		
		if(!this.inlineAllowed && ctx.Identifier() == null && this.inRule) 
			if(!isIgnored)
				throwException(
						ctx,
						"undefined matcher " + ctx.getText());
		
		AnnotationMatcher annotationMatcher = null;
		
		if(ctx.Regex() != null) {
			String text = ctx.Regex().getText();
			// remove trailing and heading slashes "/"
			String regex = text.substring(1, text.length() - 1);
			annotationMatcher = new RegexCoveredTextMatcher(regex);
		} else if(ctx.Identifier() != null) {
			String matcherName = ctx.Identifier().getText();
			annotationMatcher = this.shortcutMatchers.get(matcherName);
			if(annotationMatcher == null)
				annotationMatcher = typeMatchers.get(matcherName);

			if(annotationMatcher == null)
				throwException(
						ctx,
						"There is no matcher declared for short matcher name " + matcherName);

		} else if(ctx.featureMatcherDeclaration() != null) {
			annotationMatcher = toAnnotationMatcher(ctx.featureMatcherDeclaration());
		} else
			throwException(
					ctx,
					"Not a valid matcher context");
		annotationMatcher.setIgnoreMatcher(isIgnored);
		return AutomatonFactory.createSimpleAutomaton(annotationMatcher);
	}

	
	private AnnotationMatcher toAnnotationMatcher(FeatureMatcherDeclarationContext ctx) {
		if(ctx.expression() != null)
			return toAnnotationMatcher(ctx.expression());
		else if(ctx.andexpression() != null)
			return toAnnotationMatcher(ctx.andexpression());
		else if(ctx.orexpression() != null)
			return toAnnotationMatcher(ctx.orexpression());
		else 
			return AnnotationMatcher.EMPTY_MATCHER;
	}

	private AnnotationMatcher toAnnotationMatcher(AndexpressionContext ctx) {
		return new AndMatcher(ctx.expression().stream().map(this::toAnnotationMatcher).collect(Collectors.toList()));
	}

	private AnnotationMatcher toAnnotationMatcher(OrexpressionContext ctx) {
		return new OrMatcher(ctx.expression().stream().map(this::toAnnotationMatcher).collect(Collectors.toList()));
	}

	private AnnotationMatcher toAnnotationMatcher(ExpressionContext ctx) {
		if(ctx.atomicExpression() != null) 
			return toAnnotationMatcher(ctx.atomicExpression());
		else if(ctx.andexpression() != null)
			return toAnnotationMatcher(ctx.andexpression());
		else if(ctx.orexpression() != null)
			return toAnnotationMatcher(ctx.orexpression());
		throw new IllegalStateException("Unexpected context for expression: " + ctx);
	}


	private AnnotationMatcher toAnnotationMatcher(AtomicExpressionContext ctx) {
		AnnotationMatcher matcher = null;
		if(ctx.matcherIdentifier() != null) {
			String matcherName = ctx.matcherIdentifier().getText();
			matcher = findAnnotationMatcherByName(matcherName, ctx);
		} else if(ctx.coveredTextArray() != null) {
			matcher = new CoveredTextStringArrayMatcher(
					toOperator(
							ctx.inStringListOperator()),
							Sets.newHashSet(coveredTextArray.get()));
		} else if(ctx.literalArray() != null) {
			matcher = new ArrayMatcher(
					toFeature(ctx.featureName(), ctx),
					toOperator(ctx.arrayOperator()),
					toLiteralArray(ctx.literalArray()));
		} else if(ctx.resourceIdentifier() != null) {
			if(ctx.featureName() != null) {
				matcher = new StringArrayMatcher(
						toFeature(ctx.featureName(), ctx),
						toOperator(ctx.inStringListOperator()),
						toStringArray(ctx.resourceIdentifier())
				);
			} else {
				matcher = new CoveredTextStringArrayMatcher(
						toOperator(
								ctx.inStringListOperator()),
						toStringArray(ctx.resourceIdentifier()));
			}
		} else if(ctx.coveredTextExactly() != null) {
			matcher = new StringExactlyMatcher(coveredTextExactly.get());
		} else if(ctx.coveredTextIgnoreCase() != null) {
			matcher = new StringIgnoreCaseMatcher(coveredTextIgnoredCase.get());
		} else 
			matcher = new ExpressionMatcher(
					toFeature(ctx.featureName(), ctx),
					toOperator(ctx.operator()),
					toLiteralValue(ctx.literal()), 
					toLiteralType(ctx.literal())
				);

		return matcher;
	}

	private AnnotationMatcher findAnnotationMatcherByName(String matcherName, ParserRuleContext ctx) {
		AnnotationMatcher matcher = null;
		if(shortcutMatchers.containsKey(matcherName))
			matcher = shortcutMatchers.get(matcherName);
		else if(declaredJavaMatchers.containsKey(matcherName))
			matcher = declaredJavaMatchers.get(matcherName);
		else if(typeMatchers.containsKey(matcherName))
			matcher = typeMatchers.get(matcherName);
		else if(BuiltinMatcher.isRegistered(matcherName))
			matcher = BuiltinMatcher.get(matcherName);
		else
			throwException(ctx, "No such custom nor builtin matcher: " + matcherName);
		return matcher;
	}

	private Map<String, Set<String>> resources = new HashMap<>();

	private Set<String> toStringArray(ResourceIdentifierContext ctxt) {
		String resourceId = ctxt.getText();
		if(resources.containsKey(resourceId)) {
			return resources.get(resourceId);
		} else
			throwException(ctxt, String.format("No such external resource <%s>. Available resources: %s", resourceId, resources.keySet()));
		return null;
	}

	private Op toOperator(InStringListOperatorContext ctxt) {
		return Op.fromString(ctxt.getText());
	}

	private Op toOperator(OperatorContext ctxt) {
		return Op.fromString(ctxt.getText());
	}
	private Op toOperator(ArrayOperatorContext ctxt) {
		return Op.fromString(ctxt.getText());
	}

	private Feature toFeature(FeatureNameContext featName, ParserRuleContext ctx) {
		TypeDescription baseType = mainIteratedType;
		String featureBaseName = featName.getText();

//		// TODO fix grammar because this is always null
//		if(featName.typeShortName() != null) {
//			TypeDescription typeDescription = typesByShortcut.get(featName.typeShortName().getText());
//			if(typeDescription != null)
//				baseType = typeDescription;
//			else
//				throw new AutomataParsingException(String.format("Unknown type <%s> for feature <%s>", featName.typeShortName().getText(), featName.getText()));
//		}

		String string = featName.getText();
		int dot = string.lastIndexOf('.');
		if(dot >0 ) {
			String typeShortname = string.substring(0, dot);
			TypeDescription typeDescription = typesByShortcut.get(typeShortname);
			if(typeDescription != null) {
				baseType = typeDescription;
				featureBaseName = string.substring(dot+1);
			}
		}


		Optional<Feature> featureDescription = findFeatureDescription(toType(baseType), featureBaseName);
		if(featureDescription.isPresent())
			return featureDescription.get();
		else
			return throwException(ctx, String.format("No feature named <%s> for type <%s>", featName.getText(), baseType.getName()));
	}

	private Type toType(TypeDescription typeDescription) {
		return getTypeSystem().getType(typeDescription.getName());
	}

	private TypeSystem getTypeSystem() {
		if(typeSystem == null)
			try {
				typeSystem = JCasFactory.createJCas().getTypeSystem();
			} catch (UIMAException e) {
				throwException(0,0, e.getMessage());
			}
		return typeSystem;

	}

	private Optional<Feature> findFeatureDescription(Type type, String featName) {
		return Optional.ofNullable(type.getFeatureByBaseName(featName));
	}

	private Object[] toLiteralArray(LiteralArrayContext literalArrayContext) {
		List<Object> literals = new ArrayList<>();
		for(LiteralContext literalCtx:literalArrayContext.literal()) {
			literals.add(toLiteral(literalCtx));
		}
		return literals.toArray();
	}

	private Object toLiteral(LiteralContext literalCtx) {
		if(literalCtx.IntegerLiteral() != null)
			return Integer.parseInt(literalCtx.IntegerLiteral().getText());
		else if(literalCtx.BooleanLiteral() != null)
			return Boolean.parseBoolean(literalCtx.BooleanLiteral().getText());
		else if(literalCtx.FloatingPointLiteral() != null)
			return Float.parseFloat(literalCtx.FloatingPointLiteral().getText());
		else if(literalCtx.StringLiteral() != null) {
			String textWithQuotes = literalCtx.StringLiteral().getText();
			return textWithQuotes.substring(1,textWithQuotes.length()-1);
		} else
			throw new UnsupportedOperationException("Unexpected literal type: " + literalCtx.getText());
	}

	private String toLiteralType(LiteralContext ctx) {
		if(ctx.IntegerLiteral() != null) 
			return ExpressionMatcher.TYPE_INT;
		else if(ctx.BooleanLiteral() != null) 
			return ExpressionMatcher.TYPE_BOOLEAN;
		else if(ctx.FloatingPointLiteral() != null)
			return ExpressionMatcher.TYPE_FLOAT;
		else if(ctx.StringLiteral() != null)
			return ExpressionMatcher.TYPE_STRING;
		else
			return throwException(ctx, "Unknown literal type: " + ctx.toStringTree(parser));
	}

	private Object toLiteralValue(LiteralContext ctx) {
		if(ctx.IntegerLiteral() != null)
			return Integer.parseInt(ctx.getText());
		else if(ctx.BooleanLiteral() != null)
			return Boolean.parseBoolean(ctx.getText());
		else if(ctx.FloatingPointLiteral() != null)
			return Float.parseFloat(ctx.getText());
		else if(ctx.StringLiteral() != null)
			return ctx.getText().substring(1, ctx.getText().length()-1); // remove heading and trailing "
		else
			return throwException(ctx, "Unknown literal type: " + ctx.toStringTree(parser));
	}

	@Override
	public void exitRuleDeclaration(RuleDeclarationContext ctx) {
		Automaton a = toAutomaton(ctx.automatonDeclaration());
		RuleNameContext ruleCtx = ctx.ruleName();
		String ruleName = ruleCtx.getText().substring(1, ruleCtx.getText().length()-1);
		Rule rule = new Rule(a, ruleName);
		if(a.matchesEmptySequence() && !allowMatchingEmptySequences )
			throwException(ctx, "The automata " + ruleName + " matches the empty sequence");
		this.rules.add(rule);
		this.inRule = false;
	}


	private Automaton toAutomaton(AutomatonDeclarationContext ctx) {
		List<Automaton> subAutomata = ctx.orBranchingDeclaration().stream().map(this::toOrBanchingAutomaton).collect(Collectors.toList());
		return AutomatonFactory.createConcatenation(subAutomata);
	}



	private AutomatonQuantifier parseQuantifier(QuantifierDeclarationContext ctx) {
		String quantifierString = ctx.getText();

		return TokensRegex.parseQuantifier(quantifierString);
	}

	@Override
	public void enterRuleList(RuleListContext ctx) {
		this.rules = Lists.newLinkedList();
		this.shortcutMatchers = Maps.newHashMap();
	}



	
	@Override
	public void exitShortcutMatcherDeclaration(
			ShortcutMatcherDeclarationContext ctx) {
		AnnotationMatcher matcher = null;
		String matcherName = ctx.Identifier().getText();
		if(ctx.featureMatcherDeclaration() != null) {
			matcher = toAnnotationMatcher(ctx.featureMatcherDeclaration());
		} else if(ctx.Regex() !=null) {
			String text = ctx.Regex().getText();
			String regex = text.substring(1, text.length() - 1);
			matcher = new RegexCoveredTextMatcher(regex);
		} else 
			throwException(ctx, "Not a valid shortcutMatcherDeclaration: " + ctx.getText());
		if(this.shortcutMatchers.get(matcherName) != null)
			throwException(ctx, "There is already a matcher named " + matcherName);
		if(ctx.labelIdentifier() == null)
			matcher.setLabel(matcherName);
		else
			matcher.setLabel(ctx.labelIdentifier().getText());
		
		this.shortcutMatchers.put(matcherName, matcher);
	}

	@Override
	public void enterHeaderBlock(HeaderBlockContext ctx) {
		options = Maps.newHashMap();
	}

	@Override
	public void exitHeaderBlock(HeaderBlockContext ctx) {
		if(options.get(OPTION_INLINE) != null)
			try {
				this.inlineAllowed = Boolean.parseBoolean(options.get(OPTION_INLINE));
			} catch(Exception e) {
				throwException(ctx, "Bad value for parameter " + OPTION_INLINE + " (expected true or false)");
			}
		else {
			this.inlineAllowed = true;
		}
	}

	@Override
	public void enterTypeSystemDeclaration(TypeSystemDeclarationContext ctx) {

	}

	@Override
	public void exitTypeSystemDeclaration(TypeSystemDeclarationContext ctx) {
		String value = ctx.Identifier().getText();
		String filePath = value.replaceAll("\\.", "/") + ".xml";
		try {
			typeSystemDescription = TypeSystemDescriptionFactory.createTypeSystemDescription();
			typeSystemDescription.resolveImports();
		} catch (Exception e) {
			throwException(ctx, String.format("Failed to load type system %s. Got %s:%s", filePath, e.getClass().getSimpleName(), e.getMessage()));
		}

	}

	@Override
	public void enterImportMatchersDeclaration(ImportMatchersDeclarationContext ctx) {

	}

	@Override
	public void exitImportMatchersDeclaration(ImportMatchersDeclarationContext ctx) {
		URL url = toResourceUrl(ctx.path(), ctx.path().getText(), ctx);
		try {
			RegexList regexList = TokensRegex.parseRegexList(url, customResourceDir);
			shortcutMatchers.putAll(regexList.getShortcutMatchers());
			shortcutMatchers.putAll(regexList.getJavaMatchers());
		} catch(Exception e) {
			throwException(ctx, String.format("Could not parse uima tokens regex file %s. Got error: %s", ctx.path().getText(), e.getMessage()));
		}
	}


	@Override
	public void exitUseDeclaration(UseDeclarationContext ctx) {
		String value = ctx.mainUseDeclaration().typeFullName().getText();
		mainIteratedType = toTypeDescription(value, ctx);
		if(ctx.mainUseDeclaration().typeShortName() != null)
			typesByShortcut.put(ctx.mainUseDeclaration().typeShortName().getText(), mainIteratedType);
		for(SecondaryUseDeclarationContext sctx:ctx.secondaryUseDeclaration()) {
			String typeFullName = sctx.typeFullName().getText();
			TypeDescription typeDescription = toTypeDescription(typeFullName, ctx);
			Type type = toType(typeDescription);
			String typeCustomShortName = sctx.typeShortName().getText();
			if(mainIteratedType.getName().equals(typeFullName))
				throwException(ctx, String.format("A used type can be declared at most once: <%s>",
						typeFullName));
			if(typesByShortcut.values().contains(typeFullName))
				throwException(ctx, String.format("A used type can be declared at most once: <%s>",
						typeFullName));
			if(typesByShortcut.containsKey(type.getShortName()))
				throwException(ctx, String.format("There is already one declared type with shortcut <%s>: %s",
						typeCustomShortName,
						typesByShortcut.get(type.getShortName())));
			if(typesByShortcut.containsKey(typeCustomShortName))
				throwException(ctx, String.format("There is already one declared type with shortcut <%s>: %s",
						typeCustomShortName,
						typesByShortcut.get(typeCustomShortName)));
			typesByShortcut.put(typeCustomShortName, typeDescription);
		}
		populateTypeMatchers();
	}

	private void populateTypeMatchers() {
		Type mainType = toType(mainIteratedType);
		typeMatchers.put(mainType.getName(), new TypeMatcher(getTypeSystem(), mainType));
		typeMatchers.put(mainType.getShortName(), new TypeMatcher(getTypeSystem(), mainType));
		for(Map.Entry<String, TypeDescription> e:typesByShortcut.entrySet()) {
			Type type = toType(e.getValue());
			typeMatchers.put(e.getKey(), new TypeMatcher(getTypeSystem(), type));
			typeMatchers.put(type.getName(), new TypeMatcher(getTypeSystem(), type));
			typeMatchers.put(type.getShortName(), new TypeMatcher(getTypeSystem(), type));
		}
	}

	@Override
	public void enterMainUseDeclaration(MainUseDeclarationContext ctx) {

	}

	@Override
	public void exitMainUseDeclaration(MainUseDeclarationContext ctx) {

	}

	@Override
	public void enterSecondaryUseDeclaration(SecondaryUseDeclarationContext ctx) {

	}

	@Override
	public void exitSecondaryUseDeclaration(SecondaryUseDeclarationContext ctx) {

	}

	@Override
	public void enterTypeFullName(TypeFullNameContext ctx) {

	}

	@Override
	public void exitTypeFullName(TypeFullNameContext ctx) {

	}

	@Override
	public void enterTypeShortName(TypeShortNameContext ctx) {

	}

	@Override
	public void exitTypeShortName(TypeShortNameContext ctx) {

	}

	private TypeDescription toTypeDescription(String value, ParserRuleContext ctx) {
		TypeDescription typeDesc = typeSystemDescription.getType(value);
		if(typeDesc == null)
			throwException(ctx, "No such type in type system: " + value);
		return typeDesc;
	}


	@Override
	public void enterOptionDeclaration(OptionDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitOptionDeclaration(OptionDeclarationContext ctx) {
		String optName = ctx.Identifier().getText();
		if(!OPTION_NAMES.contains(optName))
			throwException(ctx, "Unknown option " + optName);
		options.put(optName, ctx.literal().toString());
	}


			



	@Override
	public void enterJavaMatcherDeclaration(JavaMatcherDeclarationContext ctx) {
		
	}

	@Override
	public void exitJavaMatcherDeclaration(JavaMatcherDeclarationContext ctx) {
		String javaMatcherName = ctx.Identifier().getText();
		CustomMatcher matcher = new CustomMatcher(javaMatcherName);
		declaredJavaMatchers.put(javaMatcherName, matcher);
		
	}


	private Optional<String> coveredTextIgnoredCase = Optional.empty();
	
	@Override
	public void enterCoveredTextIgnoreCase(CoveredTextIgnoreCaseContext ctx) {
		coveredTextIgnoredCase = Optional.empty();
	}

	@Override
	public void exitCoveredTextIgnoreCase(CoveredTextIgnoreCaseContext ctx) {
		coveredTextIgnoredCase = Optional.of(prepareStringLiteral(ctx.StringLiteral().toString()));
	}

	private Optional<String> coveredTextExactly = Optional.empty();

	@Override
	public void enterCoveredTextExactly(CoveredTextExactlyContext ctx) {
		coveredTextExactly = Optional.empty();
	}

	@Override
	public void exitCoveredTextExactly(CoveredTextExactlyContext ctx) {
		coveredTextExactly = Optional.of(prepareStringLiteral(ctx.StringLiteral().toString()));
	}

	@Override
	public void enterLiteralArray(UimaTokenRegexParser.LiteralArrayContext ctx) {

	}

	@Override
	public void exitLiteralArray(UimaTokenRegexParser.LiteralArrayContext ctx) {

	}


	@Override
	public void enterCoveredTextArray(CoveredTextArrayContext ctx) {
		coveredTextArray = Optional.empty();
	}

	@Override
	public void exitCoveredTextArray(CoveredTextArrayContext ctx) {
		List<String> values = ctx.StringLiteral().stream()
				.map(TerminalNode::toString)
				.map(this::prepareStringLiteral)
				.collect(toList());
		coveredTextArray = Optional.of(values.toArray(new String[values.size()]));
	}

	private static final String ERR_STRING_LITERAL = "Invalid string literal. Should start and end with double quotes. Got %s";
	private static final String QUOTE = "\"";
	private String prepareStringLiteral(String stringLiteral) {
		Preconditions.checkArgument(stringLiteral.startsWith(QUOTE) && stringLiteral.endsWith(QUOTE),
				ERR_STRING_LITERAL, stringLiteral);
		return stringLiteral.substring(1, stringLiteral.length()-1);
	}

	@Override
	public void enterAtomicExpression(AtomicExpressionContext ctx) {
	}

	@Override
	public void exitAtomicExpression(AtomicExpressionContext ctx) {
	}

	@Override
	public void enterMatcherIdentifier(MatcherIdentifierContext ctx) {

	}

	@Override
	public void exitMatcherIdentifier(MatcherIdentifierContext ctx) {

	}

	@Override
	public void enterResourceIdentifier(ResourceIdentifierContext ctx) {

	}

	@Override
	public void exitResourceIdentifier(ResourceIdentifierContext ctx) {
	}

	@Override
	public void enterExternalListDeclaration(ExternalListDeclarationContext ctx) {

	}

	@Override
	public void exitExternalListDeclaration(ExternalListDeclarationContext ctx) {
		String resourceId = ctx.resourceIdentifier().getText();
		Set<String> values = new HashSet<>();
		try {
			if (ctx.csvListDefinition() != null) {
				throw new UnsupportedOperationException("Not yet implemented");
			} else if (ctx.tsvListDefinition() != null) {
				URL url = toResourceUrl(ctx.tsvListDefinition().path(), resourceId, ctx);
				TerminalNode colArg = ctx.tsvListDefinition().IntegerLiteral();
				int column = colArg == null ? 0 : Integer.parseInt(colArg.getText());
				LOGGER.debug(String.format("[TSV] Loading %s from column %d of resource %s",
						resourceId,
						column,
						url));
				values = Files.loadTsv(url, column);
			} else if (ctx.jsonListDefinition() != null) {
				URL url = toResourceUrl(ctx.jsonListDefinition().path(), resourceId, ctx);
				String rawKeyPath = ctx.jsonListDefinition().keypath().getText();
				values = Files.loadJson(url, withoutQuotes(rawKeyPath));
			} else if (ctx.simpleListDefinition() != null) {
				URL url = toResourceUrl(ctx.simpleListDefinition().path(), resourceId, ctx);
				LOGGER.debug(String.format("[Simple string file] Loading %s from column 0 of resource %s",
						resourceId,
						url));
				values = Files.loadTsv(url, 0);
			} else if (ctx.yamlListDefinition() != null) {
				URL url = toResourceUrl(ctx.yamlListDefinition().path(), resourceId, ctx);
				String rawKeyPath = ctx.yamlListDefinition().keypath().getText();
				values = Files.loadYaml(url, withoutQuotes(rawKeyPath));
			}
			resources.put(resourceId, values);
		} catch(IOException e) {
			LOGGER.error(String.format("Failed to parse resource %s", resourceId), e);
			throwException(ctx, String.format("Failed to parse resource %s", resourceId));
		}
	}

	private String withoutQuotes(String text) {
		return text.substring(1, text.length()-1);
	}



	private URL toResourceUrl(PathContext path, String resourceId, ParserRuleContext ctx) {
		String text = path.StringLiteral().getText();
		text = text.substring(1, text.length() - 1);
		return resolveUrl(text, resourceId, ctx);
	}

	private URL resolveUrl(String text, String resourceId, ParserRuleContext ctx) {
		try {
			// try current dir
			if(Paths.get(text).toFile().isFile()) {
				LOGGER.debug("Loading resource {} from {} directory", resourceId, Paths.get(text).isAbsolute() ? "absolute" : "relative");
				return Paths.get(text).toUri().toURL();
			}
			// try custom resource dir
			if(customResourceDir.isPresent()) {
				if(customResourceDir.get().resolve(text).toFile().isFile()) {
					LOGGER.debug("Loading resource {} from custom resource directory {}", resourceId, customResourceDir.get().resolve(text));
					return customResourceDir.get().resolve(text).toUri().toURL();
				}
			}
			return throwException(ctx, String.format("Cannot find resource %s", text));
		} catch (MalformedURLException e) {
			return throwException(ctx, e.getMessage());
		}
	}



	@Override
	public void exitRuleList(RuleListContext ctx) {
	}

	@Override
	public void enterOperator(OperatorContext ctx) {
	}

	@Override
	public void exitOperator(OperatorContext ctx) {
	}

	@Override
	public void enterFeatureMatcherDeclaration(FeatureMatcherDeclarationContext ctx) {
	}


	@Override
	public void exitFeatureMatcherDeclaration(FeatureMatcherDeclarationContext ctx) {
	}

	@Override
	public void enterLiteral(LiteralContext ctx) {
		// do nothing
	}

	@Override
	public void exitLiteral(LiteralContext ctx) {
	}

	@Override
	public void enterOrexpression(OrexpressionContext ctx) {
	}

	@Override
	public void exitOrexpression(OrexpressionContext ctx) {
	}


	@Override
	public void enterAndexpression(AndexpressionContext ctx) {
	}

	@Override
	public void exitAndexpression(AndexpressionContext ctx) {
	}



	@Override
	public void enterShortcutMatcherDeclaration(
			ShortcutMatcherDeclarationContext ctx) {
	}



	@Override
	public void enterEveryRule(ParserRuleContext arg0) {}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {}

	@Override
	public void visitErrorNode(ErrorNode arg0) {}

	@Override
	public void visitTerminal(TerminalNode arg0) {}

	@Override
	public void enterExpression(ExpressionContext ctx) {}

	@Override
	public void exitExpression(ExpressionContext ctx) {
	}

	@Override
	public void enterAutomatonDeclaration(AutomatonDeclarationContext ctx) {

	}

	@Override
	public void exitAutomatonDeclaration(AutomatonDeclarationContext ctx) {

	}

	@Override
	public void enterFeatureName(FeatureNameContext ctx) {
		// do nothing
	}

	@Override
	public void exitFeatureName(FeatureNameContext ctx) {
	}

	@Override
	public void enterFeatureBaseName(FeatureBaseNameContext ctx) {

	}

	@Override
	public void exitFeatureBaseName(FeatureBaseNameContext ctx) {

	}

	@Override
	public void enterArrayOperator(UimaTokenRegexParser.ArrayOperatorContext ctx) {

	}

	@Override
	public void exitArrayOperator(UimaTokenRegexParser.ArrayOperatorContext ctx) {

	}

	@Override
	public void enterInStringListOperator(InStringListOperatorContext ctx) {

	}

	@Override
	public void exitInStringListOperator(InStringListOperatorContext ctx) {

	}


	@Override
	public void enterRuleName(RuleNameContext ctx) {
		// do nothing
	}

	@Override
	public void exitRuleName(RuleNameContext ctx) {
	}


	@Override
	public void enterMatcherDeclaration(MatcherDeclarationContext ctx) {
	}


	@Override
	public void exitMatcherDeclaration(MatcherDeclarationContext ctx) {
	}


	@Override
	public void enterOrBranchingDeclaration(OrBranchingDeclarationContext ctx) {
	}

	@Override
	public void exitOrBranchingDeclaration(OrBranchingDeclarationContext ctx) {
	}



	@Override
	public void enterQuantifierDeclaration(QuantifierDeclarationContext ctx) {
		// do nothing
	}

	@Override
	public void exitQuantifierDeclaration(QuantifierDeclarationContext ctx) {

	}


	@Override
	public void enterLabelIdentifier(LabelIdentifierContext ctx) {
	}

	@Override
	public void exitLabelIdentifier(LabelIdentifierContext ctx) {
	}


	@Override
	public void enterUseDeclaration(UseDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}



	@Override
	public void enterSimpleListDefinition(SimpleListDefinitionContext ctx) {

	}

	@Override
	public void exitSimpleListDefinition(SimpleListDefinitionContext ctx) {

	}

	@Override
	public void enterPath(PathContext ctx) {

	}

	@Override
	public void exitPath(PathContext ctx) {

	}

	@Override
	public void enterYamlListDefinition(YamlListDefinitionContext ctx) {

	}

	@Override
	public void exitYamlListDefinition(YamlListDefinitionContext ctx) {

	}

	@Override
	public void enterJsonListDefinition(JsonListDefinitionContext ctx) {

	}

	@Override
	public void exitJsonListDefinition(JsonListDefinitionContext ctx) {

	}

	@Override
	public void enterCsvListDefinition(CsvListDefinitionContext ctx) {

	}

	@Override
	public void exitCsvListDefinition(CsvListDefinitionContext ctx) {

	}

	@Override
	public void enterTsvListDefinition(TsvListDefinitionContext ctx) {

	}

	@Override
	public void exitTsvListDefinition(TsvListDefinitionContext ctx) {

	}

	@Override
	public void enterQuote(QuoteContext ctx) {

	}

	@Override
	public void exitQuote(QuoteContext ctx) {

	}

	@Override
	public void enterSeparator(SeparatorContext ctx) {

	}

	@Override
	public void exitSeparator(SeparatorContext ctx) {

	}

	@Override
	public void enterKeypath(KeypathContext ctx) {

	}

	@Override
	public void exitKeypath(KeypathContext ctx) {

	}

	public Map<String, TypeMatcher> getTypeMatchers() {
		return typeMatchers;
	}
}


