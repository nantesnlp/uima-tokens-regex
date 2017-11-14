package fr.univnantes.lina.uima.tkregex.ae;

import com.google.common.collect.AbstractIterator;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import java.util.*;

public class MultiTypeIterator extends AbstractIterator<Annotation> {

	private JCas cas;
	private FSIterator<Annotation> it;
	private Optional<Set<Class<? extends Annotation>>> classes = Optional.empty();
	private Optional<Set<Type>> iteratedTypes = Optional.empty();

	public MultiTypeIterator(JCas cas, Class<? extends Annotation>... classes) {
		this.cas = cas;
		this.classes = Optional.of(new HashSet<>(classes.length));
		for(Class<? extends Annotation> cls:classes) {
			this.classes.get().add(cls);
		}
	}

	public MultiTypeIterator(JCas jCas, Collection<Type> iteratedTypes) {
		this.cas= jCas;
		this.iteratedTypes = Optional.of(new HashSet<>(iteratedTypes));
	}


	@Override
	protected Annotation computeNext() {
		if(!getIt().hasNext())
			return endOfData();
		else if(isEmpty()) {
			return getIt().next();
		}
		else {
			Annotation a = getIt().next();
			do {
				if(isIntanciable(a))
					return a;
				else if(!getIt().hasNext())
					return endOfData();
				else
					a = getIt().next();
			} while(true);
		}
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
		if(it == null)
			it = this.cas.getAnnotationIndex(Annotation.class).iterator();
		return it;
	}
}
