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

import com.google.common.collect.Sets;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.text.AnnotationFS;

import java.util.Collection;
import java.util.Set;

public class StringArrayMatcher  extends FeatureMatcher {
	private Set<String> values;
	private Op operator;

	public StringArrayMatcher(Feature feature, Op operator, Collection<String> values) {
		super(feature);
		this.operator = operator;
		this.values = Sets.newHashSetWithExpectedSize(values.size());
		boolean ignoreCase = isIgnoreCase();
		for(String v:values) {
			this.values.add(ignoreCase ? v.toLowerCase() : v);
		}

	}

	public StringArrayMatcher(Feature feature, Op operator, String... values) {
		this(feature, operator, Sets.newHashSet(values));
	}

	private boolean isIgnoreCase() {
		return operator == Op.IN_IGNORE_CASE || operator == Op.NIN_IGNORE_CASE;
	}


	public Op getOperator() {
		return operator;
	}

	private boolean isIn(String text) {
		return values.contains(text);
	}

	public Set<String> getValues() {
		return values;
	}

	@Override
	public boolean matches(AnnotationFS annotation) {
		String value = getStringValue(annotation);
		switch(operator) {
			case IN:
				return isIn(value);
			case NIN:
				return !isIn(value);
			case IN_IGNORE_CASE:
				return isIn(value.toLowerCase());
			case NIN_IGNORE_CASE:
				return !isIn(value.toLowerCase());
			default:
				throw new UnsupportedOperationException("Unexpected operator: " + operator);
		}
	}

	protected String getStringValue(AnnotationFS annotation) {
		return (String) getValue(annotation);
	}
}
