package fr.univnantes.lina.uima.tkregex.test.utils;

import java.nio.file.Paths;

import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.fit.factory.TypeSystemDescriptionFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.metadata.TypeDescription;
import org.apache.uima.resource.metadata.TypeSystemDescription;

import fr.univnantes.lina.test.uima.TestAnno;

public class Fixtures {
	
	public static JCas createTestCas(String documentString) {
		String tsPath = Paths.get("src", "test", "resources", "TestTypeSystem.xml").toString();
		TypeSystemDescription tsd = TypeSystemDescriptionFactory.createTypeSystemDescriptionFromPath(tsPath);
		
		for(TypeDescription td:tsd.getTypes()) {
			System.out.println(td);
		}
		
		
		try {
			JCas cas = JCasFactory.createJCas(tsd);
			cas.setDocumentText(documentString);
			StringBuffer buffer = new StringBuffer();
			int lastBegin = 0;
			boolean inWord = false;
			int i;
			for(i = 0 ; i < documentString.length() ; i++) {
				if(Character.isWhitespace(documentString.charAt(i))) {
					if(inWord) {
						createAnno(cas, lastBegin, i, buffer.toString());
						inWord = false;
					}
				} else {
					if(!inWord) {
						lastBegin = i;
						buffer = new StringBuffer();
						inWord = true;
					}
					buffer.append(documentString.charAt(i));
				}
			}
			if(inWord)
				createAnno(cas, lastBegin, i, buffer.toString());
			return cas;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static void createAnno(JCas cas, int begin, int end, String lemma) {
		TestAnno a = new TestAnno(cas);
		a.setBegin(begin);
		a.setEnd(end);
		a.setLemma(lemma);
		a.addToIndexes();
	}
}
