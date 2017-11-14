package fr.univnantes.lina.uima.tkregex;

import fr.univnantes.lina.uima.tkregex.antlr.AutomataParsingException;
import fr.univnantes.lina.uima.tkregex.model.automata.AutomatonQuantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TokensRegex {
	private static final Pattern M_N_PATTERN = Pattern.compile("\\{(\\d+),(\\d+)\\}");
	private static final Pattern N_PATTERN = Pattern.compile("\\{(\\d+)\\}");


	public static AutomatonQuantifier parseQuantifier(String quantifierString) {
		AutomatonQuantifier quantifier = null;
		switch(quantifierString) {
			case "*":
				quantifier = AutomatonQuantifier.getZeroN();
				break;
			case "?":
				quantifier = AutomatonQuantifier.getZeroOne();
				break;
			case "+":
				quantifier = AutomatonQuantifier.getOneN();
				break;
			default:
				Matcher m_n_matcher = M_N_PATTERN.matcher(quantifierString);
				Matcher n_matcher = N_PATTERN.matcher(quantifierString);
				if(m_n_matcher.matches())
					quantifier = AutomatonQuantifier.getMN(
							Integer.parseInt(m_n_matcher.group(1)),
							Integer.parseInt(m_n_matcher.group(2))
					);
				else if(n_matcher.matches())
					quantifier = AutomatonQuantifier.getN(
							Integer.parseInt(n_matcher.group(1))
					);
				else throw new AutomataParsingException("Unrecognized regex: " + quantifierString);
		}
		return quantifier;
	}
}
