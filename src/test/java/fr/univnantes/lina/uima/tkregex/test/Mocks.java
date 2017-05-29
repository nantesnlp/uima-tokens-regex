package fr.univnantes.lina.uima.tkregex.test;

import org.apache.uima.cas.text.AnnotationFS;
import org.mockito.Mockito;

public class Mocks {

	public static AnnotationFS anno(String text) {
		AnnotationFS anno = Mockito.mock(AnnotationFS.class);
		Mockito.when(anno.getCoveredText()).thenReturn(text);
		return anno;
	}
}
