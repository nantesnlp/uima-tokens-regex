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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, IgnoreMatcher=13, IntegerLiteral=14, NonZeroDigit=15, 
		Digit=16, BooleanLiteral=17, StringLiteral=18, FloatingPointLiteral=19, 
		LCURL=20, RCURL=21, LPAREN=22, RPAREN=23, LBRACK=24, RBRACK=25, SEMI=26, 
		QUESTION=27, COLON=28, MUL=29, PLUS=30, AND=31, OR=32, GT=33, LT=34, EQUAL=35, 
		LE=36, GE=37, NOTEQUAL=38, IN=39, IMPORT=40, USE=41, SET=42, JAVA_MATCHER=43, 
		LINE_COMMENT=44, MATCHER=45, RULE=46, Identifier=47, IdentifierPart=48, 
		WS=49, Regex=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "IgnoreMatcher", "IntegerLiteral", "NonZeroDigit", 
		"Digit", "BooleanLiteral", "StringLiteral", "StringCharacters", "StringCharacter", 
		"EscapeSequence", "FloatingPointLiteral", "LCURL", "RCURL", "LPAREN", 
		"RPAREN", "LBRACK", "RBRACK", "SEMI", "QUESTION", "COLON", "MUL", "PLUS", 
		"AND", "OR", "GT", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", "IN", "IMPORT", 
		"USE", "SET", "JAVA_MATCHER", "LINE_COMMENT", "MATCHER", "RULE", "Identifier", 
		"IdentifierPart", "FirstLetter", "JavaLetterOrDigit", "WS", "Regex"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'as'", "'='", "'text'", "'==='", "'list'", "'csv'", "','", "'json'", 
		"'yaml'", "'nin'", "'inIgnoreCase'", "'ninIgnoreCase'", "'~'", null, null, 
		null, null, null, null, "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", 
		"'?'", "':'", "'*'", "'+'", "'&'", "'|'", "'>'", "'<'", "'=='", "'<='", 
		"'>='", "'!='", "'in'", "'import'", "'use'", "'set'", "'java-matcher'", 
		null, "'matcher'", "'rule'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "IgnoreMatcher", "IntegerLiteral", "NonZeroDigit", "Digit", "BooleanLiteral", 
		"StringLiteral", "FloatingPointLiteral", "LCURL", "RCURL", "LPAREN", "RPAREN", 
		"LBRACK", "RBRACK", "SEMI", "QUESTION", "COLON", "MUL", "PLUS", "AND", 
		"OR", "GT", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", "IN", "IMPORT", "USE", 
		"SET", "JAVA_MATCHER", "LINE_COMMENT", "MATCHER", "RULE", "Identifier", 
		"IdentifierPart", "WS", "Regex"
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
		case 51:
			return FirstLetter_sempred((RuleContext)_localctx, predIndex);
		case 52:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u017a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\7\17\u00b9\n\17"+
		"\f\17\16\17\u00bc\13\17\5\17\u00be\n\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cd\n\22\3\23\3\23\5\23\u00d1"+
		"\n\23\3\23\3\23\3\24\6\24\u00d6\n\24\r\24\16\24\u00d7\3\25\3\25\5\25\u00dc"+
		"\n\25\3\26\3\26\3\26\3\27\6\27\u00e2\n\27\r\27\16\27\u00e3\3\27\3\27\6"+
		"\27\u00e8\n\27\r\27\16\27\u00e9\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,"+
		"\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3\60\3\60\7\60\u0137\n\60\f\60\16\60\u013a\13\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\7\63\u014e\n\63\f\63\16\63\u0151\13\63\3\64\3\64\7\64\u0155\n"+
		"\64\f\64\16\64\u0158\13\64\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0160\n"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0168\n\66\3\67\6\67\u016b\n\67"+
		"\r\67\16\67\u016c\3\67\3\67\38\38\38\78\u0174\n8\f8\168\u0177\138\38\3"+
		"8\2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\2)\2+\2-\25/\26\61\27\63\30\65\31\67\329\33"+
		";\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\2k\2m"+
		"\63o\64\3\2\16\3\2\63;\3\2\62;\4\2$$^^\n\2$$))^^ddhhppttvv\4\2\f\f\17"+
		"\17\5\2C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001"+
		"\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\3\2\61\61\2\u0186\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3"+
		"\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2"+
		"\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\3q\3\2\2\2\5t\3\2\2\2\7v\3\2\2\2\t{\3\2\2\2\13\177\3\2\2\2\r"+
		"\u0084\3\2\2\2\17\u0088\3\2\2\2\21\u008a\3\2\2\2\23\u008f\3\2\2\2\25\u0094"+
		"\3\2\2\2\27\u0098\3\2\2\2\31\u00a5\3\2\2\2\33\u00b3\3\2\2\2\35\u00bd\3"+
		"\2\2\2\37\u00bf\3\2\2\2!\u00c1\3\2\2\2#\u00cc\3\2\2\2%\u00ce\3\2\2\2\'"+
		"\u00d5\3\2\2\2)\u00db\3\2\2\2+\u00dd\3\2\2\2-\u00e1\3\2\2\2/\u00eb\3\2"+
		"\2\2\61\u00ed\3\2\2\2\63\u00ef\3\2\2\2\65\u00f1\3\2\2\2\67\u00f3\3\2\2"+
		"\29\u00f5\3\2\2\2;\u00f7\3\2\2\2=\u00f9\3\2\2\2?\u00fb\3\2\2\2A\u00fd"+
		"\3\2\2\2C\u00ff\3\2\2\2E\u0101\3\2\2\2G\u0103\3\2\2\2I\u0105\3\2\2\2K"+
		"\u0107\3\2\2\2M\u0109\3\2\2\2O\u010c\3\2\2\2Q\u010f\3\2\2\2S\u0112\3\2"+
		"\2\2U\u0115\3\2\2\2W\u0118\3\2\2\2Y\u011f\3\2\2\2[\u0123\3\2\2\2]\u0127"+
		"\3\2\2\2_\u0134\3\2\2\2a\u013d\3\2\2\2c\u0145\3\2\2\2e\u014a\3\2\2\2g"+
		"\u0152\3\2\2\2i\u015f\3\2\2\2k\u0167\3\2\2\2m\u016a\3\2\2\2o\u0170\3\2"+
		"\2\2qr\7c\2\2rs\7u\2\2s\4\3\2\2\2tu\7?\2\2u\6\3\2\2\2vw\7v\2\2wx\7g\2"+
		"\2xy\7z\2\2yz\7v\2\2z\b\3\2\2\2{|\7?\2\2|}\7?\2\2}~\7?\2\2~\n\3\2\2\2"+
		"\177\u0080\7n\2\2\u0080\u0081\7k\2\2\u0081\u0082\7u\2\2\u0082\u0083\7"+
		"v\2\2\u0083\f\3\2\2\2\u0084\u0085\7e\2\2\u0085\u0086\7u\2\2\u0086\u0087"+
		"\7x\2\2\u0087\16\3\2\2\2\u0088\u0089\7.\2\2\u0089\20\3\2\2\2\u008a\u008b"+
		"\7l\2\2\u008b\u008c\7u\2\2\u008c\u008d\7q\2\2\u008d\u008e\7p\2\2\u008e"+
		"\22\3\2\2\2\u008f\u0090\7{\2\2\u0090\u0091\7c\2\2\u0091\u0092\7o\2\2\u0092"+
		"\u0093\7n\2\2\u0093\24\3\2\2\2\u0094\u0095\7p\2\2\u0095\u0096\7k\2\2\u0096"+
		"\u0097\7p\2\2\u0097\26\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a"+
		"\u009b\7K\2\2\u009b\u009c\7i\2\2\u009c\u009d\7p\2\2\u009d\u009e\7q\2\2"+
		"\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7E\2\2\u00a1\u00a2"+
		"\7c\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\30\3\2\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7K\2\2\u00a9"+
		"\u00aa\7i\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7t\2\2"+
		"\u00ad\u00ae\7g\2\2\u00ae\u00af\7E\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1"+
		"\7u\2\2\u00b1\u00b2\7g\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7\u0080\2\2\u00b4"+
		"\34\3\2\2\2\u00b5\u00be\7\62\2\2\u00b6\u00ba\5\37\20\2\u00b7\u00b9\5!"+
		"\21\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00b5\3\2"+
		"\2\2\u00bd\u00b6\3\2\2\2\u00be\36\3\2\2\2\u00bf\u00c0\t\2\2\2\u00c0 \3"+
		"\2\2\2\u00c1\u00c2\t\3\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5"+
		"\7t\2\2\u00c5\u00c6\7w\2\2\u00c6\u00cd\7g\2\2\u00c7\u00c8\7h\2\2\u00c8"+
		"\u00c9\7c\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cd\7g\2\2"+
		"\u00cc\u00c3\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd$\3\2\2\2\u00ce\u00d0\7"+
		"$\2\2\u00cf\u00d1\5\'\24\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\7$\2\2\u00d3&\3\2\2\2\u00d4\u00d6\5)\25\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8(\3\2\2\2\u00d9\u00dc\n\4\2\2\u00da\u00dc\5+\26\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00da\3\2\2\2\u00dc*\3\2\2\2\u00dd\u00de\7^\2\2\u00de\u00df"+
		"\t\5\2\2\u00df,\3\2\2\2\u00e0\u00e2\5!\21\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e7\7\60\2\2\u00e6\u00e8\5!\21\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea.\3\2\2\2"+
		"\u00eb\u00ec\7}\2\2\u00ec\60\3\2\2\2\u00ed\u00ee\7\177\2\2\u00ee\62\3"+
		"\2\2\2\u00ef\u00f0\7*\2\2\u00f0\64\3\2\2\2\u00f1\u00f2\7+\2\2\u00f2\66"+
		"\3\2\2\2\u00f3\u00f4\7]\2\2\u00f48\3\2\2\2\u00f5\u00f6\7_\2\2\u00f6:\3"+
		"\2\2\2\u00f7\u00f8\7=\2\2\u00f8<\3\2\2\2\u00f9\u00fa\7A\2\2\u00fa>\3\2"+
		"\2\2\u00fb\u00fc\7<\2\2\u00fc@\3\2\2\2\u00fd\u00fe\7,\2\2\u00feB\3\2\2"+
		"\2\u00ff\u0100\7-\2\2\u0100D\3\2\2\2\u0101\u0102\7(\2\2\u0102F\3\2\2\2"+
		"\u0103\u0104\7~\2\2\u0104H\3\2\2\2\u0105\u0106\7@\2\2\u0106J\3\2\2\2\u0107"+
		"\u0108\7>\2\2\u0108L\3\2\2\2\u0109\u010a\7?\2\2\u010a\u010b\7?\2\2\u010b"+
		"N\3\2\2\2\u010c\u010d\7>\2\2\u010d\u010e\7?\2\2\u010eP\3\2\2\2\u010f\u0110"+
		"\7@\2\2\u0110\u0111\7?\2\2\u0111R\3\2\2\2\u0112\u0113\7#\2\2\u0113\u0114"+
		"\7?\2\2\u0114T\3\2\2\2\u0115\u0116\7k\2\2\u0116\u0117\7p\2\2\u0117V\3"+
		"\2\2\2\u0118\u0119\7k\2\2\u0119\u011a\7o\2\2\u011a\u011b\7r\2\2\u011b"+
		"\u011c\7q\2\2\u011c\u011d\7t\2\2\u011d\u011e\7v\2\2\u011eX\3\2\2\2\u011f"+
		"\u0120\7w\2\2\u0120\u0121\7u\2\2\u0121\u0122\7g\2\2\u0122Z\3\2\2\2\u0123"+
		"\u0124\7u\2\2\u0124\u0125\7g\2\2\u0125\u0126\7v\2\2\u0126\\\3\2\2\2\u0127"+
		"\u0128\7l\2\2\u0128\u0129\7c\2\2\u0129\u012a\7x\2\2\u012a\u012b\7c\2\2"+
		"\u012b\u012c\7/\2\2\u012c\u012d\7o\2\2\u012d\u012e\7c\2\2\u012e\u012f"+
		"\7v\2\2\u012f\u0130\7e\2\2\u0130\u0131\7j\2\2\u0131\u0132\7g\2\2\u0132"+
		"\u0133\7t\2\2\u0133^\3\2\2\2\u0134\u0138\7%\2\2\u0135\u0137\n\6\2\2\u0136"+
		"\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\b\60\2\2\u013c"+
		"`\3\2\2\2\u013d\u013e\7o\2\2\u013e\u013f\7c\2\2\u013f\u0140\7v\2\2\u0140"+
		"\u0141\7e\2\2\u0141\u0142\7j\2\2\u0142\u0143\7g\2\2\u0143\u0144\7t\2\2"+
		"\u0144b\3\2\2\2\u0145\u0146\7t\2\2\u0146\u0147\7w\2\2\u0147\u0148\7n\2"+
		"\2\u0148\u0149\7g\2\2\u0149d\3\2\2\2\u014a\u014f\5g\64\2\u014b\u014c\7"+
		"\60\2\2\u014c\u014e\5g\64\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150f\3\2\2\2\u0151\u014f\3\2\2\2"+
		"\u0152\u0156\5i\65\2\u0153\u0155\5k\66\2\u0154\u0153\3\2\2\2\u0155\u0158"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157h\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0159\u0160\t\7\2\2\u015a\u015b\n\b\2\2\u015b\u0160\6\65"+
		"\2\2\u015c\u015d\t\t\2\2\u015d\u015e\t\n\2\2\u015e\u0160\6\65\3\2\u015f"+
		"\u0159\3\2\2\2\u015f\u015a\3\2\2\2\u015f\u015c\3\2\2\2\u0160j\3\2\2\2"+
		"\u0161\u0168\t\13\2\2\u0162\u0163\n\b\2\2\u0163\u0168\6\66\4\2\u0164\u0165"+
		"\t\t\2\2\u0165\u0166\t\n\2\2\u0166\u0168\6\66\5\2\u0167\u0161\3\2\2\2"+
		"\u0167\u0162\3\2\2\2\u0167\u0164\3\2\2\2\u0168l\3\2\2\2\u0169\u016b\t"+
		"\f\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\b\67\2\2\u016fn\3\2\2\2"+
		"\u0170\u0175\7\61\2\2\u0171\u0174\n\r\2\2\u0172\u0174\5+\26\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7\61"+
		"\2\2\u0179p\3\2\2\2\23\2\u00ba\u00bd\u00cc\u00d0\u00d7\u00db\u00e3\u00e9"+
		"\u0138\u014f\u0156\u015f\u0167\u016c\u0173\u0175\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}