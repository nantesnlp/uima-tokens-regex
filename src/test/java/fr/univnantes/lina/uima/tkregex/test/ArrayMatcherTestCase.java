package fr.univnantes.lina.uima.tkregex.test;

import fr.univnantes.lina.test.uima.TypeA;
import fr.univnantes.lina.uima.tkregex.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.ArrayMatcher;
import fr.univnantes.lina.uima.tkregex.Op;
import fr.univnantes.lina.uima.tkregex.test.utils.Fixtures;
import fr.univnantes.lina.uima.tkregex.test.utils.Mocks;
import org.apache.uima.UIMAException;
import org.apache.uima.cas.Type;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayMatcherTestCase {

	AnnotationMatcher strMatcherIn;
	AnnotationMatcher strMatcherNin;
	AnnotationMatcher intMatcherIn;
	AnnotationMatcher intMatcherNin;
	AnnotationMatcher floatMatcherIn;
	AnnotationMatcher floatMatcherNin;
	AnnotationMatcher booleanMatcherIn;
	AnnotationMatcher booleanMatcherNin;
	JCas cas;
	Type type;

	@Before
	public void setup() throws UIMAException {
		cas = JCasFactory.createJCas();
		type = cas.getRequiredType(TypeA.class.getName());

		strMatcherIn = new ArrayMatcher(Fixtures.feature("fString"), Op.IN, 1, "3", "tata", true, 5.2f);
		strMatcherNin = new ArrayMatcher(Fixtures.feature("fString"), Op.NIN, 1, "3", "tata", true, 5.2f);
		intMatcherIn = new ArrayMatcher(Fixtures.feature("fInt"), Op.IN, 1, "3", "tata", true, 5.2f);
		intMatcherNin = new ArrayMatcher(Fixtures.feature("fInt"), Op.NIN, 1, "3", "tata", true, 5.2f);
		floatMatcherIn = new ArrayMatcher(Fixtures.feature("fFloat"), Op.IN, 1, "3", "tata", true, 5.2f);
		floatMatcherNin = new ArrayMatcher(Fixtures.feature("fFloat"), Op.NIN, 1, "3", "tata", true, 5.2f);
		booleanMatcherIn = new ArrayMatcher(Fixtures.feature("fBoolean"), Op.IN, 1, "3", "tata", true, 5.2f);
		booleanMatcherNin = new ArrayMatcher(Fixtures.feature("fBoolean"), Op.NIN, 1, "3", "tata", true, 5.2f);
	}

	@Test
	public void testDifferentTypes() throws UIMAException {

		TypeA a;

		// tata
		a = Mocks.anno(TypeA.class, "fString", "tata");
		assertTrue(strMatcherIn.matches(a));
		assertFalse(strMatcherNin.matches(a));
		a = Mocks.anno(TypeA.class, "fString", "Tata");
		assertFalse(strMatcherIn.matches(a));
		assertTrue(strMatcherNin.matches(a));

		// 1
		a = Mocks.anno(TypeA.class, "fInt", 1);
		assertTrue(intMatcherIn.matches(a));
		assertFalse(intMatcherNin.matches(a));

		a = Mocks.anno(TypeA.class, "fString", "1");
		assertFalse(strMatcherIn.matches(a));
		assertTrue(strMatcherNin.matches(a));


		// 3
		a = Mocks.anno(TypeA.class, "fString", "3");
		assertTrue(strMatcherIn.matches(a));
		assertFalse(strMatcherNin.matches(a));

		a = Mocks.anno(TypeA.class, "fInt", 3);
		assertFalse(intMatcherIn.matches(a));
		assertTrue(intMatcherNin.matches(a));


		// 5.2
		a = Mocks.anno(TypeA.class, "fFloat", 5.2f);
		assertTrue(floatMatcherIn.matches(a));
		assertFalse(floatMatcherNin.matches(a));

		a = Mocks.anno(TypeA.class, "fString", "5.2");
		assertFalse(strMatcherIn.matches(a));
		assertTrue(strMatcherNin.matches(a));

		// 5.2
		a = Mocks.anno(TypeA.class, "fBoolean", true);
		assertTrue(booleanMatcherIn.matches(a));
		assertFalse(booleanMatcherNin.matches(a));

		a = Mocks.anno(TypeA.class, "fString", "true");
		assertFalse(strMatcherIn.matches(a));
		assertTrue(strMatcherNin.matches(a));

	}
}
