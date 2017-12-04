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

	private StringArrayMatcherAspect stringArrayMatcherAspect;

	public StringArrayMatcher(Feature feature, Op operator, Collection<String> values) {
		super(feature);
		this.stringArrayMatcherAspect = new StringArrayMatcherAspect(operator, values);
	}

	public StringArrayMatcher(Feature feature, Op operator, String... values) {
		this(feature, operator, Sets.newHashSet(values));
	}


	@Override
	protected boolean doMatching(AnnotationFS annotation) {
		return stringArrayMatcherAspect.doMatching(getStringValue(annotation));
	}

	protected String getStringValue(AnnotationFS annotation) {
		return (String) getValue(annotation);
	}

	public StringArrayMatcherAspect getStringArrayMatcherAspect() {
		return stringArrayMatcherAspect;
	}
}
