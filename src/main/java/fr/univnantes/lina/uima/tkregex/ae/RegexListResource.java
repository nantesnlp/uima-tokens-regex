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
import fr.univnantes.lina.uima.tkregex.antlr.AutomataParserListener;
import fr.univnantes.lina.uima.tkregex.antlr.ThrowingErrorListener;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexLexer;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser;
import fr.univnantes.lina.uima.tkregex.model.automata.Rule;
import fr.univnantes.lina.uima.tkregex.model.matchers.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.model.matchers.CustomMatcher;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.uima.UIMAFramework;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.DataResource;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.SharedResourceObject;
import org.apache.uima.resource.metadata.TypeDescription;
import org.apache.uima.util.Level;

import java.io.IOException;
import java.util.*;


public class RegexListResource implements SharedResourceObject {

	public static final String KEY_TOKEN_REGEX_RULES = "TokenRegexRules";
	private AutomataParserListener listener;
	
	@Override
	public void load(DataResource aData) throws ResourceInitializationException {
		CharStream input;
		try {
			UIMAFramework.getLogger().log(Level.FINE, "Loading resource " + KEY_TOKEN_REGEX_RULES + " at: " + aData.getUri());
			
			input = getCharStream(aData);
			UimaTokenRegexLexer lexer = new UimaTokenRegexLexer(input);
			lexer.removeErrorListeners();
			lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

			CommonTokenStream tokens = new CommonTokenStream(lexer);
			UimaTokenRegexParser parser = new UimaTokenRegexParser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(ThrowingErrorListener.INSTANCE);

			listener = new AutomataParserListener( parser );
			listener.setAllowMatchingEmptySequences(false);
			ParseTreeWalker.DEFAULT.walk(listener, parser.ruleList());
		} catch (IOException e) {
			throw new ResourceInitializationException(e);
		}
	}

	protected CharStream getCharStream(DataResource aData) throws IOException {
		return CharStreams.fromStream(aData.getInputStream());
	}


	public List<Rule> getRules() {
		return Collections.unmodifiableList(this.listener.getRules());
	}
	
	public Map<String, AnnotationMatcher> getShortcutMatchers() {
		return listener.getShortcutMatchers();
	}

	public Map<String, CustomMatcher> getJavaMatchers() {
		return listener.getJavaMatchers();
	}


//	public TypeDescription getIteratedTypeDescription() {
//		return this.listener.getMainIteraredType();
//	}

	public List<Type> getIteratedTypes() {
		return this.listener.getIteratedTypes();
	}

	public String getMatchingLabelString(Annotation word) {
		List<String> matcherNames = new LinkedList<String>();
		Set<String> labels = new HashSet<String>();
		for(String matcherName:this.listener.getShortcutMatchers().keySet()) {
			if(listener.getShortcutMatchers().get(matcherName).matches(word)) {
				matcherNames.add(matcherName);
				labels.add(listener.getShortcutMatchers().get(matcherName).getLabel());
			}
		}
		matcherNames.removeAll(labels);
		String otherLabelStr = matcherNames.isEmpty() ? "" : ("|" + Joiner.on(" ").join(matcherNames));
		return  Joiner.on(" ").join(labels) + otherLabelStr;
	}

	public List<String> getMatchingLabels(Annotation word) {
		List<String> l = new LinkedList<String>();
		for(String matcherName:this.listener.getShortcutMatchers().keySet()) {
			if(listener.getShortcutMatchers().get(matcherName).matches(word)) {
				l.add(matcherName + ">" + listener.getShortcutMatchers().get(matcherName).getLabel());
			}
		}
		return l;
	}


}