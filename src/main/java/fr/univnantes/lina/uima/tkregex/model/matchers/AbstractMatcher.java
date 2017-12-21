package fr.univnantes.lina.uima.tkregex.model.matchers;

public abstract class AbstractMatcher implements AnnotationMatcher {

	protected String label;
	private boolean ignoreMatcher;


	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public void setLabel(String label) {
	this.label = label;
	}

	@Override
	public boolean isIgnoreMatcher() {
		return ignoreMatcher;
	}

	@Override
	public void setIgnoreMatcher(boolean ignoreMatcher) {
		this.ignoreMatcher = ignoreMatcher;
	}
}
