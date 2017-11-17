package fr.univnantes.lina.uima.tkregex.test.asserts;

import fr.univnantes.lina.uima.tkregex.model.matchers.Op;
import fr.univnantes.lina.uima.tkregex.model.matchers.StringArrayMatcher;
import org.assertj.core.api.IterableAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class StringArrayMatcherAssert extends FeatureMatcherAssert {
	private StringArrayMatcher actual;

	public StringArrayMatcherAssert(StringArrayMatcher stringArrayMatcher, Class<?> selfType) {
		super(stringArrayMatcher, selfType);
		this.actual = stringArrayMatcher;
	}

	public StringArrayMatcherAssert ignoresCase() {
		if(actual.getStringArrayMatcherAspect().getOperator() != Op.IN_IGNORE_CASE && actual.getStringArrayMatcherAspect().getOperator() != Op.NIN_IGNORE_CASE)
			failWithMessage("Expected matcher's operator to ignore case, but actually does not.");
		return this;
	}

	public StringArrayMatcherAssert doesNotIgnoreCase() {
		if(actual.getStringArrayMatcherAspect().getOperator() == Op.IN_IGNORE_CASE || actual.getStringArrayMatcherAspect().getOperator() == Op.NIN_IGNORE_CASE)
			failWithMessage("Expected matcher's operator to not ignore case, but actually does.");
		return this;
	}


	public StringArrayMatcherAssert hasOperator(Op op) {
		if(actual.getStringArrayMatcherAspect().getOperator().equals(op))
			failWithMessage("Expected matcher's operator to be <%s>. Got <%s>", op, actual.getStringArrayMatcherAspect().getOperator());
		return this;
	}

	public IterableAssert<Object> asValuesAssert() {
		return assertThat(actual.getStringArrayMatcherAspect().getValues());
	}

}
