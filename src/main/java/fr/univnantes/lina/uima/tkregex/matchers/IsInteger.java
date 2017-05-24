package fr.univnantes.lina.uima.tkregex.matchers;

public class IsInteger extends CoveredTextMatcher {
	@Override
	protected boolean match(String text) {
		for(char c:text.toCharArray())
			if(!Character.isDigit(c))
				return false;
		return true;
	}
}
