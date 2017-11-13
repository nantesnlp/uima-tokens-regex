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

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.univnantes.lina.test.uima.TestAnno;
import org.apache.uima.UIMAException;
import org.apache.uima.cas.Feature;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.fit.factory.TypeSystemDescriptionFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.metadata.TypeDescription;
import org.apache.uima.resource.metadata.TypeSystemDescription;

public class Fixtures {

	public static Feature feature(String featShortName) throws UIMAException {
		List<Feature> features = new ArrayList<>();
		Iterator<Feature> iterator = JCasFactory.createJCas().getTypeSystem().getFeatures();
		while(iterator.hasNext()) {
			Feature f = iterator.next();
			if(f.getShortName().equals(featShortName))
				features.add(f);
		}
		if(features.isEmpty())
			throw new IllegalArgumentException("No such feature found: " + featShortName);
		else if(features.size() > 1)
			throw new IllegalArgumentException(String.format("Amibiguous feature name <%s>. Features: <%s>", featShortName, features) );
		else
			return features.get(0);

	}

	public static JCas createTestCas(String documentString) {
		String tsPath = Paths.get("src", "test", "resources", "TestTypeSystem.xml").toString();
		TypeSystemDescription tsd = TypeSystemDescriptionFactory.createTypeSystemDescriptionFromPath(tsPath);
		
		for(TypeDescription td:tsd.getTypes()) {
			System.out.println(td);
		}
		
		
		try {
			JCas cas = JCasFactory.createJCas(tsd);
			cas.setDocumentText(documentString);
			StringBuffer buffer = new StringBuffer();
			int lastBegin = 0;
			boolean inWord = false;
			int i;
			for(i = 0 ; i < documentString.length() ; i++) {
				if(Character.isWhitespace(documentString.charAt(i))) {
					if(inWord) {
						createAnno(cas, lastBegin, i, buffer.toString());
						inWord = false;
					}
				} else {
					if(!inWord) {
						lastBegin = i;
						buffer = new StringBuffer();
						inWord = true;
					}
					buffer.append(documentString.charAt(i));
				}
			}
			if(inWord)
				createAnno(cas, lastBegin, i, buffer.toString());
			return cas;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static void createAnno(JCas cas, int begin, int end, String lemma) {
		TestAnno a = new TestAnno(cas);
		a.setBegin(begin);
		a.setEnd(end);
		a.setLemma(lemma);
		a.addToIndexes();
	}
}
