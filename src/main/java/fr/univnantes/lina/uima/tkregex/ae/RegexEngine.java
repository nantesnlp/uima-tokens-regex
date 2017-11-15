package fr.univnantes.lina.uima.tkregex.ae;

import fr.univnantes.lina.uima.tkregex.model.automata.Automaton;
import fr.univnantes.lina.uima.tkregex.model.automata.RecognitionHandler;
import fr.univnantes.lina.uima.tkregex.model.automata.RegexOccurrence;
import fr.univnantes.lina.uima.tkregex.model.automata.Rule;
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

		RecognitionHandler episodeHandler = episode -> casRecognitionHandler.recognizedEpisode(jCas, episode);

		for (final Rule rule: rules) {
			Deque<NoOverlapMultiTypeIterator> currentAlternativeStack = new LinkedList<>();
			Automaton automaton = rule.getAutomaton();
			automaton.setAllowOverlappingInstances(this.allowOverlappingOccurrences);
			automaton.addRecognitionHandler(episodeHandler);
			automaton.reset();

			NoOverlapMultiTypeIterator it = getIterator(jCas);
			it.addAlternativeListener(currentAlternativeStack::addFirst);
			iterate(automaton, it, currentAlternativeStack);
			automaton.finish();
			automaton.removeRecognitionHandler(episodeHandler);
		}

	}

	private void iterate(Automaton automaton, NoOverlapMultiTypeIterator it, Deque<NoOverlapMultiTypeIterator> alternativeStack) {
		while (it.hasNext()) {
			Annotation annotation = it.next();
			automaton.nextAnnotation(annotation);
			if(automaton.isCurrentlyFailed()) {
				if(alternativeStack.isEmpty()) {
					// end iteration on fail when "it" is not the root iterator
					if (!it.isRoot())
						return;
				} else
					iterate(automaton, alternativeStack.pop(), alternativeStack);
			}
		}
	}

	private NoOverlapMultiTypeIterator getIterator(JCas jCas) {
		return new NoOverlapMultiTypeIterator(jCas, this.iteratedTypes);
	}


}
