package fr.univnantes.lina.uima.tkregex.ae;

import fr.univnantes.lina.uima.tkregex.model.automata.RecognitionHandler;
import fr.univnantes.lina.uima.tkregex.model.automata.RegexOccurrence;
import fr.univnantes.lina.uima.tkregex.model.automata.Rule;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import java.util.List;

public class RegexEngine {
	private List<Rule> rules;
	private String iteratedTypeName;
	private boolean allowOverlappingOccurrences;
	private CasRecognitionHandler casRecognitionHandler;


	public RegexEngine(List<Rule> rules, CasRecognitionHandler recognitionHandler) {
		this.casRecognitionHandler = recognitionHandler;
		this.rules = rules;
	}

	public String getIteratedTypeName() {
		return iteratedTypeName;
	}

	public void setIteratedTypeName(String iteratedTypeName) {
		this.iteratedTypeName = iteratedTypeName;
	}

	public boolean isAllowOverlappingOccurrences() {
		return allowOverlappingOccurrences;
	}

	public void setAllowOverlappingOccurrences(boolean allowOverlappingOccurrences) {
		this.allowOverlappingOccurrences = allowOverlappingOccurrences;
	}


	public void process(JCas jCas) {

		RecognitionHandler episodeHandler = new RecognitionHandler() {
			@Override
			public void recognizedEpisode(RegexOccurrence episode) {
				casRecognitionHandler.recognizedEpisode(jCas, episode);
			}
		};

		for (final Rule rule: rules) {
			rule.getAutomaton().setAllowOverlappingInstances(this.allowOverlappingOccurrences);
			rule.getAutomaton().addRecognitionHandler(episodeHandler);
			rule.getAutomaton().reset();
		}

		FSIterator<Annotation> it = jCas.getAnnotationIndex(getIteratedType(jCas)).iterator();
		while (it.hasNext()) {
			Annotation word = it.next();
			boolean allRulesFailed = true;
			for (Rule rule : rules) {
				rule.getAutomaton().nextAnnotation(word);
				allRulesFailed &= rule.getAutomaton().currentInstancesNum() == 0;
			}
			if(allRulesFailed)
				allRulesFailed(jCas);
		}

		for (Rule rule : rules)
			rule.getAutomaton().finish();
		for (final Rule rule: rules)
			rule.getAutomaton().removeRecognitionHandler(episodeHandler);

	}

	private Type getIteratedType(JCas cas) {
		return cas.getTypeSystem().getType(iteratedTypeName);
	}


	protected void allRulesFailed(JCas jCas) {
	}
}
