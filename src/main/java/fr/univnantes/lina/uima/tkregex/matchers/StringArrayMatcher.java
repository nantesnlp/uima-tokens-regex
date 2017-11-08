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
package fr.univnantes.lina.uima.tkregex.matchers;

import java.util.Set;

import com.google.common.collect.Sets;
import fr.univnantes.lina.uima.tkregex.ArrayMatcher;
import fr.univnantes.lina.uima.tkregex.Op;

public class StringArrayMatcher  extends CoveredTextMatcher {
	private Set<String> values;
	private Op operator;

	public StringArrayMatcher(Op operator, String... values) {
		super();
		this.operator = operator;
		this.values = Sets.newHashSetWithExpectedSize(values.length);
		boolean ignoreCase = isIgnoreCase();
		for(String v:values) {
			this.values.add(ignoreCase ? v.toLowerCase() : v);
		}
	}

	private boolean isIgnoreCase() {
		return operator == Op.IN_IGNORE_CASE || operator == Op.NIN_IGNORE_CASE;
	}

	@Override
	protected boolean match(String text) {
		switch(operator) {
			case IN:
				return isIn(text);
			case NIN:
				return !isIn(text);
			case IN_IGNORE_CASE:
				return isIn(text.toLowerCase());
			case NIN_IGNORE_CASE:
				return !isIn(text.toLowerCase());
			default:
				throw new UnsupportedOperationException("Unexpected operator: " + operator);
		}
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
}
