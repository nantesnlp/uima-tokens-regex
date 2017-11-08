package fr.univnantes.lina.uima.tkregex.test;

import fr.univnantes.lina.test.uima.TypeA;
import fr.univnantes.lina.uima.tkregex.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.ArrayMatcher;
import fr.univnantes.lina.uima.tkregex.test.utils.Mocks;
import org.apache.uima.UIMAException;
import org.apache.uima.cas.Feature;
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
		System.out.println(cas.getTypeSystem());
		type = cas.getRequiredType(TypeA.class.getName());

		Feature pString = cas.getRequiredFeature(type,"fString");
		Feature pInt = type.getFeatureByBaseName("fInt");
		Feature pBoolean = type.getFeatureByBaseName("fBoolean");
		Feature pFloat = type.getFeatureByBaseName("fFloat");
		strMatcherIn = new ArrayMatcher(pString, "in", 1, "3", "tata", true, 5.2f);
		strMatcherNin = new ArrayMatcher(pString, "nin", 1, "3", "tata", true, 5.2f);
		intMatcherIn = new ArrayMatcher(pInt, "in", 1, "3", "tata", true, 5.2f);
		intMatcherNin = new ArrayMatcher(pInt, "nin", 1, "3", "tata", true, 5.2f);
		floatMatcherIn = new ArrayMatcher(pFloat, "in", 1, "3", "tata", true, 5.2f);
		floatMatcherNin = new ArrayMatcher(pFloat, "nin", 1, "3", "tata", true, 5.2f);
		booleanMatcherIn = new ArrayMatcher(pBoolean, "in", 1, "3", "tata", true, 5.2f);
		booleanMatcherNin = new ArrayMatcher(pBoolean, "nin", 1, "3", "tata", true, 5.2f);
	}

	@Test
	public void testDifferentTypes() throws UIMAException {

		TypeA a;

		// tata
		a = Mocks.anno(TypeA.class, "fString", "tata");
		assertTrue(strMatcherIn.match(a));
		assertFalse(strMatcherNin.match(a));
		a = Mocks.anno(TypeA.class, "fString", "Tata");
		assertFalse(strMatcherIn.match(a));
		assertTrue(strMatcherNin.match(a));

		// 1
		a = Mocks.anno(TypeA.class, "fInt", 1);
		assertTrue(intMatcherIn.match(a));
		assertFalse(intMatcherNin.match(a));

		a = Mocks.anno(TypeA.class, "fString", "1");
		assertFalse(strMatcherIn.match(a));
		assertTrue(strMatcherNin.match(a));


		// 3
		a = Mocks.anno(TypeA.class, "fString", "3");
		assertTrue(strMatcherIn.match(a));
		assertFalse(strMatcherNin.match(a));

		a = Mocks.anno(TypeA.class, "fInt", 3);
		assertFalse(intMatcherIn.match(a));
		assertTrue(intMatcherNin.match(a));


		// 5.2
		a = Mocks.anno(TypeA.class, "fFloat", 5.2f);
		assertTrue(floatMatcherIn.match(a));
		assertFalse(floatMatcherNin.match(a));

		a = Mocks.anno(TypeA.class, "fString", "5.2");
		assertFalse(strMatcherIn.match(a));
		assertTrue(strMatcherNin.match(a));

		// 5.2
		a = Mocks.anno(TypeA.class, "fBoolean", true);
		assertTrue(booleanMatcherIn.match(a));
		assertFalse(booleanMatcherNin.match(a));

		a = Mocks.anno(TypeA.class, "fString", "true");
		assertFalse(strMatcherIn.match(a));
		assertTrue(strMatcherNin.match(a));

	}
}
