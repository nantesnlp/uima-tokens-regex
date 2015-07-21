package fr.univnantes.lina.uima.tkregex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class State implements Comparable<State> {
	private static int idCounter = 0;
	
	private List<Transition> transitions = new LinkedList<Transition>();
	private List<Transition> closedTransition = null;
	private List<State> epsilonClosure = null;

	private int id;
	
	State() {
		this.id = idCounter++;
	}
	
	public Iterator<Transition> transitionIterator() {
		return getEpsilonClosedTransitions().iterator();
	}

	private List<Transition> getEpsilonClosedTransitions() {
		if (this.closedTransition == null) {
			this.closedTransition = new LinkedList<Transition>();
			for(State s:getEpsilonClosure()) {
				for(Transition t:s.transitions) {
					if(!t.isEpsilon())
						this.closedTransition.add(t);
				}
			}
		}
		return this.closedTransition;
	}

	public List<State> getEpsilonClosure() {
		if(this.epsilonClosure == null) {
			List<State> visitedStates = Lists.newLinkedList();
			visitedStates.add(this);
			this.epsilonClosure = getEpsilonClosure(visitedStates);
		}
		return this.epsilonClosure;
	}

	private List<State> getEpsilonClosure(List<State> visitedStates) {
		List<State> closure = new LinkedList<State>();
		closure.add(this);
		for (Transition t : this.transitions) {
			if(t.isEpsilon()) {
				State s = t.getToState();
				if(!visitedStates.contains(s)) {
					visitedStates.add(s);
					closure.addAll(s.getEpsilonClosure(visitedStates));
				}
			} 
		}
		return closure;
	}
		
	boolean addTransition(Transition e) {
		return transitions.add(e);
	}
	
	
	@Override
	public String toString() {
		return "State " + this.id;
	}
	
	public String transitionsToString() {
		String s="";
		for(Transition t:this.transitions) {
			s+="\n\t --"+t.toString()+"--> " + t.getToState().toString();
		}
		return s;
	}

	public List<Transition> getTransitions() {
		return ImmutableList.copyOf(this.transitions);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof State) 
			return ((State) obj).id == this.id;
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public int compareTo(State o) {
		return Integer.compare(this.id, o.id);
	}
}
