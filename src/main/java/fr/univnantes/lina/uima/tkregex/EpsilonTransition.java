package fr.univnantes.lina.uima.tkregex;

import org.apache.uima.cas.text.AnnotationFS;

public class EpsilonTransition extends Transition {

	public EpsilonTransition() {
		super();
	}
	
	@Override
	public boolean match(AnnotationFS annotation) {
		return true;
	}
	
	@Override
	public String toString() {
		return "epsilon";
	}
	
	@Override
	public boolean isEpsilon() {
		return true;
	}
}
