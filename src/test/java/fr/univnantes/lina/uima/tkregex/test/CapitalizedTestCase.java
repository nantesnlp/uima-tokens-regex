package fr.univnantes.lina.uima.tkregex.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import fr.univnantes.lina.uima.tkregex.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.matchers.Capitalized;

public class CapitalizedTestCase {
	
	AnnotationMatcher matcher;
	
	@Before
	public void setup() {
		matcher = new Capitalized();
	}
	
	@Test
	public void set() {
		// FALSE
		assertFalse(matcher.match(Mocks.anno("tata")));

		// TRUE
		assertTrue(matcher.match(Mocks.anno("Tata")));
		assertTrue(matcher.match(Mocks.anno("TATA")));
		assertTrue(matcher.match(Mocks.anno("ÀATA")));
	}
}
