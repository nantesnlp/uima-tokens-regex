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
package fr.univnantes.lina.uima.tkregex;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.resource.metadata.FeatureDescription;

import java.util.Set;

public class ArrayMatcher implements AnnotationMatcher {

	/* Ignorer aspect */
	private Ignorer ignorer = new Ignorer();
	public boolean isIgnoreMatcher() {
		return ignorer.isIgnoreMatcher();
	}
	public void setIgnoreMatcher(boolean ignoreMatcher) {
		ignorer.setIgnoreMatcher(ignoreMatcher);
	}
	/* End of Ignorer aspect */


	/* Label aspect */
	private Labeller labeller = new Labeller();
	public String getLabel() {
		return labeller.getLabel();
	}
	public void setLabel(String label) {
		labeller.setLabel(label);
	}
	/* End of Label aspect */


	public static final String UIMA_CAS_INTEGER = "uima.cas.Integer";
	public static final String UIMA_CAS_STRING = "uima.cas.String";
	public static final String UIMA_CAS_FLOAT = "uima.cas.Float";
	public static final String UIMA_CAS_BOOLEAN = "uima.cas.Boolean";
	private Set<Object> values;

	public static final String IN="in";
	public static final String NIN="nin";

	private Feature feature;
	private FeatureDescription featureDescription;
	private String operator;

	public ArrayMatcher(Feature feature, String operator, Object... values) {
		Preconditions.checkNotNull(feature);
		this.feature = feature;
		this.operator = operator;
		this.values = Sets.newHashSetWithExpectedSize(values.length);
		for(Object v:values)
			this.values.add(v);
	}

	public ArrayMatcher(FeatureDescription feature, String operator, Object... values) {
		Preconditions.checkNotNull(feature);
		this.featureDescription = feature;
		this.operator = operator;
		this.values = Sets.newHashSetWithExpectedSize(values.length);
		for(Object v:values)
			this.values.add(v);
	}

	private boolean isIn(Object value) {
		return values.contains(value);
	}

	@Override
	public boolean match(AnnotationFS annotation) {
		Object value = getValue(annotation);

		return isInOperator() ? isIn(value) : !isIn(value);
	}

	private Object getValue(AnnotationFS annotation) {
		Feature feature = getFeature(annotation, featureDescription);
		switch(feature.getRange().getName()) {
			case UIMA_CAS_INTEGER:
				return annotation.getIntValue(feature);
			case UIMA_CAS_STRING:
				return annotation.getStringValue(feature);
			case UIMA_CAS_FLOAT:
				return annotation.getFloatValue(feature);
			case UIMA_CAS_BOOLEAN:
				return annotation.getBooleanValue(feature);
			default:
				return annotation.getStringValue(feature);
		}

	}

	private Feature getFeature(AnnotationFS annotation, FeatureDescription featureDescription) {
		if(feature == null) {
			String name = featureDescription.getName();
			return annotation.getType().getFeatureByBaseName(name);
		}
		else
			return feature;
	}


	private boolean isInOperator() {
		return operator.equals(IN);
	}
}
