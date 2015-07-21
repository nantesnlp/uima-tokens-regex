package fr.univnantes.lina.uima.tkregex;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.apache.uima.cas.text.AnnotationFS;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

public class OrMatcher implements AnnotationMatcher {
	
	/* Label aspect */
	private Labeller labeller = new Labeller();
	public String getLabel() {
		return labeller.getLabel();
	}
	public void setLabel(String label) {
		labeller.setLabel(label);
	}
	/* End of Label aspect */
	
	/* Ignorer aspect */
	private Ignorer ignorer = new Ignorer();
	public boolean isIgnoreMatcher() {
		return ignorer.isIgnoreMatcher();
	}
	public void setIgnoreMatcher(boolean ignoreMatcher) {
		ignorer.setIgnoreMatcher(ignoreMatcher);
	}
	/* End of Ignorer aspect */
	
	private LinkedList<AnnotationMatcher> expr = Lists.newLinkedList();
	
	public List<AnnotationMatcher> getDisjonctionParts() {
		return expr;
	}


	public boolean addConjonctionPart(AnnotationMatcher e) {
		return expr.add(e);
	}


	public boolean addAllDijonctionParts(Collection<? extends AnnotationMatcher> c) {
		return expr.addAll(c);
	}
	
	@Override
	public boolean match(AnnotationFS annotation) {
		for(AnnotationMatcher matcher:expr) {
			if(matcher.match(annotation)) 
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "OrMatcher: (" + Joiner.on(" & ").join(expr) + ")";
	}
}
