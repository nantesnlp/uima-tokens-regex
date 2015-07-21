/*******************************************************************************
 * Copyright 2015 - CNRS (Centre National de Recherche Scientifique)
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

public class Transition {
	public static final Transition EPSILON() {
		return new Transition() {
			public boolean match(AnnotationFS annotation) {
				return true;
			};
			public boolean isEpsilon() {
				return true;
			}
		};
	};
	
	private State fromState;
	private State toState;
	private AnnotationMatcher matcher;
	Transition() {
		super();
	}
	
	public boolean isEpsilon() {
		return false;
	}

	void setFromState(State fromState) {
		this.fromState = fromState;
	}

	void setToState(State toState) {
		this.toState = toState;
	}

	void setMatcher(AnnotationMatcher matcher) {
		this.matcher = matcher;
	}

	public State getFromState() {
		return fromState;
	}

	public State getToState() {
		return toState;
	}

	public AnnotationMatcher getMatcher() {
		return matcher;
	}

	public boolean match(AnnotationFS annotation) {
		if(annotation == LastAnnotationToken.INSTANCE)
			return false;
		else
			return matcher.match(annotation);
	};
	
	@Override
	public String toString() {
		if (matcher instanceof RegexCoveredTextMatcher) {
			RegexCoveredTextMatcher m = (RegexCoveredTextMatcher) matcher;
			return m.toString();
		} else
			return "[" + matcher.getClass().getSimpleName() + "]";
	}
}
