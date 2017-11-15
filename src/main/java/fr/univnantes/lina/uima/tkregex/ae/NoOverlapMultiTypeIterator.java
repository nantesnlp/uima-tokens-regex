package fr.univnantes.lina.uima.tkregex.ae;

import fr.univnantes.lina.uima.tkregex.util.JcasUtil;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.tcas.Annotation_Type;

import javax.swing.text.html.Option;
import java.util.*;

/*
An annotation iterator that always takes the next non-overlapping annotation
of any of accepted types.
 */
public class NoOverlapMultiTypeIterator implements Iterator<Annotation> {

	protected List<Annotation> annotations;
	protected int currentIndex;


	public NoOverlapMultiTypeIterator(JCas cas, Collection<Type> iteratedTypes) {
		this(cas, iteratedTypes, 0);
	}

	public NoOverlapMultiTypeIterator(JCas cas, Collection<Type> iteratedTypes, int startingIndex) {
		this.annotations= JcasUtil.toList(cas, iteratedTypes);
		this.currentIndex = startingIndex - 1;
		doNext();
	}


//	private List<AlternativeListener> alternativeListeners = new ArrayList<>();

	private  NoOverlapMultiTypeIterator() {
	}



//	public void addAlternativeListener(AlternativeListener listener) {
//		if(!alternativeListeners.contains(listener))
//			alternativeListeners.add(listener);
//	}

//	public void removeAlternativeListener(AlternativeListener listener) {
//		alternativeListeners.remove(listener);
//	}

	private boolean inOverlap = false;

	private int beforeLastIndex = -1;
	private int lastIndex = -1;

	protected void doNext() {
		currentIndex++;
		if(currentIndex < annotations.size()) {

			if (currentIndex  == 0) {
				//do nothing
			} else {
				if (annotations.get(lastIndex).getEnd() > annotations.get(currentIndex).getBegin()) {
					// produce an alternative for this overlap
					if(!inOverlap) {
						inOverlap = true;
//						produceIterationAlternative(beforeLastIndex, currentIndex);
					}
					doNext();
				} else {
					inOverlap = false;
				}
			}
		}
	}

	public boolean atAlternativePoint() {
		/*
		The iterator is at alternative point if the next annotation to return
		overlaps the n+1 annotation
		 */
		if(currentIndex + 1 >= annotations.size())
			// no after next annotation
			// cannot be an alternative point
			return false;
		Annotation nextToReturn = annotations.get(currentIndex);
		Annotation afterNextToReturn = annotations.get(currentIndex + 1);
		return nextToReturn.getEnd() > afterNextToReturn.getBegin();
	}


	public Optional<NoOverlapMultiTypeIterator> getIterationAlternative() {
		if(!atAlternativePoint())
			return Optional.empty();
		else {
			NoOverlapMultiTypeIterator newIt = new NoOverlapMultiTypeIterator();
			newIt.annotations = this.annotations;
			newIt.currentIndex = currentIndex + 1;
			newIt.lastIndex = lastIndex;
			newIt.beforeLastIndex = -1;
//			newIt.alternativeListeners = this.alternativeListeners;
			newIt.inOverlap = false;
//			notifyListeners(newIt);
			return Optional.of(newIt);
		}

	}

//	private void produceIterationAlternative(int lastIndex, int currentIndex) {
//		if(alternativeListeners.isEmpty())
//			return;
//		NoOverlapMultiTypeIterator newIt = new NoOverlapMultiTypeIterator();
//		newIt.annotations = this.annotations;
//		newIt.currentIndex = currentIndex;
//		newIt.lastIndex = lastIndex;
//		newIt.beforeLastIndex = -1;
//		newIt.alternativeListeners = this.alternativeListeners;
//		newIt.inOverlap = false;
//		notifyListeners(newIt);
//	}
//

//	private void notifyListeners(NoOverlapMultiTypeIterator newIt) {
//		for(AlternativeListener listener:alternativeListeners)
//			listener.newIterationAlternative(newIt);
//	}

	@Override
	public boolean hasNext() {
		return currentIndex < annotations.size();
	}

	@Override
	public Annotation next() {
		if(!hasNext())
			throw new NoSuchElementException();
		Annotation retVal = annotations.get(currentIndex);
		beforeLastIndex = lastIndex;
		lastIndex = currentIndex;
		doNext();
		return retVal;
	}

	@Override
	public String toString() {
		return String.format("%s<--*%s-->%s",
				lastIndex == -1 ? "BEGIN" : toString(annotations.get(lastIndex)),
				atAlternativePoint() ? "(fork)" : "",
				currentIndex >= annotations.size()  ? "END" : toString(annotations.get(currentIndex))
				);
	}

	private String toString(Annotation a) {
		return String.format("%s[%s,%d]", a.getClass().getSimpleName(), a.getBegin(), a.getEnd());
	}

}
