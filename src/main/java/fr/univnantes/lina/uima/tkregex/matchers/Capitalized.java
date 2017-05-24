package fr.univnantes.lina.uima.tkregex.matchers;

public class Capitalized extends CoveredTextMatcher {

	@Override
	protected boolean match(String text) {
		return Character.isUpperCase(text.charAt(0));
	}
}
