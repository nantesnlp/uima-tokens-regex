package fr.univnantes.lina.uima.tkregex.bm;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.uima.cas.Type;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.jcas.JCas;

import fr.univnantes.lina.uima.tkregex.RegexOccurrence;
import fr.univnantes.lina.uima.tkregex.ae.TokenRegexAE;

public class CountingEngine extends TokenRegexAE {

	AtomicInteger cnt = new AtomicInteger(0);
	
	Type termType;
	
	@Override
	protected void beforeRuleProcessing(JCas jCas) {
		super.beforeRuleProcessing(jCas);
		termType = jCas.getTypeSystem().getType("fr.univnantes.termsuite.types.TermOccAnnotation");
	}
	
	@Override
	protected void ruleMatched(JCas jCas, RegexOccurrence occurrence) {
		cnt.incrementAndGet();
		AnnotationFS annotation = jCas.getCas().createAnnotation(termType, occurrence.getBegin(), occurrence.getEnd());
		jCas.addFsToIndexes(annotation);
	}
	
}
