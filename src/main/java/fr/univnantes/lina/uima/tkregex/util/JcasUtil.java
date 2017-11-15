package fr.univnantes.lina.uima.tkregex.util;

import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.TypeSystem;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JcasUtil {
	public static List<Annotation> toList(JCas jCas, Collection<Type> iteratedTypes) {
		List<Annotation> annotations = new ArrayList<>();

		FSIterator<Annotation> it = jCas.getAnnotationIndex().iterator();
		while(it.hasNext()) {
			Annotation a = it.next();
			if(iteratedTypes.isEmpty())
				annotations.add(a);
			else {
				for(Type type:iteratedTypes) {
					TypeSystem typeSystem = jCas.getTypeSystem();
					if(typeSystem.subsumes(type, a.getType())) {
						annotations.add(a);
						break;
					}
				}
			}
		}
		return annotations;
	}


}
