package fr.univnantes.lina.uima.tkregex.model.automata;

import com.google.common.collect.Lists;
import fr.univnantes.lina.uima.tkregex.model.matchers.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.model.matchers.LabelledAnnotation;
import org.apache.uima.cas.text.AnnotationFS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

public class AutomatonInstance implements Cloneable {
	private State current;
	private LinkedList<StateExploration> trace = Lists.newLinkedList();
	private boolean failed;
	private Automaton automaton;

	AutomatonInstance(Automaton automaton, State current) {
		this.automaton = automaton;
		this.current = current;
		this.failed = false;
	}

	public boolean hasFailed() {
		return failed;
	}

	public State getCurrentState() {
		return current;
	}

	void setCurrentState(State current) {
		this.current = current;
	}

	RegexOccurrence getEpisode() {
		List<LabelledAnnotation> retVal = new LinkedList<LabelledAnnotation>();
		for(StateExploration se:trace) {
			if(se.annotation != null)
				retVal.add( new LabelledAnnotation(
							se.annotation,
							se.transition.getMatcher().getLabel(),
							se.transition.getMatcher().isIgnoreMatcher()
					)
				);
		}
		return new RegexOccurrence(automaton, retVal);
	}

	private class StateExploration {
		private Iterator<Transition> iterator;
		private AnnotationFS annotation;
		private Transition transition;
		StateExploration(Iterator<Transition> iterator,
				AnnotationFS annotation, Transition transition) {
			super();
			this.iterator = iterator;
			this.annotation = annotation;
			this.transition = transition;
		}
	}

	public AnnotationFS firstAnno() {
		for(StateExploration se:trace) {
			return se.annotation;
		}
		return null;
	}

	public void propagateAnnotation(AnnotationFS annotation) {
		LinkedList<AnnotationFS> annotations = Lists.newLinkedList();
		annotations.add(annotation);
		propagateAnnotations(annotations);
	}

	private void propagateAnnotations(LinkedList<AnnotationFS> annotations) {
		Iterator<Transition> transitionIt = this.current.transitionIterator();
		iterate(annotations, transitionIt);
	}

	public void iterate(LinkedList<AnnotationFS> annotations,
			Iterator<Transition> transitionIt) {
		if(annotations.isEmpty()) {
		} else {
			AnnotationFS a = annotations.getFirst();
			Transition t = null;
			while (transitionIt.hasNext()) {
				Transition transition = transitionIt.next();
				if(doesAnnotationMatchTransition(a, transition)) {
					AnnotationFS matchedAnnotation = annotations.pop();

					this.trace.addLast(new StateExploration(
							transitionIt,
							matchedAnnotation,
							transition));
					t = transition;
					break;
				}
			}
			if(t==null) {// no matching transition

				// do not backtrack if at accepting state
				if(this.automaton.isAccepting(this.current))
					this.failed = true;
				else
					backtrack(annotations);
			} else {
				this.current = t.getToState();
				propagateAnnotations(annotations);
			}
		}
	}


	private boolean doesAnnotationMatchTransition(AnnotationFS a, Transition transition) {
		if(automaton.useMatcherCache) {
			ConcurrentMap<AnnotationMatcher, Boolean> annotationCache;
			try {
				annotationCache = automaton.matcherCache.get(a);
			} catch (ExecutionException e) {
				throw new RuntimeException("Using automaton cache failed", e);
			}
			return annotationCache.computeIfAbsent(
					transition.getMatcher(),
					matcher -> matcher.matches(a));
		} else
			return transition.match(a);
	}

	private void backtrack(LinkedList<AnnotationFS> annotations) {
		if(trace.isEmpty()) {
			this.failed = true;
		} else {
			StateExploration at = trace.removeLast();
			this.current = at.transition.getFromState();
			annotations.addFirst(at.annotation);
			iterate(annotations, at.iterator);
		}

	}
}
