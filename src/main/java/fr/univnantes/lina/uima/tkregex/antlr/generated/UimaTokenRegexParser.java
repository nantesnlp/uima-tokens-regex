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
		RULE_labelIdentifier = 7, RULE_ruleDeclaration = 8, RULE_automatonDeclaration = 9, 
		RULE_ruleName = 10, RULE_matcherDeclaration = 11, RULE_orBranchingDeclaration = 12, 
		RULE_featureMatcherDeclaration = 13, RULE_andexpression = 14, RULE_orexpression = 15, 
		RULE_expression = 16, RULE_atomicExpression = 17, RULE_quantifierDeclaration = 18, 
		RULE_featureName = 19, RULE_operator = 20, RULE_coveredTextArray = 21, 
		RULE_coveredTextIgnoreCase = 22, RULE_coveredTextExactly = 23, RULE_literal = 24;
	public static final String[] ruleNames = {
		"ruleList", "headerBlock", "importDeclaration", "useDeclaration", "javaMatcherDeclaration", 
		"optionDeclaration", "shortcutMatcherDeclaration", "labelIdentifier", 
		"ruleDeclaration", "automatonDeclaration", "ruleName", "matcherDeclaration", 
		"orBranchingDeclaration", "featureMatcherDeclaration", "andexpression", 
		"orexpression", "expression", "atomicExpression", "quantifierDeclaration", 
		"featureName", "operator", "coveredTextArray", "coveredTextIgnoreCase", 
		"coveredTextExactly", "literal"
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
			setState(50);
			headerBlock();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATCHER) {
				{
				{
				setState(51);
				shortcutMatcherDeclaration();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				ruleDeclaration();
				}
				}
				setState(60); 
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
			setState(62);
			importDeclaration();
			setState(63);
			useDeclaration();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAVA_MATCHER) {
				{
				{
				setState(64);
				javaMatcherDeclaration();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET) {
				{
				{
				setState(70);
				optionDeclaration();
				}
				}
				setState(75);
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
			setState(76);
			match(IMPORT);
			setState(77);
			match(Identifier);
			setState(78);
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
			setState(80);
			match(USE);
			setState(81);
			match(Identifier);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(82);
				match(T__0);
				setState(83);
				match(IdentifierPart);
				}
			}

			setState(86);
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
			setState(88);
			match(JAVA_MATCHER);
			setState(89);
			match(COLON);
			setState(90);
			match(Identifier);
			setState(91);
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
			setState(93);
			match(SET);
			setState(94);
			match(Identifier);
			setState(95);
			match(T__1);
			setState(96);
			literal();
			setState(97);
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
			setState(99);
			match(MATCHER);
			setState(100);
			match(Identifier);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(101);
				match(T__0);
				setState(102);
				labelIdentifier();
				}
			}

			setState(105);
			match(COLON);
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				setState(106);
				featureMatcherDeclaration();
				}
				break;
			case Regex:
				{
				setState(107);
				match(Regex);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(110);
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
			setState(112);
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
			setState(114);
			match(RULE);
			setState(115);
			ruleName();
			setState(116);
			match(COLON);
			setState(117);
			automatonDeclaration();
			setState(118);
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
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				orBranchingDeclaration();
				}
				}
				setState(123); 
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
			setState(125);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(127);
					match(IgnoreMatcher);
					}
				}

				setState(130);
				match(Regex);
				}
				break;
			case 2:
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(131);
					match(IgnoreMatcher);
					}
				}

				setState(134);
				match(Identifier);
				}
				break;
			case 3:
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(135);
					match(IgnoreMatcher);
					}
				}

				setState(138);
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(141);
				match(LPAREN);
				setState(142);
				automatonDeclaration();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(143);
					match(OR);
					setState(144);
					automatonDeclaration();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(RPAREN);
				}
				break;
			case IgnoreMatcher:
			case LBRACK:
			case Identifier:
			case Regex:
				{
				setState(152);
				matcherDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURL) | (1L << QUESTION) | (1L << MUL) | (1L << PLUS))) != 0)) {
				{
				setState(155);
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(LBRACK);
				setState(159);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(LBRACK);
				setState(164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(161);
					expression();
					}
					break;
				case 2:
					{
					setState(162);
					andexpression();
					}
					break;
				case 3:
					{
					setState(163);
					orexpression();
					}
					break;
				}
				setState(166);
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
			setState(170);
			expression();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(171);
				match(AND);
				setState(172);
				expression();
				}
				}
				setState(177);
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
			setState(178);
			expression();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(179);
				match(OR);
				setState(180);
				expression();
				}
				}
				setState(185);
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				atomicExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(LPAREN);
				setState(188);
				orexpression();
				setState(189);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(LPAREN);
				setState(192);
				andexpression();
				setState(193);
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
		enterRule(_localctx, 34, RULE_atomicExpression);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				featureName();
				setState(199);
				operator();
				setState(200);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(T__2);
				setState(203);
				match(EQUAL);
				setState(204);
				coveredTextIgnoreCase();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(T__2);
				setState(206);
				match(T__3);
				setState(207);
				coveredTextExactly();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				match(T__2);
				setState(209);
				match(IN);
				setState(210);
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
		enterRule(_localctx, 36, RULE_quantifierDeclaration);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(LCURL);
				setState(214);
				match(IntegerLiteral);
				setState(215);
				match(RCURL);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(MUL);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(QUESTION);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
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
		enterRule(_localctx, 38, RULE_featureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		enterRule(_localctx, 40, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
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
		enterRule(_localctx, 42, RULE_coveredTextArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(LBRACK);
			setState(226);
			match(StringLiteral);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(227);
				match(T__4);
				setState(228);
				match(StringLiteral);
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
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
		enterRule(_localctx, 44, RULE_coveredTextIgnoreCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 46, RULE_coveredTextExactly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		enterRule(_localctx, 48, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\6\2=\n\2\r\2\16\2>\3"+
		"\3\3\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\5\5W\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bj\n\b\3\b\3\b\3\b\5\bo\n\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13|\n\13\r\13\16\13}\3\f\3\f\3"+
		"\r\5\r\u0083\n\r\3\r\3\r\5\r\u0087\n\r\3\r\3\r\5\r\u008b\n\r\3\r\5\r\u008e"+
		"\n\r\3\16\3\16\3\16\3\16\7\16\u0094\n\16\f\16\16\16\u0097\13\16\3\16\3"+
		"\16\3\16\5\16\u009c\n\16\3\16\5\16\u009f\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00a7\n\17\3\17\3\17\5\17\u00ab\n\17\3\20\3\20\3\20\7\20\u00b0"+
		"\n\20\f\20\16\20\u00b3\13\20\3\21\3\21\3\21\7\21\u00b8\n\21\f\21\16\21"+
		"\u00bb\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c6\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u00d6\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00de\n\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00e8\n\27\f\27\16\27\u00eb\13"+
		"\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\4\3\2\34!\4\2\t\t\f\16\2\u00fa"+
		"\2\64\3\2\2\2\4@\3\2\2\2\6N\3\2\2\2\bR\3\2\2\2\nZ\3\2\2\2\f_\3\2\2\2\16"+
		"e\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24{\3\2\2\2\26\177\3\2\2\2\30\u008d"+
		"\3\2\2\2\32\u009b\3\2\2\2\34\u00aa\3\2\2\2\36\u00ac\3\2\2\2 \u00b4\3\2"+
		"\2\2\"\u00c5\3\2\2\2$\u00d5\3\2\2\2&\u00dd\3\2\2\2(\u00df\3\2\2\2*\u00e1"+
		"\3\2\2\2,\u00e3\3\2\2\2.\u00ee\3\2\2\2\60\u00f0\3\2\2\2\62\u00f2\3\2\2"+
		"\2\648\5\4\3\2\65\67\5\16\b\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289"+
		"\3\2\2\29<\3\2\2\2:8\3\2\2\2;=\5\22\n\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2"+
		">?\3\2\2\2?\3\3\2\2\2@A\5\6\4\2AE\5\b\5\2BD\5\n\6\2CB\3\2\2\2DG\3\2\2"+
		"\2EC\3\2\2\2EF\3\2\2\2FK\3\2\2\2GE\3\2\2\2HJ\5\f\7\2IH\3\2\2\2JM\3\2\2"+
		"\2KI\3\2\2\2KL\3\2\2\2L\5\3\2\2\2MK\3\2\2\2NO\7#\2\2OP\7*\2\2PQ\7\25\2"+
		"\2Q\7\3\2\2\2RS\7$\2\2SV\7*\2\2TU\7\3\2\2UW\7+\2\2VT\3\2\2\2VW\3\2\2\2"+
		"WX\3\2\2\2XY\7\25\2\2Y\t\3\2\2\2Z[\7&\2\2[\\\7\27\2\2\\]\7*\2\2]^\7\25"+
		"\2\2^\13\3\2\2\2_`\7%\2\2`a\7*\2\2ab\7\4\2\2bc\5\62\32\2cd\7\25\2\2d\r"+
		"\3\2\2\2ef\7(\2\2fi\7*\2\2gh\7\3\2\2hj\5\20\t\2ig\3\2\2\2ij\3\2\2\2jk"+
		"\3\2\2\2kn\7\27\2\2lo\5\34\17\2mo\7-\2\2nl\3\2\2\2nm\3\2\2\2op\3\2\2\2"+
		"pq\7\25\2\2q\17\3\2\2\2rs\7*\2\2s\21\3\2\2\2tu\7)\2\2uv\5\26\f\2vw\7\27"+
		"\2\2wx\5\24\13\2xy\7\25\2\2y\23\3\2\2\2z|\5\32\16\2{z\3\2\2\2|}\3\2\2"+
		"\2}{\3\2\2\2}~\3\2\2\2~\25\3\2\2\2\177\u0080\7\r\2\2\u0080\27\3\2\2\2"+
		"\u0081\u0083\7\b\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u008e\7-\2\2\u0085\u0087\7\b\2\2\u0086\u0085\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008e\7*\2\2\u0089\u008b\7\b"+
		"\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\5\34\17\2\u008d\u0082\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u008a\3"+
		"\2\2\2\u008e\31\3\2\2\2\u008f\u0090\7\21\2\2\u0090\u0095\5\24\13\2\u0091"+
		"\u0092\7\33\2\2\u0092\u0094\5\24\13\2\u0093\u0091\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7\22\2\2\u0099\u009c\3\2\2\2\u009a\u009c\5"+
		"\30\r\2\u009b\u008f\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009f\5&\24\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\33\3\2\2"+
		"\2\u00a0\u00a1\7\23\2\2\u00a1\u00ab\7\24\2\2\u00a2\u00a6\7\23\2\2\u00a3"+
		"\u00a7\5\"\22\2\u00a4\u00a7\5\36\20\2\u00a5\u00a7\5 \21\2\u00a6\u00a3"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\7\24\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a0\3\2\2\2\u00aa\u00a2\3"+
		"\2\2\2\u00ab\35\3\2\2\2\u00ac\u00b1\5\"\22\2\u00ad\u00ae\7\32\2\2\u00ae"+
		"\u00b0\5\"\22\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\37\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b9\5\"\22\2\u00b5\u00b6\7\33\2\2\u00b6\u00b8\5\"\22\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"!\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c6\5$\23\2\u00bd\u00be\7\21\2\2"+
		"\u00be\u00bf\5 \21\2\u00bf\u00c0\7\22\2\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2"+
		"\7\21\2\2\u00c2\u00c3\5\36\20\2\u00c3\u00c4\7\22\2\2\u00c4\u00c6\3\2\2"+
		"\2\u00c5\u00bc\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6#"+
		"\3\2\2\2\u00c7\u00d6\7*\2\2\u00c8\u00c9\5(\25\2\u00c9\u00ca\5*\26\2\u00ca"+
		"\u00cb\5\62\32\2\u00cb\u00d6\3\2\2\2\u00cc\u00cd\7\5\2\2\u00cd\u00ce\7"+
		"\36\2\2\u00ce\u00d6\5.\30\2\u00cf\u00d0\7\5\2\2\u00d0\u00d1\7\6\2\2\u00d1"+
		"\u00d6\5\60\31\2\u00d2\u00d3\7\5\2\2\u00d3\u00d4\7\"\2\2\u00d4\u00d6\5"+
		",\27\2\u00d5\u00c7\3\2\2\2\u00d5\u00c8\3\2\2\2\u00d5\u00cc\3\2\2\2\u00d5"+
		"\u00cf\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6%\3\2\2\2\u00d7\u00d8\7\17\2\2"+
		"\u00d8\u00d9\7\t\2\2\u00d9\u00de\7\20\2\2\u00da\u00de\7\30\2\2\u00db\u00de"+
		"\7\26\2\2\u00dc\u00de\7\31\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00da\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\'\3\2\2\2\u00df\u00e0\7"+
		"*\2\2\u00e0)\3\2\2\2\u00e1\u00e2\t\2\2\2\u00e2+\3\2\2\2\u00e3\u00e4\7"+
		"\23\2\2\u00e4\u00e9\7\r\2\2\u00e5\u00e6\7\7\2\2\u00e6\u00e8\7\r\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7\24\2\2\u00ed"+
		"-\3\2\2\2\u00ee\u00ef\7\r\2\2\u00ef/\3\2\2\2\u00f0\u00f1\7\r\2\2\u00f1"+
		"\61\3\2\2\2\u00f2\u00f3\t\3\2\2\u00f3\63\3\2\2\2\318>EKVin}\u0082\u0086"+
		"\u008a\u008d\u0095\u009b\u009e\u00a6\u00aa\u00b1\u00b9\u00c5\u00d5\u00dd"+
		"\u00e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}