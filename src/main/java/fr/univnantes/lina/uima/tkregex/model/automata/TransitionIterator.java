package fr.univnantes.lina.uima.tkregex.model.automata;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


/**
 * A clonable transition iteration
 */
public class TransitionIterator implements Iterator<Transition> {

	private List<Transition> transitions;
	private int currentIndex = 0;

	public TransitionIterator(List<Transition> transitions) {
		this.transitions = transitions;
	}

	@Override
	public boolean hasNext() {
		return currentIndex < transitions.size();
	}

	@Override
	public Transition next() {
		if(!hasNext())
			throw new NoSuchElementException(String.format("No transitions at index <%d> in list %s", currentIndex, transitions));
		Transition retVal = transitions.get(currentIndex);
		currentIndex++;
		return retVal;
	}

	public TransitionIterator doClone() {
		TransitionIterator clone = new TransitionIterator(transitions);
		clone.currentIndex = this.currentIndex;
		return clone;
	}
}
