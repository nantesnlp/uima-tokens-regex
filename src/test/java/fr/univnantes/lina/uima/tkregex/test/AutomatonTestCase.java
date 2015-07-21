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
package fr.univnantes.lina.uima.tkregex.test;


import static fr.univnantes.lina.uima.tkregex.test.TestUtils.automaton;
import static fr.univnantes.lina.uima.tkregex.test.TestUtils.automatonTest;
import static fr.univnantes.lina.uima.tkregex.test.TestUtils.javaTest;
import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.google.common.collect.ImmutableMap;

import fr.univnantes.lina.uima.tkregex.Automaton;

@RunWith(MockitoJUnitRunner.class)
public class AutomatonTestCase extends TestCase {
	
	@Test
	public void testMatchLastAnnotation() {
		/*
		 * Test if an automaton matching the last anno 
		 * of the sequence will succeed
		 */
		automatonTest(
				"a b", 
				"a b", 
				"a b (0,2)"
		);
	}
	
	@Test
	public void testMatcherLabel() {
		ImmutableMap<String, String> labels = ImmutableMap.of("a", "b", "c", "e");
		automatonTest(
				"a c b d", 
				automaton("a c b d", labels), 
				"b e b d (0,4)");
	}

	@Test
	public void testIgnorePattern() {
		Automaton a = automaton("~c b d");
		automatonTest(
				"a c b d", 
				a, 
				"b d (2,4)"
		);
		
		automatonTest(
				"a a c a c", 
				"a+ ~c", 
				"a a (0,2) | a (3,4)"
		);

		automatonTest(
				"a b a b a", 
				"a ~b ~a", 
				"a (0,1)"
		);
	}

	@Test
	public void testGreedy() {
		//greedy
		javaTest(
				"aaaaaa",
				"a*",
				"aaaaaa (0,6) |  (6,6)"
		);
		automatonTest(
				"a a a a a a", 
				"a*", 
				"a a a a a a (0,6) |  (none)"
		);

		
		javaTest(
				"abcabc",
				"a.*c",
				"abcabc (0,6)"
		);
		automatonTest(
				"a b c a b c", 
				"a .* c", 
				"a b c a b c (0,6)"
		);

		
		javaTest(
				"abcabc",
				"a.+",
				"abcabc (0,6)"
		);
		automatonTest(
				"a b c a b c", 
				"a .+", 
				"a b c a b c (0,6)"
		);
		
		
		javaTest(
				"aaa",
				"a+",
				"aaa (0,3)"
		);
		automatonTest(
				"a a a", 
				"a+", 
				"a a a (0,3)"
		);

		
		javaTest(
				"ab",
				"ab?",
				"ab (0,2)"
		);
		automatonTest(
				"a b", 
				"a b?", 
				"a b (0,2)"
		);

	}
	
	@Test
	public void testGreedy2() {
		// greedy *
		automatonTest(
				"a b c c d", 
				"a b c*", 
				"a b c c (0,4)"
				);

		automatonTest(
				"a b c c d", 
				"a b c+", 
				"a b c c (0,4)"
				);

		automatonTest(
				"a b c c d", 
				"a b c?", 
				"a b c (0,3)"
				);

		// lazy *
//		doTest(
//				"a b c c d", 
//				"a b c*?", 
//				"a b (0,2)"
//				);
		
//		doTest(
//				"a b c c d", 
//				"a b c+?", 
//				"a b c (0,3)"
//				);
	}
	
	@Test
	public void testDocile() {
		/*
		 *  docile (and backtrack) : give up characters a posteriori 
		 *  and try match the regex
		 */
		javaTest(
				"aaa",
				"a+.",
				"aaa (0,3)"
		);
		automatonTest(
				"a a a", 
				"a+ .", 
				"a a a (0,3)"
		);
	}
	
	@Test
	public void testImpatient() {

		/*
		 *  impatient : take the first alternative,
		 *  while the second one would match more characters
		 */
		javaTest(
				"aba",
				"a(b|ba)",
				"ab (0,2)"
		);

	}
	
	@Test
	public void testNoOverlap() {
		javaTest(
				"ababababa",
				"aba",
				"aba (0,3) | aba (4,7)"
		);

		automatonTest(
				"a b a b a b a b c", 
				"a b a", 
				"a b a (0,3) | a b a (4,7)"
				);
	}
	
	@Test
	public void testSucceedsIfItDoesNotMatchWholeSequence() {
		// succeeds
		javaTest(
				"aba",
				"ab",
				"ab (0,2)"
		);
		automatonTest(
				"a b a", 
				"a b", 
				"a b (0,2)"
		);
	}

