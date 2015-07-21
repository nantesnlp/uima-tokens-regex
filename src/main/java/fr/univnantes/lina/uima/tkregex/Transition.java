package fr.univnantes.lina.uima.tkregex;

import org.apache.uima.cas.text.AnnotationFS;

public class Transition {
	public static final Transition EPSILON() {
		return new Transition() {
			public boolean match(AnnotationFS annotation) {
				return true;
			};
			public boolean isEpsilon() {
				return true;
			}
		};
	};
	
	private State fromState;
	private State toState;
	private AnnotationMatcher matcher;
	Transition() {
		super();
	}
	
	public boolean isEpsilon() {
		return false;
	}

	void setFromState(State fromState) {
		this.fromState = fromState;
	}

	void setToState(State toState) {
		this.toState = toState;
	}

	void setMatcher(AnnotationMatcher matcher) {
		this.matcher = matcher;
	}

	public State getFromState() {
		return fromState;
	}

	public State getToState() {
		return toState;
	}

	public AnnotationMatcher getMatcher() {
		return matcher;
	}

	public boolean match(AnnotationFS annotation) {
		if(annotation == LastAnnotationToken.INSTANCE)
			return false;
		else
			return matcher.match(annotation);
	};
	
	@Override
	public String toString() {
		if (matcher instanceof RegexCoveredTextMatcher) {
			RegexCoveredTextMatcher m = (RegexCoveredTextMatcher) matcher;
			return m.toString();
		} else
			return "[" + matcher.getClass().getSimpleName() + "]";
	}
}
