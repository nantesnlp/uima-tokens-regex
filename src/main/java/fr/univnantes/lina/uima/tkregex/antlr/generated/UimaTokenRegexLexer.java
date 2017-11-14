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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, IgnoreMatcher=15, IntegerLiteral=16, 
		NonZeroDigit=17, Digit=18, BooleanLiteral=19, StringLiteral=20, FloatingPointLiteral=21, 
		LCURL=22, RCURL=23, LPAREN=24, RPAREN=25, LBRACK=26, RBRACK=27, SEMI=28, 
		QUESTION=29, COLON=30, MUL=31, PLUS=32, AND=33, OR=34, GT=35, LT=36, EQUAL=37, 
		LE=38, GE=39, NOTEQUAL=40, IN=41, IMPORT=42, USE=43, SET=44, JAVA_MATCHER=45, 
		RESOURCE=46, LINE_COMMENT=47, MATCHER=48, RULE=49, Identifier=50, DowncasedIdentifierPart=51, 
		IdentifierPart=52, WS=53, Regex=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "IgnoreMatcher", "IntegerLiteral", 
		"NonZeroDigit", "Digit", "BooleanLiteral", "StringLiteral", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "FloatingPointLiteral", "LCURL", 
		"RCURL", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "SEMI", "QUESTION", "COLON", 
		"MUL", "PLUS", "AND", "OR", "GT", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"IN", "IMPORT", "USE", "SET", "JAVA_MATCHER", "RESOURCE", "LINE_COMMENT", 
		"MATCHER", "RULE", "Identifier", "DowncasedIdentifierPart", "IdentifierPart", 
		"FirstLetterDowncased", "FirstLetter", "JavaLetterOrDigit", "WS", "Regex"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'as'", "'='", "'text'", "'==='", "'list'", "'yaml'", "'json'", 
		"'csv'", "'tsv'", "'.'", "'nin'", "'inIgnoreCase'", "'ninIgnoreCase'", 
		"'~'", null, null, null, null, null, null, "'{'", "'}'", "'('", "')'", 
		"'['", "']'", "';'", "'?'", "':'", "'*'", "'+'", "'&'", "'|'", "'>'", 
		"'<'", "'=='", "'<='", "'>='", "'!='", "'in'", "'import'", "'use'", "'set'", 
		"'java-matcher'", "'resource'", null, "'matcher'", "'rule'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "IgnoreMatcher", "IntegerLiteral", "NonZeroDigit", "Digit", 
		"BooleanLiteral", "StringLiteral", "FloatingPointLiteral", "LCURL", "RCURL", 
		"LPAREN", "RPAREN", "LBRACK", "RBRACK", "SEMI", "QUESTION", "COLON", "MUL", 
		"PLUS", "AND", "OR", "GT", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", "IN", 
		"IMPORT", "USE", "SET", "JAVA_MATCHER", "RESOURCE", "LINE_COMMENT", "MATCHER", 
		"RULE", "Identifier", "DowncasedIdentifierPart", "IdentifierPart", "WS", 
		"Regex"
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
		case 56:
			return FirstLetter_sempred((RuleContext)_localctx, predIndex);
		case 57:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u019c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21"+
		"\u00c9\n\21\f\21\16\21\u00cc\13\21\5\21\u00ce\n\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00dd\n\24\3\25\3\25"+
		"\5\25\u00e1\n\25\3\25\3\25\3\26\6\26\u00e6\n\26\r\26\16\26\u00e7\3\27"+
		"\3\27\5\27\u00ec\n\27\3\30\3\30\3\30\3\31\6\31\u00f2\n\31\r\31\16\31\u00f3"+
		"\3\31\3\31\6\31\u00f8\n\31\r\31\16\31\u00f9\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3."+
		"\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\7\63\u0150\n\63\f\63\16\63\u0153\13\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\7\66\u0167\n\66\f\66\16\66\u016a\13\66\3\67\3\67"+
		"\7\67\u016e\n\67\f\67\16\67\u0171\13\67\38\38\78\u0175\n8\f8\168\u0178"+
		"\138\39\39\3:\3:\3:\3:\3:\3:\5:\u0182\n:\3;\3;\3;\3;\3;\3;\5;\u018a\n"+
		";\3<\6<\u018d\n<\r<\16<\u018e\3<\3<\3=\3=\3=\7=\u0196\n=\f=\16=\u0199"+
		"\13=\3=\3=\2\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\27\63\30\65\31"+
		"\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g"+
		"\62i\63k\64m\65o\66q\2s\2u\2w\67y8\3\2\17\3\2\63;\3\2\62;\4\2$$^^\n\2"+
		"$$))^^ddhhppttvv\4\2\f\f\17\17\4\2aac|\5\2C\\aac|\4\2\2\u0101\ud802\udc01"+
		"\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\3"+
		"\2\61\61\2\u01a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2w"+
		"\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7\u0080\3\2\2\2\t\u0082\3\2"+
		"\2\2\13\u0087\3\2\2\2\r\u008b\3\2\2\2\17\u0090\3\2\2\2\21\u0095\3\2\2"+
		"\2\23\u009a\3\2\2\2\25\u009e\3\2\2\2\27\u00a2\3\2\2\2\31\u00a4\3\2\2\2"+
		"\33\u00a8\3\2\2\2\35\u00b5\3\2\2\2\37\u00c3\3\2\2\2!\u00cd\3\2\2\2#\u00cf"+
		"\3\2\2\2%\u00d1\3\2\2\2\'\u00dc\3\2\2\2)\u00de\3\2\2\2+\u00e5\3\2\2\2"+
		"-\u00eb\3\2\2\2/\u00ed\3\2\2\2\61\u00f1\3\2\2\2\63\u00fb\3\2\2\2\65\u00fd"+
		"\3\2\2\2\67\u00ff\3\2\2\29\u0101\3\2\2\2;\u0103\3\2\2\2=\u0105\3\2\2\2"+
		"?\u0107\3\2\2\2A\u0109\3\2\2\2C\u010b\3\2\2\2E\u010d\3\2\2\2G\u010f\3"+
		"\2\2\2I\u0111\3\2\2\2K\u0113\3\2\2\2M\u0115\3\2\2\2O\u0117\3\2\2\2Q\u0119"+
		"\3\2\2\2S\u011c\3\2\2\2U\u011f\3\2\2\2W\u0122\3\2\2\2Y\u0125\3\2\2\2["+
		"\u0128\3\2\2\2]\u012f\3\2\2\2_\u0133\3\2\2\2a\u0137\3\2\2\2c\u0144\3\2"+
		"\2\2e\u014d\3\2\2\2g\u0156\3\2\2\2i\u015e\3\2\2\2k\u0163\3\2\2\2m\u016b"+
		"\3\2\2\2o\u0172\3\2\2\2q\u0179\3\2\2\2s\u0181\3\2\2\2u\u0189\3\2\2\2w"+
		"\u018c\3\2\2\2y\u0192\3\2\2\2{|\7.\2\2|\4\3\2\2\2}~\7c\2\2~\177\7u\2\2"+
		"\177\6\3\2\2\2\u0080\u0081\7?\2\2\u0081\b\3\2\2\2\u0082\u0083\7v\2\2\u0083"+
		"\u0084\7g\2\2\u0084\u0085\7z\2\2\u0085\u0086\7v\2\2\u0086\n\3\2\2\2\u0087"+
		"\u0088\7?\2\2\u0088\u0089\7?\2\2\u0089\u008a\7?\2\2\u008a\f\3\2\2\2\u008b"+
		"\u008c\7n\2\2\u008c\u008d\7k\2\2\u008d\u008e\7u\2\2\u008e\u008f\7v\2\2"+
		"\u008f\16\3\2\2\2\u0090\u0091\7{\2\2\u0091\u0092\7c\2\2\u0092\u0093\7"+
		"o\2\2\u0093\u0094\7n\2\2\u0094\20\3\2\2\2\u0095\u0096\7l\2\2\u0096\u0097"+
		"\7u\2\2\u0097\u0098\7q\2\2\u0098\u0099\7p\2\2\u0099\22\3\2\2\2\u009a\u009b"+
		"\7e\2\2\u009b\u009c\7u\2\2\u009c\u009d\7x\2\2\u009d\24\3\2\2\2\u009e\u009f"+
		"\7v\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7x\2\2\u00a1\26\3\2\2\2\u00a2\u00a3"+
		"\7\60\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\32\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa"+
		"\u00ab\7K\2\2\u00ab\u00ac\7i\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7q\2\2"+
		"\u00ae\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7E\2\2\u00b1\u00b2"+
		"\7c\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7g\2\2\u00b4\34\3\2\2\2\u00b5\u00b6"+
		"\7p\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7K\2\2\u00b9"+
		"\u00ba\7i\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7t\2\2"+
		"\u00bd\u00be\7g\2\2\u00be\u00bf\7E\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1"+
		"\7u\2\2\u00c1\u00c2\7g\2\2\u00c2\36\3\2\2\2\u00c3\u00c4\7\u0080\2\2\u00c4"+
		" \3\2\2\2\u00c5\u00ce\7\62\2\2\u00c6\u00ca\5#\22\2\u00c7\u00c9\5%\23\2"+
		"\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd"+
		"\u00c6\3\2\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\t\2\2\2\u00d0$\3\2\2\2\u00d1"+
		"\u00d2\t\3\2\2\u00d2&\3\2\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7t\2\2\u00d5"+
		"\u00d6\7w\2\2\u00d6\u00dd\7g\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7c\2\2"+
		"\u00d9\u00da\7n\2\2\u00da\u00db\7u\2\2\u00db\u00dd\7g\2\2\u00dc\u00d3"+
		"\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd(\3\2\2\2\u00de\u00e0\7$\2\2\u00df\u00e1"+
		"\5+\26\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\7$\2\2\u00e3*\3\2\2\2\u00e4\u00e6\5-\27\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8,\3\2\2\2"+
		"\u00e9\u00ec\n\4\2\2\u00ea\u00ec\5/\30\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7^\2\2\u00ee\u00ef\t\5\2\2\u00ef\60"+
		"\3\2\2\2\u00f0\u00f2\5%\23\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\7\60"+
		"\2\2\u00f6\u00f8\5%\23\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\62\3\2\2\2\u00fb\u00fc\7}\2\2"+
		"\u00fc\64\3\2\2\2\u00fd\u00fe\7\177\2\2\u00fe\66\3\2\2\2\u00ff\u0100\7"+
		"*\2\2\u01008\3\2\2\2\u0101\u0102\7+\2\2\u0102:\3\2\2\2\u0103\u0104\7]"+
		"\2\2\u0104<\3\2\2\2\u0105\u0106\7_\2\2\u0106>\3\2\2\2\u0107\u0108\7=\2"+
		"\2\u0108@\3\2\2\2\u0109\u010a\7A\2\2\u010aB\3\2\2\2\u010b\u010c\7<\2\2"+
		"\u010cD\3\2\2\2\u010d\u010e\7,\2\2\u010eF\3\2\2\2\u010f\u0110\7-\2\2\u0110"+
		"H\3\2\2\2\u0111\u0112\7(\2\2\u0112J\3\2\2\2\u0113\u0114\7~\2\2\u0114L"+
		"\3\2\2\2\u0115\u0116\7@\2\2\u0116N\3\2\2\2\u0117\u0118\7>\2\2\u0118P\3"+
		"\2\2\2\u0119\u011a\7?\2\2\u011a\u011b\7?\2\2\u011bR\3\2\2\2\u011c\u011d"+
		"\7>\2\2\u011d\u011e\7?\2\2\u011eT\3\2\2\2\u011f\u0120\7@\2\2\u0120\u0121"+
		"\7?\2\2\u0121V\3\2\2\2\u0122\u0123\7#\2\2\u0123\u0124\7?\2\2\u0124X\3"+
		"\2\2\2\u0125\u0126\7k\2\2\u0126\u0127\7p\2\2\u0127Z\3\2\2\2\u0128\u0129"+
		"\7k\2\2\u0129\u012a\7o\2\2\u012a\u012b\7r\2\2\u012b\u012c\7q\2\2\u012c"+
		"\u012d\7t\2\2\u012d\u012e\7v\2\2\u012e\\\3\2\2\2\u012f\u0130\7w\2\2\u0130"+
		"\u0131\7u\2\2\u0131\u0132\7g\2\2\u0132^\3\2\2\2\u0133\u0134\7u\2\2\u0134"+
		"\u0135\7g\2\2\u0135\u0136\7v\2\2\u0136`\3\2\2\2\u0137\u0138\7l\2\2\u0138"+
		"\u0139\7c\2\2\u0139\u013a\7x\2\2\u013a\u013b\7c\2\2\u013b\u013c\7/\2\2"+
		"\u013c\u013d\7o\2\2\u013d\u013e\7c\2\2\u013e\u013f\7v\2\2\u013f\u0140"+
		"\7e\2\2\u0140\u0141\7j\2\2\u0141\u0142\7g\2\2\u0142\u0143\7t\2\2\u0143"+
		"b\3\2\2\2\u0144\u0145\7t\2\2\u0145\u0146\7g\2\2\u0146\u0147\7u\2\2\u0147"+
		"\u0148\7q\2\2\u0148\u0149\7w\2\2\u0149\u014a\7t\2\2\u014a\u014b\7e\2\2"+
		"\u014b\u014c\7g\2\2\u014cd\3\2\2\2\u014d\u0151\7%\2\2\u014e\u0150\n\6"+
		"\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\b\63"+
		"\2\2\u0155f\3\2\2\2\u0156\u0157\7o\2\2\u0157\u0158\7c\2\2\u0158\u0159"+
		"\7v\2\2\u0159\u015a\7e\2\2\u015a\u015b\7j\2\2\u015b\u015c\7g\2\2\u015c"+
		"\u015d\7t\2\2\u015dh\3\2\2\2\u015e\u015f\7t\2\2\u015f\u0160\7w\2\2\u0160"+
		"\u0161\7n\2\2\u0161\u0162\7g\2\2\u0162j\3\2\2\2\u0163\u0168\5o8\2\u0164"+
		"\u0165\7\60\2\2\u0165\u0167\5o8\2\u0166\u0164\3\2\2\2\u0167\u016a\3\2"+
		"\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169l\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016b\u016f\5q9\2\u016c\u016e\5u;\2\u016d\u016c\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170n\3\2\2\2"+
		"\u0171\u016f\3\2\2\2\u0172\u0176\5s:\2\u0173\u0175\5u;\2\u0174\u0173\3"+
		"\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"p\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\t\7\2\2\u017ar\3\2\2\2\u017b"+
		"\u0182\t\b\2\2\u017c\u017d\n\t\2\2\u017d\u0182\6:\2\2\u017e\u017f\t\n"+
		"\2\2\u017f\u0180\t\13\2\2\u0180\u0182\6:\3\2\u0181\u017b\3\2\2\2\u0181"+
		"\u017c\3\2\2\2\u0181\u017e\3\2\2\2\u0182t\3\2\2\2\u0183\u018a\t\f\2\2"+
		"\u0184\u0185\n\t\2\2\u0185\u018a\6;\4\2\u0186\u0187\t\n\2\2\u0187\u0188"+
		"\t\13\2\2\u0188\u018a\6;\5\2\u0189\u0183\3\2\2\2\u0189\u0184\3\2\2\2\u0189"+
		"\u0186\3\2\2\2\u018av\3\2\2\2\u018b\u018d\t\r\2\2\u018c\u018b\3\2\2\2"+
		"\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0191\b<\2\2\u0191x\3\2\2\2\u0192\u0197\7\61\2\2\u0193"+
		"\u0196\n\16\2\2\u0194\u0196\5/\30\2\u0195\u0193\3\2\2\2\u0195\u0194\3"+
		"\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7\61\2\2\u019bz\3\2\2\2"+
		"\24\2\u00ca\u00cd\u00dc\u00e0\u00e7\u00eb\u00f3\u00f9\u0151\u0168\u016f"+
		"\u0176\u0181\u0189\u018e\u0195\u0197\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}