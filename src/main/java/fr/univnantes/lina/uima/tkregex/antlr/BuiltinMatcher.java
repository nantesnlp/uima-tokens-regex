package fr.univnantes.lina.uima.tkregex.antlr;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.google.common.base.Preconditions;

import fr.univnantes.lina.uima.tkregex.AnnotationMatcher;
import fr.univnantes.lina.uima.tkregex.matchers.Capitalized;
import fr.univnantes.lina.uima.tkregex.matchers.IsAbbreviation;
import fr.univnantes.lina.uima.tkregex.matchers.IsDigit;
import fr.univnantes.lina.uima.tkregex.matchers.IsInteger;
import fr.univnantes.lina.uima.tkregex.matchers.TitleCased;

public class BuiltinMatcher {
	public static final String ERR_NO_SUCH_BUILTIN_MATCHER = "No such built-in matcher: %s";
	
	private static final Map<String, AnnotationMatcher> matchers = new ConcurrentHashMap<>();

	public static boolean isRegistered(String matcherName) {
		return matchers.containsKey(matcherName);
	}

	public static void register(String matcherName, AnnotationMatcher matcher) {
		Preconditions.checkArgument(!matchers.containsKey(matcherName), "A matcher named %s already exists.", matcherName);
		matchers.put(matcherName, matcher);
	}
	
	public static void register(Class<? extends AnnotationMatcher> cls) {
		try {
			register(cls.getSimpleName(), cls.newInstance());
		} catch (Exception e) {
			throw new RuntimeException("Unabled to create instance for class " + cls, e);
		}
	}

	public static AnnotationMatcher get(String matcherName) {
		Preconditions.checkArgument(matchers.containsKey(matcherName), "No such matcher: %s.", matcherName);
		return matchers.get(matcherName);
	}
	
	public static <T extends AnnotationMatcher> T get(Class<T> cls) {
		AnnotationMatcher matcher = matchers.get(cls.getName());
		if(matcher == null)
			matcher = matchers.get(cls.getSimpleName());
		Preconditions.checkArgument(matcher != null, "No such matcher: %s or %s.", cls.getName(), cls.getSimpleName());
		Preconditions.checkArgument(cls.isAssignableFrom(matcher.getClass()), "Expected matcher of type <%s>, got type <%s>.", cls.getName(), matcher.getClass().getName());
		return cls.cast(matcher);
	}
	
	static {
		register(Capitalized.class);
		register(IsAbbreviation.class);
		register(IsDigit.class);
		register(IsInteger.class);
		register(TitleCased.class);
	}
}
