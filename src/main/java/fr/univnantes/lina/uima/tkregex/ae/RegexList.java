package fr.univnantes.lina.uima.tkregex.ae;

import fr.univnantes.lina.uima.tkregex.model.automata.Rule;
import fr.univnantes.lina.uima.tkregex.model.matchers.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.model.matchers.CustomMatcher;
import org.apache.uima.cas.Type;

import java.util.List;
import java.util.Map;

public class RegexList {
	List<Rule> rules;
	List<Type> getIteratedTypes;
	Map<String, AnnotationMatcher> shortcutMatchers;
	Map<String, CustomMatcher> javaMatchers;

	public RegexList(List<Type> iteratedTypes, List<Rule> rules, Map<String, AnnotationMatcher> shortcutMatchers, Map<String, CustomMatcher> javaMatchers) {
		this.rules = rules;
		this.getIteratedTypes = iteratedTypes;
		this.shortcutMatchers = shortcutMatchers;
		this.javaMatchers = javaMatchers;
	}


	public List<Rule> getRules() {
		return rules;
	}

	public List<Type> getGetIteratedTypes() {
		return getIteratedTypes;
	}

	public Map<String, AnnotationMatcher> getShortcutMatchers() {
		return shortcutMatchers;
	}

	public Map<String, CustomMatcher> getJavaMatchers() {
		return javaMatchers;
	}
}
