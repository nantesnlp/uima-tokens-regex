package fr.univnantes.lina.uima.tkregex;

import fr.univnantes.lina.uima.tkregex.ae.RegexList;
import fr.univnantes.lina.uima.tkregex.antlr.AutomataParserListener;
import fr.univnantes.lina.uima.tkregex.antlr.AutomataParsingException;
import fr.univnantes.lina.uima.tkregex.antlr.ThrowingErrorListener;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexLexer;
import fr.univnantes.lina.uima.tkregex.antlr.generated.UimaTokenRegexParser;
import fr.univnantes.lina.uima.tkregex.model.automata.AutomatonQuantifier;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TokensRegex {
	private static final Logger LOGGER = LoggerFactory.getLogger(TokensRegex.class);

	private static final Pattern M_N_PATTERN = Pattern.compile("\\{(\\d+),(\\d+)\\}");
	private static final Pattern N_PATTERN = Pattern.compile("\\{(\\d+)\\}");

	public static RegexList parseRegexList(String text) {
		try {
			return parseRegexList(CharStreams.fromString(text), new URL("file://from/inline/string"), Optional.empty());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static RegexList parseRegexList(Path path) throws IOException {
		return  parseRegexList(path, Optional.empty());
	}

	public static RegexList parseRegexList(Path path, Optional<Path> customResourceDir) throws IOException {
		try {
			return parseRegexList(path.toUri().toURL(), customResourceDir);
		} catch(MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}


	public static RegexList parseRegexList(URL resourceURL) throws IOException {
		return parseRegexList(resourceURL, Optional.empty());
	}

	public static RegexList parseRegexList(CharStream input, URL resourceURL, Optional<Path> customResourceDir) {
		try {

			UimaTokenRegexLexer lexer = new UimaTokenRegexLexer(input);
			lexer.removeErrorListeners();
			ThrowingErrorListener listener = new ThrowingErrorListener(resourceURL);
			lexer.addErrorListener(listener);

			CommonTokenStream tokens = new CommonTokenStream(lexer);
			UimaTokenRegexParser parser = new UimaTokenRegexParser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(listener);

			AutomataParserListener parserListener = new AutomataParserListener( parser , resourceURL);
			if(customResourceDir.isPresent())
				parserListener.setCustomResourceDir(customResourceDir.get());
			parserListener.setAllowMatchingEmptySequences(false);

			ParseTreeWalker.DEFAULT.walk(parserListener, parser.ruleList());
			return new RegexList(
					parserListener.getIteratedTypes(),
					parserListener.getRules(),
					parserListener.getShortcutMatchers(),
					parserListener.getJavaMatchers()
			);
		} catch(ParseCancellationException e) {
			throw new AutomataParsingException(e);
		}
	}

	public static AutomatonQuantifier parseQuantifier(String quantifierString) {
		AutomatonQuantifier quantifier = null;
		switch(quantifierString) {
			case "*":
				quantifier = AutomatonQuantifier.getZeroN();
				break;
			case "?":
				quantifier = AutomatonQuantifier.getZeroOne();
				break;
			case "+":
				quantifier = AutomatonQuantifier.getOneN();
				break;
			default:
				Matcher m_n_matcher = M_N_PATTERN.matcher(quantifierString);
				Matcher n_matcher = N_PATTERN.matcher(quantifierString);
				if(m_n_matcher.matches())
					quantifier = AutomatonQuantifier.getMN(
							Integer.parseInt(m_n_matcher.group(1)),
							Integer.parseInt(m_n_matcher.group(2))
					);
				else if(n_matcher.matches())
					quantifier = AutomatonQuantifier.getN(
							Integer.parseInt(n_matcher.group(1))
					);
				else throw new AutomataParsingException("Unrecognized regex: " + quantifierString);
		}
		return quantifier;
	}

	public static RegexList parseRegexList(URL resourceURL, Optional<Path> customResourceDir) throws IOException {
		InputStream is = resourceURL.openStream();
		CharStream  input = CharStreams.fromStream(is);
		return parseRegexList(input, resourceURL, customResourceDir);

	}
}
