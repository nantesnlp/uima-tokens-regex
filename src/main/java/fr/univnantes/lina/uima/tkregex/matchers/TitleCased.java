package fr.univnantes.lina.uima.tkregex.matchers;

public class TitleCased extends CoveredTextMatcher {

	@Override
	protected boolean match(String text) {
		for(char c:text.toCharArray())
			if(!Character.isTitleCase(c))
				return false;
		return true;
	}
}
