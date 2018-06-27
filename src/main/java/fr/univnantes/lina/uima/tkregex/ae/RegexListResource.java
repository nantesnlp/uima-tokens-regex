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

import com.google.common.base.Joiner;
import fr.univnantes.lina.uima.tkregex.TokensRegex;
import fr.univnantes.lina.uima.tkregex.model.automata.Rule;
import fr.univnantes.lina.uima.tkregex.model.matchers.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.model.matchers.CustomMatcher;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.DataResource;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.SharedResourceObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;


public class RegexListResource implements SharedResourceObject {

	private static final Logger LOGGER = LoggerFactory.getLogger(RegexListResource.class);

	public static final String KEY_TOKEN_REGEX_RULES = "TokenRegexRules";

	public List<Rule> getRules() {
		return regexList.getRules();
	}

	public List<Type> getIteratedTypes() {
		return regexList.getIteratedTypes();
	}

	public Map<String, AnnotationMatcher> getShortcutMatchers() {
		return regexList.getShortcutMatchers();
	}

	public Map<String, CustomMatcher> getJavaMatchers() {
		return regexList.getJavaMatchers();
	}

	private RegexList regexList;
	
	@Override
	public void load(DataResource aData) throws ResourceInitializationException {
		try {
			regexList = TokensRegex.parseRegexList(aData.getUrl());
		} catch (Exception e) {
			throw new ResourceInitializationException(e);
		}
	}

	public String getMatchingLabelString(Annotation word) {
		List<String> matcherNames = new LinkedList<String>();
		Set<String> labels = new HashSet<String>();
		for(String matcherName:regexList.getShortcutMatchers().keySet()) {
			if(regexList.getShortcutMatchers().get(matcherName).matches(word)) {
				matcherNames.add(matcherName);
				labels.add(regexList.getShortcutMatchers().get(matcherName).getLabel());
			}
		}
		matcherNames.removeAll(labels);
		String otherLabelStr = matcherNames.isEmpty() ? "" : ("|" + Joiner.on(" ").join(matcherNames));
		return  Joiner.on(" ").join(labels) + otherLabelStr;
	}

	public List<String> getMatchingLabels(Annotation word) {
		List<String> l = new LinkedList<String>();
		for(String matcherName:regexList.getShortcutMatchers().keySet()) {
			if(regexList.getShortcutMatchers().get(matcherName).matches(word)) {
				l.add(matcherName + ">" + regexList.getShortcutMatchers().get(matcherName).getLabel());
			}
		}
		return l;
	}

}