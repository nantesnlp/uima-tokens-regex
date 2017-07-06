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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IgnoreMatcher=6, IntegerLiteral=7, 
		NonZeroDigit=8, Digit=9, BooleanLiteral=10, StringLiteral=11, FloatingPointLiteral=12, 
		LCURL=13, RCURL=14, LPAREN=15, RPAREN=16, LBRACK=17, RBRACK=18, SEMI=19, 
		QUESTION=20, COLON=21, MUL=22, PLUS=23, AND=24, OR=25, GT=26, LT=27, EQUAL=28, 
		LE=29, GE=30, NOTEQUAL=31, IN=32, IMPORT=33, USE=34, SET=35, JAVA_MATCHER=36, 
		LINE_COMMENT=37, MATCHER=38, RULE=39, Identifier=40, IdentifierPart=41, 
		WS=42, Regex=43;
	public static final int
		RULE_ruleList = 0, RULE_headerBlock = 1, RULE_importDeclaration = 2, RULE_useDeclaration = 3, 
		RULE_javaMatcherDeclaration = 4, RULE_optionDeclaration = 5, RULE_shortcutMatcherDeclaration = 6, 
		RULE_labelIdentifier = 7, RULE_ruleDeclaration = 8, RULE_ruleName = 9, 
		RULE_matcherDeclaration = 10, RULE_orBranchingDeclaration = 11, RULE_featureMatcherDeclaration = 12, 
		RULE_andexpression = 13, RULE_orexpression = 14, RULE_expression = 15, 
		RULE_atomicExpression = 16, RULE_quantifierDeclaration = 17, RULE_featureName = 18, 
		RULE_operator = 19, RULE_coveredTextArray = 20, RULE_coveredTextIgnoreCase = 21, 
		RULE_coveredTextExactly = 22, RULE_literal = 23;
	public static final String[] ruleNames = {
		"ruleList", "headerBlock", "importDeclaration", "useDeclaration", "javaMatcherDeclaration", 
		"optionDeclaration", "shortcutMatcherDeclaration", "labelIdentifier", 
		"ruleDeclaration", "ruleName", "matcherDeclaration", "orBranchingDeclaration", 
		"featureMatcherDeclaration", "andexpression", "orexpression", "expression", 
		"atomicExpression", "quantifierDeclaration", "featureName", "operator", 
		"coveredTextArray", "coveredTextIgnoreCase", "coveredTextExactly", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'as'", "'='", "'text'", "'==='", "','", "'~'", null, null, null, 
		null, null, null, "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "'?'", 
		"':'", "'*'", "'+'", "'&'", "'|'", "'>'", "'<'", "'=='", "'<='", "'>='", 
		"'!='", "'in'", "'import'", "'use'", "'set'", "'java-matcher'", null, 
		"'matcher'", "'rule'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "IgnoreMatcher", "IntegerLiteral", 
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
			setState(48);
			headerBlock();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATCHER) {
				{
				{
				setState(49);
				shortcutMatcherDeclaration();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				ruleDeclaration();
				}
				}
				setState(58); 
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
			setState(60);
			importDeclaration();
			setState(61);
			useDeclaration();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAVA_MATCHER) {
				{
				{
				setState(62);
				javaMatcherDeclaration();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET) {
				{
				{
				setState(68);
				optionDeclaration();
				}
				}
				setState(73);
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
			setState(74);
			match(IMPORT);
			setState(75);
			match(Identifier);
			setState(76);
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
			setState(78);
			match(USE);
			setState(79);
			match(Identifier);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(80);
				match(T__0);
				setState(81);
				match(IdentifierPart);
				}
			}

			setState(84);
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
			setState(86);
			match(JAVA_MATCHER);
			setState(87);
			match(COLON);
			setState(88);
			match(Identifier);
			setState(89);
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
			setState(91);
			match(SET);
			setState(92);
			match(Identifier);
			setState(93);
			match(T__1);
			setState(94);
			literal();
			setState(95);
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
			setState(97);
			match(MATCHER);
			setState(98);
			match(Identifier);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(99);
				match(T__0);
				setState(100);
				labelIdentifier();
				}
			}

			setState(103);
			match(COLON);
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				setState(104);
				featureMatcherDeclaration();
				}
				break;
			case Regex:
				{
				setState(105);
				match(Regex);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
			setState(110);
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
		public List<OrBranchingDeclarationContext> orBranchingDeclaration() {
			return getRuleContexts(OrBranchingDeclarationContext.class);
		}
		public OrBranchingDeclarationContext orBranchingDeclaration(int i) {
			return getRuleContext(OrBranchingDeclarationContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(RULE);
			setState(113);
			ruleName();
			setState(114);
			match(COLON);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				orBranchingDeclaration();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IgnoreMatcher) | (1L << LPAREN) | (1L << LBRACK) | (1L << Identifier) | (1L << Regex))) != 0) );
			setState(120);
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
		enterRule(_localctx, 18, RULE_ruleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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
		enterRule(_localctx, 20, RULE_matcherDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(124);
					match(IgnoreMatcher);
					}
				}

				setState(127);
				match(Regex);
				}
				break;
			case 2:
				{
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(128);
					match(IgnoreMatcher);
					}
				}

				setState(131);
				match(Identifier);
				}
				break;
			case 3:
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(132);
					match(IgnoreMatcher);
					}
				}

				setState(135);
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
		public List<OrBranchingDeclarationContext> orBranchingDeclaration() {
			return getRuleContexts(OrBranchingDeclarationContext.class);
		}
		public OrBranchingDeclarationContext orBranchingDeclaration(int i) {
			return getRuleContext(OrBranchingDeclarationContext.class,i);
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
		enterRule(_localctx, 22, RULE_orBranchingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(138);
				match(LPAREN);
				setState(139);
				orBranchingDeclaration();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(140);
					match(OR);
					setState(141);
					orBranchingDeclaration();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(RPAREN);
				}
				break;
			case IgnoreMatcher:
			case LBRACK:
			case Identifier:
			case Regex:
				{
				setState(149);
				matcherDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURL) | (1L << QUESTION) | (1L << MUL) | (1L << PLUS))) != 0)) {
				{
				setState(152);
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
		enterRule(_localctx, 24, RULE_featureMatcherDeclaration);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(LBRACK);
				setState(156);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(LBRACK);
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(158);
					expression();
					}
					break;
				case 2:
					{
					setState(159);
					andexpression();
					}
					break;
				case 3:
					{
					setState(160);
					orexpression();
					}
					break;
				}
				setState(163);
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
		enterRule(_localctx, 26, RULE_andexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			expression();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(168);
				match(AND);
				setState(169);
				expression();
				}
				}
				setState(174);
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
		enterRule(_localctx, 28, RULE_orexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			expression();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(176);
				match(OR);
				setState(177);
				expression();
				}
				}
				setState(182);
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
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				atomicExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(LPAREN);
				setState(185);
				orexpression();
				setState(186);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(LPAREN);
				setState(189);
				andexpression();
				setState(190);
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
		enterRule(_localctx, 32, RULE_atomicExpression);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				featureName();
				setState(196);
				operator();
				setState(197);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(T__2);
				setState(200);
				match(EQUAL);
				setState(201);
				coveredTextIgnoreCase();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(T__2);
				setState(203);
				match(T__3);
				setState(204);
				coveredTextExactly();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				match(T__2);
				setState(206);
				match(IN);
				setState(207);
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
		enterRule(_localctx, 34, RULE_quantifierDeclaration);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(LCURL);
				setState(211);
				match(IntegerLiteral);
				setState(212);
				match(RCURL);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(MUL);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(QUESTION);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
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
		enterRule(_localctx, 36, RULE_featureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
		enterRule(_localctx, 38, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
		enterRule(_localctx, 40, RULE_coveredTextArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(LBRACK);
			setState(223);
			match(StringLiteral);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(224);
				match(T__4);
				setState(225);
				match(StringLiteral);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
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
		enterRule(_localctx, 42, RULE_coveredTextIgnoreCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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
		enterRule(_localctx, 44, RULE_coveredTextExactly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 46, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00f2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\6\2;\n\2\r\2\16\2<\3\3\3\3\3\3"+
		"\7\3B\n\3\f\3\16\3E\13\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\5\5U\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\5\bh\n\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\6\nw\n\n\r\n\16\nx\3\n\3\n\3\13\3\13\3\f\5\f\u0080\n\f"+
		"\3\f\3\f\5\f\u0084\n\f\3\f\3\f\5\f\u0088\n\f\3\f\5\f\u008b\n\f\3\r\3\r"+
		"\3\r\3\r\7\r\u0091\n\r\f\r\16\r\u0094\13\r\3\r\3\r\3\r\5\r\u0099\n\r\3"+
		"\r\5\r\u009c\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a4\n\16\3\16\3"+
		"\16\5\16\u00a8\n\16\3\17\3\17\3\17\7\17\u00ad\n\17\f\17\16\17\u00b0\13"+
		"\17\3\20\3\20\3\20\7\20\u00b5\n\20\f\20\16\20\u00b8\13\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c3\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d3\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00db\n\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\7\26\u00e5\n\26\f\26\16\26\u00e8\13\26\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\2\4\3\2\34!\4\2\t\t\f\16\2\u00f8\2\62\3\2\2\2\4>\3\2\2\2"+
		"\6L\3\2\2\2\bP\3\2\2\2\nX\3\2\2\2\f]\3\2\2\2\16c\3\2\2\2\20p\3\2\2\2\22"+
		"r\3\2\2\2\24|\3\2\2\2\26\u008a\3\2\2\2\30\u0098\3\2\2\2\32\u00a7\3\2\2"+
		"\2\34\u00a9\3\2\2\2\36\u00b1\3\2\2\2 \u00c2\3\2\2\2\"\u00d2\3\2\2\2$\u00da"+
		"\3\2\2\2&\u00dc\3\2\2\2(\u00de\3\2\2\2*\u00e0\3\2\2\2,\u00eb\3\2\2\2."+
		"\u00ed\3\2\2\2\60\u00ef\3\2\2\2\62\66\5\4\3\2\63\65\5\16\b\2\64\63\3\2"+
		"\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\28\66\3\2\2\29"+
		";\5\22\n\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\3\3\2\2\2>?\5\6\4"+
		"\2?C\5\b\5\2@B\5\n\6\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DI\3\2\2"+
		"\2EC\3\2\2\2FH\5\f\7\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\5\3\2"+
		"\2\2KI\3\2\2\2LM\7#\2\2MN\7*\2\2NO\7\25\2\2O\7\3\2\2\2PQ\7$\2\2QT\7*\2"+
		"\2RS\7\3\2\2SU\7+\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\25\2\2W\t\3\2"+
		"\2\2XY\7&\2\2YZ\7\27\2\2Z[\7*\2\2[\\\7\25\2\2\\\13\3\2\2\2]^\7%\2\2^_"+
		"\7*\2\2_`\7\4\2\2`a\5\60\31\2ab\7\25\2\2b\r\3\2\2\2cd\7(\2\2dg\7*\2\2"+
		"ef\7\3\2\2fh\5\20\t\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2il\7\27\2\2jm\5\32"+
		"\16\2km\7-\2\2lj\3\2\2\2lk\3\2\2\2mn\3\2\2\2no\7\25\2\2o\17\3\2\2\2pq"+
		"\7*\2\2q\21\3\2\2\2rs\7)\2\2st\5\24\13\2tv\7\27\2\2uw\5\30\r\2vu\3\2\2"+
		"\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\25\2\2{\23\3\2\2\2|}\7"+
		"\r\2\2}\25\3\2\2\2~\u0080\7\b\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u008b\7-\2\2\u0082\u0084\7\b\2\2\u0083\u0082\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008b\7*\2\2\u0086"+
		"\u0088\7\b\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008b\5\32\16\2\u008a\177\3\2\2\2\u008a\u0083\3\2\2\2\u008a"+
		"\u0087\3\2\2\2\u008b\27\3\2\2\2\u008c\u008d\7\21\2\2\u008d\u0092\5\30"+
		"\r\2\u008e\u008f\7\33\2\2\u008f\u0091\5\30\r\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\22\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0099\5\26\f\2\u0098\u008c\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009b\3"+
		"\2\2\2\u009a\u009c\5$\23\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\31\3\2\2\2\u009d\u009e\7\23\2\2\u009e\u00a8\7\24\2\2\u009f\u00a3\7\23"+
		"\2\2\u00a0\u00a4\5 \21\2\u00a1\u00a4\5\34\17\2\u00a2\u00a4\5\36\20\2\u00a3"+
		"\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00a8\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7"+
		"\u009f\3\2\2\2\u00a8\33\3\2\2\2\u00a9\u00ae\5 \21\2\u00aa\u00ab\7\32\2"+
		"\2\u00ab\u00ad\5 \21\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\35\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b6\5 \21\2\u00b2\u00b3\7\33\2\2\u00b3\u00b5\5 \21\2\u00b4\u00b2\3"+
		"\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\37\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00c3\5\"\22\2\u00ba\u00bb\7\21"+
		"\2\2\u00bb\u00bc\5\36\20\2\u00bc\u00bd\7\22\2\2\u00bd\u00c3\3\2\2\2\u00be"+
		"\u00bf\7\21\2\2\u00bf\u00c0\5\34\17\2\u00c0\u00c1\7\22\2\2\u00c1\u00c3"+
		"\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3"+
		"!\3\2\2\2\u00c4\u00d3\7*\2\2\u00c5\u00c6\5&\24\2\u00c6\u00c7\5(\25\2\u00c7"+
		"\u00c8\5\60\31\2\u00c8\u00d3\3\2\2\2\u00c9\u00ca\7\5\2\2\u00ca\u00cb\7"+
		"\36\2\2\u00cb\u00d3\5,\27\2\u00cc\u00cd\7\5\2\2\u00cd\u00ce\7\6\2\2\u00ce"+
		"\u00d3\5.\30\2\u00cf\u00d0\7\5\2\2\u00d0\u00d1\7\"\2\2\u00d1\u00d3\5*"+
		"\26\2\u00d2\u00c4\3\2\2\2\u00d2\u00c5\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2"+
		"\u00cc\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3#\3\2\2\2\u00d4\u00d5\7\17\2\2"+
		"\u00d5\u00d6\7\t\2\2\u00d6\u00db\7\20\2\2\u00d7\u00db\7\30\2\2\u00d8\u00db"+
		"\7\26\2\2\u00d9\u00db\7\31\2\2\u00da\u00d4\3\2\2\2\u00da\u00d7\3\2\2\2"+
		"\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db%\3\2\2\2\u00dc\u00dd\7"+
		"*\2\2\u00dd\'\3\2\2\2\u00de\u00df\t\2\2\2\u00df)\3\2\2\2\u00e0\u00e1\7"+
		"\23\2\2\u00e1\u00e6\7\r\2\2\u00e2\u00e3\7\7\2\2\u00e3\u00e5\7\r\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\24\2\2\u00ea"+
		"+\3\2\2\2\u00eb\u00ec\7\r\2\2\u00ec-\3\2\2\2\u00ed\u00ee\7\r\2\2\u00ee"+
		"/\3\2\2\2\u00ef\u00f0\t\3\2\2\u00f0\61\3\2\2\2\31\66<CITglx\177\u0083"+
		"\u0087\u008a\u0092\u0098\u009b\u00a3\u00a7\u00ae\u00b6\u00c2\u00d2\u00da"+
		"\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}