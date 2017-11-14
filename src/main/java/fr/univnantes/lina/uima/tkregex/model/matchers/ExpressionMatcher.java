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
package fr.univnantes.lina.uima.tkregex.model.matchers;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.text.AnnotationFS;

public class ExpressionMatcher extends FeatureMatcher {

	public static final String TYPE_STRING = "String";
	public static final String TYPE_INT = "Integer";
	public static final String TYPE_FLOAT = "Float";
	public static final String TYPE_BOOLEAN = "Boolean";
	
	
	private Op operator;
	private Object value;
	private String valueType;

	
	public ExpressionMatcher(Feature feature, Op operator, Object value, String valueType) {
		super(feature);
		this.operator = operator;
		this.value = value;
		this.valueType = valueType;
	}

	@Override
	public boolean matches(AnnotationFS annotation) {
		boolean b = doMatching(annotation);
		return b;
	}
	private boolean doMatching(AnnotationFS annotation) {
		switch(operator) {
		case EQ:
			return value.equals(getValue(annotation));
		case NEQ:
			return !value.equals(getValue(annotation));
		case LTE:
			return  ((Number)getValue(annotation)).floatValue() <=((Number)value).floatValue();
		case LT:
			return  ((Number)getValue(annotation)).floatValue() <((Number)value).floatValue();
		case GTE:
			return  ((Number)getValue(annotation)).floatValue() >=((Number)value).floatValue();
		case GT:
			return  ((Number)getValue(annotation)).floatValue() >((Number)value).floatValue();
		default:
			throw new IllegalStateException("Unsupported operator: " + this.operator);
		}
	}

	public Op getOperator() {
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
		return super.toString() + this.operator + this.value + ":" + this.valueType;
	}

}
