package fr.univnantes.lina.uima.tkregex.test.asserts;

import fr.univnantes.lina.uima.tkregex.ae.builtin.CoveredTextMatcher;
import org.apache.uima.cas.text.AnnotationFS;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

public class CoveredTextMatcherAssert extends AnnotationMatcherAssert {
	private CoveredTextMatcher actual;

	public CoveredTextMatcherAssert(CoveredTextMatcher coveredTextMatcher, Class<?> selfType) {
		super(coveredTextMatcher, selfType);
		this.actual = coveredTextMatcher;
	}
	
	public CoveredTextMatcherAssert matches(String text) {
		AnnotationFS a = Mockito.mock(AnnotationFS.class);
		Mockito.when(a.getCoveredText()).thenReturn(text);
		if(!actual.matches(a))
			failWithMessage("Expected matcher to matches text <%s>, but does not matches", text);

		return this;
	}

	public CoveredTextMatcherAssert doesNotMatch(String text) {
		AnnotationFS a = Mockito.mock(AnnotationFS.class);
		Mockito.when(a.getCoveredText()).thenReturn(text);
		if(actual.matches(a))
			failWithMessage("Expected matcher not to match text <%s>, but actually matches", text);

		return this;
	}


}
