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

import org.apache.uima.UIMAException;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.mockito.Mockito;

public class Mocks {

	public static JCas cas() throws UIMAException {
		return JCasFactory.createJCas();
	}

	public static <T extends Annotation> T anno(JCas cas, Class<T> cls, int begin, int end) throws CASException {
		AnnotationFS annotation = cas
				.getCas().createAnnotation(
						cas.getRequiredType(cls.getName()),
						begin,
						end);
		cas.addFsToIndexes(annotation);
		return (T) annotation;
	}

	public static <T extends Annotation> T anno(JCas cas, Class<T> cls) throws CASException {
		return anno(cas, cls, 0,0);
	}

	public static <T extends Annotation> T anno(Class<T> cls, int begin, int end) throws UIMAException {
		JCas cas = cas();
		return (T) cas
				.getCas().createAnnotation(
						getType(cls, cas),
						begin,
						end);
	}

	private static <T extends Annotation> Type getType(T anno) throws CASException {
		return anno.getCAS().getJCas().getRequiredType(anno.getClass().getName());
	}

	private static <T extends Annotation> Type getType(Class<T> cls, JCas cas) throws CASException {
		return cas.getRequiredType(cls.getName());
	}

	public static <T extends Annotation> T anno(Class<T> cls) throws UIMAException {
		return anno(cls, 0,0);
	}


	public static AnnotationFS anno(String text) {
		AnnotationFS anno = Mockito.mock(AnnotationFS.class);
		Mockito.when(anno.getCoveredText()).thenReturn(text);
		return anno;
	}

	public static <T extends Annotation> T anno(Class<T> cls, String feat, boolean value) throws UIMAException {
		T a = anno(cls);
		a.setBooleanValue(getFeature(a, feat), value);
		return a;
	}

	public static <T extends Annotation> T anno(Class<T> cls, String feat, String value) throws UIMAException {
		T a = anno(cls);
		a.setStringValue(getFeature(a, feat), value);
		return a;
	}

	public static <T extends Annotation> T anno(Class<T> cls, String feat, int value) throws UIMAException {
		T a = anno(cls);
		a.setIntValue(getFeature(a, feat), value);
		return a;
	}

	public static <T extends Annotation> T anno(Class<T> cls, String feat, float value) throws UIMAException {
		T a = anno(cls);
		a.setFloatValue(getFeature(a, feat), value);
		return a;
	}

	private static  <T extends Annotation> Feature getFeature(T a, String feat) throws CASException {
		return a.getCAS().getJCas().getRequiredFeature(getType(a), feat);
	}
}
