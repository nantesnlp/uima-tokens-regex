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
package fr.univnantes.lina.uima.tkregex.ae;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.descriptor.ExternalResource;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import fr.univnantes.lina.uima.tkregex.RecognitionHandler;
import fr.univnantes.lina.uima.tkregex.RegexOccurrence;
import fr.univnantes.lina.uima.tkregex.Rule;


public abstract class TokenRegexAE extends JCasAnnotator_ImplBase {

	public static final String TOKEN_REGEX_RULES = "TokenRegexRules";
	@ExternalResource(key = TOKEN_REGEX_RULES, mandatory = true)
	protected RegexListResource resource = null;
	
	private static final String NO_SET_LABEL = "_no_set_label";
	public static final String PARAM_SET_LABELS = "SetLabels";
	@ConfigurationParameter(name = PARAM_SET_LABELS, mandatory = false, defaultValue = NO_SET_LABEL)
	private String labelFeature = null;

	public static final String PARAM_ALLOW_OVERLAPPING_OCCURRENCES = "AllowOverlappingOccurrences";
	@ConfigurationParameter(name = PARAM_ALLOW_OVERLAPPING_OCCURRENCES, mandatory = false, defaultValue="false")
	private boolean allowOverlappingOccurrences;

	protected abstract void ruleMatched(JCas jCas, RegexOccurrence occurrence);
	protected void beforeRuleProcessing(JCas jCas) {}
	protected void afterRuleProcessing(JCas jCas) {}
	
	@Override
	public void process(final JCas jCas) throws AnalysisEngineProcessException {
		beforeRuleProcessing(jCas);
		
		if(!this.labelFeature.equals(NO_SET_LABEL)) {
			// Must set labels
			FSIterator<Annotation> it = jCas.getAnnotationIndex(getIteratedType(jCas)).iterator();
			Feature feat = this.getIteratedType(jCas).getFeatureByBaseName(this.labelFeature);
			while (it.hasNext()) {
				Annotation word = (Annotation) it.next();
				word.setStringValue(
						feat, 
						this.resource.getMatchingLabelString(word));
			}
		}
		
		RecognitionHandler recognitionHandler = new RecognitionHandler() {
			@Override
			public void recognizedEpisode(RegexOccurrence episode) {
				ruleMatched(jCas, episode);
			}
		};
		for (final Rule rule: this.resource.getRules()) {
			rule.getAutomaton().setAllowOverlappingInstances(this.allowOverlappingOccurrences);
			rule.getAutomaton().addRecognitionHandler(recognitionHandler);
			rule.getAutomaton().reset();
		}
		
		FSIterator<Annotation> it = jCas.getAnnotationIndex(getIteratedType(jCas)).iterator();
		while (it.hasNext()) {
			Annotation word = (Annotation) it.next();
			boolean allRulesFailed = true;
			for (Rule rule : this.resource.getRules()) {
				rule.getAutomaton().nextAnnotation(word);
				allRulesFailed &= rule.getAutomaton().currentInstancesNum() == 0;
			}
			if(allRulesFailed)
				allRulesFailed(jCas);
		}
		
		
		
		for (Rule rule : this.resource.getRules()) 
			rule.getAutomaton().finish();
		for (final Rule rule: this.resource.getRules()) 
			rule.getAutomaton().removeRecognitionHandler(recognitionHandler);
		
		
		afterRuleProcessing(jCas);
	}

	protected void allRulesFailed(JCas jCas) {}
	
	private Type getIteratedType(JCas cas) {
		return cas.getTypeSystem().getType(this.resource.getIteratedTypeDescription().getName());
	}
}
