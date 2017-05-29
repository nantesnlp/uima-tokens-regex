package fr.univnantes.lina.uima.tkregex.matchers;

import java.util.Set;

import com.google.common.collect.Sets;

public class StringArrayMatcher  extends CoveredTextMatcher {
	private Set<String> values;
	private boolean ignoreCase;
	
	public StringArrayMatcher(boolean ignoreCase, String... values) {
		super();
		this.values = Sets.newHashSetWithExpectedSize(values.length);
		this.ignoreCase = ignoreCase;
		for(String v:values)
			this.values.add(ignoreCase ? v.toLowerCase() : v);
	}

	@Override
	protected boolean match(String text) {
		if(ignoreCase)
			return values.contains(text.toLowerCase());
		else
			return values.contains(text);
	}
	
	public Set<String> getValues() {
		return values;
	}
	
	public boolean isIgnoreCase() {
		return ignoreCase;
	}
}
