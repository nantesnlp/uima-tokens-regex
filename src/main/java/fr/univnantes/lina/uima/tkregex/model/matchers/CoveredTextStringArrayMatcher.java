package fr.univnantes.lina.uima.tkregex.model.matchers;

import org.apache.uima.cas.text.AnnotationFS;

import java.util.Set;

public class CoveredTextStringArrayMatcher extends AbstractAnnotationMatcher {

	private StringArrayMatcherAspect stringArrayMatcherAspect;

	public CoveredTextStringArrayMatcher(Op operator, Set<String> values) {
		this.stringArrayMatcherAspect = new StringArrayMatcherAspect(operator, values);

	}

	@Override
	public boolean matches(AnnotationFS annotation) {
		return stringArrayMatcherAspect.doMatching(annotation.getCoveredText());
	}

	public StringArrayMatcherAspect getStringArrayMatcherAspect() {
		return stringArrayMatcherAspect;
	}
}
