// Generated from UimaTokenRegex.g4 by ANTLR 4.7

    package fr.univnantes.lina.uima.tkregex.antlr.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UimaTokenRegexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, IgnoreMatcher=14, IntegerLiteral=15, 
		NonZeroDigit=16, Digit=17, BooleanLiteral=18, StringLiteral=19, FloatingPointLiteral=20, 
		LCURL=21, RCURL=22, LPAREN=23, RPAREN=24, LBRACK=25, RBRACK=26, SEMI=27, 
		QUESTION=28, COLON=29, MUL=30, PLUS=31, AND=32, OR=33, GT=34, LT=35, EQUAL=36, 
		LE=37, GE=38, NOTEQUAL=39, IN=40, IMPORT=41, USE=42, SET=43, JAVA_MATCHER=44, 
		RESOURCE=45, LINE_COMMENT=46, MATCHER=47, RULE=48, Identifier=49, IdentifierPart=50, 
		WS=51, Regex=52;
	public static final int
		RULE_ruleList = 0, RULE_headerBlock = 1, RULE_importDeclaration = 2, RULE_useDeclaration = 3, 
		RULE_javaMatcherDeclaration = 4, RULE_optionDeclaration = 5, RULE_shortcutMatcherDeclaration = 6, 
		RULE_labelIdentifier = 7, RULE_ruleDeclaration = 8, RULE_automatonDeclaration = 9, 
		RULE_ruleName = 10, RULE_matcherDeclaration = 11, RULE_orBranchingDeclaration = 12, 
		RULE_featureMatcherDeclaration = 13, RULE_andexpression = 14, RULE_orexpression = 15, 
		RULE_expression = 16, RULE_atomicExpression = 17, RULE_resourceIdentifier = 18, 
		RULE_externalListDeclaration = 19, RULE_simpleListDefinition = 20, RULE_path = 21, 
		RULE_yamlListDefinition = 22, RULE_jsonListDefinition = 23, RULE_csvListDefinition = 24, 
		RULE_tsvListDefinition = 25, RULE_quote = 26, RULE_separator = 27, RULE_keypath = 28, 
		RULE_quantifierDeclaration = 29, RULE_featureName = 30, RULE_arrayOperator = 31, 
		RULE_inListOperator = 32, RULE_operator = 33, RULE_coveredTextArray = 34, 
		RULE_coveredTextIgnoreCase = 35, RULE_coveredTextExactly = 36, RULE_literalArray = 37, 
		RULE_literal = 38;
	public static final String[] ruleNames = {
		"ruleList", "headerBlock", "importDeclaration", "useDeclaration", "javaMatcherDeclaration", 
		"optionDeclaration", "shortcutMatcherDeclaration", "labelIdentifier", 
		"ruleDeclaration", "automatonDeclaration", "ruleName", "matcherDeclaration", 
		"orBranchingDeclaration", "featureMatcherDeclaration", "andexpression", 
		"orexpression", "expression", "atomicExpression", "resourceIdentifier", 
		"externalListDeclaration", "simpleListDefinition", "path", "yamlListDefinition", 
		"jsonListDefinition", "csvListDefinition", "tsvListDefinition", "quote", 
		"separator", "keypath", "quantifierDeclaration", "featureName", "arrayOperator", 
		"inListOperator", "operator", "coveredTextArray", "coveredTextIgnoreCase", 
		"coveredTextExactly", "literalArray", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'as'", "'='", "'text'", "'==='", "'list'", "'yaml'", "','", "'json'", 
		"'csv'", "'tsv'", "'nin'", "'inIgnoreCase'", "'ninIgnoreCase'", "'~'", 
		null, null, null, null, null, null, "'{'", "'}'", "'('", "')'", "'['", 
		"']'", "';'", "'?'", "':'", "'*'", "'+'", "'&'", "'|'", "'>'", "'<'", 
		"'=='", "'<='", "'>='", "'!='", "'in'", "'import'", "'use'", "'set'", 
		"'java-matcher'", "'resource'", null, "'matcher'", "'rule'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "IgnoreMatcher", "IntegerLiteral", "NonZeroDigit", "Digit", 
		"BooleanLiteral", "StringLiteral", "FloatingPointLiteral", "LCURL", "RCURL", 
		"LPAREN", "RPAREN", "LBRACK", "RBRACK", "SEMI", "QUESTION", "COLON", "MUL", 
		"PLUS", "AND", "OR", "GT", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", "IN", 
		"IMPORT", "USE", "SET", "JAVA_MATCHER", "RESOURCE", "LINE_COMMENT", "MATCHER", 
		"RULE", "Identifier", "IdentifierPart", "WS", "Regex"
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

	@Override
	public String getGrammarFileName() { return "UimaTokenRegex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UimaTokenRegexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RuleListContext extends ParserRuleContext {
		public HeaderBlockContext headerBlock() {
			return getRuleContext(HeaderBlockContext.class,0);
		}
		public List<ShortcutMatcherDeclarationContext> shortcutMatcherDeclaration() {
			return getRuleContexts(ShortcutMatcherDeclarationContext.class);
		}
		public ShortcutMatcherDeclarationContext shortcutMatcherDeclaration(int i) {
			return getRuleContext(ShortcutMatcherDeclarationContext.class,i);
		}
		public List<RuleDeclarationContext> ruleDeclaration() {
			return getRuleContexts(RuleDeclarationContext.class);
		}
		public RuleDeclarationContext ruleDeclaration(int i) {
			return getRuleContext(RuleDeclarationContext.class,i);
		}
		public RuleListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterRuleList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitRuleList(this);
		}
	}

	public final RuleListContext ruleList() throws RecognitionException {
		RuleListContext _localctx = new RuleListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ruleList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			headerBlock();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATCHER) {
				{
				{
				setState(79);
				shortcutMatcherDeclaration();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RULE) {
				{
				{
				setState(85);
				ruleDeclaration();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderBlockContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public List<ExternalListDeclarationContext> externalListDeclaration() {
			return getRuleContexts(ExternalListDeclarationContext.class);
		}
		public ExternalListDeclarationContext externalListDeclaration(int i) {
			return getRuleContext(ExternalListDeclarationContext.class,i);
		}
		public List<OptionDeclarationContext> optionDeclaration() {
			return getRuleContexts(OptionDeclarationContext.class);
		}
		public OptionDeclarationContext optionDeclaration(int i) {
			return getRuleContext(OptionDeclarationContext.class,i);
		}
		public List<JavaMatcherDeclarationContext> javaMatcherDeclaration() {
			return getRuleContexts(JavaMatcherDeclarationContext.class);
		}
		public JavaMatcherDeclarationContext javaMatcherDeclaration(int i) {
			return getRuleContext(JavaMatcherDeclarationContext.class,i);
		}
		public HeaderBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterHeaderBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitHeaderBlock(this);
		}
	}

	public final HeaderBlockContext headerBlock() throws RecognitionException {
		HeaderBlockContext _localctx = new HeaderBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_headerBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			importDeclaration();
			setState(92);
			useDeclaration();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET || _la==RESOURCE) {
				{
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RESOURCE:
					{
					setState(93);
					externalListDeclaration();
					}
					break;
				case SET:
					{
					setState(94);
					optionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAVA_MATCHER) {
				{
				{
				setState(100);
				javaMatcherDeclaration();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(UimaTokenRegexParser.IMPORT, 0); }
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IMPORT);
			setState(107);
			match(Identifier);
			setState(108);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseDeclarationContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(UimaTokenRegexParser.USE, 0); }
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public TerminalNode IdentifierPart() { return getToken(UimaTokenRegexParser.IdentifierPart, 0); }
		public UseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterUseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitUseDeclaration(this);
		}
	}

	public final UseDeclarationContext useDeclaration() throws RecognitionException {
		UseDeclarationContext _localctx = new UseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_useDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(USE);
			setState(111);
			match(Identifier);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(112);
				match(T__0);
				setState(113);
				match(IdentifierPart);
				}
			}

			setState(116);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JavaMatcherDeclarationContext extends ParserRuleContext {
		public TerminalNode JAVA_MATCHER() { return getToken(UimaTokenRegexParser.JAVA_MATCHER, 0); }
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public JavaMatcherDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaMatcherDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterJavaMatcherDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitJavaMatcherDeclaration(this);
		}
	}

	public final JavaMatcherDeclarationContext javaMatcherDeclaration() throws RecognitionException {
		JavaMatcherDeclarationContext _localctx = new JavaMatcherDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_javaMatcherDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(JAVA_MATCHER);
			setState(119);
			match(COLON);
			setState(120);
			match(Identifier);
			setState(121);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionDeclarationContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(UimaTokenRegexParser.SET, 0); }
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OptionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterOptionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitOptionDeclaration(this);
		}
	}

	public final OptionDeclarationContext optionDeclaration() throws RecognitionException {
		OptionDeclarationContext _localctx = new OptionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_optionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(SET);
			setState(124);
			match(Identifier);
			setState(125);
			match(T__1);
			setState(126);
			literal();
			setState(127);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortcutMatcherDeclarationContext extends ParserRuleContext {
		public TerminalNode MATCHER() { return getToken(UimaTokenRegexParser.MATCHER, 0); }
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public FeatureMatcherDeclarationContext featureMatcherDeclaration() {
			return getRuleContext(FeatureMatcherDeclarationContext.class,0);
		}
		public TerminalNode Regex() { return getToken(UimaTokenRegexParser.Regex, 0); }
		public LabelIdentifierContext labelIdentifier() {
			return getRuleContext(LabelIdentifierContext.class,0);
		}
		public ShortcutMatcherDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortcutMatcherDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterShortcutMatcherDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitShortcutMatcherDeclaration(this);
		}
	}

	public final ShortcutMatcherDeclarationContext shortcutMatcherDeclaration() throws RecognitionException {
		ShortcutMatcherDeclarationContext _localctx = new ShortcutMatcherDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_shortcutMatcherDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(MATCHER);
			setState(130);
			match(Identifier);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(131);
				match(T__0);
				setState(132);
				labelIdentifier();
				}
			}

			setState(135);
			match(COLON);
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				setState(136);
				featureMatcherDeclaration();
				}
				break;
			case Regex:
				{
				setState(137);
				match(Regex);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(140);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public LabelIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterLabelIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitLabelIdentifier(this);
		}
	}

	public final LabelIdentifierContext labelIdentifier() throws RecognitionException {
		LabelIdentifierContext _localctx = new LabelIdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_labelIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleDeclarationContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(UimaTokenRegexParser.RULE, 0); }
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public AutomatonDeclarationContext automatonDeclaration() {
			return getRuleContext(AutomatonDeclarationContext.class,0);
		}
		public RuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterRuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitRuleDeclaration(this);
		}
	}

	public final RuleDeclarationContext ruleDeclaration() throws RecognitionException {
		RuleDeclarationContext _localctx = new RuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(RULE);
			setState(145);
			ruleName();
			setState(146);
			match(COLON);
			setState(147);
			automatonDeclaration();
			setState(148);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutomatonDeclarationContext extends ParserRuleContext {
		public List<OrBranchingDeclarationContext> orBranchingDeclaration() {
			return getRuleContexts(OrBranchingDeclarationContext.class);
		}
		public OrBranchingDeclarationContext orBranchingDeclaration(int i) {
			return getRuleContext(OrBranchingDeclarationContext.class,i);
		}
		public AutomatonDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterAutomatonDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitAutomatonDeclaration(this);
		}
	}

	public final AutomatonDeclarationContext automatonDeclaration() throws RecognitionException {
		AutomatonDeclarationContext _localctx = new AutomatonDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_automatonDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				orBranchingDeclaration();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IgnoreMatcher) | (1L << LPAREN) | (1L << LBRACK) | (1L << Identifier) | (1L << Regex))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleNameContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(UimaTokenRegexParser.StringLiteral, 0); }
		public RuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterRuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitRuleName(this);
		}
	}

	public final RuleNameContext ruleName() throws RecognitionException {
		RuleNameContext _localctx = new RuleNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ruleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatcherDeclarationContext extends ParserRuleContext {
		public TerminalNode Regex() { return getToken(UimaTokenRegexParser.Regex, 0); }
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public FeatureMatcherDeclarationContext featureMatcherDeclaration() {
			return getRuleContext(FeatureMatcherDeclarationContext.class,0);
		}
		public TerminalNode IgnoreMatcher() { return getToken(UimaTokenRegexParser.IgnoreMatcher, 0); }
		public MatcherDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matcherDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterMatcherDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitMatcherDeclaration(this);
		}
	}

	public final MatcherDeclarationContext matcherDeclaration() throws RecognitionException {
		MatcherDeclarationContext _localctx = new MatcherDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matcherDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(157);
					match(IgnoreMatcher);
					}
				}

				setState(160);
				match(Regex);
				}
				break;
			case 2:
				{
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(161);
					match(IgnoreMatcher);
					}
				}

				setState(164);
				match(Identifier);
				}
				break;
			case 3:
				{
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(165);
					match(IgnoreMatcher);
					}
				}

				setState(168);
				featureMatcherDeclaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrBranchingDeclarationContext extends ParserRuleContext {
		public List<AutomatonDeclarationContext> automatonDeclaration() {
			return getRuleContexts(AutomatonDeclarationContext.class);
		}
		public AutomatonDeclarationContext automatonDeclaration(int i) {
			return getRuleContext(AutomatonDeclarationContext.class,i);
		}
		public MatcherDeclarationContext matcherDeclaration() {
			return getRuleContext(MatcherDeclarationContext.class,0);
		}
		public QuantifierDeclarationContext quantifierDeclaration() {
			return getRuleContext(QuantifierDeclarationContext.class,0);
		}
		public OrBranchingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orBranchingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterOrBranchingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitOrBranchingDeclaration(this);
		}
	}

	public final OrBranchingDeclarationContext orBranchingDeclaration() throws RecognitionException {
		OrBranchingDeclarationContext _localctx = new OrBranchingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orBranchingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(171);
				match(LPAREN);
				setState(172);
				automatonDeclaration();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(173);
					match(OR);
					setState(174);
					automatonDeclaration();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(RPAREN);
				}
				break;
			case IgnoreMatcher:
			case LBRACK:
			case Identifier:
			case Regex:
				{
				setState(182);
				matcherDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURL) | (1L << QUESTION) | (1L << MUL) | (1L << PLUS))) != 0)) {
				{
				setState(185);
				quantifierDeclaration();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeatureMatcherDeclarationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public OrexpressionContext orexpression() {
			return getRuleContext(OrexpressionContext.class,0);
		}
		public FeatureMatcherDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureMatcherDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterFeatureMatcherDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitFeatureMatcherDeclaration(this);
		}
	}

	public final FeatureMatcherDeclarationContext featureMatcherDeclaration() throws RecognitionException {
		FeatureMatcherDeclarationContext _localctx = new FeatureMatcherDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_featureMatcherDeclaration);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(LBRACK);
				setState(189);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(LBRACK);
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(191);
					expression();
					}
					break;
				case 2:
					{
					setState(192);
					andexpression();
					}
					break;
				case 3:
					{
					setState(193);
					orexpression();
					}
					break;
				}
				setState(196);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndexpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(UimaTokenRegexParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(UimaTokenRegexParser.AND, i);
		}
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterAndexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitAndexpression(this);
		}
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_andexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			expression();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(201);
				match(AND);
				setState(202);
				expression();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrexpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(UimaTokenRegexParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(UimaTokenRegexParser.OR, i);
		}
		public OrexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterOrexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitOrexpression(this);
		}
	}

	public final OrexpressionContext orexpression() throws RecognitionException {
		OrexpressionContext _localctx = new OrexpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			expression();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(209);
				match(OR);
				setState(210);
				expression();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AtomicExpressionContext atomicExpression() {
			return getRuleContext(AtomicExpressionContext.class,0);
		}
		public OrexpressionContext orexpression() {
			return getRuleContext(OrexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				atomicExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(LPAREN);
				setState(218);
				orexpression();
				setState(219);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(LPAREN);
				setState(222);
				andexpression();
				setState(223);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public FeatureNameContext featureName() {
			return getRuleContext(FeatureNameContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayOperatorContext arrayOperator() {
			return getRuleContext(ArrayOperatorContext.class,0);
		}
		public LiteralArrayContext literalArray() {
			return getRuleContext(LiteralArrayContext.class,0);
		}
		public InListOperatorContext inListOperator() {
			return getRuleContext(InListOperatorContext.class,0);
		}
		public ResourceIdentifierContext resourceIdentifier() {
			return getRuleContext(ResourceIdentifierContext.class,0);
		}
		public CoveredTextIgnoreCaseContext coveredTextIgnoreCase() {
			return getRuleContext(CoveredTextIgnoreCaseContext.class,0);
		}
		public CoveredTextExactlyContext coveredTextExactly() {
			return getRuleContext(CoveredTextExactlyContext.class,0);
		}
		public CoveredTextArrayContext coveredTextArray() {
			return getRuleContext(CoveredTextArrayContext.class,0);
		}
		public AtomicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterAtomicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitAtomicExpression(this);
		}
	}

	public final AtomicExpressionContext atomicExpression() throws RecognitionException {
		AtomicExpressionContext _localctx = new AtomicExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atomicExpression);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				featureName();
				setState(229);
				operator();
				setState(230);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				featureName();
				setState(233);
				arrayOperator();
				setState(234);
				literalArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				featureName();
				setState(237);
				inListOperator();
				setState(238);
				resourceIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				match(T__2);
				setState(241);
				match(EQUAL);
				setState(242);
				coveredTextIgnoreCase();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				match(T__2);
				setState(244);
				match(T__3);
				setState(245);
				coveredTextExactly();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				match(T__2);
				setState(247);
				inListOperator();
				setState(248);
				coveredTextArray();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public ResourceIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterResourceIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitResourceIdentifier(this);
		}
	}

	public final ResourceIdentifierContext resourceIdentifier() throws RecognitionException {
		ResourceIdentifierContext _localctx = new ResourceIdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_resourceIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalListDeclarationContext extends ParserRuleContext {
		public TerminalNode RESOURCE() { return getToken(UimaTokenRegexParser.RESOURCE, 0); }
		public ResourceIdentifierContext resourceIdentifier() {
			return getRuleContext(ResourceIdentifierContext.class,0);
		}
		public SimpleListDefinitionContext simpleListDefinition() {
			return getRuleContext(SimpleListDefinitionContext.class,0);
		}
		public CsvListDefinitionContext csvListDefinition() {
			return getRuleContext(CsvListDefinitionContext.class,0);
		}
		public TsvListDefinitionContext tsvListDefinition() {
			return getRuleContext(TsvListDefinitionContext.class,0);
		}
		public JsonListDefinitionContext jsonListDefinition() {
			return getRuleContext(JsonListDefinitionContext.class,0);
		}
		public YamlListDefinitionContext yamlListDefinition() {
			return getRuleContext(YamlListDefinitionContext.class,0);
		}
		public ExternalListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalListDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterExternalListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitExternalListDeclaration(this);
		}
	}

	public final ExternalListDeclarationContext externalListDeclaration() throws RecognitionException {
		ExternalListDeclarationContext _localctx = new ExternalListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_externalListDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(RESOURCE);
			setState(255);
			resourceIdentifier();
			setState(256);
			match(COLON);
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(257);
				simpleListDefinition();
				}
				break;
			case T__8:
				{
				setState(258);
				csvListDefinition();
				}
				break;
			case T__9:
				{
				setState(259);
				tsvListDefinition();
				}
				break;
			case T__7:
				{
				setState(260);
				jsonListDefinition();
				}
				break;
			case T__5:
				{
				setState(261);
				yamlListDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(264);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleListDefinitionContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public SimpleListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleListDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterSimpleListDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitSimpleListDefinition(this);
		}
	}

	public final SimpleListDefinitionContext simpleListDefinition() throws RecognitionException {
		SimpleListDefinitionContext _localctx = new SimpleListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_simpleListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__4);
			setState(267);
			match(LPAREN);
			setState(268);
			path();
			setState(269);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(UimaTokenRegexParser.StringLiteral, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YamlListDefinitionContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public KeypathContext keypath() {
			return getRuleContext(KeypathContext.class,0);
		}
		public YamlListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yamlListDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterYamlListDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitYamlListDefinition(this);
		}
	}

	public final YamlListDefinitionContext yamlListDefinition() throws RecognitionException {
		YamlListDefinitionContext _localctx = new YamlListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_yamlListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__5);
			setState(274);
			match(LPAREN);
			setState(275);
			path();
			setState(276);
			match(T__6);
			setState(277);
			keypath();
			setState(278);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonListDefinitionContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public KeypathContext keypath() {
			return getRuleContext(KeypathContext.class,0);
		}
		public JsonListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonListDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterJsonListDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitJsonListDefinition(this);
		}
	}

	public final JsonListDefinitionContext jsonListDefinition() throws RecognitionException {
		JsonListDefinitionContext _localctx = new JsonListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jsonListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__7);
			setState(281);
			match(LPAREN);
			setState(282);
			path();
			setState(283);
			match(T__6);
			setState(284);
			keypath();
			setState(285);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CsvListDefinitionContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(UimaTokenRegexParser.IntegerLiteral, 0); }
		public CsvListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csvListDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterCsvListDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitCsvListDefinition(this);
		}
	}

	public final CsvListDefinitionContext csvListDefinition() throws RecognitionException {
		CsvListDefinitionContext _localctx = new CsvListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_csvListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__8);
			setState(288);
			match(LPAREN);
			setState(289);
			path();
			setState(290);
			match(T__6);
			setState(291);
			separator();
			setState(292);
			match(T__6);
			setState(293);
			quote();
			setState(294);
			match(T__6);
			setState(295);
			match(IntegerLiteral);
			setState(296);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TsvListDefinitionContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(UimaTokenRegexParser.IntegerLiteral, 0); }
		public TsvListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsvListDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterTsvListDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitTsvListDefinition(this);
		}
	}

	public final TsvListDefinitionContext tsvListDefinition() throws RecognitionException {
		TsvListDefinitionContext _localctx = new TsvListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tsvListDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__9);
			setState(299);
			match(LPAREN);
			setState(300);
			path();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(301);
				match(T__6);
				setState(302);
				match(IntegerLiteral);
				}
			}

			setState(305);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuoteContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(UimaTokenRegexParser.StringLiteral, 0); }
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitQuote(this);
		}
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeparatorContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(UimaTokenRegexParser.StringLiteral, 0); }
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitSeparator(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeypathContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(UimaTokenRegexParser.StringLiteral, 0); }
		public KeypathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keypath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterKeypath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitKeypath(this);
		}
	}

	public final KeypathContext keypath() throws RecognitionException {
		KeypathContext _localctx = new KeypathContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_keypath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifierDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IntegerLiteral() { return getTokens(UimaTokenRegexParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(UimaTokenRegexParser.IntegerLiteral, i);
		}
		public QuantifierDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifierDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterQuantifierDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitQuantifierDeclaration(this);
		}
	}

	public final QuantifierDeclarationContext quantifierDeclaration() throws RecognitionException {
		QuantifierDeclarationContext _localctx = new QuantifierDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_quantifierDeclaration);
		int _la;
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(LCURL);
				setState(314);
				match(IntegerLiteral);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(315);
					match(T__6);
					setState(316);
					match(IntegerLiteral);
					}
				}

				setState(319);
				match(RCURL);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(MUL);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(QUESTION);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(PLUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeatureNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public FeatureNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterFeatureName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitFeatureName(this);
		}
	}

	public final FeatureNameContext featureName() throws RecognitionException {
		FeatureNameContext _localctx = new FeatureNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_featureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayOperatorContext extends ParserRuleContext {
		public ArrayOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterArrayOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitArrayOperator(this);
		}
	}

	public final ArrayOperatorContext arrayOperator() throws RecognitionException {
		ArrayOperatorContext _localctx = new ArrayOperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InListOperatorContext extends ParserRuleContext {
		public ArrayOperatorContext arrayOperator() {
			return getRuleContext(ArrayOperatorContext.class,0);
		}
		public InListOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inListOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterInListOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitInListOperator(this);
		}
	}

	public final InListOperatorContext inListOperator() throws RecognitionException {
		InListOperatorContext _localctx = new InListOperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_inListOperator);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				arrayOperator();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoveredTextArrayContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(UimaTokenRegexParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(UimaTokenRegexParser.StringLiteral, i);
		}
		public CoveredTextArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coveredTextArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterCoveredTextArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitCoveredTextArray(this);
		}
	}

	public final CoveredTextArrayContext coveredTextArray() throws RecognitionException {
		CoveredTextArrayContext _localctx = new CoveredTextArrayContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_coveredTextArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(LBRACK);
			setState(337);
			match(StringLiteral);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(338);
				match(T__6);
				setState(339);
				match(StringLiteral);
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoveredTextIgnoreCaseContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(UimaTokenRegexParser.StringLiteral, 0); }
		public CoveredTextIgnoreCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coveredTextIgnoreCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterCoveredTextIgnoreCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitCoveredTextIgnoreCase(this);
		}
	}

	public final CoveredTextIgnoreCaseContext coveredTextIgnoreCase() throws RecognitionException {
		CoveredTextIgnoreCaseContext _localctx = new CoveredTextIgnoreCaseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_coveredTextIgnoreCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoveredTextExactlyContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(UimaTokenRegexParser.StringLiteral, 0); }
		public CoveredTextExactlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coveredTextExactly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterCoveredTextExactly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitCoveredTextExactly(this);
		}
	}

	public final CoveredTextExactlyContext coveredTextExactly() throws RecognitionException {
		CoveredTextExactlyContext _localctx = new CoveredTextExactlyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_coveredTextExactly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralArrayContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public LiteralArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterLiteralArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitLiteralArray(this);
		}
	}

	public final LiteralArrayContext literalArray() throws RecognitionException {
		LiteralArrayContext _localctx = new LiteralArrayContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literalArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(LBRACK);
			setState(352);
			literal();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(353);
				match(T__6);
				setState(354);
				literal();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(UimaTokenRegexParser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(UimaTokenRegexParser.IntegerLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(UimaTokenRegexParser.BooleanLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(UimaTokenRegexParser.FloatingPointLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << StringLiteral) | (1L << FloatingPointLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u016f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\7\2S\n\2\f\2"+
		"\16\2V\13\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\3\3\3\3\3\3\3\7\3b\n\3\f\3"+
		"\16\3e\13\3\3\3\7\3h\n\3\f\3\16\3k\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\5\5u\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\5\b\u0088\n\b\3\b\3\b\3\b\5\b\u008d\n\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\6\13\u009a\n\13\r\13\16\13\u009b\3\f\3\f\3\r"+
		"\5\r\u00a1\n\r\3\r\3\r\5\r\u00a5\n\r\3\r\3\r\5\r\u00a9\n\r\3\r\5\r\u00ac"+
		"\n\r\3\16\3\16\3\16\3\16\7\16\u00b2\n\16\f\16\16\16\u00b5\13\16\3\16\3"+
		"\16\3\16\5\16\u00ba\n\16\3\16\5\16\u00bd\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00c5\n\17\3\17\3\17\5\17\u00c9\n\17\3\20\3\20\3\20\7\20\u00ce"+
		"\n\20\f\20\16\20\u00d1\13\20\3\21\3\21\3\21\7\21\u00d6\n\21\f\21\16\21"+
		"\u00d9\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e4\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00fd\n\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0109\n\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u0132\n\33\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0140\n\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0146\n\37\3 \3 \3!\3!\3\"\3\"\3\"\5\"\u014f\n\""+
		"\3#\3#\3$\3$\3$\3$\7$\u0157\n$\f$\16$\u015a\13$\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3\'\3\'\7\'\u0166\n\'\f\'\16\'\u0169\13\'\3\'\3\'\3(\3(\3(\2\2)\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"N\2\5\4\2\r\r**\3\2$)\4\2\21\21\24\26\2\u0172\2P\3\2\2\2\4]\3\2\2\2\6"+
		"l\3\2\2\2\bp\3\2\2\2\nx\3\2\2\2\f}\3\2\2\2\16\u0083\3\2\2\2\20\u0090\3"+
		"\2\2\2\22\u0092\3\2\2\2\24\u0099\3\2\2\2\26\u009d\3\2\2\2\30\u00ab\3\2"+
		"\2\2\32\u00b9\3\2\2\2\34\u00c8\3\2\2\2\36\u00ca\3\2\2\2 \u00d2\3\2\2\2"+
		"\"\u00e3\3\2\2\2$\u00fc\3\2\2\2&\u00fe\3\2\2\2(\u0100\3\2\2\2*\u010c\3"+
		"\2\2\2,\u0111\3\2\2\2.\u0113\3\2\2\2\60\u011a\3\2\2\2\62\u0121\3\2\2\2"+
		"\64\u012c\3\2\2\2\66\u0135\3\2\2\28\u0137\3\2\2\2:\u0139\3\2\2\2<\u0145"+
		"\3\2\2\2>\u0147\3\2\2\2@\u0149\3\2\2\2B\u014e\3\2\2\2D\u0150\3\2\2\2F"+
		"\u0152\3\2\2\2H\u015d\3\2\2\2J\u015f\3\2\2\2L\u0161\3\2\2\2N\u016c\3\2"+
		"\2\2PT\5\4\3\2QS\5\16\b\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UZ\3"+
		"\2\2\2VT\3\2\2\2WY\5\22\n\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2["+
		"\3\3\2\2\2\\Z\3\2\2\2]^\5\6\4\2^c\5\b\5\2_b\5(\25\2`b\5\f\7\2a_\3\2\2"+
		"\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2di\3\2\2\2ec\3\2\2\2fh\5\n\6"+
		"\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\5\3\2\2\2ki\3\2\2\2lm\7+\2"+
		"\2mn\7\63\2\2no\7\35\2\2o\7\3\2\2\2pq\7,\2\2qt\7\63\2\2rs\7\3\2\2su\7"+
		"\64\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\35\2\2w\t\3\2\2\2xy\7.\2\2y"+
		"z\7\37\2\2z{\7\63\2\2{|\7\35\2\2|\13\3\2\2\2}~\7-\2\2~\177\7\63\2\2\177"+
		"\u0080\7\4\2\2\u0080\u0081\5N(\2\u0081\u0082\7\35\2\2\u0082\r\3\2\2\2"+
		"\u0083\u0084\7\61\2\2\u0084\u0087\7\63\2\2\u0085\u0086\7\3\2\2\u0086\u0088"+
		"\5\20\t\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\u008c\7\37\2\2\u008a\u008d\5\34\17\2\u008b\u008d\7\66\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\35"+
		"\2\2\u008f\17\3\2\2\2\u0090\u0091\7\63\2\2\u0091\21\3\2\2\2\u0092\u0093"+
		"\7\62\2\2\u0093\u0094\5\26\f\2\u0094\u0095\7\37\2\2\u0095\u0096\5\24\13"+
		"\2\u0096\u0097\7\35\2\2\u0097\23\3\2\2\2\u0098\u009a\5\32\16\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\25\3\2\2\2\u009d\u009e\7\25\2\2\u009e\27\3\2\2\2\u009f\u00a1\7\20\2\2"+
		"\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00ac"+
		"\7\66\2\2\u00a3\u00a5\7\20\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00ac\7\63\2\2\u00a7\u00a9\7\20\2\2\u00a8\u00a7"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\5\34\17\2"+
		"\u00ab\u00a0\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\31"+
		"\3\2\2\2\u00ad\u00ae\7\31\2\2\u00ae\u00b3\5\24\13\2\u00af\u00b0\7#\2\2"+
		"\u00b0\u00b2\5\24\13\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b7\7\32\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00ba\5\30\r\2\u00b9\u00ad\3"+
		"\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\5<\37\2\u00bc"+
		"\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\33\3\2\2\2\u00be\u00bf\7\33\2"+
		"\2\u00bf\u00c9\7\34\2\2\u00c0\u00c4\7\33\2\2\u00c1\u00c5\5\"\22\2\u00c2"+
		"\u00c5\5\36\20\2\u00c3\u00c5\5 \21\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3"+
		"\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\34\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00be\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c9\35\3\2\2"+
		"\2\u00ca\u00cf\5\"\22\2\u00cb\u00cc\7\"\2\2\u00cc\u00ce\5\"\22\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\37\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d7\5\"\22\2\u00d3\u00d4"+
		"\7#\2\2\u00d4\u00d6\5\"\22\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8!\3\2\2\2\u00d9\u00d7\3\2\2\2"+
		"\u00da\u00e4\5$\23\2\u00db\u00dc\7\31\2\2\u00dc\u00dd\5 \21\2\u00dd\u00de"+
		"\7\32\2\2\u00de\u00e4\3\2\2\2\u00df\u00e0\7\31\2\2\u00e0\u00e1\5\36\20"+
		"\2\u00e1\u00e2\7\32\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3"+
		"\u00db\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4#\3\2\2\2\u00e5\u00fd\7\63\2\2"+
		"\u00e6\u00e7\5> \2\u00e7\u00e8\5D#\2\u00e8\u00e9\5N(\2\u00e9\u00fd\3\2"+
		"\2\2\u00ea\u00eb\5> \2\u00eb\u00ec\5@!\2\u00ec\u00ed\5L\'\2\u00ed\u00fd"+
		"\3\2\2\2\u00ee\u00ef\5> \2\u00ef\u00f0\5B\"\2\u00f0\u00f1\5&\24\2\u00f1"+
		"\u00fd\3\2\2\2\u00f2\u00f3\7\5\2\2\u00f3\u00f4\7&\2\2\u00f4\u00fd\5H%"+
		"\2\u00f5\u00f6\7\5\2\2\u00f6\u00f7\7\6\2\2\u00f7\u00fd\5J&\2\u00f8\u00f9"+
		"\7\5\2\2\u00f9\u00fa\5B\"\2\u00fa\u00fb\5F$\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00e5\3\2\2\2\u00fc\u00e6\3\2\2\2\u00fc\u00ea\3\2\2\2\u00fc\u00ee\3\2"+
		"\2\2\u00fc\u00f2\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd"+
		"%\3\2\2\2\u00fe\u00ff\7\63\2\2\u00ff\'\3\2\2\2\u0100\u0101\7/\2\2\u0101"+
		"\u0102\5&\24\2\u0102\u0108\7\37\2\2\u0103\u0109\5*\26\2\u0104\u0109\5"+
		"\62\32\2\u0105\u0109\5\64\33\2\u0106\u0109\5\60\31\2\u0107\u0109\5.\30"+
		"\2\u0108\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\35\2\2"+
		"\u010b)\3\2\2\2\u010c\u010d\7\7\2\2\u010d\u010e\7\31\2\2\u010e\u010f\5"+
		",\27\2\u010f\u0110\7\32\2\2\u0110+\3\2\2\2\u0111\u0112\7\25\2\2\u0112"+
		"-\3\2\2\2\u0113\u0114\7\b\2\2\u0114\u0115\7\31\2\2\u0115\u0116\5,\27\2"+
		"\u0116\u0117\7\t\2\2\u0117\u0118\5:\36\2\u0118\u0119\7\32\2\2\u0119/\3"+
		"\2\2\2\u011a\u011b\7\n\2\2\u011b\u011c\7\31\2\2\u011c\u011d\5,\27\2\u011d"+
		"\u011e\7\t\2\2\u011e\u011f\5:\36\2\u011f\u0120\7\32\2\2\u0120\61\3\2\2"+
		"\2\u0121\u0122\7\13\2\2\u0122\u0123\7\31\2\2\u0123\u0124\5,\27\2\u0124"+
		"\u0125\7\t\2\2\u0125\u0126\58\35\2\u0126\u0127\7\t\2\2\u0127\u0128\5\66"+
		"\34\2\u0128\u0129\7\t\2\2\u0129\u012a\7\21\2\2\u012a\u012b\7\32\2\2\u012b"+
		"\63\3\2\2\2\u012c\u012d\7\f\2\2\u012d\u012e\7\31\2\2\u012e\u0131\5,\27"+
		"\2\u012f\u0130\7\t\2\2\u0130\u0132\7\21\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7\32\2\2\u0134\65\3\2\2"+
		"\2\u0135\u0136\7\25\2\2\u0136\67\3\2\2\2\u0137\u0138\7\25\2\2\u01389\3"+
		"\2\2\2\u0139\u013a\7\25\2\2\u013a;\3\2\2\2\u013b\u013c\7\27\2\2\u013c"+
		"\u013f\7\21\2\2\u013d\u013e\7\t\2\2\u013e\u0140\7\21\2\2\u013f\u013d\3"+
		"\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0146\7\30\2\2\u0142"+
		"\u0146\7 \2\2\u0143\u0146\7\36\2\2\u0144\u0146\7!\2\2\u0145\u013b\3\2"+
		"\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146"+
		"=\3\2\2\2\u0147\u0148\7\63\2\2\u0148?\3\2\2\2\u0149\u014a\t\2\2\2\u014a"+
		"A\3\2\2\2\u014b\u014f\5@!\2\u014c\u014f\7\16\2\2\u014d\u014f\7\17\2\2"+
		"\u014e\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014fC\3"+
		"\2\2\2\u0150\u0151\t\3\2\2\u0151E\3\2\2\2\u0152\u0153\7\33\2\2\u0153\u0158"+
		"\7\25\2\2\u0154\u0155\7\t\2\2\u0155\u0157\7\25\2\2\u0156\u0154\3\2\2\2"+
		"\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b"+
		"\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\34\2\2\u015cG\3\2\2\2\u015d"+
		"\u015e\7\25\2\2\u015eI\3\2\2\2\u015f\u0160\7\25\2\2\u0160K\3\2\2\2\u0161"+
		"\u0162\7\33\2\2\u0162\u0167\5N(\2\u0163\u0164\7\t\2\2\u0164\u0166\5N("+
		"\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7\34\2\2"+
		"\u016bM\3\2\2\2\u016c\u016d\t\4\2\2\u016dO\3\2\2\2\37TZacit\u0087\u008c"+
		"\u009b\u00a0\u00a4\u00a8\u00ab\u00b3\u00b9\u00bc\u00c4\u00c8\u00cf\u00d7"+
		"\u00e3\u00fc\u0108\u0131\u013f\u0145\u014e\u0158\u0167";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}