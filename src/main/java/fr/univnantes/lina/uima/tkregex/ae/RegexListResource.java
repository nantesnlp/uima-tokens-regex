package fr.univnantes.lina.uima.tkregex.ae;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.uima.UIMAFramework;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.DataResource;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.SharedResourceObject;
import org.apache.uima.resource.metadata.TypeDescription;
import org.apache.uima.util.Level;

import com.google.common.base.Joiner;

import fr.univnantes.lina.uima.tkregex.Rule;
import fr.univnantes.lina.uima.tkregex.antlr.AutomataParserListener;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexLexer;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser;


public class RegexListResource implements SharedResourceObject {

	public static final String KEY_TOKEN_REGEX_RULES = "TokenRegexRules";
	private AutomataParserListener listener;
	
	@Override
	public void load(DataResource aData) throws ResourceInitializationException {
		ANTLRInputStream input;
		try {
			UIMAFramework.getLogger().log(Level.FINE, "Loading resource " + KEY_TOKEN_REGEX_RULES + " at: " + aData.getUri());
			
			input = new ANTLRInputStream(aData.getInputStream());
			UimaTokenRegexLexer lexer = new UimaTokenRegexLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			UimaTokenRegexParser parser = new UimaTokenRegexParser(tokens);
			listener = new AutomataParserListener( parser );
			listener.setAllowMatchingEmptySequences(false);
			ParseTreeWalker.DEFAULT.walk(listener, parser.ruleList());
		} catch (IOException e) {
			throw new ResourceInitializationException(e);
		}
	}
	
	
	public List<Rule> getRules() {
		return Collections.unmodifiableList(this.listener.getRules());
	}
	
	public TypeDescription getIteratedTypeDescription() {
		return this.listener.getIteraredType();
	}

	public String getMatchingLabelString(Annotation word) {
		List<String> matcherNames = new LinkedList<String>();
		Set<String> labels = new HashSet<String>();
		for(String matcherName:this.listener.getShortcutMatchers().keySet()) {
			if(listener.getShortcutMatchers().get(matcherName).match(word)) {
				matcherNames.add(matcherName);
				labels.add(listener.getShortcutMatchers().get(matcherName).getLabel());
			}
		}
		matcherNames.removeAll(labels);
		String otherLabelStr = matcherNames.isEmpty() ? "" : ("|" + Joiner.on(" ").join(matcherNames));
		return  Joiner.on(" ").join(labels) + otherLabelStr;
	}

	public List<String> getMatchingLabels(Annotation word) {
		List<String> l = new LinkedList<String>();
		for(String matcherName:this.listener.getShortcutMatchers().keySet()) {
			if(listener.getShortcutMatchers().get(matcherName).match(word)) {
				l.add(matcherName + ">" + listener.getShortcutMatchers().get(matcherName).getLabel());
			}
		}
		return l;
	}
}