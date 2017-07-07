package fr.univnantes.lina.uima.tkregex.test.utils;

import java.util.stream.Collectors;

import org.apache.uima.jcas.JCas;

import fr.univnantes.lina.test.uima.OccAnno;
import fr.univnantes.lina.uima.tkregex.LabelledAnnotation;
import fr.univnantes.lina.uima.tkregex.RegexOccurrence;
import fr.univnantes.lina.uima.tkregex.ae.TokenRegexAE;

public class RecogEngine extends TokenRegexAE {
	@Override
	protected void ruleMatched(JCas jCas, RegexOccurrence occurrence) {
		OccAnno a = new OccAnno(jCas);
		a.setBegin(occurrence.getBegin());
		a.setEnd(occurrence.getEnd());
		a.setRule(occurrence.getRule().getName());
		a.setPattern(occurrence.getLabelledAnnotations().stream().map(LabelledAnnotation::getLabel).collect(Collectors.joining(" ")));
		a.addToIndexes();
	}
}