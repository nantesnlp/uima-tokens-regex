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

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import fr.univnantes.lina.test.uima.OccAnno;
import org.apache.uima.UIMAFramework;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.factory.ExternalResourceFactory;
import org.apache.uima.fit.pipeline.SimplePipeline;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ExternalResourceDescription;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import com.google.common.base.Charsets;

import fr.univnantes.julestar.uima.testing.CasAssert;
import fr.univnantes.lina.uima.tkregex.ae.RegexListResource;
import fr.univnantes.lina.uima.tkregex.ae.TokenRegexAE;
import fr.univnantes.lina.uima.tkregex.test.utils.Fixtures;
import fr.univnantes.lina.uima.tkregex.test.utils.RecogEngine;
import fr.univnantes.lina.uima.tkregex.test.utils.TestUtils;

public class OnCasFunctionalTestCase {

	private JCas  cas;
	
	@Rule
	public TemporaryFolder root = new TemporaryFolder();
	
	@Test
	public void testCas1() throws Exception {
		runAutomaton("a b c c d e f a c", "A ~[]? C");
		new CasAssert(cas)
				.hasNAnnotationOfType(OccAnno.class, 2)
				.containsAnnotation(OccAnno.class, 0, 5)
				.containsAnnotation(OccAnno.class, 14, 17)
				;
	}

	@Test
	public void testCas2() throws Exception {
		runAutomaton("a b c b c d f b c d a", "(B C)+ D");
		new CasAssert(cas)
				.hasNAnnotationOfType(OccAnno.class, 2)
				.containsAnnotation(OccAnno.class, 2, 11)
				.containsAnnotation(OccAnno.class, 14, 19)
				;
	}
	
	
	@Test
	public void testCas3() throws Exception {
		runAutomaton("a d b d c a c b a b d g h a c d f a e f d a e f e f d a e f e f e f d", "A (B | C | (E F){2})+ D");
		new CasAssert(cas)
				.hasNAnnotationOfType(OccAnno.class, 3)
				.containsAnnotation(OccAnno.class, 16, 21)
				.containsAnnotation(OccAnno.class, 26, 31)
				.containsAnnotation(OccAnno.class, 42, 53)
				;
	}

	private void runAutomaton(String casString, String automataRule) throws Exception, AnalysisEngineProcessException {
		cas = Fixtures.createTestCas(casString);
		AnalysisEngine engine = createAE(automataRule);
		SimplePipeline.runPipeline(cas, engine);
	}
	
	private AnalysisEngine createAE(String automataRule)
			throws Exception {
		Path templatePath = Paths.get("src", "test", "resources", "template-mwt-rules.regex");
		File mwtRulesFile = root.newFile();
		String template = TestUtils.readFile(templatePath, Charsets.UTF_8);
		String mwtText = template.replace("RULE_PATTERN", automataRule);
		TestUtils.writeToFile(mwtRulesFile, Charsets.UTF_8, mwtText);
		AnalysisEngineDescription ae = AnalysisEngineFactory.createEngineDescription(RecogEngine.class);
		ExternalResourceDescription	mwtRulesResources = ExternalResourceFactory.createExternalResourceDescription(
				RegexListResource.class,
				mwtRulesFile.toURI().toURL().toString()
			);
		ExternalResourceFactory.bindResource(
				ae, 
				TokenRegexAE.TOKEN_REGEX_RULES, 
				mwtRulesResources);
		AnalysisEngine engine = UIMAFramework.produceAnalysisEngine(ae);
		return engine;
	}

	
}
