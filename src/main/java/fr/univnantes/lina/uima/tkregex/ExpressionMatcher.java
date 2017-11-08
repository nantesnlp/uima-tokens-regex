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

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.text.AnnotationFS;

public class ExpressionMatcher implements AnnotationMatcher{

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
	
	public static final String OP_EQ = "==";
	public static final String OP_NE = "!=";
	public static final String OP_LT = "<";
	public static final String OP_LTE = "<=";
	public static final String OP_GT = ">";
	public static final String OP_GTE = ">=";
	
	public static final String TYPE_STRING = "String";
	public static final String TYPE_INT = "Integer";
	public static final String TYPE_FLOAT = "Float";
	public static final String TYPE_BOOLEAN = "Boolean";
	
	
	private String feature;
	private String operator;
	private Object value;
	private String valueType;

	
	public ExpressionMatcher(String feature, String operator, Object value, String valueType) {
		super();
		this.feature = feature;
		this.operator = operator;
		this.value = value;
		this.valueType = valueType;
	}

	@Override
	public boolean match(AnnotationFS annotation) {
//		TaskProfiler.getProfiler("ExpressionMatcher").start(this, "match");
		boolean b = doMatching(annotation);
//		TaskProfiler.getProfiler("ExpressionMatcher").stop(this, "match");
		return b;
	}
	private boolean doMatching(AnnotationFS annotation) {
		switch(operator) {
		case OP_EQ:
			return value.equals(getValue(annotation));
		case OP_NE:
			return !value.equals(getValue(annotation));
		case OP_LTE:
			return  ((Number)getValue(annotation)).floatValue() <=((Number)value).floatValue();
		case OP_LT:
			return  ((Number)getValue(annotation)).floatValue() <((Number)value).floatValue();
		case OP_GTE:
			return  ((Number)getValue(annotation)).floatValue() >=((Number)value).floatValue();
		case OP_GT:
			return  ((Number)getValue(annotation)).floatValue() >((Number)value).floatValue();
		default:
			throw new IllegalStateException("Unknown operator: " + this.operator);
		}
	}

	protected Object getValue(AnnotationFS annotation) {
		switch(valueType) {
		case TYPE_BOOLEAN:
			return annotation.getBooleanValue(getFeature(annotation));
		case TYPE_STRING:
			return annotation.getStringValue(getFeature(annotation));
		case TYPE_INT:
			return annotation.getIntValue(getFeature(annotation));
		case TYPE_FLOAT:
			return annotation.getFloatValue(getFeature(annotation));
		default:
			throw new IllegalStateException("Unknown value type: " + this.valueType);
		}

	}
	
	private Feature f;
	public Feature getFeature(AnnotationFS annotation) {
		if(f==null) {
			/*
			 * TODO Ensure that the Feature will be reset for a new TypeSystem
			 */
			f = annotation.getCAS().getTypeSystem().getFeatureByFullName(feature);
		}
		return f;
	}
	

	public String getFeature() {
		return feature;
	}
	public String getOperator() {
		return operator;
	}

	public Object getValue() {
		return value;
	}

	public String getValueType() {
		return valueType;
	}

	@Override
	public String toString() {
		return this.feature + this.operator + this.value + ":" + this.valueType;
	}

}
