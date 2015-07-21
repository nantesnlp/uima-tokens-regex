package fr.univnantes.lina.uima.tkregex.test;


import junit.framework.TestCase;

import org.apache.uima.jcas.tcas.Annotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import fr.univnantes.lina.uima.tkregex.RegexCoveredTextMatcher;

@RunWith(MockitoJUnitRunner.class)
public class RegexCoveredTextMatcherTestCase extends TestCase {
	public Annotation getAnnotation(String coveredText) {
		Annotation anno = Mockito.mock(Annotation.class);
		Mockito.when(anno.getCoveredText()).thenReturn(coveredText);
		return anno;
	}
	
	@Test
	public void testMatch() {
		doTest("Le baccalauréat", "bac", true);
		// should be case-insensitive
		doTest("Le baccalauréat", "baC", true);
		doTest("Le baccalauréat", "^bac", false);
		doTest("Le baccalauréat", "^Le bac", true);
		doTest("Le baccalauréat", "^Le bac$", false);
		doTest("Le baccalauréat", "^Le b(a|e)?c*", true);
		doTest("Le baccalauréat", "^Le{2} b(a|e)?c*", false);
	}

	public void doTest(String coveredText, String regex, boolean matches) {
		RegexCoveredTextMatcher m = new RegexCoveredTextMatcher(regex);
		assertEquals(matches, m.match(getAnnotation(coveredText)));
	}
}
