package fr.univnantes.lina.uima.tkregex.matchers;

public class StringIgnoreCaseMatcher  extends CoveredTextMatcher {
	private String ref;
	
	public StringIgnoreCaseMatcher(String ref) {
		super();
		this.ref = ref;
	}

	@Override
	protected boolean match(String text) {
		return this.ref.equalsIgnoreCase(text);
	}
	
	public String getRef() {
		return ref;
	}

}
