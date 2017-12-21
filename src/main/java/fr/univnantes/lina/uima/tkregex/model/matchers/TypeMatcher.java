package fr.univnantes.lina.uima.tkregex.model.matchers;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.TypeSystem;
import org.apache.uima.cas.text.AnnotationFS;

import java.util.stream.Collectors;

public class TypeMatcher implements AnnotationMatcher {
	private TypeSystem typeSystem;
	private Type type;
	private String label;

	public TypeMatcher(TypeSystem typeSystem, Type type) {
		this.typeSystem = typeSystem;
		this.type = type;
		this.label = type.getShortName();
	}

	public Type getType() {
		return type;
	}

	LoadingCache<Type, Boolean> typeCheckingCache = CacheBuilder.newBuilder()
			.build(new CacheLoader<Type, Boolean>() {
				@Override
				public Boolean load(Type annotationType) throws Exception {
					return TypeMatcher.this.typeSystem.subsumes(TypeMatcher.this.type, annotationType);
				}
			});

	@Override
	public boolean matches(AnnotationFS annotation) {
		return typeCheckingCache.getUnchecked(annotation.getType());
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public boolean isIgnoreMatcher() {
		return false;
	}

	@Override
	public void setIgnoreMatcher(boolean ignoreMatcher) {

	}
}
