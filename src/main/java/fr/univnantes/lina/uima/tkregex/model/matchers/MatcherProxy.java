package fr.univnantes.lina.uima.tkregex.model.matchers;

import org.apache.uima.cas.text.AnnotationFS;

public class MatcherProxy extends AbstractMatcher {

	private AnnotationMatcher matcher;

	public MatcherProxy(AnnotationMatcher matcher) {
		this.matcher = matcher;
	}


	@Override
	public boolean matches(AnnotationFS annotation) {
		return matcher.matches(annotation);
	}


	public AnnotationMatcher getMatcher() {
		return matcher;
	}


	@Override
	public String getLabel() {
		return this.label == null ? matcher.getLabel() : this.label;
	}
}
