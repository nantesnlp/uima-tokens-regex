/*******************************************************************************
 * Copyright 2015 - CNRS (Centre National de Recherche Scientifique)
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

import static java.util.stream.Collectors.toList;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.uima.fit.factory.TypeSystemDescriptionFactory;
import org.apache.uima.resource.metadata.FeatureDescription;
import org.apache.uima.resource.metadata.TypeDescription;
import org.apache.uima.resource.metadata.TypeSystemDescription;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import fr.univnantes.lina.uima.tkregex.AndMatcher;
import fr.univnantes.lina.uima.tkregex.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.Automaton;
import fr.univnantes.lina.uima.tkregex.AutomatonFactory;
import fr.univnantes.lina.uima.tkregex.AutomatonQuantifier;
import fr.univnantes.lina.uima.tkregex.CustomMatcher;
import fr.univnantes.lina.uima.tkregex.ExpressionMatcher;
import fr.univnantes.lina.uima.tkregex.OrMatcher;
import fr.univnantes.lina.uima.tkregex.RegexCoveredTextMatcher;
import fr.univnantes.lina.uima.tkregex.Rule;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexListener;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.AndexpressionContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.CoveredTextArrayContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.CoveredTextExactlyContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.CoveredTextIgnoreCaseContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.ExpressionContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.FeatureMatcherDeclarationContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.FeatureNameContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.GrammaticalCategoryContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.HeaderBlockContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.ImportDeclarationContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.JavaMatcherDeclarationContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.LabelIdentifierContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.LiteralContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.MatcherDeclarationContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.OperatorContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.OptionDeclarationContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.OrBranchContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.OrBranchingDeclarationContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.OrexpressionContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.QuantifierDeclarationContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.RuleDeclarationContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.RuleListContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.RuleNameContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.ShortcutMatcherDeclarationContext;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser.UseDeclarationContext;
import fr.univnantes.lina.uima.tkregex.matchers.StringArrayMatcher;
import fr.univnantes.lina.uima.tkregex.matchers.StringExactlyMatcher;
import fr.univnantes.lina.uima.tkregex.matchers.StringIgnoreCaseMatcher;


public class AutomataParserListener implements UimaTokenRegexListener {
	private static final Pattern M_N_PATTERN = Pattern.compile("\\{(\\d+(,\\d+)?)\\}");

	public static final String OPTION_INLINE = "inline";
	
	private List<String> OPTION_NAMES = ImmutableList.of(
			OPTION_INLINE
			);
	private Map<String, String> options = Maps.newHashMap();;
	
	private List<Rule> rules;

	private Parser parser;
	
	private Map<String, AnnotationMatcher> shortcutMatchers;
	
	private LinkedList<List<AnnotationMatcher>> expressionLists;
	
	private AnnotationMatcher lastExpression;
	
	private String literalType;
	
	private Object literalValue;
	
	private LinkedList<Automaton> lastOrBranch;

	private String feature;
	
	private AutomatonQuantifier quantifier;
	
	private LinkedList<LinkedList<Automaton>> orBranches;

	private String ruleName;

	private String grammaticalCategory = null;
	
	private boolean allowMatchingEmptySequences = false;

	private boolean allowInlineMatcherDeclaration = true;

	private boolean inRule = false;
	
	private String matcherLabel = null;

	
	private TypeSystemDescription typeSystemDescription = null;
	
	private TypeDescription usedType = null;
	
	public Map<String, CustomMatcher> getCustomJavaMatchers() {
		return declaredJavaMatchers;
	}
	
	public List<Rule> getRules() {
		return ImmutableList.copyOf(this.rules);
	}
	
	public Map<String, AnnotationMatcher> getShortcutMatchers() {
		return shortcutMatchers;
	}
	
	public TypeDescription getIteraredType() {
		return usedType;
	}
	
	public AutomataParserListener(Parser parser) {
		super();
		this.parser = parser;
	}

	public void setAllowOnlineMatcherDeclaration(
			boolean allowOnlineMatcherDeclaration) {
		this.allowInlineMatcherDeclaration = allowOnlineMatcherDeclaration;
	}
	
	public void setAllowMatchingEmptySequences(
			boolean allowMatchingEmptySequences) {
		this.allowMatchingEmptySequences = allowMatchingEmptySequences;
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
//		System.out.println("exitExpression("+ctx.getText()+")");

		if(ctx.andexpression() != null) {
			// do nothing
		} else {
//			System.out.println(ctx.toStringTree(parser));
			AnnotationMatcher matcher = null;
			if(ctx.Identifier() != null) {
				String matcherName = ctx.Identifier().getText();
				AnnotationMatcher annotationMatcher = shortcutMatchers.get(matcherName);
				if(annotationMatcher == null) {
					if(declaredJavaMatchers.containsKey(matcherName))
						matcher = declaredJavaMatchers.get(matcherName);
					else if(BuiltinMatcher.isRegistered(matcherName))
						matcher = BuiltinMatcher.get(matcherName);
				} 
				if(matcher == null)
					throw new AutomataParsingException("No such custom nor builtin matcher: " + matcherName);
			} else if(ctx.coveredTextArray() != null) {
				matcher = new StringArrayMatcher(true, coveredTextArray.get());
			} else if(ctx.coveredTextExactly() != null) {
				matcher = new StringExactlyMatcher(coveredTextExactly.get());
			} else if(ctx.coveredTextIgnoreCase() != null) {
				matcher = new StringIgnoreCaseMatcher(coveredTextIgnoredCase.get());
			} else
				matcher = new ExpressionMatcher(
					feature, 
					ctx.operator().getText(), 
					literalValue, 
					literalType
				);
			this.lastExpression = matcher;
//			System.out.println(matcher.toString());
			List<AnnotationMatcher> expressionGroup = this.expressionLists.get(0);
			if(expressionGroup != null) {
				expressionGroup.add(this.lastExpression);
//				System.out.println("ADD " + lastExpression);
			}
//			showExpressionLists();
		}
	}

	
	@Override
	public void enterRuleDeclaration(RuleDeclarationContext ctx) {
		this.orBranches = Lists.newLinkedList();
		this.inRule  = true;
		this.ruleName = null;
		this.grammaticalCategory = null;
	}

	@Override
	public void exitRuleDeclaration(RuleDeclarationContext ctx) {
		if(!this.orBranches.isEmpty())
			throw new AutomataParsingException("Should never happen.");
		Automaton a = AutomatonFactory.createConcatenation(this.lastOrBranch);
		Rule rule = new Rule(a, this.ruleName, this.grammaticalCategory);
		if(a.matchesEmptySequence() && !allowMatchingEmptySequences )
			throw new AutomataParsingException("The automata " + this.ruleName + " matches the empty sequence");
		this.rules.add(rule);
		this.inRule = false;
	}

	@Override
	public void enterFeatureName(FeatureNameContext ctx) {
		// do nothing
	}

	@Override
	public void exitFeatureName(FeatureNameContext ctx) {
		this.feature = resolveFeature(ctx.getText());
		if(feature == null) 
			throw new AutomataParsingException("No such feature: " + ctx.getText());
	}
	
	

	
	protected String resolveFeature(String shortName) {
		String feature = featureMap.get(shortName);
		if(feature == null) 
			throw new AutomataParsingException("No such feature found in type system: " + shortName);
		return feature;
	}

	@Override
	public void enterRuleName(RuleNameContext ctx) {
		// do nothing
	}

	@Override
	public void exitRuleName(RuleNameContext ctx) {
		this.ruleName = ctx.getText().substring(1, ctx.getText().length()-1);
	}

	
	@Override
	public void enterMatcherDeclaration(MatcherDeclarationContext ctx) {
//		System.out.println("enterMatcherDeclaration("+ctx.getText()+")");
		this.lastExpression = AnnotationMatcher.EMPTY_MATCHER;
		this.quantifier = AutomatonQuantifier.getOneOne();
		this.matcherLabel = null;
		this.expressionLists = Lists.newLinkedList();
//		showExpressionLists();
	}
	
	
	@Override
	public void exitMatcherDeclaration(MatcherDeclarationContext ctx) {
		Automaton automaton; 
		
		if(!this.allowInlineMatcherDeclaration && ctx.Identifier() == null && this.inRule) 
			throw new AutomataParsingException("undefined matcher "
					+ " at line " + ctx.getStart().getLine() + ":" + ctx.getText());
		
		
		TerminalNode ignoreMatcher = ctx.IgnoreMatcher();
		if(ctx.Regex() != null) {
			String text = ctx.Regex().getText();
			// remove trailing and heading slashes "/"
			String regex = text.substring(1, text.length() - 1);
			RegexCoveredTextMatcher expr = new RegexCoveredTextMatcher(regex);
			if(ignoreMatcher != null && ignoreMatcher.getText().equalsIgnoreCase("~"))
				expr.setIgnoreMatcher(true);
			automaton = AutomatonFactory.createSimpleAutomaton(expr);
		} else if(ctx.Identifier() != null) {
			String matcherName = ctx.Identifier().getText();
			AnnotationMatcher annoMatcher = this.shortcutMatchers.get(matcherName);
			if(annoMatcher == null)
				throw new AutomataParsingException("There is no shortcut for matcher name " + matcherName);
			if(ignoreMatcher != null && ignoreMatcher.getText().equalsIgnoreCase("~"))
				annoMatcher.setIgnoreMatcher(true);
			automaton = AutomatonFactory.createSimpleAutomaton(annoMatcher);
		} else if(ctx.orBranchingDeclaration() != null) {
			automaton = AutomatonFactory.createOrAutomaton(this.lastOrBranch);
		} else if(ctx.featureMatcherDeclaration() != null) {
			if(ignoreMatcher != null && ignoreMatcher.getText().equalsIgnoreCase("~"))
				lastExpression.setIgnoreMatcher(true);
			automaton = AutomatonFactory.createSimpleAutomaton(lastExpression);
		} else 
			throw new AutomataParsingException("Not a valid matcher context");
		Automaton quantifiedAutomaton = AutomatonFactory.createQuantifiedAutomaton(
				automaton, 
				this.quantifier);
		this.orBranches.peek().add(quantifiedAutomaton);
	}

	@Override
	public void enterOrBranchingDeclaration(OrBranchingDeclarationContext ctx) {
	}

	@Override
	public void exitOrBranchingDeclaration(OrBranchingDeclarationContext ctx) {
	}
	
	@Override
	public void enterOrBranch(OrBranchContext ctx) {
		LinkedList<Automaton> orBranch = new LinkedList<Automaton>();
		this.orBranches.add(orBranch);
	}
	

	@Override
	public void exitOrBranch(OrBranchContext ctx) {
		this.lastOrBranch = this.orBranches.pop();
	}

	
	@Override
	public void enterQuantifierDeclaration(QuantifierDeclarationContext ctx) {
		// do nothing
	}

//	private void showExpressionLists() {
//		System.out.println("\tlastExpresion: " + this.lastExpression);
//		System.out.println("\texpression lists nb: " + this.expressionLists.size() + "    - " + System.identityHashCode(this.expressionLists));
//		for(List<AnnotationMatcher> exprList:this.expressionLists) {
//			System.out.println("\t"+System.identityHashCode(exprList)+": "+Joiner.on(" ").join(exprList));
//		}
//	}
	@Override
	public void exitQuantifierDeclaration(QuantifierDeclarationContext ctx) {
		switch(ctx.getText()) {
		case "*":
			this.quantifier = AutomatonQuantifier.getZeroN();
			break;
		case "?":
			this.quantifier = AutomatonQuantifier.getZeroOne();
			break;
		case "+":
			this.quantifier = AutomatonQuantifier.getOneN();
			break;
		default:
			Matcher m = M_N_PATTERN.matcher(ctx.getText());
//			System.out.println(ctx.getText());
			
			if(m.matches() && m.groupCount() == 3) 
				this.quantifier = AutomatonQuantifier.getMN(
						Integer.parseInt(m.group(1)),
						Integer.parseInt(m.group(2))
						);
			else if(m.matches() && m.groupCount() == 2) 
				this.quantifier = AutomatonQuantifier.getN(
						Integer.parseInt(m.group(1))
						);
			else throw new AutomataParsingException("Unrecognized regex: " + ctx.getText());
		}
		
	}

	@Override
	public void enterRuleList(RuleListContext ctx) {
		this.rules = Lists.newLinkedList();
		this.shortcutMatchers = Maps.newHashMap();
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
		if(ctx.IntegerLiteral() != null) {
			literalType = ExpressionMatcher.TYPE_INT;
			literalValue = Integer.parseInt(ctx.getText());
		} else if(ctx.BooleanLiteral() != null) {
			literalType = ExpressionMatcher.TYPE_BOOLEAN;
			literalValue = Boolean.parseBoolean(ctx.getText());
		} else if(ctx.FloatingPointLiteral() != null) {
			literalType = ExpressionMatcher.TYPE_FLOAT;
			literalValue = Float.parseFloat(ctx.getText());
		} else if(ctx.StringLiteral() != null) {
			literalType = ExpressionMatcher.TYPE_STRING;
			literalValue = ctx.getText().substring(1, ctx.getText().length()-1); // remove heading and trailing "
		} else {
			literalType = null;
			throw new AutomataParsingException("Unknown literal type: " + ctx.toStringTree(parser));
		}
	}

	@Override
	public void enterOrexpression(OrexpressionContext ctx) {
//		System.out.println("enterOrexpression("+ctx.getText()+")");
		LinkedList<AnnotationMatcher> orExpressionList = Lists.newLinkedList();
		this.expressionLists.addFirst(orExpressionList);
//		showExpressionLists();
	}

	@Override
	public void exitOrexpression(OrexpressionContext ctx) {
//		System.out.println("exitOrexpression("+ctx.getText()+")");
		List<AnnotationMatcher> orExpressionList = this.expressionLists.pop();
		List<AnnotationMatcher> topExpressionList = this.expressionLists.peek();
		if(orExpressionList.size() == 1) {
			// do not build an or matcher for a size-1 expression list
			if(topExpressionList != null)
				topExpressionList.add(orExpressionList.get(0));
			this.lastExpression = orExpressionList.get(0);
		} else {
			OrMatcher orMatcher = new OrMatcher();
			orMatcher.addAllDijonctionParts(orExpressionList);
			if(topExpressionList != null)
				topExpressionList.add(orMatcher);
			this.lastExpression = orMatcher;
		}

//		showExpressionLists();
	}

	
	@Override
	public void enterAndexpression(AndexpressionContext ctx) {
//		System.out.println("enterAndexpression("+ctx.getText()+")");
		LinkedList<AnnotationMatcher> andExpressionList = Lists.newLinkedList();
		this.expressionLists.addFirst(andExpressionList);
//		showExpressionLists();
	}

	@Override
	public void exitAndexpression(AndexpressionContext ctx) {
		List<AnnotationMatcher> andExpressionList = this.expressionLists.pop();
		List<AnnotationMatcher> topExpressionList = this.expressionLists.peek();

		if(andExpressionList.size() == 1) {
			// do not build an and matcher for a size-1 expression
			if(topExpressionList != null)
				topExpressionList.add(andExpressionList.get(0));
			this.lastExpression = andExpressionList.get(0);
		} else {
			AndMatcher andMatcher = new AndMatcher();
			andMatcher.addAllConjonctionPart(andExpressionList);
			if(topExpressionList != null)
				topExpressionList.add(andMatcher);
			this.lastExpression = andMatcher;
		}
	}

	
	
	@Override
	public void enterShortcutMatcherDeclaration(
			ShortcutMatcherDeclarationContext ctx) {
		this.expressionLists = Lists.newLinkedList();
		this.matcherLabel = null;
	}

	
	@Override
	public void exitShortcutMatcherDeclaration(
			ShortcutMatcherDeclarationContext ctx) {
		AnnotationMatcher matcher;
		String matcherName = ctx.Identifier().getText();
		if(ctx.featureMatcherDeclaration() != null) {
			matcher = lastExpression;
		} else if(ctx.Regex() !=null) {
			String text = ctx.Regex().getText();
			String regex = text.substring(1, text.length() - 1);
			matcher = new RegexCoveredTextMatcher(regex);
		} else 
			throw new AutomataParsingException("Not a valid shortcutMatcherDeclaration: " + ctx.getText());
		if(this.shortcutMatchers.get(matcherName) != null)
			throw new AutomataParsingException("There is already a matcher named " + matcherName);
		if(matcherLabel == null)
			matcher.setLabel(matcherName);
		else
			matcher.setLabel(matcherLabel);
		
		this.shortcutMatchers.put(matcherName, matcher);
	}

	@Override
	public void enterGrammaticalCategory(GrammaticalCategoryContext ctx) {
		
	}

	@Override
	public void exitGrammaticalCategory(GrammaticalCategoryContext ctx) {
		String text = ctx.getText();
		this.grammaticalCategory = text.substring(1, text.length()-1);
	}
	
	@Override
	public void enterLabelIdentifier(LabelIdentifierContext ctx) {
	}

	@Override
	public void exitLabelIdentifier(LabelIdentifierContext ctx) {
		matcherLabel = ctx.getText();
	}


	@Override
	public void enterHeaderBlock(HeaderBlockContext ctx) {
		options = Maps.newHashMap();
	}

	@Override
	public void exitHeaderBlock(HeaderBlockContext ctx) {
		if(options.get(OPTION_INLINE) != null)
			try {
				this.allowInlineMatcherDeclaration = Boolean.parseBoolean(options.get(OPTION_INLINE));
			} catch(Exception e) {
				throw new AutomataParsingException("Bad value for parameter " + OPTION_INLINE + " (expeted true or false)");
			}
		else {
			this.allowInlineMatcherDeclaration = true;
		}
	}

	@Override
	public void enterUseDeclaration(UseDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUseDeclaration(UseDeclarationContext ctx) {
		String value = ctx.Identifier().getText();
		usedType = typeSystemDescription.getType(value);
		if(usedType == null)
			throw new AutomataParsingException("No such type in type system: " + value);
		inferFeatureMap(usedType);
	}
	
	protected Map<String, String> featureMap = Maps.newHashMap();
	
	private void inferFeatureMap(TypeDescription type) {
		// 1 - Recursively add features of the super type
		TypeDescription superType = typeSystemDescription.getType(type.getSupertypeName());
		if(superType != null)
			inferFeatureMap(superType);
		
		// 2 - Add features of this type
		for(FeatureDescription feature:type.getFeatures()) {
			String featureFQN = type.getName() + ":" + feature.getName();
			featureMap.put(feature.getName(), featureFQN);
			featureMap.put(featureFQN, featureFQN);
		}
	}

	@Override
	public void enterOptionDeclaration(OptionDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitOptionDeclaration(OptionDeclarationContext ctx) {
		String optName = ctx.Identifier().getText();
		if(!OPTION_NAMES.contains(optName))
			throw new AutomataParsingException("Unknown option " + optName);
		options.put(optName, ctx.literal().toString());
	}


			

	@Override
	public void enterImportDeclaration(ImportDeclarationContext ctx) {
		
	}

	@Override
	public void exitImportDeclaration(ImportDeclarationContext ctx) {
		String value = ctx.Identifier().getText();
		String filePath = value.replaceAll("\\.", "/") + ".xml";
		try {
			typeSystemDescription = TypeSystemDescriptionFactory.createTypeSystemDescription();
			typeSystemDescription.resolveImports();
		} catch (Exception e) {
			throw new AutomataParsingException("Failed to load type system " + filePath, e);
		}
	}

	private Map<String, CustomMatcher> declaredJavaMatchers = new ConcurrentHashMap<>();

	@Override
	public void enterJavaMatcherDeclaration(JavaMatcherDeclarationContext ctx) {
		
	}

	@Override
	public void exitJavaMatcherDeclaration(JavaMatcherDeclarationContext ctx) {
		String javaMatcherName = ctx.Identifier().getText();
		CustomMatcher matcher = new CustomMatcher(javaMatcherName);
		declaredJavaMatchers.put(javaMatcherName, matcher);
		
	}


	private Optional<String> coveredTextIgnoredCase = Optional.absent();
	
	@Override
	public void enterCoveredTextIgnoreCase(CoveredTextIgnoreCaseContext ctx) {
		coveredTextIgnoredCase = Optional.absent();
	}

	@Override
	public void exitCoveredTextIgnoreCase(CoveredTextIgnoreCaseContext ctx) {
		coveredTextIgnoredCase = Optional.of(prepareStringLiteral(ctx.StringLiteral().toString()));
	}

	private Optional<String> coveredTextExactly = Optional.absent();

	@Override
	public void enterCoveredTextExactly(CoveredTextExactlyContext ctx) {
		coveredTextExactly = Optional.absent();
	}

	@Override
	public void exitCoveredTextExactly(CoveredTextExactlyContext ctx) {
		coveredTextExactly = Optional.of(prepareStringLiteral(ctx.StringLiteral().toString()));
	}

	private Optional<String[]> coveredTextArray = Optional.absent();

	@Override
	public void enterCoveredTextArray(CoveredTextArrayContext ctx) {
		coveredTextArray = Optional.absent();		
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
}
