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

import java.util.Set;

public class ArrayMatcher extends FeatureMatcher {

	private Set<Object> values;

	private Op operator;

//	public ArrayMatcher(Feature feature, Op operator, Object... values) {
//		super(feature);
//		init(operator, values);
//	}

	private void init(Op operator, Object[] values) {
		this.operator = operator;
		this.values = Sets.newHashSetWithExpectedSize(values.length);
		for(Object v:values)
			this.values.add(v);
	}

	public ArrayMatcher(Feature feature, Op operator, Object... values) {
		super(feature);
		init(operator, values);
	}

	private boolean isIn(Object value) {
		return values.contains(value);
	}

	@Override
	public boolean doMatching(AnnotationFS annotation) {
		Object value = getValue(annotation);
		switch (operator) {
			case IN: return isIn(value);
			case NIN: return !isIn(value);
			default:
				throw new UnsupportedOperationException("Unexpected operator: " + operator);
		}
	}

	public Op getOperator() {
		return operator;
	}

	public Set<Object> getValues() {
		return values;
	}
}
