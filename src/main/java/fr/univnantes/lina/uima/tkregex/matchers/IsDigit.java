package fr.univnantes.lina.uima.tkregex.matchers;

public class IsDigit extends CoveredTextMatcher {
	@Override
	protected boolean match(String text) {
		return text.length() == 1 && Character.isDigit(text.charAt(0));
	}
}
