package fr.univnantes.lina.uima.tkregex.test.asserts;

import fr.univnantes.lina.uima.tkregex.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.ExpressionMatcher;
import fr.univnantes.lina.uima.tkregex.Op;
import org.apache.uima.resource.metadata.FeatureDescription;
import org.assertj.core.api.AbstractAssert;

public class ExpressionMatcherAssert extends FeatureMatcherAssert {
	private final ExpressionMatcher actual;
	public ExpressionMatcherAssert(ExpressionMatcher expressionMatcher, Class<?> selfType) {
		super(expressionMatcher, selfType);
		actual = expressionMatcher;
	}

	public ExpressionMatcherAssert hasOperator(Op op) {
		if(!actual.getOperator().equals(op))
			failWithMessage("Expected operator to be <%s>. Got <%s>", op, actual.getOperator());
		return this;
	}


	public ExpressionMatcherAssert hasValue(Object value) {
		if(!actual.getValue().equals(value))
			failWithMessage("Expected matcher's value to be <%s>. Got <%s>", value, actual.getValue());
		return this;
	}

	public ExpressionMatcherAssert hasValueType(String type) {
		if(!actual.getValueType().equals(type))
			failWithMessage("Expected matcher's value type to be <%s>. Got <%s>", type, actual.getValueType());
		return this;
	}


}
