package fr.univnantes.lina.uima.tkregex.test;

import fr.univnantes.lina.test.uima.A;
import fr.univnantes.lina.test.uima.B;
import fr.univnantes.lina.test.uima.C;
import fr.univnantes.lina.uima.tkregex.model.matchers.TypeMatcher;
import fr.univnantes.lina.uima.tkregex.test.utils.Fixtures;
import fr.univnantes.lina.uima.tkregex.test.utils.Mocks;
import org.apache.uima.UIMAException;
import org.apache.uima.cas.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeMatcherSpec {

	private TypeMatcher typeMatcherA;
	private TypeMatcher typeMatcherB;
	private TypeMatcher typeMatcherC;

	@Before
	public void setup() {
		typeMatcherA = new TypeMatcher(Fixtures.getTypeSystem(), Fixtures.getType("fr.univnantes.lina.test.uima.A"));
		typeMatcherB = new TypeMatcher(Fixtures.getTypeSystem(), Fixtures.getType("fr.univnantes.lina.test.uima.B"));
		typeMatcherC = new TypeMatcher(Fixtures.getTypeSystem(), Fixtures.getType("fr.univnantes.lina.test.uima.C"));
	}

	@Test
	public void testMatchesSelf() throws UIMAException {
		assertTrue(typeMatcherA.matches(Mocks.anno(A.class, 0, 0)));
		assertTrue(typeMatcherB.matches(Mocks.anno(B.class, 0, 0)));
		assertTrue(typeMatcherC.matches(Mocks.anno(C.class, 0, 0)));
	}


	@Test
	public void testMatchesSubClass() throws UIMAException {
		assertTrue(typeMatcherA.matches(Mocks.anno(C.class, 0, 0)));
		assertFalse(typeMatcherC.matches(Mocks.anno(A.class, 0, 0)));
	}

	@Test
	public void testDoesMatchOtherType() throws UIMAException {
		assertFalse(typeMatcherA.matches(Mocks.anno(B.class, 0, 0)));
		assertFalse(typeMatcherA.matches(Mocks.anno(B.class, 0, 0)));
		assertFalse(typeMatcherB.matches(Mocks.anno(A.class, 0, 0)));
		assertFalse(typeMatcherB.matches(Mocks.anno(C.class, 0, 0)));
		assertFalse(typeMatcherC.matches(Mocks.anno(A.class, 0, 0)));
		assertFalse(typeMatcherC.matches(Mocks.anno(B.class, 0, 0)));
	}
}
