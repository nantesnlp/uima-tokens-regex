package fr.univnantes.lina.uima.tkregex.ae;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import fr.univnantes.lina.uima.tkregex.model.automata.*;
import fr.univnantes.lina.uima.tkregex.model.matchers.LabelledAnnotation;
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
			final List<RegexOccurrence> recognizedEpisodes = new ArrayList<>();
			RecognitionHandler episodeHandler = (episode) -> {
				episode.setRule(rule);
				recognizedEpisodes.add(episode);
			};
			Automaton automaton = rule.getAutomaton();
			AutomatonEngine automatonEngine = new AutomatonEngine(automaton);
			automatonEngine.setAllowOverlappingInstances(this.allowOverlappingOccurrences);
			automatonEngine.addRecognitionHandler(episodeHandler);
			automatonEngine.reset();

			NoOverlapMultiTypeIterator it = getIterator(jCas);
			iterate(automatonEngine, it, true);
			automatonEngine.removeRecognitionHandler(episodeHandler);
			if(recognizedEpisodes.size() <= 1)
				for(RegexOccurrence o:recognizedEpisodes)
					casRecognitionHandler.recognizedEpisode(jCas, o);
			else
				for(RegexOccurrence o:keepLongestByInstanceId(recognizedEpisodes))
					casRecognitionHandler.recognizedEpisode(jCas, o);
		}

	}

	private List<RegexOccurrence> keepLongestByInstanceId(List<RegexOccurrence> recognizedEpisodes) {
		List<RegexOccurrence> keptOccurrences = new ArrayList<>(recognizedEpisodes.size());
		Multimap<Integer, RegexOccurrence> map = HashMultimap.create();
		for(RegexOccurrence o:recognizedEpisodes)
			map.put(o.getAutomatonInstanceId(), o);
		Collection<RegexOccurrence> currentGroup;
		for(Integer instanceId:map.keySet()) {
			currentGroup = map.get(instanceId);
			if(currentGroup.size() == 1)
				keptOccurrences.add(currentGroup.iterator().next());
			else {
				// removes doublons for that instance id
				List<RegexOccurrence> keptInGroup = Lists.newArrayListWithCapacity(currentGroup.size());
				for(RegexOccurrence o1:currentGroup)
					if(keptInGroup.stream().allMatch(o2 -> !sameEpisode(o1.getLabelledAnnotations(),o2.getLabelledAnnotations())))
						keptInGroup.add(o1);
				keptOccurrences.addAll(keptInGroup);
			}
		}
		return keptOccurrences;
	}

	private boolean sameEpisode(List<LabelledAnnotation> o1, List<LabelledAnnotation> o2) {
		if(o1.isEmpty() || o2.isEmpty())
			return true;
		else if(!o1.isEmpty() && o2.isEmpty())
			return o1.get(0) == o2.get(0) && sameEpisode(o1.subList(1, o1.size()), o2.subList(1, o2.size()));
		else
			return false;
	}

	private void iterate(AutomatonEngine automatonEngine, NoOverlapMultiTypeIterator it, boolean isRootIterator) {
		while (it.hasNext()) {
			Optional<NoOverlapMultiTypeIterator> alternative = it.getIterationAlternative();
			if(alternative.isPresent()) {
				AutomatonEngine automatonEngineClone = automatonEngine.doClone();
				iterate(automatonEngineClone, alternative.get(), false);
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
