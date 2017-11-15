package fr.univnantes.lina.uima.tkregex.ae;

import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import java.util.*;

/*
An annotation iterator that always takes the next non-overlapping annotation
of any of accepted types.
 */
public class NoOverlapMultiTypeIterator implements Iterator<Annotation> {

	private List<AlternativeListener> alternativeListeners = new ArrayList<>();
	private Optional<Annotation> startAnnotation = Optional.empty();

	private MultiTypeIterator multiTypeIterator;
	private Annotation last = null;

	private  NoOverlapMultiTypeIterator() {
	}


	public NoOverlapMultiTypeIterator(JCas cas, Collection<Type> iteratedTypes) {
		multiTypeIterator = new MultiTypeIterator(cas, iteratedTypes);
		doNext();
	}

	public void addAlternativeListener(AlternativeListener listener) {
		if(!alternativeListeners.contains(listener))
			alternativeListeners.add(listener);
	}

	public void removeAlternativeListener(AlternativeListener listener) {
		alternativeListeners.remove(listener);
	}

	private Annotation next;
	private boolean inOverlap = false;

	protected void doNext() {
		if(multiTypeIterator.hasNext()) {
			Annotation previous = next;
			Annotation current = multiTypeIterator.next();


			if (previous == null) {
				next = current;
				last = null;
				// do nothing more
			} else {
				if (previous.getEnd() > current.getBegin()) {
					// produce an alternative for this overlap
					if(!inOverlap) {
						inOverlap = true;
						produceIterationAlternative(current);
					}
					doNext();
				} else {
					inOverlap = false;
					last = previous;
					next = current;
					// do nothing more
				}
			}
		} else
			next = null;
	}


	/*
	returns true if this iterator has been created to iterate from the beginning,
	and not from an alternative point (i.e. with no startAnnotation)
	 */
	public boolean isRoot() {
		return !this.startAnnotation.isPresent();
	}

	private void produceIterationAlternative(Annotation annotation) {
		if(alternativeListeners.isEmpty())
			return;
		NoOverlapMultiTypeIterator newIt = new NoOverlapMultiTypeIterator();
		newIt.multiTypeIterator = new MultiTypeIterator(multiTypeIterator.cas, multiTypeIterator.iteratedTypes.get(), annotation);
		newIt.startAnnotation = Optional.of(annotation);
		newIt.alternativeListeners = this.alternativeListeners;
		newIt.next = annotation;
		newIt.last = last;
		newIt.inOverlap = false;
		notifyListeners(newIt);
	}


	private void notifyListeners(NoOverlapMultiTypeIterator newIt) {
		for(AlternativeListener listener:alternativeListeners)
			listener.newIterationAlternative(newIt);
	}

	@Override
	public boolean hasNext() {
		return next != null;
	}

	@Override
	public Annotation next() {
		if(next == null)
			throw new NoSuchElementException();
		Annotation retVal = next;
		doNext();
		return retVal;
	}
}
