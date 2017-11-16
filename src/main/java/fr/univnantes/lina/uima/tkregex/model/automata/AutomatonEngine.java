package fr.univnantes.lina.uima.tkregex.model.automata;

import com.google.common.collect.Lists;
import fr.univnantes.lina.uima.tkregex.model.matchers.LabelledAnnotation;
import org.apache.uima.cas.text.AnnotationFS;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;

public class AutomatonEngine {
	private Rule rule;
	private Collection<RecognitionHandler> handlers = new LinkedList<RecognitionHandler>();
	private LinkedList<AutomatonInstance> instances;
	private boolean allowOverlappingInstances = false;
	private AtomicInteger instanceIdGenerator = new AtomicInteger(0);

	private Automaton automaton;

	public Automaton getAutomaton() {
		return automaton;
	}

	public AutomatonEngine(Automaton automaton) {
		this.automaton = automaton;
		this.instances = new LinkedList<>();
	}
	public void setAllowOverlappingInstances(boolean allowOverlappingInstances) {
		this.allowOverlappingInstances = allowOverlappingInstances;
	}

	void setRule(Rule rule) {
		this.rule = rule;
	}

	public Rule getRule() {
		return rule;
	}


	public boolean isAllowOverlappingInstances() {
		return allowOverlappingInstances;
	}

	public void addRecognitionHandler(RecognitionHandler handler) {
		this.handlers.add(handler);
	}

	public void removeRecognitionHandler(RecognitionHandler handler) {
		this.handlers.remove(handler);
	}
	public void finish() {
		nextAnnotation(LastAnnotationToken.INSTANCE);
	}

	public void nextAnnotation(AnnotationFS annotation) {
		AutomatonInstance automatonInstance = new AutomatonInstance(
				this,
				this.automaton.getInitState(),
				instanceIdGenerator.incrementAndGet());
		this.instances.add(automatonInstance);

		ListIterator<AutomatonInstance> instanceIt = this.instances.listIterator();
		RegexOccurrence matchingEpisode = null;
		while (instanceIt.hasNext()) {
			AutomatonInstance inst = instanceIt.next();

			/*
			 *  remove the instance if there is already a
			 *  found instance covering it.
			 */
			if(!this.allowOverlappingInstances) {
				if(matchingEpisode != null) {
					AnnotationFS firstAnno = inst.firstAnno();
					if(firstAnno != null) {
						List<LabelledAnnotation> matchingAnnoList = matchingEpisode.getAllMatchingAnnotations();
						AnnotationFS lastAnno = matchingAnnoList.get(matchingAnnoList.size()-1).getAnnotation();
						int begin1 = lastAnno.getBegin();
						int begin2 = firstAnno.getBegin();
						int end1 = lastAnno.getEnd();
						int end2 = firstAnno.getEnd();
						if (!(begin1 < begin2 || (begin1 == begin2 && end1 < end2))) {
							instanceIt.remove();
							continue;
						}
					} else {

					}
				}
			}

			inst.propagateAnnotation(annotation);

			if(inst.hasFailed()) {
				instanceIt.remove();
				if(this.automaton.isAccepting(inst.getCurrentState())) {
					// The instance succeeds
					RegexOccurrence e = inst.getEpisode();
					matchingEpisode = e;
					e.setAutomatonInstanceId(inst.getInstanceId());
					notifyHandlers(e);
				}
			}
		}
	}

	public AutomatonEngine doClone() {
		AutomatonEngine clone = new AutomatonEngine(automaton);
		clone.rule = this.rule;
		clone.allowOverlappingInstances = this.allowOverlappingInstances;
		clone.handlers = this.handlers;

		clone.instances = new LinkedList<>();
		for(AutomatonInstance instance:this.instances) {
			clone.instances.add(instance.doClone());
		}
		return clone;
	}

	public int currentInstancesNum() {
		return this.instances.size();
	}


	public boolean isCurrentlyFailed() {
		return currentInstancesNum() == 0;
	}

	public void reset() {
		this.instances = Lists.newLinkedList();
	}

	void notifyHandlers(RegexOccurrence episode) {
//		episode.setRuleName(this.name);
		for(RecognitionHandler h:this.handlers) {
			h.recognizedEpisode(episode);
		}
	}

}
