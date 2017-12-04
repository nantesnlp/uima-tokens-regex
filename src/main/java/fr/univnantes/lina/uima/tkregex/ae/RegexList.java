package fr.univnantes.lina.uima.tkregex.ae;

import fr.univnantes.lina.uima.tkregex.model.automata.Rule;
import fr.univnantes.lina.uima.tkregex.model.matchers.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.model.matchers.CustomMatcher;
import org.apache.uima.cas.Type;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class RegexList {
	List<Rule> rules;
	List<Type> iteratedTypes;
	Map<String, AnnotationMatcher> shortcutMatchers;
	Map<String, CustomMatcher> javaMatchers;

	public RegexList(
			List<Type> iteratedTypes,
			List<Rule> rules, Map<String, AnnotationMatcher> shortcutMatchers, Map<String, CustomMatcher> javaMatchers) {
		this.rules = Collections.unmodifiableList(rules);
		this.iteratedTypes = Collections.unmodifiableList(iteratedTypes);
		this.shortcutMatchers = Collections.unmodifiableMap(shortcutMatchers);
		this.javaMatchers = Collections.unmodifiableMap(javaMatchers);
	}


	public List<Rule> getRules() {
		return rules;
	}

	public List<Type> getIteratedTypes() {
		return iteratedTypes;
	}

	public Map<String, AnnotationMatcher> getShortcutMatchers() {
		return shortcutMatchers;
	}

	public Map<String, CustomMatcher> getJavaMatchers() {
		return javaMatchers;
	}
}
