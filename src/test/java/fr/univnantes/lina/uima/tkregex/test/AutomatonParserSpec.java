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
package fr.univnantes.lina.uima.tkregex.test;


import com.google.common.collect.ImmutableSet;
import fr.univnantes.lina.uima.tkregex.ae.builtin.StringExactlyMatcher;
import fr.univnantes.lina.uima.tkregex.ae.builtin.StringIgnoreCaseMatcher;
import fr.univnantes.lina.uima.tkregex.ae.builtin.TitleCased;
import fr.univnantes.lina.uima.tkregex.antlr.AutomataParserListener;
import fr.univnantes.lina.uima.tkregex.antlr.AutomataParsingException;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexLexer;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser;
import fr.univnantes.lina.uima.tkregex.model.automata.*;
import fr.univnantes.lina.uima.tkregex.model.matchers.*;
import fr.univnantes.lina.uima.tkregex.test.asserts.Asserts;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.uima.cas.Type;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class AutomatonParserSpec {
	
	private List<Rule> rules;
	private AutomataParserListener listener;
	public void initAutomata(String rules) {
		initAutomata(rules, false);
	}
	
	
	public void initAutomata(String body, boolean allowMatchingEmptySequences) {
		String defaultHeader = "import fr.univnantes.termsuite.types.TermSuiteTypeSystem;\n" +
				"use fr.univnantes.termsuite.types.WordAnnotation;\n";
		initAutomataWithCustomHeader(body, allowMatchingEmptySequences, defaultHeader);
	}

	private void initAutomataFromFileWithCustomResourceDirectory(String regexFilePath,Path customDirectory) throws IOException {
		CharStream input = CharStreams.fromPath(AutomatonTests.RESOURCES.resolve(regexFilePath));
		UimaTokenRegexParser parser = initListenerAndGetParser(input);
		listener.setCustomResourceDir(customDirectory);
		ParseTreeWalker.DEFAULT.walk(listener, parser.ruleList());
		this.rules = listener.getRules();
	}

	private void initAutomataFromFile(String regexFilePath) throws IOException {
		CharStream input = CharStreams.fromPath(AutomatonTests.RESOURCES.resolve(regexFilePath));
		UimaTokenRegexParser parser = initListenerAndGetParser(input);
		ParseTreeWalker.DEFAULT.walk(listener, parser.ruleList());
		this.rules = listener.getRules();
	}

	private UimaTokenRegexParser initListenerAndGetParser(CharStream input) {
		UimaTokenRegexLexer lexer = new UimaTokenRegexLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		UimaTokenRegexParser parser = new UimaTokenRegexParser(tokens);
		listener = new AutomataParserListener( parser );
		return parser;
	}

	private void initAutomataWithCustomHeader(String body, boolean allowMatchingEmptySequences, String header) {
		body = header + body;
		
		CharStream input = CharStreams.fromString(body);
		UimaTokenRegexParser parser = initListenerAndGetParser(input);
		listener.setAllowMatchingEmptySequences(allowMatchingEmptySequences);
		ParseTreeWalker.DEFAULT.walk(listener, parser.ruleList());
		this.rules = listener.getRules();
	}
	
	private String file1 = "rule \"Tata\": [lemma==\"mang\"] /^(et|ou)$/ [];";
	private String file2 = "rule \"Test expression parsing\": [wordFloatTestFeat >= 0.9];";
	private String file3 = "rule \"Or expression\": [lemma==\"edee\" | wordFloatTestFeat >= 0.9 | stem != \"mang\"];";
	private String file4 = "rule \"Or/And tree expression\": [stem == \"bonj\" & (lemma == \"efbve\" | (wordFloatTestFeat >= 0.9 & wordIntTestFeat < 17) | stem != \"mang\" | (wordFloatTestFeat >= 0.9 & wordIntTestFeat > 18 & (lemma != \"salut\" | begin > 15 )))][lemma==\"edee\" | wordFloatTestFeat >= 0.9 | stem != \"mang\"];";
	private String file5_1 = "rule \"With quatifiers\": [lemma==\"mang\"]*;";
	private String file5_2 = "rule \"With quatifiers\": [lemma==\"mang\"]{2};";
	private String file5_3 = "rule \"With quatifiers\": [lemma==\"mang\"]+;";
	private String file5_4 = "rule \"With quatifiers\": [lemma==\"mang\"]?;";
	private String file6 = "rule \"Tata\": [];";
	private String file7 = "rule \"Regex\":    /Ftd?\"^\\\\a-Z/;";
	private String file8_1 = "rule \"With ignore matcher\":    /Ftd?\"^\\\\a-Z/ ~[lemma==\"mang\"];";
	private String file8_2 = "rule \"With ignore matcher\":    ~/Ftd?\"^\\\\a-Z/ [lemma==\"mang\"];";
	private String file9_1 = "matcher A: [lemma==\"mang\"]; rule \"a\": A A;";
	private String file9_2 = "matcher A as D: [lemma==\"mang\"]; rule \"a\": A A;";
	private String file9_3 = "matcher A as D: [lemma==\"mang\"]; matcher B: [lemma==\"mang\"]; rule \"a\": A B A;";

	@Test
	public void testThrowExceptionIfMatchesEmptySequence1() {
		// matches empty sequence
		try {
			initAutomata(file5_1, false);
			fail("Should throw exception");
		} catch(AutomataParsingException e) {
			assertTrue(e.getMessage().contains("empty sequence"));
		} catch(Exception e) {
			fail("Should throw AutomataParsingException");
		}
	}

	@Test
	public void testMultipleIteratedType() throws IOException {
		initAutomataFromFile("regex-files/multiple-iterated-types.regex");
		assertThat(listener.getIteratedTypes())
				.extracting("name")
				.containsExactly(
						"fr.univnantes.lina.test.uima.A",
						"fr.univnantes.lina.test.uima.B",
						"fr.univnantes.lina.test.uima.OccAnno"
						);
		assertThat(listener.getIteratedTypeShortcuts())
				.hasSize(3)
				.containsEntry("TA", listener.getIteratedTypeDescriptions().get(0))
				.containsEntry("TB", listener.getIteratedTypeDescriptions().get(1))
				.containsEntry("T3", listener.getIteratedTypeDescriptions().get(2))
		;
		assertThat(listener.getTypeMatchers())
				.hasSize(9)
				.containsOnlyKeys(
						"TA", "TB", "T3",
						"A", "B", "OccAnno",
						"fr.univnantes.lina.test.uima.A",
						"fr.univnantes.lina.test.uima.B",
						"fr.univnantes.lina.test.uima.OccAnno"
				)
		;
	}

	@Test
	public void testTypeMatcher() throws IOException {
		initAutomataFromFile("regex-files/multiple-iterated-types.regex");
		Type typeA = listener.getIteratedTypes().get(0);
		Type typeB = listener.getIteratedTypes().get(1);
		assertThat(listener.getRules()).hasSize(2);
		Automaton automaton = listener.getRules().stream().filter(r->r.getName().equals("rule1")).findFirst().get().getAutomaton();

		// matcher TA
		List<Transition> t1list = automaton.getInitState().getTransitions();
		assertThat(t1list).hasSize(1);
		AnnotationMatcher matcher1 = t1list.get(0).getMatcher();
		assertThat(matcher1).isInstanceOf(TypeMatcher.class);
		assertThat(((TypeMatcher)matcher1).getType()).isEqualTo(typeA);

		// matcher TB
		List<Transition> t2list = t1list.get(0).getToState().getTransitions().get(0).getToState().getTransitions();
		assertThat(t2list).hasSize(1);
		AnnotationMatcher matcher2 = t2list.get(0).getMatcher();
		assertThat(matcher2).isInstanceOf(TypeMatcher.class);
		assertThat(((TypeMatcher)matcher2).getType()).isEqualTo(typeB);

		// matcher A
		List<Transition> t3list = t2list.get(0).getToState().getTransitions().get(0).getToState().getTransitions();
		assertThat(t3list).hasSize(1);
		AnnotationMatcher matcher3 = t3list.get(0).getMatcher();
		assertThat(matcher3).isInstanceOf(TypeMatcher.class);
		assertThat(((TypeMatcher)matcher3).getType()).isEqualTo(typeA);

		// matcher B
		List<Transition> t4list = t3list.get(0).getToState().getTransitions().get(0).getToState().getTransitions();
		assertThat(t4list).hasSize(1);
		AnnotationMatcher matcher4 = t4list.get(0).getMatcher();
		assertThat(matcher4).isInstanceOf(TypeMatcher.class);
		assertThat(((TypeMatcher)matcher4).getType()).isEqualTo(typeB);

	}

	@Test
	public void testLoadResourceFromCurrentDirectory() throws IOException {
		initAutomataFromFile("regex-files/simple-list-from-current-directory.regex");
		assertThat(listener.getResources())
				.containsKeys("List1")
				.hasSize(1);
		assertThat(listener.getResources().get("List1"))
				.containsExactlyInAnyOrder("word1", "word2", "word3");
	}

	@Test
	public void testLoadTSVResource() throws IOException {
		initAutomataFromFile("regex-files/all-resource-types-from-current-directory.regex");
		assertThat(listener.getResources())
				.containsKeys("ListJSON1", "ListJSON2", "ListTSV", "ListYAML1", "ListYAML2", "ListSimple")
				.hasSize(6);
		assertThat(listener.getResources().get("ListJSON1"))
				.containsExactlyInAnyOrder("word1", "word2", "word3");
		assertThat(listener.getResources().get("ListJSON2"))
				.containsExactlyInAnyOrder("1", "word2", "word3");
		assertThat(listener.getResources().get("ListYAML1"))
				.containsExactlyInAnyOrder("word1", "word2", "word3");
		assertThat(listener.getResources().get("ListYAML2"))
				.containsExactlyInAnyOrder("1", "word2", "word3");
		assertThat(listener.getResources().get("ListSimple"))
				.containsExactlyInAnyOrder("word1", "word2", "word3");
		assertThat(listener.getResources().get("ListTSV"))
				.containsExactlyInAnyOrder("word1", "word2", "word3");

	}


		@Test
	public void testLoadResourceFromCustomDir() throws IOException {
		Path customDir = Paths.get("/tmp/sparklane-java-ner-tests");
		Path simpleListFile = AutomatonTests.RESOURCES.resolve("fix-resources/simple-list.txt");
		customDir.toFile().mkdirs();
		Files.copy(simpleListFile, customDir.resolve("simple-list.txt"), StandardCopyOption.REPLACE_EXISTING);
		initAutomataFromFileWithCustomResourceDirectory(
				"regex-files/simple-list-from-custom-directory.regex",
				customDir);
		assertThat(listener.getResources())
				.containsKeys("List1")
				.hasSize(1);
		assertThat(listener.getResources().get("List1"))
				.containsExactlyInAnyOrder("word1", "word2", "word3");
	}

	@Test
	public void testLoadResourceFromClasspath() throws IOException {
		assertThat(this.getClass().getResource("/fix-resources/simple-list.txt"))
				.isNotNull();
		initAutomataFromFile("regex-files/simple-list-from-classpath.regex");
		assertThat(listener.getResources())
				.containsKeys("List1")
				.hasSize(1);
		assertThat(listener.getResources().get("List1"))
				.containsExactlyInAnyOrder("word1", "word2", "word3");
	}


	@Test
	public void testThrowExceptionIfMatchesEmptySequence2() {
		try {
			initAutomata(file5_2, false);
		} catch(AutomataParsingException e) {
			fail("Should not throw the exception");
		} catch(Exception e) {
			fail("Should not throw any exception");
		}
	}
	@Test
	public void testThrowExceptionIfMatchesEmptySequence3() {
		try {
			initAutomata(file5_3, false);
		} catch(AutomataParsingException e) {
			fail("Should not throw the exception");
		} catch(Exception e) {
			fail("Should not throw any exception");
		}
	}
	@Test
	public void testThrowExceptionIfMatchesEmptySequence4() {
		// matches empty sequence
		try {
			initAutomata(file5_4, false);
			fail("Should throw exception");
		} catch(AutomataParsingException e) {
			assertTrue(e.getMessage().contains("empty sequence"));
		} catch(Exception e) {
			fail("Should throw AutomataParsingException");
		}
	}
	
	
	@Test
	public void testParseCustomJavaMatcher() {
		initAutomataWithCustomHeader("matcher A: [Tatayoyo]; rule \"a\": A A;",
				true,
				"import tata;\nuse fr.univnantes.lina.test.uima.TypeA;\njava-matcher: Tatayoyo;");
		Automaton a = rules.get(0).getAutomaton();
		Transition t1 = a.getInitState().getTransitions().iterator().next();
		assertEquals("A", t1.getMatcher().getLabel());
		assertThat(t1.getMatcher())
			.isInstanceOf(CustomMatcher.class);

	}

	@Test
	public void testParseBuiltMatcher() {
		initAutomata("matcher A: [TitleCased]; rule \"a\": A A;",
				true);
		Automaton a = rules.get(0).getAutomaton();
		Transition t1 = a.getInitState().getTransitions().iterator().next();
		assertEquals("A", t1.getMatcher().getLabel());
		assertThat(t1.getMatcher())
			.isInstanceOf(TitleCased.class);

	}
	

	@Test
	public void testParseCustomJavaMatcherFailedWhenBuiltinNotDeclared() {
		try {
			initAutomataWithCustomHeader("matcher A: [Tatayoyo]; rule \"a\": A A;",
					true,
					"import tata;\nuse fr.univnantes.lina.test.uima.TypeA;");
			fail("Should have raised exception");
		} catch(AutomataParsingException e) {
			assertThat(e.getMessage())
				.contains("No such custom nor builtin matcher: Tatayoyo");
		} catch(Exception e) {
			fail("Should have raised IllegalArgumentException, got: " + e.getClass());
		}
	}



	@Test
	public void testParseLabel() {
		initAutomata(file9_1, true);
		Automaton a = rules.get(0).getAutomaton();
		Transition t1 = a.getInitState().getTransitions().iterator().next();
		Transition t2 = t1.getToState().getTransitions().iterator().next().getToState().getTransitions().iterator().next();
		assertEquals("A", t1.getMatcher().getLabel());
		assertEquals("A", t2.getMatcher().getLabel());

		initAutomata(file9_2, true);
		a = rules.get(0).getAutomaton();
		t1 = a.getInitState().getTransitions().iterator().next();
		t2 = t1.getToState().getTransitions().iterator().next().getToState().getTransitions().iterator().next();
		assertEquals("D", t1.getMatcher().getLabel());
		assertEquals("D", t2.getMatcher().getLabel());

		initAutomata(file9_3, true);
		a = rules.get(0).getAutomaton();
		t1 = a.getInitState().getTransitions().iterator().next();
		t2 = t1.getToState().getTransitions().iterator().next().getToState().getTransitions().iterator().next();
		Transition t3 = t2.getToState().getTransitions().iterator().next().getToState().getTransitions().iterator().next();
		assertEquals("D", t1.getMatcher().getLabel());
		assertEquals("B", t2.getMatcher().getLabel());
		assertEquals("D", t3.getMatcher().getLabel());
	}

	@Test
	public void testParseIgnoreMatcher() {
		initAutomata(file8_1, true);
		Automaton a = rules.get(0).getAutomaton();
		Transition t1 = a.getInitState().getTransitions().iterator().next();
		Transition t2 = t1.getToState().getTransitions().iterator().next().getToState().getTransitions().iterator().next();
		assertFalse(t1.getMatcher().isIgnoreMatcher());
		assertTrue(t2.getMatcher().isIgnoreMatcher());

		initAutomata(file8_2, true);
		a = rules.get(0).getAutomaton();
		t1 = a.getInitState().getTransitions().iterator().next();
		t2 = t1.getToState().getTransitions().iterator().next().getToState().getTransitions().iterator().next();
		assertTrue(t1.getMatcher().isIgnoreMatcher());
		assertFalse(t2.getMatcher().isIgnoreMatcher());
	}

	@Test
	public void testParseQuantifier1() {
		initAutomata(file5_1, true);
		Automaton a = rules.get(0).getAutomaton();
		
		State initState = a.getInitState();
		assertEquals(1, initState.getTransitions().size());
		
		
		Transition transit1 = initState.getTransitions().get(0);
		Asserts.assertThat((ExpressionMatcher) transit1.getMatcher())
				.hasFeatureName("lemma");

		State state2 = transit1.getToState();
		assertTrue(!state2.equals(initState));
		assertTrue(a.isAccepting(state2));
		assertEquals(1, state2.getTransitions().size());
		
		Transition transit3 = state2.getTransitions().get(0);
		assertTrue(transit3.isEpsilon());
		assertEquals(initState, transit3.getToState());
		
		// Automata tests
		assertEquals(initState, a.getInitState());
		assertEquals(a.getStates(), ImmutableSet.of(initState, state2));
		assertEquals(a.getAcceptingStates(), ImmutableSet.of(initState, state2));
	}

	@Test
	public void testParseQuantifier2() {
		initAutomata(file5_2);
		Automaton a = rules.get(0).getAutomaton();
		
		State initState = a.getInitState();
		assertEquals(1, initState.getTransitions().size());
		
		Iterator<Transition> iterator = initState.getTransitions().iterator();
		
		Transition transit1 = iterator.next();
		Asserts.assertThat((ExpressionMatcher) transit1.getMatcher())
				.hasFeatureName("lemma");
		
		State state2 = transit1.getToState();
		assertTrue(!state2.equals(initState));
		assertTrue(!a.isAccepting(state2));
		assertEquals(1, state2.getTransitions().size());
		
		Transition transit2 = state2.getTransitions().get(0);
		assertTrue(transit2.isEpsilon());

		State state3 = transit2.getToState();
		assertTrue(!state3.equals(initState));
		assertTrue(!a.isAccepting(state3));
		assertEquals(1, state3.getTransitions().size());
		
		Transition transit3 = state3.getTransitions().get(0);
		Asserts.assertThat((ExpressionMatcher) transit3.getMatcher())
				.hasFeatureName("lemma");

		State state4 = transit3.getToState();
		assertTrue(!state3.equals(initState));
		assertTrue(a.isAccepting(state4));
		assertEquals(0, state4.getTransitions().size());

		// Automata tests
		assertEquals(initState, a.getInitState());
		assertEquals(a.getStates(), ImmutableSet.of(initState, state2, state3, state4));
		assertEquals(a.getAcceptingStates(), ImmutableSet.of(state4));
	}

	@Test
	public void testParseQuantifier3() {
		initAutomata(file5_3);
		Automaton a = rules.get(0).getAutomaton();
		
		State initState = a.getInitState();
		assertEquals(1, initState.getTransitions().size());
		
		Iterator<Transition> iterator = initState.getTransitions().iterator();
		
		Transition transit1 = iterator.next();
		Asserts.assertThat((ExpressionMatcher) transit1.getMatcher())
				.hasFeatureName("lemma");
		
		State state2 = transit1.getToState();
		assertTrue(!state2.equals(initState));
		assertTrue(a.isAccepting(state2));
		assertEquals(1, state2.getTransitions().size());
		
		Transition transit2 = state2.getTransitions().get(0);
		assertTrue(transit2.isEpsilon());

		State state3 = transit2.getToState();
		assertTrue(!state3.equals(initState));
		assertTrue(a.isAccepting(state3));
		assertEquals(1, state3.getTransitions().size());
		
		
		Transition transit3 = state3.getTransitions().get(0);
		Asserts.assertThat((ExpressionMatcher) transit3.getMatcher())
				.hasFeatureName("lemma");

		State state4 = transit3.getToState();
		assertTrue(!state3.equals(initState));
		assertTrue(a.isAccepting(state4));
		assertEquals(1, state4.getTransitions().size());

		Transition transit4 = state4.getTransitions().get(0);
		assertTrue(transit4.isEpsilon());
		assertEquals(state3, transit4.getToState());
		
		// Automata tests
		assertEquals(initState, a.getInitState());
		assertEquals(a.getStates(), ImmutableSet.of(initState, state2, state3, state4));
		assertEquals(a.getAcceptingStates(), ImmutableSet.of(state3, state4));
	}
	
	@Test
	public void testParseQuantifier4() {
		initAutomata(file5_4, true);
		Automaton a = rules.get(0).getAutomaton();
		
		State initState = a.getInitState();
		assertEquals(2, initState.getTransitions().size());
		
		Transition transit11 = initState.getTransitions().get(0);
		Asserts.assertThat((ExpressionMatcher) transit11.getMatcher())
				.hasFeatureName("lemma");
		
		State state2 = transit11.getToState();
		assertTrue(!state2.equals(initState));
		assertTrue(a.isAccepting(state2));
		assertEquals(1, state2.getTransitions().size());
		
		Transition transit12 = initState.getTransitions().get(1);
		assertTrue(transit12.isEpsilon());

		Transition transit2 = state2.getTransitions().get(0);
		assertTrue(transit2.isEpsilon());
		
		State state3 = transit2.getToState();
		assertEquals(state3, transit12.getToState());
		assertTrue(!state3.equals(initState));
		assertTrue(a.isAccepting(state3));
		assertEquals(0, state3.getTransitions().size());
		
		// Automata tests
		assertEquals(initState, a.getInitState());
		assertEquals(a.getStates(), ImmutableSet.of(initState, state2, state3));
		assertEquals(a.getAcceptingStates(), ImmutableSet.of(state3));
	}
	
	@Test
	public void testOrExpression() {
		initAutomata(file3);
		State initState = this.rules.get(0).getAutomaton().getInitState();
		Transition transition = initState.getTransitions().iterator().next();
		OrMatcher matcher = (OrMatcher)transition.getMatcher();
		
		List<AnnotationMatcher> disjonctionParts = matcher.getDisjonctionParts();
		assertEquals(3, disjonctionParts.size());

		ExpressionMatcher expr1 = (ExpressionMatcher)disjonctionParts.get(0);
		Asserts.assertThat(expr1)
				.hasOperator(Op.EQ)
				.hasValueType(ExpressionMatcher.TYPE_STRING)
				.hasValue("edee")
				.hasFeatureName("lemma")
				;

		ExpressionMatcher expr2 = (ExpressionMatcher)disjonctionParts.get(1);
		Asserts.assertThat(expr2)
				.hasOperator(Op.GTE)
				.hasValueType(ExpressionMatcher.TYPE_FLOAT)
				.hasValue(0.9f)
				.hasFeatureName("wordFloatTestFeat")
				;


		ExpressionMatcher expr3 = (ExpressionMatcher)disjonctionParts.get(2);
		Asserts.assertThat(expr3)
				.hasOperator(Op.NEQ)
				.hasValueType(ExpressionMatcher.TYPE_STRING)
				.hasValue("mang")
				.hasFeatureName("stem")
		;


	}

	@Test
	public void testSimpleExpression() {
		initAutomata(file2);
		State initState = this.rules.get(0).getAutomaton().getInitState();
		Transition transition = initState.getTransitions().iterator().next();
		ExpressionMatcher matcher = (ExpressionMatcher)transition.getMatcher();
		Asserts.assertThat(matcher)
				.hasOperator(Op.GTE)
				.hasValueType(ExpressionMatcher.TYPE_FLOAT)
				.hasValue(0.9f)
				.hasFeatureName("wordFloatTestFeat");
	}

	@Test
	public void testParsingOk() {
		initAutomata(file1);
		assertEquals(1, rules.size());
		Automaton a = rules.get(0).getAutomaton();
		assertEquals("Tata", rules.get(0).getName());
		
		State initState = a.getInitState();
		assertTrue(!a.isAccepting(initState));
		assertEquals(1, initState.getTransitions().size());
		
		Transition transition1 = initState.getTransitions().iterator().next();
		assertEquals(ExpressionMatcher.class, transition1.getMatcher().getClass());
		
		State state2 = transition1.getToState();
		assertTrue(!a.isAccepting(state2));
		assertEquals(1, state2.getTransitions().size());
		
		Transition transition2 = state2.getTransitions().iterator().next();
		assertTrue(transition2.isEpsilon());
		
		State state3 = transition2.getToState();
		assertEquals(1, state3.getTransitions().size());
		assertTrue(!a.isAccepting(state3));
		
		Transition transition3 = state3.getTransitions().iterator().next();
		assertEquals(RegexCoveredTextMatcher.class, transition3.getMatcher().getClass());

		State state4 = transition3.getToState();
		assertTrue(!a.isAccepting(state4));
		assertEquals(1, state4.getTransitions().size());

		Transition transition4 = state4.getTransitions().iterator().next();
		assertTrue(transition4.isEpsilon());

		State state5 = transition4.getToState();
		assertEquals(1, state5.getTransitions().size());
		assertTrue(!a.isAccepting(state5));
		
		Transition transition5 = state5.getTransitions().iterator().next();
		assertTrue(AnnotationMatcher.EMPTY_MATCHER == transition5.getMatcher());

		State state6 = transition5.getToState();
		assertEquals(0, state6.getTransitions().size());
		assertTrue(a.isAccepting(state6));
		
		// automata global tests
		assertEquals(initState, a.getInitState());
		assertEquals(a.getStates(), ImmutableSet.of(initState, state2, state3, state4, state5, state6));
		assertEquals(a.getAcceptingStates(), ImmutableSet.of(state6));
	}

	@Test
	public void testParseEmptyMatcher() {
		initAutomata(file6);
		assertEquals(1, rules.size());
		assertEquals("Tata", rules.get(0).getName());
		State initState = rules.get(0).getAutomaton().getInitState();
		assertEquals(1, initState.getTransitions().size());
		Transition matcher = initState.getTransitions().iterator().next();
		assertTrue(AnnotationMatcher.EMPTY_MATCHER == matcher.getMatcher());
	}


	@Test
	public void testParseCoveredTextIgnoreCase() {
		initAutomata("rule \"Tata\": [text == \"mang\"];");
		Automaton a = rules.get(0).getAutomaton();
		assertEquals(1, a.getInitState().getTransitions().size());
		Transition transition1 = a.getInitState().getTransitions().iterator().next();
		assertThat(transition1.getMatcher())
			.isInstanceOf(StringIgnoreCaseMatcher.class);
		assertThat(((StringIgnoreCaseMatcher)transition1.getMatcher()).getRef())
			.isEqualTo("mang");
	}
	
	@Test
	public void testParseCoveredTextArray() {
		initAutomata("rule \"Tata\": [text in [ \"A\" , \"B\" , \"c\"]];");
		Automaton a = rules.get(0).getAutomaton();
		assertEquals(1, a.getInitState().getTransitions().size());
		Transition transition1 = a.getInitState().getTransitions().iterator().next();
		assertThat(transition1.getMatcher())
			.isInstanceOf(StringArrayMatcher.class);
		StringArrayMatcher matcher = (StringArrayMatcher)transition1.getMatcher();
		assertThat(matcher.getValues())
			.hasSize(3)
			.containsOnly("A", "B", "c")
			;
		Asserts.assertThat(matcher).doesNotIgnoreCase();
	}

	@Test
	public void testParseCoveredTextArrayIgnoreCase() {
		initAutomata("rule \"Tata\": [text inIgnoreCase [ \"A\" , \"B\" , \"c\"]];");
		Automaton a = rules.get(0).getAutomaton();
		assertEquals(1, a.getInitState().getTransitions().size());
		Transition transition1 = a.getInitState().getTransitions().iterator().next();
		assertThat(transition1.getMatcher())
				.isInstanceOf(StringArrayMatcher.class);
		StringArrayMatcher matcher = (StringArrayMatcher)transition1.getMatcher();
		assertThat(matcher.getValues())
				.hasSize(3)
				.containsOnly("a", "b", "c")
		;
		Asserts.assertThat(matcher).ignoresCase();
	}



	@Test
	public void testParseCoveredTextExactly() {
		initAutomata("rule \"Tata\": [text ===  \"mang\"];");
		Automaton a = rules.get(0).getAutomaton();
		assertEquals(1, a.getInitState().getTransitions().size());
		Transition transition1 = a.getInitState().getTransitions().iterator().next();
		assertThat(transition1.getMatcher())
			.isInstanceOf(StringExactlyMatcher.class);
		
		assertThat(((StringExactlyMatcher)transition1.getMatcher()).getRef())
			.isEqualTo("mang");
	}

	
	@Test
	public void testTryParseVeryComplexExpression() {
		initAutomata("matcher A: /a/; matcher B: /b/; matcher C: /c/; rule \"plussub\": C (A B | (C (~B{5} | A B)?)+)* A;");
	}

	
	@Test
	public void testParseExpressionWithOrSubautomata() {
		initAutomata("matcher A: /a/; matcher B: /b/; matcher C: /c/; rule \"plussub\": C (A B | C);");

		Automaton automaton = this.rules.get(0).getAutomaton();
		
		State initState = automaton.getInitState();
		assertThat(initState.getTransitions()).hasSize(1);
		Transition transition = initState.getTransitions().iterator().next();
		assertThat(transition.getMatcher().getLabel())
			.isEqualTo("C");
		State state1 = transition.getToState();
		assertThat(state1.getTransitions()).hasSize(1);
		Transition epsilonTransition = state1.getTransitions().get(0);
		assertThat(epsilonTransition).isInstanceOf(EpsilonTransition.class);
		State state2 = epsilonTransition.getToState();
		assertThat(state2.getTransitions()).hasSize(2);
		assertThat(state2.getTransitions().get(0).getMatcher().getLabel()).isEqualTo("A");
		assertThat(state2.getTransitions().get(1)).isInstanceOf(EpsilonTransition.class);

		State state3 = state2.getTransitions().get(0).getToState();
		assertThat(state3.getTransitions()).hasSize(1);
		assertThat(state3.getTransitions().get(0)).isInstanceOf(EpsilonTransition.class);
		State state4 = state3.getTransitions().get(0).getToState();
		
		assertThat(state4.getTransitions().get(0).getMatcher().getLabel()).isEqualTo("B");
		assertThat(automaton.getAcceptingStates()).contains(state4.getTransitions().get(0).getToState());


		State state5 = state2.getTransitions().get(1).getToState();
		assertThat(state5.getTransitions()).hasSize(1);
		assertThat(state5.getTransitions().get(0).getMatcher().getLabel()).isEqualTo("C");
		State state6 = state5.getTransitions().get(0).getToState();
		assertThat(state6.getTransitions()).hasSize(0);
		assertThat(automaton.getAcceptingStates()).contains(state6);
	}

	@Test
	public void testParseExpressionWithPlusSubautomata() {
		initAutomata("matcher A: /a/; matcher B: /b/; matcher C: /c/; rule \"plussub\": C (A B)*;");
		
		Automaton automaton = this.rules.get(0).getAutomaton();
		State initState = automaton.getInitState();
		assertThat(initState.getTransitions()).hasSize(1);
		Transition transition = initState.getTransitions().iterator().next();
		assertThat(transition.getMatcher().getLabel())
			.isEqualTo("C");
		State state1 = transition.getToState();
		assertThat(state1.getTransitions()).hasSize(1);
		Transition epsilonTransition = state1.getTransitions().get(0);
		assertThat(epsilonTransition).isInstanceOf(EpsilonTransition.class);
		State state2 = epsilonTransition.getToState();
		assertThat(state2.getTransitions()).hasSize(1);
		assertThat(state2.getTransitions().get(0).getMatcher().getLabel()).isEqualTo("A");
		State state3 = state2.getTransitions().get(0).getToState();
		assertThat(state3.getTransitions()).hasSize(1);
		Transition transition2 = state3.getTransitions().get(0);
		assertThat(transition2).isInstanceOf(EpsilonTransition.class);

		State state4 = transition2.getToState();
		assertThat(state4.getTransitions()).hasSize(1);
		Transition transition3 = state4.getTransitions().get(0);
		assertThat(transition3.getMatcher().getLabel()).isEqualTo("B");
		State state5 = transition3.getToState();
		assertThat(state5.getTransitions()).hasSize(1);
		assertThat(state5.getTransitions().get(0)).isInstanceOf(EpsilonTransition.class);
		assertThat(state5.getTransitions().get(0).getToState()).isEqualTo(state2);
		assertThat(automaton.getAcceptingStates()).contains(state5);
	}

	
	@Test
	public void testParseExpressionWithBasicOrBranching() {
		initAutomata("matcher A: /a/; matcher B: /b/; matcher C: /c/; rule \"or\": C (A | B | C);");
		
		Automaton automaton = this.rules.get(0).getAutomaton();
		State initState = automaton.getInitState();
		assertThat(initState.getTransitions())
			.hasSize(1);
		Transition transition = initState.getTransitions().iterator().next();
		assertThat(transition.getMatcher().getLabel())
			.isEqualTo("C");
		State state1 = transition.getToState();
		assertThat(state1.getTransitions()).hasSize(1);
		Transition epsilonTransition = state1.getTransitions().get(0);
		assertThat(epsilonTransition).isInstanceOf(EpsilonTransition.class);

		State state2 = epsilonTransition.getToState();
		assertThat(state2.getTransitions()).hasSize(3);
		assertThat(state2.getTransitions().get(0).getMatcher().getLabel()).isEqualTo("A");
		assertThat(state2.getTransitions().get(1)).isInstanceOf(EpsilonTransition.class);
		assertThat(state2.getTransitions().get(2)).isInstanceOf(EpsilonTransition.class);
		assertThat(automaton.getAcceptingStates())
			.contains(state2.getTransitions().get(0).getToState());
		State state3 = state2.getTransitions().get(1).getToState();
		assertThat(state3.getTransitions()).hasSize(1);
		assertThat(state3.getTransitions().get(0).getMatcher().getLabel()).isEqualTo("B");
		assertThat(automaton.getAcceptingStates())
			.contains(state3.getTransitions().get(0).getToState());

		State state4 = state2.getTransitions().get(2).getToState();
		assertThat(state4.getTransitions()).hasSize(1);
		assertThat(state4.getTransitions().get(0).getMatcher().getLabel()).isEqualTo("C");
		assertThat(automaton.getAcceptingStates())
			.contains(state4.getTransitions().get(0).getToState());
	}

	
	
	@Test
	public void testParseExpressionMatcherAndOrTree() {
		initAutomata(file4);
		
		Automaton automaton = this.rules.get(0).getAutomaton();
		State initState = automaton.getInitState();
		Transition transition = initState.getTransitions().iterator().next();
		AndMatcher matcher = (AndMatcher)transition.getMatcher();
		
		List<AnnotationMatcher> conjonctionParts = matcher.getSubExpressions();
		assertEquals(2, conjonctionParts.size());

		ExpressionMatcher expr1 = (ExpressionMatcher)conjonctionParts.get(0);
		Asserts.assertThat(expr1)
				.hasOperator(Op.EQ)
				.hasValueType(ExpressionMatcher.TYPE_STRING)
				.hasValue("bonj")
				.hasFeatureName("stem");

		// 1st depth-1 OrMatcher
		OrMatcher orMatcher = (OrMatcher)conjonctionParts.get(1);
		List<AnnotationMatcher> disjonctionParts = orMatcher.getDisjonctionParts();
		assertEquals(4, disjonctionParts.size());

		
		ExpressionMatcher expr2 = (ExpressionMatcher) disjonctionParts.get(0);
		Asserts.assertThat(expr2)
				.hasOperator(Op.EQ)
				.hasValueType(ExpressionMatcher.TYPE_STRING)
				.hasValue("efbve")
				.hasFeatureName("lemma");

		// 1st depth-2 AndMatcher
		AndMatcher andMatcher = (AndMatcher)disjonctionParts.get(1);
		List<AnnotationMatcher> conjonctionParts2 = andMatcher.getSubExpressions();
		assertEquals(2, conjonctionParts2.size());

		
		ExpressionMatcher expr3 = (ExpressionMatcher) conjonctionParts2.get(0);
		Asserts.assertThat(expr3)
				.hasOperator(Op.GTE)
				.hasValueType(ExpressionMatcher.TYPE_FLOAT)
				.hasValue(0.9f)
				.hasFeatureName("wordFloatTestFeat");

		ExpressionMatcher expr4 = (ExpressionMatcher)conjonctionParts2.get(1);
		Asserts.assertThat(expr4)
				.hasOperator(Op.LT)
				.hasValueType(ExpressionMatcher.TYPE_INT)
				.hasValue(17)
				.hasFeatureName("wordIntTestFeat");

		// end depth-2 AndMatcher
		
		ExpressionMatcher expr5 = (ExpressionMatcher)disjonctionParts.get(2);
		Asserts.assertThat(expr5)
				.hasOperator(Op.NEQ)
				.hasValueType(ExpressionMatcher.TYPE_STRING)
				.hasValue("mang")
				.hasFeatureName("stem");


		// 2nd depth-2 AndMatcher
		AndMatcher andMatcher2 = (AndMatcher)disjonctionParts.get(3);
		List<AnnotationMatcher> conjonctionParts3 = andMatcher2.getSubExpressions();
		assertEquals(3, conjonctionParts3.size());

		ExpressionMatcher expr6 = (ExpressionMatcher) conjonctionParts3.get(0);
		Asserts.assertThat(expr6)
				.hasOperator(Op.GTE)
				.hasValueType(ExpressionMatcher.TYPE_FLOAT)
				.hasValue(0.9f)
				.hasFeatureName("wordFloatTestFeat");


		ExpressionMatcher expr7 = (ExpressionMatcher) conjonctionParts3.get(1);
		Asserts.assertThat(expr7)
				.hasOperator(Op.GT)
				.hasValueType(ExpressionMatcher.TYPE_INT)
				.hasValue(18)
				.hasFeatureName("wordIntTestFeat");


		// depth-3 OrMatcher
		OrMatcher orMatcher2 = (OrMatcher)conjonctionParts3.get(2);
		List<AnnotationMatcher> disjonctionParts2 = orMatcher2.getDisjonctionParts();
		assertEquals(2, disjonctionParts2.size());
		
		ExpressionMatcher expr8 = (ExpressionMatcher) disjonctionParts2.get(0);
		Asserts.assertThat(expr8)
				.hasOperator(Op.NEQ)
				.hasValueType(ExpressionMatcher.TYPE_STRING)
				.hasValue("salut")
				.hasFeatureName("lemma");


		ExpressionMatcher expr9 = (ExpressionMatcher) disjonctionParts2.get(1);
		Asserts.assertThat(expr9)
				.hasOperator(Op.GT)
				.hasValueType(ExpressionMatcher.TYPE_INT)
				.hasValue(15)
				.hasFeatureName("begin");

		// end depth-3 OrMatcher
		// end depth-2 AndMatcher
	}

	@Test
	public void testParseExpressionMatcherRegex() {
		initAutomata(file7);
		assertEquals(1, rules.size());
		assertEquals("Regex", rules.get(0).getName());
		State initState = rules.get(0).getAutomaton().getInitState();
		assertEquals(1, initState.getTransitions().size());
		Transition matcher = initState.getTransitions().iterator().next();
		assertEquals(RegexCoveredTextMatcher.class, matcher.getMatcher().getClass());
		assertEquals(Pattern.compile("Ftd?\"^\\\\a-Z").toString(), ((RegexCoveredTextMatcher)matcher.getMatcher()).getPattern().toString());

	}



}
