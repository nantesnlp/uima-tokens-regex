package fr.univnantes.lina.uima.tkregex.ae;

import com.google.common.collect.HashMultimap;
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
		RegexOccurrence longest, current;
		Collection<RegexOccurrence> occGroup;
		Iterator<RegexOccurrence> iterator;
		for(Integer instanceId:map.keySet()) {
			occGroup = map.get(instanceId);
			iterator = occGroup.iterator();
			longest = iterator.next();
			while(iterator.hasNext()) {
				current = iterator.next();
				if(current.size() > longest.size())
					longest = current;
			}
			keptOccurrences.add(longest);
		}
		return keptOccurrences;
	}

//	private List<RegexOccurrence> removePrefixOverlaps(List<RegexOccurrence> recognizedEpisodes) {
//		Collections.sort(recognizedEpisodes, (occ1, occ2) -> {
//			int comp = occ1.getBegin() - occ2.getBegin();
//			if(comp != 0)
//				return comp;
//			else
//				return occ2.getEnd() - occ1.getEnd();
//		});
//		int lastBegin = -1;
//		RegexOccurrence lastBiggestAtBegin = null;
//		List<RegexOccurrence> keptOccurrences = new ArrayList<>();
//		for(RegexOccurrence current:recognizedEpisodes) {
//			if(current.getBegin() > lastBegin) {
//				lastBegin = current.getBegin();
//				lastBiggestAtBegin = current;
//				keptOccurrences.add(current);
//			} else {
//				if(!samePrefix(lastBiggestAtBegin.getLabelledAnnotations(), current.getLabelledAnnotations()))
//					keptOccurrences.add(current);
//			}
//		}
//		return keptOccurrences;
//	}

	private boolean samePrefix(List<LabelledAnnotation> l1, List<LabelledAnnotation> l2) {
		for (int i=0; i<Math.min(l1.size(), l2.size()); i++) {
			if(l1.get(i).getAnnotation() != l2.get(i).getAnnotation())
				return false;
		}
		return true;
	}

	private void iterate(AutomatonEngine automatonEngine, NoOverlapMultiTypeIterator it, boolean isRootIterator) {
		System.out.println("Iterating with " + it);
		while (it.hasNext()) {
			Optional<NoOverlapMultiTypeIterator> alternative = it.getIterationAlternative();
			if(alternative.isPresent()) {
				AutomatonEngine automatonEngineClone = automatonEngine.doClone();
				System.out.format("Cloning engine %d to engine %d%n",
						getEngineId(automatonEngine),
						getEngineId(automatonEngineClone));
				iterate(automatonEngineClone, alternative.get(), false);
			}
			Annotation annotation = it.next();
			automatonEngine.nextAnnotation(annotation);
			if(automatonEngine.isCurrentlyFailed() && !isRootIterator) {
				System.out.format("Automaton engine %d is failed%n", getEngineId(automatonEngine));
				System.out.println("Killing iterator " + it.getName());
				break;
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
