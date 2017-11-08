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

import org.apache.uima.cas.text.AnnotationFS;

import com.google.common.base.Optional;

public class CustomMatcher extends AbstractAnnotationMatcher {

	private String name;
	
	private Optional<AnnotationMatcher> matcher = Optional.absent();
	
	
	public CustomMatcher(String name) {
		super();
		this.name = name;
	}

	public void setMatcher(AnnotationMatcher matcher) {
		this.matcher = Optional.of(matcher);
	}
	
	@Override
	public boolean matches(AnnotationFS annotation) {
		return matcher.get().matches(annotation);
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isReady() {
		return matcher.isPresent();
	}
}
