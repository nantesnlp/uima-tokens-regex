package fr.univnantes.lina.uima.tkregex.iteration;

import com.google.common.collect.AbstractIterator;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import java.util.HashSet;
import java.util.Set;

public class MultiTypeIterator extends AbstractIterator<Annotation> {

	private JCas cas;
	private FSIterator<Annotation> it;
	private Set<Class<? extends Annotation>> classes;

	public MultiTypeIterator(JCas cas, Class<? extends Annotation>... classes) {
		this.cas = cas;
		this.classes = new HashSet<>(classes.length);
		for(Class<? extends Annotation> cls:classes) {
			this.classes.add(cls);
		}
	}

	@Override
	protected Annotation computeNext() {
		if(!getIt().hasNext())
			return endOfData();
		else if(classes.isEmpty()) {
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

	private boolean isIntanciable(Annotation a) {
		for(Class<? extends Annotation> cls:classes)
			if(cls.isAssignableFrom(a.getClass()))
				return true;
		return false;
	}

	private FSIterator<Annotation> getIt() {
		if(it == null)
			it = this.cas.getAnnotationIndex(Annotation.class).iterator();
		return it;
	}
}
