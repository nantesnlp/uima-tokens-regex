package fr.univnantes.lina.uima.tkregex.matchers;

public class StringExactlyMatcher  extends CoveredTextMatcher {
	
	private String ref;
	
	public StringExactlyMatcher(String ref) {
		super();
		this.ref = ref;
	}

	@Override
	protected boolean match(String text) {
		return this.ref.equals(text);
	}
	
	public String getRef() {
		return ref;
	}
}
