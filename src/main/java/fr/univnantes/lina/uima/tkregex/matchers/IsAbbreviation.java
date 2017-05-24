package fr.univnantes.lina.uima.tkregex.matchers;

import java.util.regex.Pattern;

public class IsAbbreviation extends CoveredTextMatcher {
	private static final Pattern ABBREVIATION = Pattern.compile("^[A-Z][a-z]*\\.([A-Z][a-z]*\\.)+$");

	@Override
	protected boolean match(String text) {
		return ABBREVIATION.matcher(text).find();
	}
}
