package fr.univnantes.lina.uima.tkregex.ae;

import fr.univnantes.lina.uima.tkregex.model.automata.*;
import fr.univnantes.lina.uima.tkregex.model.matchers.LabelledAnnotation;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import java.util.*;
import java.util.function.Predicate;

public class RegexEngine {
	private List<Type> iteratedTypes;
	private List<Rule> rules;
	private boolean allowOverlappingOccurrences;
	private CasRecognitionHandler casRecognitionHandler;
	private int maxEpisodeLength = AutomatonEngine.MAX_EPISODE_LENGTH;


	public RegexEngine(List<Rule> rules, List<Type> iteratedTypes, CasRecognitionHandler recognitionHandler) {
		this.casRecognitionHandler = recognitionHandler;
		this.iteratedTypes = iteratedTypes;
		this.rules = rules;
	}

	public void setMaxEpisodeLength(int maxEpisodeLength) {
		this.maxEpisodeLength = maxEpisodeLength;
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
		/*
		By default, process on all rules
		 */
		process(jCas, r -> true);
	}

	public void process(JCas jCas, Predicate<Rule> ruleFilter) {


		for (final Rule rule: rules) {
			if(!ruleFilter.test(rule))
				continue;
			final List<RegexOccurrence> recognizedEpisodes = new ArrayList<>();
			RecognitionHandler episodeHandler = (episode) -> {
				episode.setRule(rule);
				recognizedEpisodes.add(episode);
			};
			Automaton automaton = rule.getAutomaton();
			AutomatonEngine automatonEngine = new AutomatonEngine(automaton);
			automatonEngine.setAllowOverlappingInstances(this.allowOverlappingOccurrences);
			automatonEngine.setMaxEpisodeLength(this.maxEpisodeLength);
			automatonEngine.addRecognitionHandler(episodeHandler);
			automatonEngine.reset();

			iterate(automatonEngine, jCas);
			automatonEngine.removeRecognitionHandler(episodeHandler);
			if(recognizedEpisodes.size() <= 1)
				for(RegexOccurrence o:recognizedEpisodes)
					casRecognitionHandler.recognizedEpisode(jCas, o);
			else
				for(RegexOccurrence o:removeDoublons(recognizedEpisodes))
					casRecognitionHandler.recognizedEpisode(jCas, o);
		}

	}

	private List<RegexOccurrence> removeDoublons(List<RegexOccurrence> recognizedEpisodes) {
		Collections.sort(recognizedEpisodes, (e1,e2) -> {
			int comp = e1.getBegin() - e2.getBegin();
			return comp == 0 ? e1.getEnd() - e2.getEnd() : comp;
		});

		List<RegexOccurrence> keptOccurrences = new ArrayList<>(recognizedEpisodes.size());
		Iterator<RegexOccurrence> it = recognizedEpisodes.iterator();
		RegexOccurrence last = it.next();
		RegexOccurrence current;
		keptOccurrences.add(last);
		while(it.hasNext()) {
			current = it.next();
			if(!sameEpisode(current.getLabelledAnnotations(), last.getLabelledAnnotations())) {
				keptOccurrences.add(current);
				last = current;
			}
		}

		return keptOccurrences;
	}

	private boolean sameEpisode(List<LabelledAnnotation> o1, List<LabelledAnnotation> o2) {
		if(o1.isEmpty() && o2.isEmpty())
			return true;
		else if(!o1.isEmpty() && !o2.isEmpty())
			return o1.get(0).getAnnotation() == o2.get(0).getAnnotation() && sameEpisode(o1.subList(1, o1.size()), o2.subList(1, o2.size()));
		else
			return false;
	}

	private static final int MAX_ALTERNATIVE_COUNT = 10;
	private void iterate(AutomatonEngine automatonEngine, JCas jCas) {
		iterate(automatonEngine, getIterator(jCas), true, MAX_ALTERNATIVE_COUNT);
	}

	private void iterate(AutomatonEngine automatonEngine, NoOverlapMultiTypeIterator it, boolean isRootIterator, int alternativeCount) {
		while (it.hasNext()) {
			Optional<NoOverlapMultiTypeIterator> alternative = it.getIterationAlternative();
			if(alternative.isPresent() && alternativeCount > 0) {
				AutomatonEngine automatonEngineClone = automatonEngine.doClone();
				iterate(automatonEngineClone, alternative.get(), false, alternativeCount - 1);
			}
			Annotation annotation = it.next();
			boolean inAlternativeIterationWindow = it.getOffsetUpperBound() > annotation.getBegin();
			automatonEngine.nextAnnotation(annotation, inAlternativeIterationWindow);


			if(isRootIterator)
				// this iterator is never killed
				continue;
			else {
				boolean nextOutOfWindow = it.peekNext().isPresent() && it.peekNext().get().getBegin() >= it.getOffsetUpperBound();
				if(nextOutOfWindow) {
					if(!automatonEngine.isCurrentlyFailed())
						continue;
					else {
						// stopping current iteration
						break;
					}

				}
			}
		}
		automatonEngine.finish();

	}

	private static int id = 0;
	private Map<AutomatonEngine, Integer> ids = new HashMap<>();
	private int getEngineId(AutomatonEngine engine) {
		if(!ids.containsKey(engine))
			ids.put(engine, id++);
		return ids.get(engine);
	}
	private NoOverlapMultiTypeIterator getIterator(JCas jCas) {
		return new NoOverlapMultiTypeIterator(jCas, this.iteratedTypes);
	}


}
