package fr.univnantes.lina.uima.tkregex.model.automata;

import org.apache.uima.cas.text.AnnotationFS;

public class StateExploration {
	private TransitionIterator iterator;
	private AnnotationFS annotation;
	private Transition transition;
	StateExploration(TransitionIterator iterator,
					 AnnotationFS annotation, Transition transition) {
		super();
		this.iterator = iterator;
		this.annotation = annotation;
		this.transition = transition;
	}

	public AnnotationFS getAnnotation() {
		return annotation;
	}

	public TransitionIterator getIterator() {
		return iterator;
	}

	public Transition getTransition() {
		return transition;
	}

	public StateExploration doClone() {
		return new StateExploration(iterator.doClone(), annotation, transition);
	}
}
