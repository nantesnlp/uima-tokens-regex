package fr.univnantes.lina.uima.tkregex.test.asserts;

import fr.univnantes.lina.uima.tkregex.model.matchers.AnnotationMatcher;
import org.assertj.core.api.AbstractAssert;

public class AnnotationMatcherAssert extends AbstractAssert<AnnotationMatcherAssert, AnnotationMatcher> {

	public AnnotationMatcherAssert(AnnotationMatcher annotationMatcher, Class<?> selfType) {
		super(annotationMatcher, selfType);
	}

	public AnnotationMatcherAssert hasLabel(String label) {
		if(!actual.getLabel().equals(label))
			failWithMessage("Expected label to be <%s>. Got <%s>", label, actual.getLabel());
		return this;
	}

	public AnnotationMatcherAssert isIgnoreMatcher() {
		if(!actual.isIgnoreMatcher())
			failWithMessage("Expected matcher to be an ignore matcher, but was not.");
		return this;
	}

	public AnnotationMatcherAssert isNotIgnoreMatcher() {
		if(actual.isIgnoreMatcher())
			failWithMessage("Expected matcher not to be an ignore matcher, but actually was.");
		return this;
	}

}
