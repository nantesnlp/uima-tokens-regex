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
package fr.univnantes.lina.uima.tkregex.test.utils;

import fr.univnantes.lina.test.uima.OccAnno;
import fr.univnantes.lina.uima.tkregex.ae.TokenRegexAE;
import fr.univnantes.lina.uima.tkregex.model.automata.RegexOccurrence;
import fr.univnantes.lina.uima.tkregex.model.automata.Rule;
import fr.univnantes.lina.uima.tkregex.model.matchers.LabelledAnnotation;
import org.apache.uima.jcas.JCas;

import java.util.stream.Collectors;

public class RecogEngine extends TokenRegexAE {
	@Override
	protected void ruleMatched(JCas jCas, RegexOccurrence occurrence, Rule rule) {
		OccAnno a = new OccAnno(jCas);
		a.setBegin(occurrence.getBegin());
		a.setEnd(occurrence.getEnd());
		a.setRule(rule.getName());
		a.setPattern(occurrence.getLabelledAnnotations().stream().map(LabelledAnnotation::getLabel).collect(Collectors.joining(" ")));
		a.addToIndexes();
	}
}