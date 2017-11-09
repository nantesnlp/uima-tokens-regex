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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;

public class AutomatonFactory {
	
	public static Automaton createMNAutomaton(Automaton automaton, int m, int n) {

		List<Automaton> toConcat = Lists.newLinkedList();
		if(m > 0)
			toConcat.add(createNAutomaton(automaton, m));
		for(int i=0; i<(n-m); i++) 
			toConcat.add(createZeroOneAutomaton(automaton));
		return createConcatenation(toConcat);
	}

	public static Automaton createNAutomaton(Automaton automaton, int n) {
		List<Automaton> clones = Lists.newArrayListWithCapacity(n);
		for(int i=0; i<n; i++) 
			clones.add(automaton.deepClone());
		return createConcatenation(clones);
	}

	public static Automaton createZeroOneAutomaton(Automaton automaton) {
		Automaton a = automaton.deepClone();
		Set<State> states = new TreeSet<State>(a.getStates());
		State acceptingState = new State();
		states.add(acceptingState);
		for(State s:a.getAcceptingStates())
			addEpsilon(s, acceptingState);
		addEpsilon(a.getInitState(), acceptingState);
		Automaton zeroOneAutomaton = new Automaton(
				a.getInitState(),
				ImmutableSet.of(acceptingState),
				states
			);
		return zeroOneAutomaton;
	}

	public static Automaton createPlusAutomaton(Automaton a) {
		return createConcatenation(ImmutableList.of(
				a.deepClone(),
				createStarAutomaton(a)
				));
	}

	public static Automaton createStarAutomaton(Automaton automaton) {
		Automaton a = automaton.deepClone();
		State initState = a.getInitState();
		a.addAcceptingState(initState);
		for(State s:a.getAcceptingStates()) {
			if(!s.equals(initState))
				addEpsilon(s, initState); 
		}
		return a;
	}
	private static void addEpsilon(State from, State to) {
		EpsilonTransition e = new EpsilonTransition();
		e.setFromState(from);
		e.setToState(to);
		if(from.equals(to))
			throw new IllegalArgumentException("Epsilon transition from and to the same stae is useless");
		from.addTransition(e);
	}

	public static Automaton createOrAutomaton(List<Automaton> automata) {
		if (automata.size() == 0)
			return createEmptyAutomaton();
		else if (automata.size() == 1)
			return automata.get(0).deepClone();
		else {
			List<Automaton> clonedAutomata = getClonedAutomataList(automata);
			Set<State> states = new TreeSet<State>();
			Set<State> acceptingStates = new TreeSet<State>();
			for (Automaton a : clonedAutomata) {
				states.addAll(a.getStates());
				acceptingStates.addAll(a.getAcceptingStates());
			}

			Automaton a1 = clonedAutomata.get(0);
			for (int i = 1; i < clonedAutomata.size(); i++) {
				Automaton ai = clonedAutomata.get(i);
				addEpsilon(a1.getInitState(), ai.getInitState());
			}
			
			Automaton or = new Automaton(
					a1.getInitState(),
					acceptingStates,
					states);
			return or;
		}
	}

	public static Automaton createConcatenation(List<Automaton> automata) {
		if(automata.size() == 0) 
			return createEmptyAutomaton();
		else if(automata.size() == 1) 
			return automata.get(0).deepClone();
		else {
			List<Automaton> clonedAutomata = getClonedAutomataList(automata);
			Set<State> states = new TreeSet<State>();
			for(Automaton a:clonedAutomata) 
				states.addAll(a.getStates());
			
			for(int i=0; i<(clonedAutomata.size()-1); i++) {
				Automaton a1 = clonedAutomata.get(i);
				Automaton a2 = clonedAutomata.get(i + 1);
				for(State accepting:a1.getAcceptingStates()) 
					addEpsilon(accepting, a2.getInitState());
			}
			Automaton concat = new Automaton(
					clonedAutomata.get(0).getInitState(), 
					clonedAutomata.get(clonedAutomata.size()-1).getAcceptingStates(),
					states);
			return concat;
		}
	}

	private static Automaton createEmptyAutomaton() {
		return new Automaton();
	}

	private static List<Automaton> getClonedAutomataList(List<Automaton> automata) {
		List<Automaton> clones = Lists.newArrayListWithCapacity(automata.size());
		for(Automaton a:automata)
			clones.add(a.deepClone());
		return clones;
	}

	public static Automaton createSimpleAutomaton(AnnotationMatcher annoMatcher) {
		AutomatonBuilder builder = new AutomatonBuilder();
		builder.addTransition(builder.addInitState(), annoMatcher, builder.addAcceptingState());
		return builder.getAutomaton();
	}

	public static Automaton createQuantifiedAutomaton(Automaton automaton,
			AutomatonQuantifier quantifier) {
		switch(quantifier.getQuantifierType()) {
		case AutomatonQuantifier.ZERO_ONE:
			return createZeroOneAutomaton(automaton);
		case AutomatonQuantifier.ZERO_N:
			return createStarAutomaton(automaton);
		case AutomatonQuantifier.ONE_N:
			return createPlusAutomaton(automaton);
		case AutomatonQuantifier.N:
			return createNAutomaton(automaton, quantifier.getLowerBound());
		case AutomatonQuantifier.M_N:
			return createMNAutomaton(automaton, quantifier.getLowerBound(), quantifier.getUpperBound());
		case AutomatonQuantifier.ONE:
		default:
			return automaton;
		}
	}
}
