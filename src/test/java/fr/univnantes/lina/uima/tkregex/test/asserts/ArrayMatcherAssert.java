package fr.univnantes.lina.uima.tkregex.test.asserts;

import fr.univnantes.lina.uima.tkregex.model.matchers.ArrayMatcher;
import fr.univnantes.lina.uima.tkregex.model.matchers.Op;
import org.assertj.core.api.IterableAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayMatcherAssert extends FeatureMatcherAssert {
	private ArrayMatcher actual;
	public ArrayMatcherAssert(ArrayMatcher arrayMatcher, Class<?> selfType) {
		super(arrayMatcher, selfType);
		this.actual = arrayMatcher;
	}

	public ArrayMatcherAssert hasOperator(Op operator) {
		if(!actual.getOperator().equals(operator))
			failWithMessage("Expected matcher's operator to be <%s>. Got <%s>", operator, actual.getOperator());
		return this;
	}

	public IterableAssert<Object> asValuesAssert() {
		return assertThat(actual.getValues());
	}

}
