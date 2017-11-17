package fr.univnantes.lina.uima.tkregex.model.matchers;

import com.google.common.collect.Sets;

import java.util.Collection;
import java.util.Set;

public class StringArrayMatcherAspect {

	private Set<String> values;
	private Op operator;


	public StringArrayMatcherAspect(Op operator, Collection<String> values) {
		this.operator = operator;
		this.values = Sets.newHashSetWithExpectedSize(values.size());
		boolean ignoreCase = isIgnoreCase();
		for(String v:values) {
			this.values.add(ignoreCase ? v.toLowerCase() : v);
		}

	}


	public boolean isIgnoreCase() {
		return operator == Op.IN_IGNORE_CASE || operator == Op.NIN_IGNORE_CASE;
	}


	public Op getOperator() {
		return operator;
	}

	private boolean isIn(String text) {
		return values.contains(text);
	}

	public Set<String> getValues() {
		return values;
	}

	public boolean doMatching(String stringValue) {
		switch(operator) {
			case IN:
				return isIn(stringValue);
			case NIN:
				return !isIn(stringValue);
			case IN_IGNORE_CASE:
				return isIn(stringValue.toLowerCase());
			case NIN_IGNORE_CASE:
				return !isIn(stringValue.toLowerCase());
			default:
				throw new UnsupportedOperationException("Unexpected operator: " + operator);
		}
	}

}
