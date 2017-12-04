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
		LE=38, GE=39, NOTEQUAL=40, IN=41, TYPE_SYSTEM=42, IMPORT_MATCHERS_FROM=43, 
		USE=44, SET=45, JAVA_MATCHER=46, RESOURCE=47, LINE_COMMENT=48, MATCHER=49, 
		RULE=50, Identifier=51, IdentifierPart=52, WS=53, Regex=54;
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
		"IN", "TYPE_SYSTEM", "IMPORT_MATCHERS_FROM", "USE", "SET", "JAVA_MATCHER", 
		"RESOURCE", "LINE_COMMENT", "MATCHER", "RULE", "Identifier", "IdentifierPart", 
		"FirstLetter", "JavaLetterOrDigit", "WS", "Regex"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'as'", "'='", "'text'", "'==='", "'list'", "'yaml'", "'json'", 
		"'csv'", "'tsv'", "'.'", "'nin'", "'inIgnoreCase'", "'ninIgnoreCase'", 
		"'~'", null, null, null, null, null, null, "'{'", "'}'", "'('", "')'", 
		"'['", "']'", "';'", "'?'", "':'", "'*'", "'+'", "'&'", "'|'", "'>'", 
		"'<'", "'=='", "'<='", "'>='", "'!='", "'in'", "'type-system'", "'import-matchers-from'", 
		"'use'", "'set'", "'java-matcher'", "'resource'", null, "'matcher'", "'rule'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "IgnoreMatcher", "IntegerLiteral", "NonZeroDigit", "Digit", 
		"BooleanLiteral", "StringLiteral", "FloatingPointLiteral", "LCURL", "RCURL", 
		"LPAREN", "RPAREN", "LBRACK", "RBRACK", "SEMI", "QUESTION", "COLON", "MUL", 
		"PLUS", "AND", "OR", "GT", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", "IN", 
		"TYPE_SYSTEM", "IMPORT_MATCHERS_FROM", "USE", "SET", "JAVA_MATCHER", "RESOURCE", 
		"LINE_COMMENT", "MATCHER", "RULE", "Identifier", "IdentifierPart", "WS", 
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
		case 55:
			return FirstLetter_sempred((RuleContext)_localctx, predIndex);
		case 56:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01ab\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21\u00c7"+
		"\n\21\f\21\16\21\u00ca\13\21\5\21\u00cc\n\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00db\n\24\3\25\3\25\5\25"+
		"\u00df\n\25\3\25\3\25\3\26\6\26\u00e4\n\26\r\26\16\26\u00e5\3\27\3\27"+
		"\5\27\u00ea\n\27\3\30\3\30\3\30\3\31\6\31\u00f0\n\31\r\31\16\31\u00f1"+
		"\3\31\3\31\6\31\u00f6\n\31\r\31\16\31\u00f7\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\7\64\u0168\n\64\f\64"+
		"\16\64\u016b\13\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\7\67\u017f\n\67\f\67\16\67\u0182"+
		"\13\67\38\38\78\u0186\n8\f8\168\u0189\138\39\39\39\39\39\39\59\u0191\n"+
		"9\3:\3:\3:\3:\3:\3:\5:\u0199\n:\3;\6;\u019c\n;\r;\16;\u019d\3;\3;\3<\3"+
		"<\3<\7<\u01a5\n<\f<\16<\u01a8\13<\3<\3<\2\2=\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\2-\2/\2\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q"+
		"\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65o\66q\2s\2u\67w8\3\2\16\3\2"+
		"\63;\3\2\62;\4\2$$^^\n\2$$))^^ddhhppttvv\4\2\f\f\17\17\5\2C\\aac|\4\2"+
		"\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|"+
		"\5\2\13\f\17\17\"\"\3\2\61\61\2\u01b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2"+
		"\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2"+
		"\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m"+
		"\3\2\2\2\2o\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7~\3\2"+
		"\2\2\t\u0080\3\2\2\2\13\u0085\3\2\2\2\r\u0089\3\2\2\2\17\u008e\3\2\2\2"+
		"\21\u0093\3\2\2\2\23\u0098\3\2\2\2\25\u009c\3\2\2\2\27\u00a0\3\2\2\2\31"+
		"\u00a2\3\2\2\2\33\u00a6\3\2\2\2\35\u00b3\3\2\2\2\37\u00c1\3\2\2\2!\u00cb"+
		"\3\2\2\2#\u00cd\3\2\2\2%\u00cf\3\2\2\2\'\u00da\3\2\2\2)\u00dc\3\2\2\2"+
		"+\u00e3\3\2\2\2-\u00e9\3\2\2\2/\u00eb\3\2\2\2\61\u00ef\3\2\2\2\63\u00f9"+
		"\3\2\2\2\65\u00fb\3\2\2\2\67\u00fd\3\2\2\29\u00ff\3\2\2\2;\u0101\3\2\2"+
		"\2=\u0103\3\2\2\2?\u0105\3\2\2\2A\u0107\3\2\2\2C\u0109\3\2\2\2E\u010b"+
		"\3\2\2\2G\u010d\3\2\2\2I\u010f\3\2\2\2K\u0111\3\2\2\2M\u0113\3\2\2\2O"+
		"\u0115\3\2\2\2Q\u0117\3\2\2\2S\u011a\3\2\2\2U\u011d\3\2\2\2W\u0120\3\2"+
		"\2\2Y\u0123\3\2\2\2[\u0126\3\2\2\2]\u0132\3\2\2\2_\u0147\3\2\2\2a\u014b"+
		"\3\2\2\2c\u014f\3\2\2\2e\u015c\3\2\2\2g\u0165\3\2\2\2i\u016e\3\2\2\2k"+
		"\u0176\3\2\2\2m\u017b\3\2\2\2o\u0183\3\2\2\2q\u0190\3\2\2\2s\u0198\3\2"+
		"\2\2u\u019b\3\2\2\2w\u01a1\3\2\2\2yz\7.\2\2z\4\3\2\2\2{|\7c\2\2|}\7u\2"+
		"\2}\6\3\2\2\2~\177\7?\2\2\177\b\3\2\2\2\u0080\u0081\7v\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7z\2\2\u0083\u0084\7v\2\2\u0084\n\3\2\2\2\u0085\u0086"+
		"\7?\2\2\u0086\u0087\7?\2\2\u0087\u0088\7?\2\2\u0088\f\3\2\2\2\u0089\u008a"+
		"\7n\2\2\u008a\u008b\7k\2\2\u008b\u008c\7u\2\2\u008c\u008d\7v\2\2\u008d"+
		"\16\3\2\2\2\u008e\u008f\7{\2\2\u008f\u0090\7c\2\2\u0090\u0091\7o\2\2\u0091"+
		"\u0092\7n\2\2\u0092\20\3\2\2\2\u0093\u0094\7l\2\2\u0094\u0095\7u\2\2\u0095"+
		"\u0096\7q\2\2\u0096\u0097\7p\2\2\u0097\22\3\2\2\2\u0098\u0099\7e\2\2\u0099"+
		"\u009a\7u\2\2\u009a\u009b\7x\2\2\u009b\24\3\2\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7u\2\2\u009e\u009f\7x\2\2\u009f\26\3\2\2\2\u00a0\u00a1\7\60\2\2"+
		"\u00a1\30\3\2\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7"+
		"p\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9"+
		"\7K\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7q\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7E\2\2\u00af\u00b0\7c\2\2"+
		"\u00b0\u00b1\7u\2\2\u00b1\u00b2\7g\2\2\u00b2\34\3\2\2\2\u00b3\u00b4\7"+
		"p\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7K\2\2\u00b7\u00b8"+
		"\7i\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7t\2\2\u00bb"+
		"\u00bc\7g\2\2\u00bc\u00bd\7E\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7u\2\2"+
		"\u00bf\u00c0\7g\2\2\u00c0\36\3\2\2\2\u00c1\u00c2\7\u0080\2\2\u00c2 \3"+
		"\2\2\2\u00c3\u00cc\7\62\2\2\u00c4\u00c8\5#\22\2\u00c5\u00c7\5%\23\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb"+
		"\u00c4\3\2\2\2\u00cc\"\3\2\2\2\u00cd\u00ce\t\2\2\2\u00ce$\3\2\2\2\u00cf"+
		"\u00d0\t\3\2\2\u00d0&\3\2\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7t\2\2\u00d3"+
		"\u00d4\7w\2\2\u00d4\u00db\7g\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7c\2\2"+
		"\u00d7\u00d8\7n\2\2\u00d8\u00d9\7u\2\2\u00d9\u00db\7g\2\2\u00da\u00d1"+
		"\3\2\2\2\u00da\u00d5\3\2\2\2\u00db(\3\2\2\2\u00dc\u00de\7$\2\2\u00dd\u00df"+
		"\5+\26\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7$\2\2\u00e1*\3\2\2\2\u00e2\u00e4\5-\27\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6,\3\2\2\2"+
		"\u00e7\u00ea\n\4\2\2\u00e8\u00ea\5/\30\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8"+
		"\3\2\2\2\u00ea.\3\2\2\2\u00eb\u00ec\7^\2\2\u00ec\u00ed\t\5\2\2\u00ed\60"+
		"\3\2\2\2\u00ee\u00f0\5%\23\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\7\60"+
		"\2\2\u00f4\u00f6\5%\23\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\62\3\2\2\2\u00f9\u00fa\7}\2\2"+
		"\u00fa\64\3\2\2\2\u00fb\u00fc\7\177\2\2\u00fc\66\3\2\2\2\u00fd\u00fe\7"+
		"*\2\2\u00fe8\3\2\2\2\u00ff\u0100\7+\2\2\u0100:\3\2\2\2\u0101\u0102\7]"+
		"\2\2\u0102<\3\2\2\2\u0103\u0104\7_\2\2\u0104>\3\2\2\2\u0105\u0106\7=\2"+
		"\2\u0106@\3\2\2\2\u0107\u0108\7A\2\2\u0108B\3\2\2\2\u0109\u010a\7<\2\2"+
		"\u010aD\3\2\2\2\u010b\u010c\7,\2\2\u010cF\3\2\2\2\u010d\u010e\7-\2\2\u010e"+
		"H\3\2\2\2\u010f\u0110\7(\2\2\u0110J\3\2\2\2\u0111\u0112\7~\2\2\u0112L"+
		"\3\2\2\2\u0113\u0114\7@\2\2\u0114N\3\2\2\2\u0115\u0116\7>\2\2\u0116P\3"+
		"\2\2\2\u0117\u0118\7?\2\2\u0118\u0119\7?\2\2\u0119R\3\2\2\2\u011a\u011b"+
		"\7>\2\2\u011b\u011c\7?\2\2\u011cT\3\2\2\2\u011d\u011e\7@\2\2\u011e\u011f"+
		"\7?\2\2\u011fV\3\2\2\2\u0120\u0121\7#\2\2\u0121\u0122\7?\2\2\u0122X\3"+
		"\2\2\2\u0123\u0124\7k\2\2\u0124\u0125\7p\2\2\u0125Z\3\2\2\2\u0126\u0127"+
		"\7v\2\2\u0127\u0128\7{\2\2\u0128\u0129\7r\2\2\u0129\u012a\7g\2\2\u012a"+
		"\u012b\7/\2\2\u012b\u012c\7u\2\2\u012c\u012d\7{\2\2\u012d\u012e\7u\2\2"+
		"\u012e\u012f\7v\2\2\u012f\u0130\7g\2\2\u0130\u0131\7o\2\2\u0131\\\3\2"+
		"\2\2\u0132\u0133\7k\2\2\u0133\u0134\7o\2\2\u0134\u0135\7r\2\2\u0135\u0136"+
		"\7q\2\2\u0136\u0137\7t\2\2\u0137\u0138\7v\2\2\u0138\u0139\7/\2\2\u0139"+
		"\u013a\7o\2\2\u013a\u013b\7c\2\2\u013b\u013c\7v\2\2\u013c\u013d\7e\2\2"+
		"\u013d\u013e\7j\2\2\u013e\u013f\7g\2\2\u013f\u0140\7t\2\2\u0140\u0141"+
		"\7u\2\2\u0141\u0142\7/\2\2\u0142\u0143\7h\2\2\u0143\u0144\7t\2\2\u0144"+
		"\u0145\7q\2\2\u0145\u0146\7o\2\2\u0146^\3\2\2\2\u0147\u0148\7w\2\2\u0148"+
		"\u0149\7u\2\2\u0149\u014a\7g\2\2\u014a`\3\2\2\2\u014b\u014c\7u\2\2\u014c"+
		"\u014d\7g\2\2\u014d\u014e\7v\2\2\u014eb\3\2\2\2\u014f\u0150\7l\2\2\u0150"+
		"\u0151\7c\2\2\u0151\u0152\7x\2\2\u0152\u0153\7c\2\2\u0153\u0154\7/\2\2"+
		"\u0154\u0155\7o\2\2\u0155\u0156\7c\2\2\u0156\u0157\7v\2\2\u0157\u0158"+
		"\7e\2\2\u0158\u0159\7j\2\2\u0159\u015a\7g\2\2\u015a\u015b\7t\2\2\u015b"+
		"d\3\2\2\2\u015c\u015d\7t\2\2\u015d\u015e\7g\2\2\u015e\u015f\7u\2\2\u015f"+
		"\u0160\7q\2\2\u0160\u0161\7w\2\2\u0161\u0162\7t\2\2\u0162\u0163\7e\2\2"+
		"\u0163\u0164\7g\2\2\u0164f\3\2\2\2\u0165\u0169\7%\2\2\u0166\u0168\n\6"+
		"\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\b\64"+
		"\2\2\u016dh\3\2\2\2\u016e\u016f\7o\2\2\u016f\u0170\7c\2\2\u0170\u0171"+
		"\7v\2\2\u0171\u0172\7e\2\2\u0172\u0173\7j\2\2\u0173\u0174\7g\2\2\u0174"+
		"\u0175\7t\2\2\u0175j\3\2\2\2\u0176\u0177\7t\2\2\u0177\u0178\7w\2\2\u0178"+
		"\u0179\7n\2\2\u0179\u017a\7g\2\2\u017al\3\2\2\2\u017b\u0180\5o8\2\u017c"+
		"\u017d\7\60\2\2\u017d\u017f\5o8\2\u017e\u017c\3\2\2\2\u017f\u0182\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181n\3\2\2\2\u0182\u0180"+
		"\3\2\2\2\u0183\u0187\5q9\2\u0184\u0186\5s:\2\u0185\u0184\3\2\2\2\u0186"+
		"\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188p\3\2\2\2"+
		"\u0189\u0187\3\2\2\2\u018a\u0191\t\7\2\2\u018b\u018c\n\b\2\2\u018c\u0191"+
		"\69\2\2\u018d\u018e\t\t\2\2\u018e\u018f\t\n\2\2\u018f\u0191\69\3\2\u0190"+
		"\u018a\3\2\2\2\u0190\u018b\3\2\2\2\u0190\u018d\3\2\2\2\u0191r\3\2\2\2"+
		"\u0192\u0199\t\13\2\2\u0193\u0194\n\b\2\2\u0194\u0199\6:\4\2\u0195\u0196"+
		"\t\t\2\2\u0196\u0197\t\n\2\2\u0197\u0199\6:\5\2\u0198\u0192\3\2\2\2\u0198"+
		"\u0193\3\2\2\2\u0198\u0195\3\2\2\2\u0199t\3\2\2\2\u019a\u019c\t\f\2\2"+
		"\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\b;\2\2\u01a0v\3\2\2\2\u01a1\u01a6"+
		"\7\61\2\2\u01a2\u01a5\n\r\2\2\u01a3\u01a5\5/\30\2\u01a4\u01a2\3\2\2\2"+
		"\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7\61\2\2"+
		"\u01aax\3\2\2\2\23\2\u00c8\u00cb\u00da\u00de\u00e5\u00e9\u00f1\u00f7\u0169"+
		"\u0180\u0187\u0190\u0198\u019d\u01a4\u01a6\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}