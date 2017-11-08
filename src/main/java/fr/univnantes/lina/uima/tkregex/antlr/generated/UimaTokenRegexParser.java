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
		T__9=10, T__10=11, T__11=12, IgnoreMatcher=13, IntegerLiteral=14, NonZeroDigit=15, 
		Digit=16, BooleanLiteral=17, StringLiteral=18, FloatingPointLiteral=19, 
		LCURL=20, RCURL=21, LPAREN=22, RPAREN=23, LBRACK=24, RBRACK=25, SEMI=26, 
		QUESTION=27, COLON=28, MUL=29, PLUS=30, AND=31, OR=32, GT=33, LT=34, EQUAL=35, 
		LE=36, GE=37, NOTEQUAL=38, IN=39, IMPORT=40, USE=41, SET=42, JAVA_MATCHER=43, 
		LINE_COMMENT=44, MATCHER=45, RULE=46, Identifier=47, IdentifierPart=48, 
		WS=49, Regex=50;
	public static final int
		RULE_ruleList = 0, RULE_headerBlock = 1, RULE_importDeclaration = 2, RULE_useDeclaration = 3, 
		RULE_javaMatcherDeclaration = 4, RULE_optionDeclaration = 5, RULE_shortcutMatcherDeclaration = 6, 
		RULE_labelIdentifier = 7, RULE_ruleDeclaration = 8, RULE_automatonDeclaration = 9, 
		RULE_ruleName = 10, RULE_matcherDeclaration = 11, RULE_orBranchingDeclaration = 12, 
		RULE_featureMatcherDeclaration = 13, RULE_andexpression = 14, RULE_orexpression = 15, 
		RULE_expression = 16, RULE_atomicExpression = 17, RULE_externalListDefinition = 18, 
		RULE_separator = 19, RULE_keypath = 20, RULE_quantifierDeclaration = 21, 
		RULE_featureName = 22, RULE_arrayOperator = 23, RULE_inListOperator = 24, 
		RULE_operator = 25, RULE_coveredTextArray = 26, RULE_coveredTextIgnoreCase = 27, 
		RULE_coveredTextExactly = 28, RULE_literalArray = 29, RULE_literal = 30;
	public static final String[] ruleNames = {
		"ruleList", "headerBlock", "importDeclaration", "useDeclaration", "javaMatcherDeclaration", 
		"optionDeclaration", "shortcutMatcherDeclaration", "labelIdentifier", 
		"ruleDeclaration", "automatonDeclaration", "ruleName", "matcherDeclaration", 
		"orBranchingDeclaration", "featureMatcherDeclaration", "andexpression", 
		"orexpression", "expression", "atomicExpression", "externalListDefinition", 
		"separator", "keypath", "quantifierDeclaration", "featureName", "arrayOperator", 
		"inListOperator", "operator", "coveredTextArray", "coveredTextIgnoreCase", 
		"coveredTextExactly", "literalArray", "literal"
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
			setState(62);
			headerBlock();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATCHER) {
				{
				{
				setState(63);
				shortcutMatcherDeclaration();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				ruleDeclaration();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RULE );
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
		public List<JavaMatcherDeclarationContext> javaMatcherDeclaration() {
			return getRuleContexts(JavaMatcherDeclarationContext.class);
		}
		public JavaMatcherDeclarationContext javaMatcherDeclaration(int i) {
			return getRuleContext(JavaMatcherDeclarationContext.class,i);
		}
		public List<OptionDeclarationContext> optionDeclaration() {
			return getRuleContexts(OptionDeclarationContext.class);
		}
		public OptionDeclarationContext optionDeclaration(int i) {
			return getRuleContext(OptionDeclarationContext.class,i);
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
			setState(74);
			importDeclaration();
			setState(75);
			useDeclaration();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAVA_MATCHER) {
				{
				{
				setState(76);
				javaMatcherDeclaration();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET) {
				{
				{
				setState(82);
				optionDeclaration();
				}
				}
				setState(87);
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
			setState(88);
			match(IMPORT);
			setState(89);
			match(Identifier);
			setState(90);
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
			setState(92);
			match(USE);
			setState(93);
			match(Identifier);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(94);
				match(T__0);
				setState(95);
				match(IdentifierPart);
				}
			}

			setState(98);
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
			setState(100);
			match(JAVA_MATCHER);
			setState(101);
			match(COLON);
			setState(102);
			match(Identifier);
			setState(103);
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
			setState(105);
			match(SET);
			setState(106);
			match(Identifier);
			setState(107);
			match(T__1);
			setState(108);
			literal();
			setState(109);
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
			setState(111);
			match(MATCHER);
			setState(112);
			match(Identifier);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(113);
				match(T__0);
				setState(114);
				labelIdentifier();
				}
			}

			setState(117);
			match(COLON);
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				setState(118);
				featureMatcherDeclaration();
				}
				break;
			case Regex:
				{
				setState(119);
				match(Regex);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
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
			setState(124);
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
			setState(126);
			match(RULE);
			setState(127);
			ruleName();
			setState(128);
			match(COLON);
			setState(129);
			automatonDeclaration();
			setState(130);
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
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				orBranchingDeclaration();
				}
				}
				setState(135); 
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
			setState(137);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(139);
					match(IgnoreMatcher);
					}
				}

				setState(142);
				match(Regex);
				}
				break;
			case 2:
				{
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(143);
					match(IgnoreMatcher);
					}
				}

				setState(146);
				match(Identifier);
				}
				break;
			case 3:
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(147);
					match(IgnoreMatcher);
					}
				}

				setState(150);
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
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(153);
				match(LPAREN);
				setState(154);
				automatonDeclaration();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(155);
					match(OR);
					setState(156);
					automatonDeclaration();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(RPAREN);
				}
				break;
			case IgnoreMatcher:
			case LBRACK:
			case Identifier:
			case Regex:
				{
				setState(164);
				matcherDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURL) | (1L << QUESTION) | (1L << MUL) | (1L << PLUS))) != 0)) {
				{
				setState(167);
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
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(LBRACK);
				setState(171);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(LBRACK);
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(173);
					expression();
					}
					break;
				case 2:
					{
					setState(174);
					andexpression();
					}
					break;
				case 3:
					{
					setState(175);
					orexpression();
					}
					break;
				}
				setState(178);
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
			setState(182);
			expression();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(183);
				match(AND);
				setState(184);
				expression();
				}
				}
				setState(189);
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
			setState(190);
			expression();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(191);
				match(OR);
				setState(192);
				expression();
				}
				}
				setState(197);
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
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				atomicExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(LPAREN);
				setState(200);
				orexpression();
				setState(201);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(LPAREN);
				setState(204);
				andexpression();
				setState(205);
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
		public ExternalListDefinitionContext externalListDefinition() {
			return getRuleContext(ExternalListDefinitionContext.class,0);
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				featureName();
				setState(211);
				operator();
				setState(212);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				featureName();
				setState(215);
				arrayOperator();
				setState(216);
				literalArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				featureName();
				setState(219);
				inListOperator();
				setState(220);
				externalListDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(T__2);
				setState(223);
				match(EQUAL);
				setState(224);
				coveredTextIgnoreCase();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				match(T__2);
				setState(226);
				match(T__3);
				setState(227);
				coveredTextExactly();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				match(T__2);
				setState(229);
				inListOperator();
				setState(230);
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

	public static class ExternalListDefinitionContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(UimaTokenRegexParser.StringLiteral, 0); }
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(UimaTokenRegexParser.IntegerLiteral, 0); }
		public KeypathContext keypath() {
			return getRuleContext(KeypathContext.class,0);
		}
		public ExternalListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalListDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterExternalListDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitExternalListDefinition(this);
		}
	}

	public final ExternalListDefinitionContext externalListDefinition() throws RecognitionException {
		ExternalListDefinitionContext _localctx = new ExternalListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_externalListDefinition);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(T__4);
				setState(235);
				match(LPAREN);
				setState(236);
				match(StringLiteral);
				setState(237);
				match(RPAREN);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__5);
				setState(239);
				match(LPAREN);
				setState(240);
				match(StringLiteral);
				setState(241);
				match(T__6);
				setState(242);
				separator();
				setState(243);
				match(T__6);
				setState(244);
				match(IntegerLiteral);
				setState(245);
				match(RPAREN);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(T__7);
				setState(248);
				match(LPAREN);
				setState(249);
				match(StringLiteral);
				setState(250);
				match(T__6);
				setState(251);
				keypath();
				setState(252);
				match(RPAREN);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				match(T__8);
				setState(255);
				match(LPAREN);
				setState(256);
				match(StringLiteral);
				setState(257);
				match(T__6);
				setState(258);
				keypath();
				setState(259);
				match(RPAREN);
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
		enterRule(_localctx, 38, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
		enterRule(_localctx, 40, RULE_keypath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		public TerminalNode IntegerLiteral() { return getToken(UimaTokenRegexParser.IntegerLiteral, 0); }
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
		enterRule(_localctx, 42, RULE_quantifierDeclaration);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(LCURL);
				setState(268);
				match(IntegerLiteral);
				setState(269);
				match(RCURL);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(MUL);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(QUESTION);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
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
		enterRule(_localctx, 44, RULE_featureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 46, RULE_arrayOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==IN) ) {
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
		enterRule(_localctx, 48, RULE_inListOperator);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				arrayOperator();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(T__11);
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
		enterRule(_localctx, 50, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
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
		enterRule(_localctx, 52, RULE_coveredTextArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LBRACK);
			setState(287);
			match(StringLiteral);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(288);
				match(T__6);
				setState(289);
				match(StringLiteral);
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
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
		enterRule(_localctx, 54, RULE_coveredTextIgnoreCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		enterRule(_localctx, 56, RULE_coveredTextExactly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		enterRule(_localctx, 58, RULE_literalArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(LBRACK);
			setState(302);
			literal();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(303);
				match(T__6);
				setState(304);
				literal();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
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
		enterRule(_localctx, 60, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u013d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\6\2I\n\2\r\2\16\2J\3\3\3\3\3\3\7\3P\n"+
		"\3\f\3\16\3S\13\3\3\3\7\3V\n\3\f\3\16\3Y\13\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\5\5c\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\5\bv\n\b\3\b\3\b\3\b\5\b{\n\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\6\13\u0088\n\13\r\13\16\13\u0089\3\f\3\f\3\r\5\r"+
		"\u008f\n\r\3\r\3\r\5\r\u0093\n\r\3\r\3\r\5\r\u0097\n\r\3\r\5\r\u009a\n"+
		"\r\3\16\3\16\3\16\3\16\7\16\u00a0\n\16\f\16\16\16\u00a3\13\16\3\16\3\16"+
		"\3\16\5\16\u00a8\n\16\3\16\5\16\u00ab\n\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00b3\n\17\3\17\3\17\5\17\u00b7\n\17\3\20\3\20\3\20\7\20\u00bc"+
		"\n\20\f\20\16\20\u00bf\13\20\3\21\3\21\3\21\7\21\u00c4\n\21\f\21\16\21"+
		"\u00c7\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d2\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00eb\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0108"+
		"\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0114\n\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\5\32\u011d\n\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\7\34\u0125\n\34\f\34\16\34\u0128\13\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u0134\n\37\f\37\16\37\u0137\13\37"+
		"\3\37\3\37\3 \3 \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>\2\5\4\2\f\f))\3\2#(\4\2\20\20\23\25\2\u0144\2@\3\2"+
		"\2\2\4L\3\2\2\2\6Z\3\2\2\2\b^\3\2\2\2\nf\3\2\2\2\fk\3\2\2\2\16q\3\2\2"+
		"\2\20~\3\2\2\2\22\u0080\3\2\2\2\24\u0087\3\2\2\2\26\u008b\3\2\2\2\30\u0099"+
		"\3\2\2\2\32\u00a7\3\2\2\2\34\u00b6\3\2\2\2\36\u00b8\3\2\2\2 \u00c0\3\2"+
		"\2\2\"\u00d1\3\2\2\2$\u00ea\3\2\2\2&\u0107\3\2\2\2(\u0109\3\2\2\2*\u010b"+
		"\3\2\2\2,\u0113\3\2\2\2.\u0115\3\2\2\2\60\u0117\3\2\2\2\62\u011c\3\2\2"+
		"\2\64\u011e\3\2\2\2\66\u0120\3\2\2\28\u012b\3\2\2\2:\u012d\3\2\2\2<\u012f"+
		"\3\2\2\2>\u013a\3\2\2\2@D\5\4\3\2AC\5\16\b\2BA\3\2\2\2CF\3\2\2\2DB\3\2"+
		"\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2GI\5\22\n\2HG\3\2\2\2IJ\3\2\2\2JH\3"+
		"\2\2\2JK\3\2\2\2K\3\3\2\2\2LM\5\6\4\2MQ\5\b\5\2NP\5\n\6\2ON\3\2\2\2PS"+
		"\3\2\2\2QO\3\2\2\2QR\3\2\2\2RW\3\2\2\2SQ\3\2\2\2TV\5\f\7\2UT\3\2\2\2V"+
		"Y\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\5\3\2\2\2YW\3\2\2\2Z[\7*\2\2[\\\7\61\2"+
		"\2\\]\7\34\2\2]\7\3\2\2\2^_\7+\2\2_b\7\61\2\2`a\7\3\2\2ac\7\62\2\2b`\3"+
		"\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\34\2\2e\t\3\2\2\2fg\7-\2\2gh\7\36\2\2h"+
		"i\7\61\2\2ij\7\34\2\2j\13\3\2\2\2kl\7,\2\2lm\7\61\2\2mn\7\4\2\2no\5> "+
		"\2op\7\34\2\2p\r\3\2\2\2qr\7/\2\2ru\7\61\2\2st\7\3\2\2tv\5\20\t\2us\3"+
		"\2\2\2uv\3\2\2\2vw\3\2\2\2wz\7\36\2\2x{\5\34\17\2y{\7\64\2\2zx\3\2\2\2"+
		"zy\3\2\2\2{|\3\2\2\2|}\7\34\2\2}\17\3\2\2\2~\177\7\61\2\2\177\21\3\2\2"+
		"\2\u0080\u0081\7\60\2\2\u0081\u0082\5\26\f\2\u0082\u0083\7\36\2\2\u0083"+
		"\u0084\5\24\13\2\u0084\u0085\7\34\2\2\u0085\23\3\2\2\2\u0086\u0088\5\32"+
		"\16\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\25\3\2\2\2\u008b\u008c\7\24\2\2\u008c\27\3\2\2\2"+
		"\u008d\u008f\7\17\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u009a\7\64\2\2\u0091\u0093\7\17\2\2\u0092\u0091\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009a\7\61\2\2\u0095\u0097"+
		"\7\17\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\u009a\5\34\17\2\u0099\u008e\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0096"+
		"\3\2\2\2\u009a\31\3\2\2\2\u009b\u009c\7\30\2\2\u009c\u00a1\5\24\13\2\u009d"+
		"\u009e\7\"\2\2\u009e\u00a0\5\24\13\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\31\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a8\5"+
		"\30\r\2\u00a7\u009b\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00ab\5,\27\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\33\3\2\2"+
		"\2\u00ac\u00ad\7\32\2\2\u00ad\u00b7\7\33\2\2\u00ae\u00b2\7\32\2\2\u00af"+
		"\u00b3\5\"\22\2\u00b0\u00b3\5\36\20\2\u00b1\u00b3\5 \21\2\u00b2\u00af"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\7\33\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b6\u00ae\3"+
		"\2\2\2\u00b7\35\3\2\2\2\u00b8\u00bd\5\"\22\2\u00b9\u00ba\7!\2\2\u00ba"+
		"\u00bc\5\"\22\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3"+
		"\2\2\2\u00bd\u00be\3\2\2\2\u00be\37\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c5\5\"\22\2\u00c1\u00c2\7\"\2\2\u00c2\u00c4\5\"\22\2\u00c3\u00c1\3"+
		"\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"!\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00d2\5$\23\2\u00c9\u00ca\7\30\2\2"+
		"\u00ca\u00cb\5 \21\2\u00cb\u00cc\7\31\2\2\u00cc\u00d2\3\2\2\2\u00cd\u00ce"+
		"\7\30\2\2\u00ce\u00cf\5\36\20\2\u00cf\u00d0\7\31\2\2\u00d0\u00d2\3\2\2"+
		"\2\u00d1\u00c8\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2#"+
		"\3\2\2\2\u00d3\u00eb\7\61\2\2\u00d4\u00d5\5.\30\2\u00d5\u00d6\5\64\33"+
		"\2\u00d6\u00d7\5> \2\u00d7\u00eb\3\2\2\2\u00d8\u00d9\5.\30\2\u00d9\u00da"+
		"\5\60\31\2\u00da\u00db\5<\37\2\u00db\u00eb\3\2\2\2\u00dc\u00dd\5.\30\2"+
		"\u00dd\u00de\5\62\32\2\u00de\u00df\5&\24\2\u00df\u00eb\3\2\2\2\u00e0\u00e1"+
		"\7\5\2\2\u00e1\u00e2\7%\2\2\u00e2\u00eb\58\35\2\u00e3\u00e4\7\5\2\2\u00e4"+
		"\u00e5\7\6\2\2\u00e5\u00eb\5:\36\2\u00e6\u00e7\7\5\2\2\u00e7\u00e8\5\62"+
		"\32\2\u00e8\u00e9\5\66\34\2\u00e9\u00eb\3\2\2\2\u00ea\u00d3\3\2\2\2\u00ea"+
		"\u00d4\3\2\2\2\u00ea\u00d8\3\2\2\2\u00ea\u00dc\3\2\2\2\u00ea\u00e0\3\2"+
		"\2\2\u00ea\u00e3\3\2\2\2\u00ea\u00e6\3\2\2\2\u00eb%\3\2\2\2\u00ec\u00ed"+
		"\7\7\2\2\u00ed\u00ee\7\30\2\2\u00ee\u00ef\7\24\2\2\u00ef\u0108\7\31\2"+
		"\2\u00f0\u00f1\7\b\2\2\u00f1\u00f2\7\30\2\2\u00f2\u00f3\7\24\2\2\u00f3"+
		"\u00f4\7\t\2\2\u00f4\u00f5\5(\25\2\u00f5\u00f6\7\t\2\2\u00f6\u00f7\7\20"+
		"\2\2\u00f7\u00f8\7\31\2\2\u00f8\u0108\3\2\2\2\u00f9\u00fa\7\n\2\2\u00fa"+
		"\u00fb\7\30\2\2\u00fb\u00fc\7\24\2\2\u00fc\u00fd\7\t\2\2\u00fd\u00fe\5"+
		"*\26\2\u00fe\u00ff\7\31\2\2\u00ff\u0108\3\2\2\2\u0100\u0101\7\13\2\2\u0101"+
		"\u0102\7\30\2\2\u0102\u0103\7\24\2\2\u0103\u0104\7\t\2\2\u0104\u0105\5"+
		"*\26\2\u0105\u0106\7\31\2\2\u0106\u0108\3\2\2\2\u0107\u00ec\3\2\2\2\u0107"+
		"\u00f0\3\2\2\2\u0107\u00f9\3\2\2\2\u0107\u0100\3\2\2\2\u0108\'\3\2\2\2"+
		"\u0109\u010a\7\24\2\2\u010a)\3\2\2\2\u010b\u010c\7\24\2\2\u010c+\3\2\2"+
		"\2\u010d\u010e\7\26\2\2\u010e\u010f\7\20\2\2\u010f\u0114\7\27\2\2\u0110"+
		"\u0114\7\37\2\2\u0111\u0114\7\35\2\2\u0112\u0114\7 \2\2\u0113\u010d\3"+
		"\2\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"-\3\2\2\2\u0115\u0116\7\61\2\2\u0116/\3\2\2\2\u0117\u0118\t\2\2\2\u0118"+
		"\61\3\2\2\2\u0119\u011d\5\60\31\2\u011a\u011d\7\r\2\2\u011b\u011d\7\16"+
		"\2\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\63\3\2\2\2\u011e\u011f\t\3\2\2\u011f\65\3\2\2\2\u0120\u0121\7\32\2\2"+
		"\u0121\u0126\7\24\2\2\u0122\u0123\7\t\2\2\u0123\u0125\7\24\2\2\u0124\u0122"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\33\2\2\u012a\67\3\2\2"+
		"\2\u012b\u012c\7\24\2\2\u012c9\3\2\2\2\u012d\u012e\7\24\2\2\u012e;\3\2"+
		"\2\2\u012f\u0130\7\32\2\2\u0130\u0135\5> \2\u0131\u0132\7\t\2\2\u0132"+
		"\u0134\5> \2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2"+
		"\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139"+
		"\7\33\2\2\u0139=\3\2\2\2\u013a\u013b\t\4\2\2\u013b?\3\2\2\2\34DJQWbuz"+
		"\u0089\u008e\u0092\u0096\u0099\u00a1\u00a7\u00aa\u00b2\u00b6\u00bd\u00c5"+
		"\u00d1\u00ea\u0107\u0113\u011c\u0126\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}