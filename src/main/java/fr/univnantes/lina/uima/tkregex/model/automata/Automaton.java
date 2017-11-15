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
package fr.univnantes.lina.uima.tkregex.model.automata;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import fr.univnantes.lina.uima.tkregex.model.matchers.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.model.matchers.LabelledAnnotation;
import org.apache.uima.cas.text.AnnotationFS;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

public class Automaton implements Cloneable {

	private State initState;
	private TreeSet<State> acceptingStates;
	private TreeSet<State> states;

	Automaton(State initState,
			Set<State> acceptingStates, Set<State> states) {
		this();
		this.initState = initState;
		if(!states.contains(initState))
			throw new IllegalStateException("The states set must contains the init state.");
		if(!states.containsAll(acceptingStates))
			throw new IllegalStateException("The states set must contains all the accepting states.");
		this.acceptingStates = new TreeSet<State>(acceptingStates);
		this.states = new TreeSet<State>(states);
	}

	Automaton() {
		super();
		this.acceptingStates = new TreeSet<State>();
		this.states = new TreeSet<State>();
	}
	
	

	boolean addAllState(Collection<? extends State> arg0) {
		return acceptingStates.addAll(arg0);
	}

	public Set<State> getAcceptingStates() {
		return ImmutableSet.copyOf(acceptingStates);
	}
	
	public Set<State> getStates() {
		return ImmutableSet.copyOf(states);
	}



	void setInitState(State initState) {
		this.initState = initState;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	@Override
	public String toString() {
		String nullName = "unnamed " + System.identityHashCode(this);
//		return "Automaton " + (this.name == null ? nullName : this.name) + toFullString();
		return "Automaton " + nullName;
	}

	public String toFullString() {
		String str = "";
		for(State s: this.states) {
			str+="\n";
			str+=s.toString();
			if(this.initState.equals(s))
				str+=" INITIAL";
			if(this.acceptingStates.contains(s))
				str+=" ACCEPTING";
			str+=s.transitionsToString();
		}
		return str;
	}

//	public String getName() {
//		return name;
//	}
	
	public State getInitState() {
		return initState;
	}
	
	void addAcceptingState(State s) {
		this.acceptingStates.add(s);
	}


	public Automaton deepClone() {
		Automaton automataClone = new Automaton();
		Map<State, State> clones = Maps.newHashMap();
		
		// clone states
		for(State s: this.states) {
			State clone = new State();
			clones.put(s, clone);
		}
		
		// clone transitions
		for(State s: this.states) {
			State clone = clones.get(s);
			for(Transition t:s.getTransitions()) {
				State toState = clones.get(t.getToState());
				Transition nt;
				if(t.isEpsilon()) {
					nt = new EpsilonTransition();
				} else {
					nt = new Transition();
					nt.setMatcher(t.getMatcher());
				}
				nt.setFromState(clone);
				nt.setToState(toState);
				clone.addTransition(nt);
			}
		}
		
		automataClone.initState = clones.get(this.initState);

		for(State state:this.states) 
			automataClone.states.add(clones.get(state));

		for(State acceptingState:this.acceptingStates) {
			State state = clones.get(acceptingState);
			automataClone.acceptingStates.add(state);
		}
		
		return automataClone;
	}

	private Map<State, Boolean> acceptingStatesCache = Maps.newTreeMap();
	
	public boolean isAccepting(State state) {
		Boolean accept = acceptingStatesCache.get(state);
		if(accept == null ) {
			accept = computeAcceptingState(state);
			acceptingStatesCache.put(state,accept);
		}
		return accept;
	}
	
	private boolean computeAcceptingState(State s) {
		List<State> epsilonClosure = s.getEpsilonClosure();
		for(State st: epsilonClosure) {
			if(this.acceptingStates.contains(st))
				return true;
		}
		return false;
	}

	public boolean matchesEmptySequence() {
		return isAccepting(this.initState);
	}

}

