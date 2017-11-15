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
package fr.univnantes.lina.uima.tkregex.ae;

import com.google.common.base.Preconditions;
import fr.univnantes.lina.uima.tkregex.model.automata.RegexOccurrence;
import fr.univnantes.lina.uima.tkregex.model.automata.Rule;
import fr.univnantes.lina.uima.tkregex.model.matchers.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.model.matchers.CustomMatcher;
import org.apache.uima.UimaContext;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.descriptor.ExternalResource;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;


public abstract class TokenRegexAE extends JCasAnnotator_ImplBase {
	private static final String ERR_NO_MATCHER_IMPLEMENTATION_FOUND = "No implementation found for custom matcher %s";

	public static final String TOKEN_REGEX_RULES = "TokenRegexRules";
	@ExternalResource(key = TOKEN_REGEX_RULES, mandatory = true)
	protected RegexListResource resource = null;


	public static final String PARAM_ALLOW_OVERLAPPING_OCCURRENCES = "AllowOverlappingOccurrences";
	@ConfigurationParameter(name = PARAM_ALLOW_OVERLAPPING_OCCURRENCES, mandatory = false, defaultValue="false")
	private boolean allowOverlappingOccurrences;

	protected abstract void ruleMatched(JCas jCas, RegexOccurrence occurrence, Rule rule);
	protected void beforeRuleProcessing(JCas jCas) {}
	protected void afterRuleProcessing(JCas jCas) {}


	protected synchronized void registerBuiltinMatcher(String matcherName, AnnotationMatcher matcher) {
		Preconditions.checkArgument(resource.getJavaMatchers().containsKey(matcherName), "No such matcher declared in regex file: %s", matcherName);
		resource.getJavaMatchers().remove(matcherName).setMatcher(matcher);
	}

	private RegexEngine regexEngine;
	
	@Override
	public void initialize(UimaContext context) throws ResourceInitializationException {
		super.initialize(context);
		this.regexEngine = new RegexEngine(resource.getRules(), resource.getIteratedTypes(), (jCas, occurrence, rule) -> ruleMatched(jCas, occurrence, rule));
		this.regexEngine.setAllowOverlappingOccurrences(allowOverlappingOccurrences);
	}
	
	@Override
	public void process(final JCas jCas) throws AnalysisEngineProcessException {
		for(String matcherName: resource.getJavaMatchers().keySet()) {
			CustomMatcher customMatcher = resource.getJavaMatchers().get(matcherName);
			Preconditions.checkState(customMatcher.isReady(), ERR_NO_MATCHER_IMPLEMENTATION_FOUND, matcherName);
		}
		
		beforeRuleProcessing(jCas);

		regexEngine.process(jCas);
		
		afterRuleProcessing(jCas);
	}

	protected void allRulesFailed(JCas jCas) {}
	
}
