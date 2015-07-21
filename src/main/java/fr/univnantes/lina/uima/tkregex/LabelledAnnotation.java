package fr.univnantes.lina.uima.tkregex;

import org.apache.uima.cas.text.AnnotationFS;

import com.google.common.base.Objects;

public class LabelledAnnotation {
	private AnnotationFS annotation;
	private String label;
	private boolean ignored;
	public LabelledAnnotation(AnnotationFS annotation, String label, boolean ignored) {
		super();
		this.annotation = annotation;
		this.label = label;
		this.ignored = ignored;
	}
	public AnnotationFS getAnnotation() {
		return annotation;
	}
	public String getLabel() {
		return label;
	}
	public boolean isIgnored() {
		return ignored;
	}
	@Override
	public String toString() {
		return Objects.toStringHelper(this)
				.add("label", label)
				.add("ignored", ignored)
				.add("begin", annotation.getBegin())
				.add("end", annotation.getEnd())
				.add("text", annotation.getCoveredText())
				.toString();
	}
}