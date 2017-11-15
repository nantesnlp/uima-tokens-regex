package fr.univnantes.lina.uima.tkregex.ae;

import com.google.common.collect.AbstractIterator;
import fr.univnantes.lina.uima.tkregex.util.JcasUtil;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import java.util.*;
import java.util.function.Consumer;

public class MultiTypeIterator implements Iterator<Annotation> {

	protected List<Annotation> annotations;
	protected ListIterator<Annotation> it;
	protected int startingAnnotation = 0;


	public MultiTypeIterator(JCas cas, Collection<Type> iteratedTypes) {
		this(cas, iteratedTypes, 0);
	}

	public MultiTypeIterator(JCas cas, Collection<Type> iteratedTypes, int startingAnnotation) {
		this.annotations= JcasUtil.toList(cas, iteratedTypes);
		this.startingAnnotation = startingAnnotation;
		this.it = annotations.listIterator(0);
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean hasNext() {
		return it.hasNext();
	}

	@Override
	public Annotation next() {
		return it.next();
	}
}
