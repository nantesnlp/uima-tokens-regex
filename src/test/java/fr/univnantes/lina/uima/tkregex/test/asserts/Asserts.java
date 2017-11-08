package fr.univnantes.lina.uima.tkregex.test.asserts;

import fr.univnantes.lina.uima.tkregex.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.ArrayMatcher;
import fr.univnantes.lina.uima.tkregex.ExpressionMatcher;
import fr.univnantes.lina.uima.tkregex.FeatureMatcher;
import fr.univnantes.lina.uima.tkregex.matchers.StringArrayMatcher;

public class Asserts {

	public static AnnotationMatcherAssert assertThat(AnnotationMatcher annotationMatcher) {
		return new AnnotationMatcherAssert(annotationMatcher, AnnotationMatcherAssert.class);
	}

	public static FeatureMatcherAssert assertThat(FeatureMatcher featureMatcher) {
		return new FeatureMatcherAssert(featureMatcher, FeatureMatcherAssert.class);
	}

	public static ExpressionMatcherAssert assertThat(ExpressionMatcher expressionMatcher) {
		return new ExpressionMatcherAssert(expressionMatcher, ExpressionMatcherAssert.class);
	}

	public static StringArrayMatcherAssert assertThat(StringArrayMatcher stringArrayMatcher) {
		return new StringArrayMatcherAssert(stringArrayMatcher, StringArrayMatcherAssert.class);
	}

	public static ArrayMatcherAssert assertThat(ArrayMatcher arrayMatcher) {
		return new ArrayMatcherAssert(arrayMatcher, ArrayMatcherAssert.class);
	}
}
