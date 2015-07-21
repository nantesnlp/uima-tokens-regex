package fr.univnantes.lina.uima.tkregex;

import org.apache.uima.cas.text.AnnotationFS;

public interface AnnotationMatcher {
	public static final AnnotationMatcher EMPTY_MATCHER = new AnnotationMatcher() {
		@Override
		public boolean match(AnnotationFS annotation) {
			return true;
		}

		public String toString() {
			return "";
		};
		
		@Override
		public String getLabel() {
			return "[]";
		}
		public void setLabel(String label) {};
		
		@Override
		public boolean isIgnoreMatcher() {
			return false;
		}
		@Override
		public void setIgnoreMatcher(boolean ignoreMatcher) {
			throw new UnsupportedOperationException("Not allowed for empty matcher");
		}
	};

	public boolean match(AnnotationFS annotation);

	public String getLabel();
	public void setLabel(String label);

	public boolean isIgnoreMatcher();
	public void setIgnoreMatcher(boolean ignoreMatcher);
}
