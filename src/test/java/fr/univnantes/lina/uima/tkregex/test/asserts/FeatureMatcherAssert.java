package fr.univnantes.lina.uima.tkregex.test.asserts;

import fr.univnantes.lina.uima.tkregex.FeatureMatcher;
import org.apache.uima.cas.Feature;

public class FeatureMatcherAssert extends AnnotationMatcherAssert {
	private final FeatureMatcher actual;

	public FeatureMatcherAssert(FeatureMatcher featureMatcher, Class<?> selfType) {
		super(featureMatcher, selfType);
		this.actual = featureMatcher;
	}


	public FeatureMatcherAssert hasFeatureDescription(Feature desc) {
		if(!actual.getFeature().equals(desc))
			failWithMessage("Expected matcher's feature description to be <%s>. Got <%s>",
					desc,
					actual.getFeature());
		return this;
	}

	public FeatureMatcherAssert hasFeatureName(String name) {
		if(!actual.getFeature().getShortName().equals(name))
			failWithMessage("Expected matcher's feature name to be <%s>. Got <%s>",
					name,
					actual.getFeature().getShortName());
		return this;
	}

	public FeatureMatcherAssert hasFeatureRange(String rangeTypeName) {
		if(!actual.getFeature().getRange().getShortName().equals(rangeTypeName))
			failWithMessage("Expected matcher's feature range to be <%s>. Got <%s>",
					rangeTypeName,
					actual.getFeature().getRange().getClass().getName());
		return this;
	}

	public FeatureMatcherAssert hasFeatureElementType(String elementTypeName) {
		if(!actual.getFeature().getDomain().getShortName().equals(elementTypeName))
			failWithMessage("Expected matcher's element type to be <%s>. Got <%s>",
					elementTypeName,
					actual.getFeature().getDomain().getShortName());
		return this;
	}

}
