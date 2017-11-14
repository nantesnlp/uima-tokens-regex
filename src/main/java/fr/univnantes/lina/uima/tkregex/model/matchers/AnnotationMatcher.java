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

import org.apache.uima.cas.text.AnnotationFS;

public interface AnnotationMatcher {
	public static final AnnotationMatcher EMPTY_MATCHER = new AnnotationMatcher() {
		@Override
		public boolean matches(AnnotationFS annotation) {
			return true;
		}

		public String toString() {
			return "";
		};
		
		@Override
		public String getLabel() {
			return "[]";
		}
		public void setLabel(String label) {};
		
		@Override
		public boolean isIgnoreMatcher() {
			return false;
		}
		@Override
		public void setIgnoreMatcher(boolean ignoreMatcher) {
		}
	};

	public boolean matches(AnnotationFS annotation);

	public String getLabel();
	public void setLabel(String label);

	public boolean isIgnoreMatcher();
	public void setIgnoreMatcher(boolean ignoreMatcher);
}
