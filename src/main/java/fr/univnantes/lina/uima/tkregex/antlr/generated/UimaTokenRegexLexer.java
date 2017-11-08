// Generated from UimaTokenRegex.g4 by ANTLR 4.7

    package fr.univnantes.lina.uima.tkregex.antlr.generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UimaTokenRegexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IgnoreMatcher=7, IntegerLiteral=8, 
		NonZeroDigit=9, Digit=10, BooleanLiteral=11, StringLiteral=12, FloatingPointLiteral=13, 
		LCURL=14, RCURL=15, LPAREN=16, RPAREN=17, LBRACK=18, RBRACK=19, SEMI=20, 
		QUESTION=21, COLON=22, MUL=23, PLUS=24, AND=25, OR=26, GT=27, LT=28, EQUAL=29, 
		LE=30, GE=31, NOTEQUAL=32, IN=33, IMPORT=34, USE=35, SET=36, JAVA_MATCHER=37, 
		LINE_COMMENT=38, MATCHER=39, RULE=40, Identifier=41, IdentifierPart=42, 
		WS=43, Regex=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "IgnoreMatcher", "IntegerLiteral", 
		"NonZeroDigit", "Digit", "BooleanLiteral", "StringLiteral", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "FloatingPointLiteral", "LCURL", 
		"RCURL", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "SEMI", "QUESTION", "COLON", 
		"MUL", "PLUS", "AND", "OR", "GT", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"IN", "IMPORT", "USE", "SET", "JAVA_MATCHER", "LINE_COMMENT", "MATCHER", 
		"RULE", "Identifier", "IdentifierPart", "FirstLetter", "JavaLetterOrDigit", 
		"WS", "Regex"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'as'", "'='", "'text'", "'==='", "'nin'", "','", "'~'", null, null, 
		null, null, null, null, "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", 
		"'?'", "':'", "'*'", "'+'", "'&'", "'|'", "'>'", "'<'", "'=='", "'<='", 
		"'>='", "'!='", "'in'", "'import'", "'use'", "'set'", "'java-matcher'", 
		null, "'matcher'", "'rule'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "IgnoreMatcher", "IntegerLiteral", 
		"NonZeroDigit", "Digit", "BooleanLiteral", "StringLiteral", "FloatingPointLiteral", 
		"LCURL", "RCURL", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "SEMI", "QUESTION", 
		"COLON", "MUL", "PLUS", "AND", "OR", "GT", "LT", "EQUAL", "LE", "GE", 
		"NOTEQUAL", "IN", "IMPORT", "USE", "SET", "JAVA_MATCHER", "LINE_COMMENT", 
		"MATCHER", "RULE", "Identifier", "IdentifierPart", "WS", "Regex"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public UimaTokenRegexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UimaTokenRegex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 45:
			return FirstLetter_sempred((RuleContext)_localctx, predIndex);
		case 46:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean FirstLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0140\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082\13\t\5\t\u0084\n\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0093\n\f\3\r\3\r\5\r\u0097"+
		"\n\r\3\r\3\r\3\16\6\16\u009c\n\16\r\16\16\16\u009d\3\17\3\17\5\17\u00a2"+
		"\n\17\3\20\3\20\3\20\3\21\6\21\u00a8\n\21\r\21\16\21\u00a9\3\21\3\21\6"+
		"\21\u00ae\n\21\r\21\16\21\u00af\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$"+
		"\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\7*\u00fd\n*\f*\16*\u0100\13*"+
		"\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\7-\u0114\n-\f-"+
		"\16-\u0117\13-\3.\3.\7.\u011b\n.\f.\16.\u011e\13.\3/\3/\3/\3/\3/\3/\5"+
		"/\u0126\n/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u012e\n\60\3\61\6\61\u0131"+
		"\n\61\r\61\16\61\u0132\3\61\3\61\3\62\3\62\3\62\7\62\u013a\n\62\f\62\16"+
		"\62\u013d\13\62\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\2\35\2\37\2!\17#\20%\21\'\22)\23+\24-\25/\26\61"+
		"\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,"+
		"]\2_\2a-c.\3\2\16\3\2\63;\3\2\62;\4\2$$^^\n\2$$))^^ddhhppttvv\4\2\f\f"+
		"\17\17\5\2C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001"+
		"\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\3\2\61\61\2\u014c\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\3e\3\2\2\2\5h\3\2\2\2\7j\3\2\2\2\to\3\2\2\2\13s\3\2\2\2\rw\3"+
		"\2\2\2\17y\3\2\2\2\21\u0083\3\2\2\2\23\u0085\3\2\2\2\25\u0087\3\2\2\2"+
		"\27\u0092\3\2\2\2\31\u0094\3\2\2\2\33\u009b\3\2\2\2\35\u00a1\3\2\2\2\37"+
		"\u00a3\3\2\2\2!\u00a7\3\2\2\2#\u00b1\3\2\2\2%\u00b3\3\2\2\2\'\u00b5\3"+
		"\2\2\2)\u00b7\3\2\2\2+\u00b9\3\2\2\2-\u00bb\3\2\2\2/\u00bd\3\2\2\2\61"+
		"\u00bf\3\2\2\2\63\u00c1\3\2\2\2\65\u00c3\3\2\2\2\67\u00c5\3\2\2\29\u00c7"+
		"\3\2\2\2;\u00c9\3\2\2\2=\u00cb\3\2\2\2?\u00cd\3\2\2\2A\u00cf\3\2\2\2C"+
		"\u00d2\3\2\2\2E\u00d5\3\2\2\2G\u00d8\3\2\2\2I\u00db\3\2\2\2K\u00de\3\2"+
		"\2\2M\u00e5\3\2\2\2O\u00e9\3\2\2\2Q\u00ed\3\2\2\2S\u00fa\3\2\2\2U\u0103"+
		"\3\2\2\2W\u010b\3\2\2\2Y\u0110\3\2\2\2[\u0118\3\2\2\2]\u0125\3\2\2\2_"+
		"\u012d\3\2\2\2a\u0130\3\2\2\2c\u0136\3\2\2\2ef\7c\2\2fg\7u\2\2g\4\3\2"+
		"\2\2hi\7?\2\2i\6\3\2\2\2jk\7v\2\2kl\7g\2\2lm\7z\2\2mn\7v\2\2n\b\3\2\2"+
		"\2op\7?\2\2pq\7?\2\2qr\7?\2\2r\n\3\2\2\2st\7p\2\2tu\7k\2\2uv\7p\2\2v\f"+
		"\3\2\2\2wx\7.\2\2x\16\3\2\2\2yz\7\u0080\2\2z\20\3\2\2\2{\u0084\7\62\2"+
		"\2|\u0080\5\23\n\2}\177\5\25\13\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"{\3\2\2\2\u0083|\3\2\2\2\u0084\22\3\2\2\2\u0085\u0086\t\2\2\2\u0086\24"+
		"\3\2\2\2\u0087\u0088\t\3\2\2\u0088\26\3\2\2\2\u0089\u008a\7v\2\2\u008a"+
		"\u008b\7t\2\2\u008b\u008c\7w\2\2\u008c\u0093\7g\2\2\u008d\u008e\7h\2\2"+
		"\u008e\u008f\7c\2\2\u008f\u0090\7n\2\2\u0090\u0091\7u\2\2\u0091\u0093"+
		"\7g\2\2\u0092\u0089\3\2\2\2\u0092\u008d\3\2\2\2\u0093\30\3\2\2\2\u0094"+
		"\u0096\7$\2\2\u0095\u0097\5\33\16\2\u0096\u0095\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7$\2\2\u0099\32\3\2\2\2\u009a\u009c"+
		"\5\35\17\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\34\3\2\2\2\u009f\u00a2\n\4\2\2\u00a0\u00a2"+
		"\5\37\20\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\36\3\2\2\2\u00a3"+
		"\u00a4\7^\2\2\u00a4\u00a5\t\5\2\2\u00a5 \3\2\2\2\u00a6\u00a8\5\25\13\2"+
		"\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\7\60\2\2\u00ac\u00ae\5\25\13"+
		"\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7}\2\2\u00b2$\3\2\2\2\u00b3\u00b4"+
		"\7\177\2\2\u00b4&\3\2\2\2\u00b5\u00b6\7*\2\2\u00b6(\3\2\2\2\u00b7\u00b8"+
		"\7+\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7]\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7"+
		"_\2\2\u00bc.\3\2\2\2\u00bd\u00be\7=\2\2\u00be\60\3\2\2\2\u00bf\u00c0\7"+
		"A\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\7<\2\2\u00c2\64\3\2\2\2\u00c3\u00c4"+
		"\7,\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\7-\2\2\u00c68\3\2\2\2\u00c7\u00c8"+
		"\7(\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7~\2\2\u00ca<\3\2\2\2\u00cb\u00cc\7"+
		"@\2\2\u00cc>\3\2\2\2\u00cd\u00ce\7>\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7?"+
		"\2\2\u00d0\u00d1\7?\2\2\u00d1B\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4"+
		"\7?\2\2\u00d4D\3\2\2\2\u00d5\u00d6\7@\2\2\u00d6\u00d7\7?\2\2\u00d7F\3"+
		"\2\2\2\u00d8\u00d9\7#\2\2\u00d9\u00da\7?\2\2\u00daH\3\2\2\2\u00db\u00dc"+
		"\7k\2\2\u00dc\u00dd\7p\2\2\u00ddJ\3\2\2\2\u00de\u00df\7k\2\2\u00df\u00e0"+
		"\7o\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7t\2\2\u00e3"+
		"\u00e4\7v\2\2\u00e4L\3\2\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7u\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8N\3\2\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7g\2\2\u00eb"+
		"\u00ec\7v\2\2\u00ecP\3\2\2\2\u00ed\u00ee\7l\2\2\u00ee\u00ef\7c\2\2\u00ef"+
		"\u00f0\7x\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7/\2\2\u00f2\u00f3\7o\2\2"+
		"\u00f3\u00f4\7c\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7"+
		"\7j\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7t\2\2\u00f9R\3\2\2\2\u00fa\u00fe"+
		"\7%\2\2\u00fb\u00fd\n\6\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0102\b*\2\2\u0102T\3\2\2\2\u0103\u0104\7o\2\2\u0104\u0105"+
		"\7c\2\2\u0105\u0106\7v\2\2\u0106\u0107\7e\2\2\u0107\u0108\7j\2\2\u0108"+
		"\u0109\7g\2\2\u0109\u010a\7t\2\2\u010aV\3\2\2\2\u010b\u010c\7t\2\2\u010c"+
		"\u010d\7w\2\2\u010d\u010e\7n\2\2\u010e\u010f\7g\2\2\u010fX\3\2\2\2\u0110"+
		"\u0115\5[.\2\u0111\u0112\7\60\2\2\u0112\u0114\5[.\2\u0113\u0111\3\2\2"+
		"\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116Z"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011c\5]/\2\u0119\u011b\5_\60\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\\\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0126\t\7\2\2\u0120\u0121"+
		"\n\b\2\2\u0121\u0126\6/\2\2\u0122\u0123\t\t\2\2\u0123\u0124\t\n\2\2\u0124"+
		"\u0126\6/\3\2\u0125\u011f\3\2\2\2\u0125\u0120\3\2\2\2\u0125\u0122\3\2"+
		"\2\2\u0126^\3\2\2\2\u0127\u012e\t\13\2\2\u0128\u0129\n\b\2\2\u0129\u012e"+
		"\6\60\4\2\u012a\u012b\t\t\2\2\u012b\u012c\t\n\2\2\u012c\u012e\6\60\5\2"+
		"\u012d\u0127\3\2\2\2\u012d\u0128\3\2\2\2\u012d\u012a\3\2\2\2\u012e`\3"+
		"\2\2\2\u012f\u0131\t\f\2\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b\61"+
		"\2\2\u0135b\3\2\2\2\u0136\u013b\7\61\2\2\u0137\u013a\n\r\2\2\u0138\u013a"+
		"\5\37\20\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013e\u013f\7\61\2\2\u013fd\3\2\2\2\23\2\u0080\u0083\u0092\u0096"+
		"\u009d\u00a1\u00a9\u00af\u00fe\u0115\u011c\u0125\u012d\u0132\u0139\u013b"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}