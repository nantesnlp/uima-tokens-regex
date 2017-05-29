package fr.univnantes.lina.uima.tkregex;

import org.apache.uima.cas.text.AnnotationFS;

import com.google.common.base.Optional;

public class CustomMatcher extends AbstractAnnotationMatcher {

	private String name;
	
	private Optional<AnnotationMatcher> matcher = Optional.absent();
	
	
	public CustomMatcher(String name) {
		super();
		this.name = name;
	}

	public void setMatcher(AnnotationMatcher matcher) {
		this.matcher = Optional.of(matcher);
	}
	
	@Override
	public boolean match(AnnotationFS annotation) {
		return matcher.get().match(annotation);
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isReady() {
		return matcher.isPresent();
	}
}
