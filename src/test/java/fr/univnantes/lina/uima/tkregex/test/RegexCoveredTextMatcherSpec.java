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


import fr.univnantes.lina.uima.tkregex.model.matchers.RegexCoveredTextMatcher;
import org.apache.uima.jcas.tcas.Annotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class RegexCoveredTextMatcherSpec {
	public Annotation getAnnotation(String coveredText) {
		Annotation anno = Mockito.mock(Annotation.class);
		Mockito.when(anno.getCoveredText()).thenReturn(coveredText);
		return anno;
	}
	
	@Test
	public void testMatch() {
		doTest("Le baccalauréat", "bac", true);
		// should be case-insensitive
		doTest("Le baccalauréat", "baC", true);
		doTest("Le baccalauréat", "^bac", false);
		doTest("Le baccalauréat", "^Le bac", true);
		doTest("Le baccalauréat", "^Le bac$", false);
		doTest("Le baccalauréat", "^Le b(a|e)?c*", true);
		doTest("Le baccalauréat", "^Le{2} b(a|e)?c*", false);
	}

	public void doTest(String coveredText, String regex, boolean matches) {
		RegexCoveredTextMatcher m = new RegexCoveredTextMatcher(regex);
		assertEquals(matches, m.matches(getAnnotation(coveredText)));
	}
}
