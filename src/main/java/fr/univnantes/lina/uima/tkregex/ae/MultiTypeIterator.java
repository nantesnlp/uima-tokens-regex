package fr.univnantes.lina.uima.tkregex.ae;

import com.google.common.collect.AbstractIterator;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import java.util.*;
import java.util.function.Consumer;

public class MultiTypeIterator implements Iterator<Annotation> {

	protected JCas cas;
	protected FSIterator<Annotation> it;
	protected Optional<Set<Class<? extends Annotation>>> classes = Optional.empty();
	protected Optional<Set<Type>> iteratedTypes = Optional.empty();
	protected Optional<Annotation> startingAnnotation = Optional.empty();

//	public MultiTypeIterator(JCas cas, Class<? extends Annotation>... classes) {
//		this.cas = cas;
//		this.classes = Optional.of(new HashSet<>(classes.length));
//		for(Class<? extends Annotation> cls:classes) {
//			this.classes.get().add(cls);
//		}
//		doNext();
//	}

	public MultiTypeIterator(JCas jCas, Collection<Type> iteratedTypes) {
		this.cas= jCas;
		this.iteratedTypes = Optional.of(new HashSet<>(iteratedTypes));
		doNext();
	}

	public MultiTypeIterator(JCas cas, Collection<Type> iteratedTypes, Annotation startingAnnotation) {
		this.cas= cas;
		this.iteratedTypes = Optional.of(new HashSet<>(iteratedTypes));
		this.startingAnnotation = Optional.of(startingAnnotation);
		doNext();
	}


	private boolean isEmpty() {
		if(classes.isPresent())
			return classes.get().isEmpty();
		else
			return iteratedTypes.get().isEmpty();
	}

	private boolean isIntanciable(Annotation a) {
		if(classes.isPresent()) {
			for(Class<? extends Annotation> cls:classes.get())
				if(cls.isAssignableFrom(a.getClass()))
					return true;
			return false;
		} else {
			for(Type type:iteratedTypes.get())
				if(a.getCAS().getTypeSystem().subsumes(type, a.getType()))
					return true;
			return false;
		}
	}

	private FSIterator<Annotation> getIt() {
		if(it == null) {
			if(startingAnnotation.isPresent())
				it = this.cas.getAnnotationIndex(Annotation.class).iterator(startingAnnotation.get());
			else
				it = this.cas.getAnnotationIndex(Annotation.class).iterator();
		}
		return it;
	}


	protected Annotation next = null;

	protected void doNext() {
		if(!getIt().hasNext())
			next = null;
		else if(isEmpty()) {
			next = getIt().next();
		}
		else {
			Annotation a = getIt().next();
			do {
				if(isIntanciable(a)) {
					next = a;
					break;
				} else if(!getIt().hasNext()) {
					next = null;
					break;
				}
				else
					a = getIt().next();
			} while(true);
		}
	}

	@Override
	public boolean hasNext() {
		return next != null;
	}

	@Override
	public Annotation next() {
		Annotation retVal = next;
		doNext();
		return retVal;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Not implemented");
	}

	@Override
	public void forEachRemaining(Consumer<? super Annotation> consumer) {
		throw new UnsupportedOperationException("Not implemented");
	}
}
