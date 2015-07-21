package fr.univnantes.lina.uima.tkregex;

import java.util.regex.Pattern;

import org.apache.uima.cas.text.AnnotationFS;

public class RegexCoveredTextMatcher implements
		AnnotationMatcher {
	
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

	private Pattern pattern;
	
	public RegexCoveredTextMatcher(String regex) {
		super();
		this.pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	}

	@Override
	public boolean match(AnnotationFS annotation) {
		return pattern.matcher(annotation.getCoveredText()).find();
	}
	@Override
	public String toString() {
		return "/" + pattern.toString() + "/";
	}
	public Pattern getPattern() {
		return pattern;
	}
}
