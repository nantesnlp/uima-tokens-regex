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
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				ruleDeclaration();
				}
				}
				setState(88); 
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
			setState(90);
			importDeclaration();
			setState(91);
			useDeclaration();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET || _la==RESOURCE) {
				{
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RESOURCE:
					{
					setState(92);
					externalListDeclaration();
					}
					break;
				case SET:
					{
					setState(93);
					optionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAVA_MATCHER) {
				{
				{
				setState(99);
				javaMatcherDeclaration();
				}
				}
				setState(104);
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
			setState(105);
			match(IMPORT);
			setState(106);
			match(Identifier);
			setState(107);
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
			setState(109);
			match(USE);
			setState(110);
			match(Identifier);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(111);
				match(T__0);
				setState(112);
				match(IdentifierPart);
				}
			}

			setState(115);
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
			setState(117);
			match(JAVA_MATCHER);
			setState(118);
			match(COLON);
			setState(119);
			match(Identifier);
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
			setState(122);
			match(SET);
			setState(123);
			match(Identifier);
			setState(124);
			match(T__1);
			setState(125);
			literal();
			setState(126);
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
			setState(128);
			match(MATCHER);
			setState(129);
			match(Identifier);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(130);
				match(T__0);
				setState(131);
				labelIdentifier();
				}
			}

			setState(134);
			match(COLON);
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				setState(135);
				featureMatcherDeclaration();
				}
				break;
			case Regex:
				{
				setState(136);
				match(Regex);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(139);
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
			setState(141);
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
			setState(143);
			match(RULE);
			setState(144);
			ruleName();
			setState(145);
			match(COLON);
			setState(146);
			automatonDeclaration();
			setState(147);
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
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				orBranchingDeclaration();
				}
				}
				setState(152); 
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
			setState(154);
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(156);
					match(IgnoreMatcher);
					}
				}

				setState(159);
				match(Regex);
				}
				break;
			case 2:
				{
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(160);
					match(IgnoreMatcher);
					}
				}

				setState(163);
				match(Identifier);
				}
				break;
			case 3:
				{
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(164);
					match(IgnoreMatcher);
					}
				}

				setState(167);
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
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(170);
				match(LPAREN);
				setState(171);
				automatonDeclaration();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(172);
					match(OR);
					setState(173);
					automatonDeclaration();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				match(RPAREN);
				}
				break;
			case IgnoreMatcher:
			case LBRACK:
			case Identifier:
			case Regex:
				{
				setState(181);
				matcherDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURL) | (1L << QUESTION) | (1L << MUL) | (1L << PLUS))) != 0)) {
				{
				setState(184);
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(LBRACK);
				setState(188);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(LBRACK);
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(190);
					expression();
					}
					break;
				case 2:
					{
					setState(191);
					andexpression();
					}
					break;
				case 3:
					{
					setState(192);
					orexpression();
					}
					break;
				}
				setState(195);
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
			setState(199);
			expression();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(200);
				match(AND);
				setState(201);
				expression();
				}
				}
				setState(206);
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
			setState(207);
			expression();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(208);
				match(OR);
				setState(209);
				expression();
				}
				}
				setState(214);
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
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				atomicExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(LPAREN);
				setState(217);
				orexpression();
				setState(218);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(LPAREN);
				setState(221);
				andexpression();
				setState(222);
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				featureName();
				setState(228);
				operator();
				setState(229);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				featureName();
				setState(232);
				arrayOperator();
				setState(233);
				literalArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				featureName();
				setState(236);
				inListOperator();
				setState(237);
				resourceIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				match(T__2);
				setState(240);
				match(EQUAL);
				setState(241);
				coveredTextIgnoreCase();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(T__2);
				setState(243);
				match(T__3);
				setState(244);
				coveredTextExactly();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				match(T__2);
				setState(246);
				inListOperator();
				setState(247);
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
			setState(251);
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
			setState(253);
			match(RESOURCE);
			setState(254);
			resourceIdentifier();
			setState(255);
			match(COLON);
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(256);
				simpleListDefinition();
				}
				break;
			case T__8:
				{
				setState(257);
				csvListDefinition();
				}
				break;
			case T__9:
				{
				setState(258);
				tsvListDefinition();
				}
				break;
			case T__7:
				{
				setState(259);
				jsonListDefinition();
				}
				break;
			case T__5:
				{
				setState(260);
				yamlListDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(263);
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
			setState(265);
			match(T__4);
			setState(266);
			match(LPAREN);
			setState(267);
			path();
			setState(268);
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
			setState(270);
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
			setState(272);
			match(T__5);
			setState(273);
			match(LPAREN);
			setState(274);
			path();
			setState(275);
			match(T__6);
			setState(276);
			keypath();
			setState(277);
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
			setState(279);
			match(T__7);
			setState(280);
			match(LPAREN);
			setState(281);
			path();
			setState(282);
			match(T__6);
			setState(283);
			keypath();
			setState(284);
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
			setState(286);
			match(T__8);
			setState(287);
			match(LPAREN);
			setState(288);
			path();
			setState(289);
			match(T__6);
			setState(290);
			separator();
			setState(291);
			match(T__6);
			setState(292);
			quote();
			setState(293);
			match(T__6);
			setState(294);
			match(IntegerLiteral);
			setState(295);
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
			setState(297);
			match(T__9);
			setState(298);
			match(LPAREN);
			setState(299);
			path();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(300);
				match(T__6);
				setState(301);
				match(IntegerLiteral);
				}
			}

			setState(304);
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
			setState(306);
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
			setState(308);
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
			setState(310);
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
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(LCURL);
				setState(313);
				match(IntegerLiteral);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(314);
					match(T__6);
					setState(315);
					match(IntegerLiteral);
					}
				}

				setState(318);
				match(RCURL);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(MUL);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				match(QUESTION);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
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
			setState(324);
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
			setState(326);
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
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				arrayOperator();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
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
			setState(333);
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
			setState(335);
			match(LBRACK);
			setState(336);
			match(StringLiteral);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(337);
				match(T__6);
				setState(338);
				match(StringLiteral);
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
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
			setState(346);
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
			setState(348);
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
			setState(350);
			match(LBRACK);
			setState(351);
			literal();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(352);
				match(T__6);
				setState(353);
				literal();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
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
			setState(361);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u016e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\7\2S\n\2\f\2"+
		"\16\2V\13\2\3\2\6\2Y\n\2\r\2\16\2Z\3\3\3\3\3\3\3\3\7\3a\n\3\f\3\16\3d"+
		"\13\3\3\3\7\3g\n\3\f\3\16\3j\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5"+
		"t\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\5\b\u0087\n\b\3\b\3\b\3\b\5\b\u008c\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\6\13\u0099\n\13\r\13\16\13\u009a\3\f\3\f\3\r\5\r\u00a0"+
		"\n\r\3\r\3\r\5\r\u00a4\n\r\3\r\3\r\5\r\u00a8\n\r\3\r\5\r\u00ab\n\r\3\16"+
		"\3\16\3\16\3\16\7\16\u00b1\n\16\f\16\16\16\u00b4\13\16\3\16\3\16\3\16"+
		"\5\16\u00b9\n\16\3\16\5\16\u00bc\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00c4\n\17\3\17\3\17\5\17\u00c8\n\17\3\20\3\20\3\20\7\20\u00cd\n\20"+
		"\f\20\16\20\u00d0\13\20\3\21\3\21\3\21\7\21\u00d5\n\21\f\21\16\21\u00d8"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e3\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00fc\n\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0108\n\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u0131\n\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u013f\n\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0145\n\37\3 \3 \3!\3!\3\"\3\"\3\"\5\"\u014e\n\"\3#\3"+
		"#\3$\3$\3$\3$\7$\u0156\n$\f$\16$\u0159\13$\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"\'\3\'\7\'\u0165\n\'\f\'\16\'\u0168\13\'\3\'\3\'\3(\3(\3(\2\2)\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\5\4"+
		"\2\r\r**\3\2$)\4\2\21\21\24\26\2\u0171\2P\3\2\2\2\4\\\3\2\2\2\6k\3\2\2"+
		"\2\bo\3\2\2\2\nw\3\2\2\2\f|\3\2\2\2\16\u0082\3\2\2\2\20\u008f\3\2\2\2"+
		"\22\u0091\3\2\2\2\24\u0098\3\2\2\2\26\u009c\3\2\2\2\30\u00aa\3\2\2\2\32"+
		"\u00b8\3\2\2\2\34\u00c7\3\2\2\2\36\u00c9\3\2\2\2 \u00d1\3\2\2\2\"\u00e2"+
		"\3\2\2\2$\u00fb\3\2\2\2&\u00fd\3\2\2\2(\u00ff\3\2\2\2*\u010b\3\2\2\2,"+
		"\u0110\3\2\2\2.\u0112\3\2\2\2\60\u0119\3\2\2\2\62\u0120\3\2\2\2\64\u012b"+
		"\3\2\2\2\66\u0134\3\2\2\28\u0136\3\2\2\2:\u0138\3\2\2\2<\u0144\3\2\2\2"+
		">\u0146\3\2\2\2@\u0148\3\2\2\2B\u014d\3\2\2\2D\u014f\3\2\2\2F\u0151\3"+
		"\2\2\2H\u015c\3\2\2\2J\u015e\3\2\2\2L\u0160\3\2\2\2N\u016b\3\2\2\2PT\5"+
		"\4\3\2QS\5\16\b\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT"+
		"\3\2\2\2WY\5\22\n\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\3\3\2\2\2"+
		"\\]\5\6\4\2]b\5\b\5\2^a\5(\25\2_a\5\f\7\2`^\3\2\2\2`_\3\2\2\2ad\3\2\2"+
		"\2b`\3\2\2\2bc\3\2\2\2ch\3\2\2\2db\3\2\2\2eg\5\n\6\2fe\3\2\2\2gj\3\2\2"+
		"\2hf\3\2\2\2hi\3\2\2\2i\5\3\2\2\2jh\3\2\2\2kl\7+\2\2lm\7\63\2\2mn\7\35"+
		"\2\2n\7\3\2\2\2op\7,\2\2ps\7\63\2\2qr\7\3\2\2rt\7\64\2\2sq\3\2\2\2st\3"+
		"\2\2\2tu\3\2\2\2uv\7\35\2\2v\t\3\2\2\2wx\7.\2\2xy\7\37\2\2yz\7\63\2\2"+
		"z{\7\35\2\2{\13\3\2\2\2|}\7-\2\2}~\7\63\2\2~\177\7\4\2\2\177\u0080\5N"+
		"(\2\u0080\u0081\7\35\2\2\u0081\r\3\2\2\2\u0082\u0083\7\61\2\2\u0083\u0086"+
		"\7\63\2\2\u0084\u0085\7\3\2\2\u0085\u0087\5\20\t\2\u0086\u0084\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\7\37\2\2\u0089\u008c"+
		"\5\34\17\2\u008a\u008c\7\66\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2"+
		"\2\u008c\u008d\3\2\2\2\u008d\u008e\7\35\2\2\u008e\17\3\2\2\2\u008f\u0090"+
		"\7\63\2\2\u0090\21\3\2\2\2\u0091\u0092\7\62\2\2\u0092\u0093\5\26\f\2\u0093"+
		"\u0094\7\37\2\2\u0094\u0095\5\24\13\2\u0095\u0096\7\35\2\2\u0096\23\3"+
		"\2\2\2\u0097\u0099\5\32\16\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\25\3\2\2\2\u009c\u009d\7\25\2"+
		"\2\u009d\27\3\2\2\2\u009e\u00a0\7\20\2\2\u009f\u009e\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00ab\7\66\2\2\u00a2\u00a4\7\20\2\2"+
		"\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ab"+
		"\7\63\2\2\u00a6\u00a8\7\20\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00ab\5\34\17\2\u00aa\u009f\3\2\2\2\u00aa\u00a3"+
		"\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\31\3\2\2\2\u00ac\u00ad\7\31\2\2\u00ad"+
		"\u00b2\5\24\13\2\u00ae\u00af\7#\2\2\u00af\u00b1\5\24\13\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\32\2\2\u00b6\u00b9\3"+
		"\2\2\2\u00b7\u00b9\5\30\r\2\u00b8\u00ac\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00bc\5<\37\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\33\3\2\2\2\u00bd\u00be\7\33\2\2\u00be\u00c8\7\34\2\2\u00bf"+
		"\u00c3\7\33\2\2\u00c0\u00c4\5\"\22\2\u00c1\u00c4\5\36\20\2\u00c2\u00c4"+
		"\5 \21\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\7\34\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00bd\3"+
		"\2\2\2\u00c7\u00bf\3\2\2\2\u00c8\35\3\2\2\2\u00c9\u00ce\5\"\22\2\u00ca"+
		"\u00cb\7\"\2\2\u00cb\u00cd\5\"\22\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3"+
		"\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\37\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d6\5\"\22\2\u00d2\u00d3\7#\2\2\u00d3\u00d5\5\""+
		"\22\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00e3\5$\23\2"+
		"\u00da\u00db\7\31\2\2\u00db\u00dc\5 \21\2\u00dc\u00dd\7\32\2\2\u00dd\u00e3"+
		"\3\2\2\2\u00de\u00df\7\31\2\2\u00df\u00e0\5\36\20\2\u00e0\u00e1\7\32\2"+
		"\2\u00e1\u00e3\3\2\2\2\u00e2\u00d9\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2\u00de"+
		"\3\2\2\2\u00e3#\3\2\2\2\u00e4\u00fc\7\63\2\2\u00e5\u00e6\5> \2\u00e6\u00e7"+
		"\5D#\2\u00e7\u00e8\5N(\2\u00e8\u00fc\3\2\2\2\u00e9\u00ea\5> \2\u00ea\u00eb"+
		"\5@!\2\u00eb\u00ec\5L\'\2\u00ec\u00fc\3\2\2\2\u00ed\u00ee\5> \2\u00ee"+
		"\u00ef\5B\"\2\u00ef\u00f0\5&\24\2\u00f0\u00fc\3\2\2\2\u00f1\u00f2\7\5"+
		"\2\2\u00f2\u00f3\7&\2\2\u00f3\u00fc\5H%\2\u00f4\u00f5\7\5\2\2\u00f5\u00f6"+
		"\7\6\2\2\u00f6\u00fc\5J&\2\u00f7\u00f8\7\5\2\2\u00f8\u00f9\5B\"\2\u00f9"+
		"\u00fa\5F$\2\u00fa\u00fc\3\2\2\2\u00fb\u00e4\3\2\2\2\u00fb\u00e5\3\2\2"+
		"\2\u00fb\u00e9\3\2\2\2\u00fb\u00ed\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb\u00f4"+
		"\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc%\3\2\2\2\u00fd\u00fe\7\63\2\2\u00fe"+
		"\'\3\2\2\2\u00ff\u0100\7/\2\2\u0100\u0101\5&\24\2\u0101\u0107\7\37\2\2"+
		"\u0102\u0108\5*\26\2\u0103\u0108\5\62\32\2\u0104\u0108\5\64\33\2\u0105"+
		"\u0108\5\60\31\2\u0106\u0108\5.\30\2\u0107\u0102\3\2\2\2\u0107\u0103\3"+
		"\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\7\35\2\2\u010a)\3\2\2\2\u010b\u010c\7\7\2\2"+
		"\u010c\u010d\7\31\2\2\u010d\u010e\5,\27\2\u010e\u010f\7\32\2\2\u010f+"+
		"\3\2\2\2\u0110\u0111\7\25\2\2\u0111-\3\2\2\2\u0112\u0113\7\b\2\2\u0113"+
		"\u0114\7\31\2\2\u0114\u0115\5,\27\2\u0115\u0116\7\t\2\2\u0116\u0117\5"+
		":\36\2\u0117\u0118\7\32\2\2\u0118/\3\2\2\2\u0119\u011a\7\n\2\2\u011a\u011b"+
		"\7\31\2\2\u011b\u011c\5,\27\2\u011c\u011d\7\t\2\2\u011d\u011e\5:\36\2"+
		"\u011e\u011f\7\32\2\2\u011f\61\3\2\2\2\u0120\u0121\7\13\2\2\u0121\u0122"+
		"\7\31\2\2\u0122\u0123\5,\27\2\u0123\u0124\7\t\2\2\u0124\u0125\58\35\2"+
		"\u0125\u0126\7\t\2\2\u0126\u0127\5\66\34\2\u0127\u0128\7\t\2\2\u0128\u0129"+
		"\7\21\2\2\u0129\u012a\7\32\2\2\u012a\63\3\2\2\2\u012b\u012c\7\f\2\2\u012c"+
		"\u012d\7\31\2\2\u012d\u0130\5,\27\2\u012e\u012f\7\t\2\2\u012f\u0131\7"+
		"\21\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\7\32\2\2\u0133\65\3\2\2\2\u0134\u0135\7\25\2\2\u0135\67\3\2\2\2"+
		"\u0136\u0137\7\25\2\2\u01379\3\2\2\2\u0138\u0139\7\25\2\2\u0139;\3\2\2"+
		"\2\u013a\u013b\7\27\2\2\u013b\u013e\7\21\2\2\u013c\u013d\7\t\2\2\u013d"+
		"\u013f\7\21\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3"+
		"\2\2\2\u0140\u0145\7\30\2\2\u0141\u0145\7 \2\2\u0142\u0145\7\36\2\2\u0143"+
		"\u0145\7!\2\2\u0144\u013a\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0143\3\2\2\2\u0145=\3\2\2\2\u0146\u0147\7\63\2\2\u0147?\3"+
		"\2\2\2\u0148\u0149\t\2\2\2\u0149A\3\2\2\2\u014a\u014e\5@!\2\u014b\u014e"+
		"\7\16\2\2\u014c\u014e\7\17\2\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2"+
		"\u014d\u014c\3\2\2\2\u014eC\3\2\2\2\u014f\u0150\t\3\2\2\u0150E\3\2\2\2"+
		"\u0151\u0152\7\33\2\2\u0152\u0157\7\25\2\2\u0153\u0154\7\t\2\2\u0154\u0156"+
		"\7\25\2\2\u0155\u0153\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2"+
		"\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b"+
		"\7\34\2\2\u015bG\3\2\2\2\u015c\u015d\7\25\2\2\u015dI\3\2\2\2\u015e\u015f"+
		"\7\25\2\2\u015fK\3\2\2\2\u0160\u0161\7\33\2\2\u0161\u0166\5N(\2\u0162"+
		"\u0163\7\t\2\2\u0163\u0165\5N(\2\u0164\u0162\3\2\2\2\u0165\u0168\3\2\2"+
		"\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0169\u016a\7\34\2\2\u016aM\3\2\2\2\u016b\u016c\t\4\2\2\u016c"+
		"O\3\2\2\2\37TZ`bhs\u0086\u008b\u009a\u009f\u00a3\u00a7\u00aa\u00b2\u00b8"+
		"\u00bb\u00c3\u00c7\u00ce\u00d6\u00e2\u00fb\u0107\u0130\u013e\u0144\u014d"+
		"\u0157\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}