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


public class Rule {
	private Automaton automaton;
	private String name;
	private String grammaticalCategory;
	
	public Rule(Automaton automaton, String name,
			String grammaticalCategory) {
		super();
		this.automaton = automaton;
		this.automaton.setRule(this);
		this.name = name;
		this.grammaticalCategory = grammaticalCategory;
	}

	public Automaton getAutomaton() {
		return automaton;
	}

	public String getName() {
		return name;
	}

	public String getGrammaticalCategory() {
		return grammaticalCategory;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rule)
			return name.equals(((Rule)obj).name);
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
