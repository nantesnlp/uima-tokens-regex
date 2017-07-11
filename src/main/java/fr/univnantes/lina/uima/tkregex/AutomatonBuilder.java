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

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.google.common.collect.Lists;

public class AutomatonBuilder {

	private State initState;
	private Set<State> states;
	private Set<State> acceptingStates;
	
	private List<AnnotationMatcher> matcherList;
	private List<AutomatonQuantifier> quantifierList;
	
	public AutomatonBuilder() {
		super();
		this.matcherList = Lists.newLinkedList();
		this.quantifierList = Lists.newLinkedList();
		this.initState = null;
		this.states = new TreeSet<State>();
		this.acceptingStates = new TreeSet<State>();
	}
	
//	public void initAutomaton() {
//	}
	
	public State addState() {
		State state = new State();
		this.states.add(state);
		return state;
	}
	
	public State addAcceptingState() {
		State state = this.addState();
		this.acceptingStates.add(state);
		return state;
	}

	public State addInitState() {
		State s = this.addState();
		this.initState = s;
		return s;
	}
	
	public Transition addTransition(State from, AnnotationMatcher m, State to) {
		Transition transition = new Transition();
		transition.setFromState(from);
		transition.setToState(to);
		transition.setMatcher(m);
		from.addTransition(transition);
		return transition;
	}
	
	public Transition addEpsilonTransition(State from, State to) {
		EpsilonTransition transition = new EpsilonTransition();
		transition.setFromState(from);
		transition.setToState(to);
		from.addTransition(transition);
		return transition;
	}

	public Automaton getAutomaton() {
		if(!this.quantifierList.isEmpty()) {
			if(this.initState != null)
				throw new IllegalStateException("Init state should not be used in builder's matcher/quatifier mode");
			State lastState = this.addInitState();
			for(int i=0; i< this.matcherList.size(); i++) {
				AnnotationMatcher matcher = this.matcherList.get(i);
				AutomatonQuantifier quantifier = this.quantifierList.get(i);
				if(quantifier.getQuantifierType().equals(AutomatonQuantifier.ONE)) {
					acceptingStates.remove(lastState);
					State state = addState();
					addTransition(lastState, matcher, state);
					lastState = state;
					acceptingStates.add(lastState);
				} else if (quantifier.getQuantifierType().equals(AutomatonQuantifier.N)) {
					acceptingStates.remove(lastState);
					for(int k=0; k<quantifier.getLowerBound(); k++) {
						State state = addState();
						addTransition(lastState, matcher, state);
						lastState = state;
					}
				} else if (quantifier.getQuantifierType().equals(AutomatonQuantifier.ZERO_ONE)) {
					acceptingStates.remove(lastState);
					State state = addState();
					addTransition(lastState, matcher, state);
					addEpsilonTransition(lastState, state);
					lastState = state;
					acceptingStates.add(lastState);
				} else if (quantifier.getQuantifierType().equals(AutomatonQuantifier.ZERO_N)) {
					acceptingStates.remove(lastState);
					State state = addState();
					addEpsilonTransition(lastState, state);
					addTransition(state, matcher, state);
					lastState = state;
					acceptingStates.add(lastState);
				} else if (quantifier.getQuantifierType().equals(AutomatonQuantifier.ONE_N)) {
					acceptingStates.remove(lastState);
					State state = addState();
					addTransition(lastState, matcher, state);
					addTransition(state, matcher, state);
					lastState = state;
					acceptingStates.add(lastState);
				} else
					throw new UnsupportedOperationException("No yet recognized regex: " + quantifier.getQuantifierType());
			}
			Automaton automaton = new Automaton(
					initState,
					acceptingStates,
					states
			);
			return automaton;
		} else {
			if(this.initState == null)
				throw new IllegalStateException("No initial state defined.");
			Automaton automaton = new Automaton(
					initState,
					acceptingStates,
					states
			);
			return automaton;
		}
	}

//	public void addMatcher(AnnotationMatcher lastExpression,
//			AutomatonQuantifier quantifier) {
//		this.matcherList.add(lastExpression);
//		this.quantifierList.add(quantifier);
//	}

	
}
