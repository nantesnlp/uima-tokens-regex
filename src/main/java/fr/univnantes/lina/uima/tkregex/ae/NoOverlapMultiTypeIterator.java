package fr.univnantes.lina.uima.tkregex.ae;

import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import java.util.Collection;

/*
An annotation iterator that always takes the next non-overlapping annotation
of any of accepted types.
 */
public class NoOverlapMultiTypeIterator extends MultiTypeIterator {
	public NoOverlapMultiTypeIterator(JCas cas, Class<? extends Annotation>... classes) {
		super(cas, classes);
	}

	public NoOverlapMultiTypeIterator(JCas jCas, Collection<Type> iteratedTypes) {
		super(jCas, iteratedTypes);
	}

	private Annotation last = null;

	@Override
	protected Annotation computeNext() {
		Annotation  annotation =  super.computeNext();
		if(annotation == null)
			// end of data
			return annotation;
		else if(last == null) {
			last = annotation;
			return annotation;
		} else if(last.getEnd()>annotation.getBegin())
			return computeNext();
		else {
			last = annotation;
			return annotation;
		}
	}
}
