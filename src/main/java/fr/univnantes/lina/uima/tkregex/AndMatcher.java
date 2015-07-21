package fr.univnantes.lina.uima.tkregex;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.apache.uima.cas.text.AnnotationFS;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class AndMatcher implements AnnotationMatcher {
	
	/* Ignorer aspect */
	private Ignorer ignorer = new Ignorer();
	public boolean isIgnoreMatcher() {
		return ignorer.isIgnoreMatcher();
	}
	public void setIgnoreMatcher(boolean ignoreMatcher) {
		ignorer.setIgnoreMatcher(ignoreMatcher);
	}
	/* End of Ignorer aspect */
	
	/* Label aspect */
	private Labeller labeller = new Labeller();
	public String getLabel() {
		return labeller.getLabel();
	}
	public void setLabel(String label) {
		labeller.setLabel(label);
	}
	/* End of Label aspect */
	
	private LinkedList<AnnotationMatcher> expr = Lists.newLinkedList();
	
	
	public boolean addConjonctionPart(AnnotationMatcher e) {
		return expr.add(e);
	}


	public boolean addAllConjonctionPart(Collection<? extends AnnotationMatcher> c) {
		return expr.addAll(c);
	}


	@Override
	public boolean match(AnnotationFS annotation) {
		for(AnnotationMatcher matcher:expr) {
			if(!matcher.match(annotation)) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "AndMatcher: (" + Joiner.on(" & ").join(expr) + ")";
	}
	
	public List<AnnotationMatcher> getConjonctionParts() {
		return ImmutableList.copyOf(expr);
	}
	
}
