package fr.univnantes.lina.uima.tkregex;

import com.google.common.base.Preconditions;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.resource.metadata.FeatureDescription;

public abstract class FeatureMatcher implements AnnotationMatcher {
	public static final String UIMA_CAS_INTEGER = "uima.cas.Integer";
	public static final String UIMA_CAS_STRING = "uima.cas.String";
	public static final String UIMA_CAS_FLOAT = "uima.cas.Float";
	public static final String UIMA_CAS_BOOLEAN = "uima.cas.Boolean";

	private Feature feature;

	protected FeatureMatcher(Feature feature) {
		this.feature = feature;
	}

	@Override
	public String toString() {
		return feature.getName();
	}

//	protected FeatureMatcher(FeatureDescription featureDescription) {
//		Preconditions.checkNotNull(featureDescription);
//		this.featureDescription = featureDescription;
//	}

	/* Ignorer aspect */
	private Ignorer ignorer = new Ignorer();
	public boolean isIgnoreMatcher() {
		return ignorer.isIgnoreMatcher();
	}
	public void setIgnoreMatcher(boolean ignoreMatcher) {
		ignorer.setIgnoreMatcher(ignoreMatcher);
	}
	/* End of Ignorer aspect */


	/* Label aspect */
	private Labeller labeller = new Labeller();
	public String getLabel() {
		return labeller.getLabel();
	}
	public void setLabel(String label) {
		labeller.setLabel(label);
	}
	/* End of Label aspect */

	private Feature getFeature(AnnotationFS annotation, FeatureDescription featureDescription) {
		if(feature == null) {
			String name = featureDescription.getName();
			feature = annotation.getType().getFeatureByBaseName(name);
		}
		return feature;
	}

	protected Object getValue(AnnotationFS annotation) {
//		Feature feature = getFeature(annotation, featureDescription);
		switch(feature.getRange().getName()) {
			case UIMA_CAS_INTEGER:
				return annotation.getIntValue(feature);
			case UIMA_CAS_STRING:
				return annotation.getStringValue(feature);
			case UIMA_CAS_FLOAT:
				return annotation.getFloatValue(feature);
			case UIMA_CAS_BOOLEAN:
				return annotation.getBooleanValue(feature);
			default:
				return annotation.getStringValue(feature);
		}
	}

	public Feature getFeature() {
		return feature;
	}

//	public FeatureDescription getFeatureDescription() {
//		return featureDescription;
//	}
}
