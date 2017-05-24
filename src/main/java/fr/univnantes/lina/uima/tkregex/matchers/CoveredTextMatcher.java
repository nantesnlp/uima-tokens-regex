package fr.univnantes.lina.uima.tkregex.matchers;

import org.apache.uima.cas.text.AnnotationFS;

import fr.univnantes.lina.uima.tkregex.AbstractAnnotationMatcher;

public abstract class CoveredTextMatcher extends AbstractAnnotationMatcher {

	@Override
	public boolean match(AnnotationFS annotation) {
		return !annotation.getCoveredText().isEmpty() && match(annotation.getCoveredText());
	}
	
	protected abstract boolean match(String text);
}