	@Test
	public void test_0_N() {
		// ab*c
		automatonTest(
				"a c a b b b b c",
				"a b* c",
				"a c (0,2) | a b b b b c (2,8)"
		);
	}

	@Test
	public void test_1_N() {
		// Greedy +
		automatonTest(
				"a b b c a b b b b c", 
				"a b+ c", 
				"a b b c (0,4) | a b b b b c (4,10)"
		);
				

		automatonTest(
				"a c a b b b b c", 
				"a b+ c", 
				"a b b b b c (2,8)"
		);
	}

	
	
	@Test
	public void test_0_1() {
		automatonTest(
				"a c", 
				"a? b* c", 
				"a c (0,2)"
		);
		automatonTest(
				"b c", 
				"b? c", 
				"b c (0,2)"
				);
		automatonTest(
				"a b c", 
				"a b? c", 
				"a b c (0,3)"
				);
		automatonTest(
				"a c", 
				"a b? c", 
				"a c (0,2)"
		);

		automatonTest(
				"a b b c", 
				"a b? c", 
				""
		);

		automatonTest(
				"a b c", 
				"b? c", 
				"b c (1,3)"
		);

		automatonTest(
				"b b c", 
				"b? c", 
				"b c (1,3)"
		);

		automatonTest(
				"c d e c b", 
				"b? c", 
				"c (0,1) | c (3,4)"
		);

	}
	
	@Test
	public void testMatchesEmptySequence() {
		assertFalse(automaton("a").matchesEmptySequence());
		assertTrue(automaton("a?").matchesEmptySequence());
		assertTrue(automaton("a*").matchesEmptySequence());
		assertFalse(automaton("a+").matchesEmptySequence());
		assertFalse(automaton("a1").matchesEmptySequence());
		assertFalse(automaton("a2").matchesEmptySequence());
		assertFalse(automaton("a3").matchesEmptySequence());
		assertTrue(automaton("a? b* c? d*").matchesEmptySequence());
		assertFalse(automaton("a? b c? d*").matchesEmptySequence());
		assertFalse(automaton("a? b* c d*").matchesEmptySequence());
	}

	@Test
	public void test_N() {
		automatonTest(
				"a b b b b c d e a b b b c", 
				"a b4 c", 
				"a b b b b c (0,6)"
		);
		automatonTest(
				"a b b b b b c d e a b b b c", 
				"a b4 c", 
				""
		);
		automatonTest(
				"a b b b b c d e a b b b c", 
				"a b3 c", 
				"a b b b c (8,13)"
		);
	}
	
	@Test
	public void test_1() {
		// a
		automatonTest(
				"a b", 
				"a", 
				"a (0,1)"
				);

		// a
		automatonTest(
				"a", 
				"a", 
				"a (0,1)"
				);
		
		// a a
		automatonTest(
				"a a", 
				"a", 
				"a (0,1) | a (1,2)"
		);

	}

	@Test
	public void testAutomaton1() {
		// a?b*c
		automatonTest(
				"c", 
				"a? b* c", 
				"c (0,1)"
		);

		automatonTest(
				"b c", 
				"a? b* c", 
				"b c (0,2)"
		);

		automatonTest(
				"b b c", 
				"a? b* c", 
				"b b c (0,3)"
		);

		automatonTest(
				"a c", 
				"a? b* c", 
				"a c (0,2)"
		);

		automatonTest(
				"a b c", 
				"a? b* c", 
				"a b c (0,3)"
		);


		automatonTest(
				"a c", 
				"a? b* c", 
				"a c (0,2)"
		);

		automatonTest(
				"a b c b c b a c", 
				"a? b* c", 
				"a b c (0,3) | b c (3,5) | a c (6,8)"
		);

		automatonTest(
				"a b c d e r c", 
				"a? b* c", 
				"a b c (0,3) | c (6,7)"
		);
	}

	@Test
	public void testAutomaton2() {
		// a?b?c?e*f?g
		automatonTest(
				"a b c e f g", 
				"a? b? c? e* f? g", 
				"a b c e f g (0,6)"
		);

		automatonTest(
				"a b e f g", 
				"a? b? c? e* f? g", 
				"a b e f g (0,5)"
		);

		automatonTest(
				"g", 
				"a? b? c? e* f? g", 
				"g (0,1)"
		);

		automatonTest(
				"a e e e g", 
				"a? b? c? e* f? g", 
				"a e e e g (0,5)"
		);

		automatonTest(
				"a d e g", 
				"a? b? c? e* f? g", 
				"e g (2,4)"
		);
	}
	

}
