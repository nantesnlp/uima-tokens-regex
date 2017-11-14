package fr.univnantes.lina.uima.tkregex.model.matchers;

import org.apache.uima.cas.text.AnnotationFS;

public class CoveredTextStringArrayMatcher extends StringArrayMatcher {

	public CoveredTextStringArrayMatcher(Op operator, String... values) {
		super(null, operator, values);
	}

	@Override
	protected String getStringValue(AnnotationFS annotation) {
		return annotation.getCoveredText();
	}
}
