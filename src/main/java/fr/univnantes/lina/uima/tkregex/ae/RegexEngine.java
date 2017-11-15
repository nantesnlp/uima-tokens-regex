package fr.univnantes.lina.uima.tkregex.ae;

import fr.univnantes.lina.uima.tkregex.model.automata.*;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import java.util.*;

public class RegexEngine {
	private List<Type> iteratedTypes;
	private List<Rule> rules;
	private boolean allowOverlappingOccurrences;
	private CasRecognitionHandler casRecognitionHandler;


	public RegexEngine(List<Rule> rules, List<Type> iteratedTypes, CasRecognitionHandler recognitionHandler) {
		this.casRecognitionHandler = recognitionHandler;
		this.iteratedTypes = iteratedTypes;
		this.rules = rules;
	}

//	public String getIteratedTypeName() {
//		return iteratedTypeName;
//	}

//	public void setIteratedTypeName(String iteratedTypeName) {
//		this.iteratedTypeName = iteratedTypeName;
//	}

	public boolean isAllowOverlappingOccurrences() {
		return allowOverlappingOccurrences;
	}

	public void setAllowOverlappingOccurrences(boolean allowOverlappingOccurrences) {
		this.allowOverlappingOccurrences = allowOverlappingOccurrences;
	}


	public void process(JCas jCas) {


		for (final Rule rule: rules) {
			RecognitionHandler episodeHandler = episode -> {
				casRecognitionHandler.recognizedEpisode(jCas, episode, rule);
			};
			Automaton automaton = rule.getAutomaton();
			AutomatonEngine automatonEngine = new AutomatonEngine(automaton);
			automatonEngine.setAllowOverlappingInstances(this.allowOverlappingOccurrences);
			automatonEngine.addRecognitionHandler(episodeHandler);
			automatonEngine.reset();

			NoOverlapMultiTypeIterator it = getIterator(jCas);
			iterate(automatonEngine, it, true);
			automatonEngine.finish();
			automatonEngine.removeRecognitionHandler(episodeHandler);
		}

	}

	private void iterate(AutomatonEngine automaton, NoOverlapMultiTypeIterator it, boolean isRootIterator) {
		while (it.hasNext()) {
			Optional<NoOverlapMultiTypeIterator> alternative = it.getIterationAlternative();
			if(alternative.isPresent())
				iterate(automaton.doClone(), alternative.get(), false);
			Annotation annotation = it.next();
			automaton.nextAnnotation(annotation);
			if(automaton.isCurrentlyFailed() && !isRootIterator)
				break;
		}
	}

	private NoOverlapMultiTypeIterator getIterator(JCas jCas) {
		return new NoOverlapMultiTypeIterator(jCas, this.iteratedTypes);
	}


}
