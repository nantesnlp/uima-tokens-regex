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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, IgnoreMatcher=15, IntegerLiteral=16, 
		NonZeroDigit=17, Digit=18, BooleanLiteral=19, StringLiteral=20, FloatingPointLiteral=21, 
		LCURL=22, RCURL=23, LPAREN=24, RPAREN=25, LBRACK=26, RBRACK=27, SEMI=28, 
		QUESTION=29, COLON=30, MUL=31, PLUS=32, AND=33, OR=34, GT=35, LT=36, EQUAL=37, 
		LE=38, GE=39, NOTEQUAL=40, IN=41, IMPORT=42, USE=43, SET=44, JAVA_MATCHER=45, 
		RESOURCE=46, LINE_COMMENT=47, MATCHER=48, RULE=49, Identifier=50, IdentifierPart=51, 
		WS=52, Regex=53;
	public static final int
		RULE_ruleList = 0, RULE_headerBlock = 1, RULE_importDeclaration = 2, RULE_useDeclaration = 3, 
		RULE_mainUseDeclaration = 4, RULE_secondaryUseDeclaration = 5, RULE_typeFullName = 6, 
		RULE_typeShortName = 7, RULE_javaMatcherDeclaration = 8, RULE_optionDeclaration = 9, 
		RULE_shortcutMatcherDeclaration = 10, RULE_labelIdentifier = 11, RULE_ruleDeclaration = 12, 
		RULE_automatonDeclaration = 13, RULE_ruleName = 14, RULE_matcherDeclaration = 15, 
		RULE_orBranchingDeclaration = 16, RULE_featureMatcherDeclaration = 17, 
		RULE_andexpression = 18, RULE_orexpression = 19, RULE_expression = 20, 
		RULE_atomicExpression = 21, RULE_matcherIdentifier = 22, RULE_resourceIdentifier = 23, 
		RULE_externalListDeclaration = 24, RULE_simpleListDefinition = 25, RULE_path = 26, 
		RULE_yamlListDefinition = 27, RULE_jsonListDefinition = 28, RULE_csvListDefinition = 29, 
		RULE_tsvListDefinition = 30, RULE_quote = 31, RULE_separator = 32, RULE_keypath = 33, 
		RULE_quantifierDeclaration = 34, RULE_featureName = 35, RULE_featureBaseName = 36, 
		RULE_arrayOperator = 37, RULE_inListOperator = 38, RULE_operator = 39, 
		RULE_coveredTextArray = 40, RULE_coveredTextIgnoreCase = 41, RULE_coveredTextExactly = 42, 
		RULE_literalArray = 43, RULE_literal = 44;
	public static final String[] ruleNames = {
		"ruleList", "headerBlock", "importDeclaration", "useDeclaration", "mainUseDeclaration", 
		"secondaryUseDeclaration", "typeFullName", "typeShortName", "javaMatcherDeclaration", 
		"optionDeclaration", "shortcutMatcherDeclaration", "labelIdentifier", 
		"ruleDeclaration", "automatonDeclaration", "ruleName", "matcherDeclaration", 
		"orBranchingDeclaration", "featureMatcherDeclaration", "andexpression", 
		"orexpression", "expression", "atomicExpression", "matcherIdentifier", 
		"resourceIdentifier", "externalListDeclaration", "simpleListDefinition", 
		"path", "yamlListDefinition", "jsonListDefinition", "csvListDefinition", 
		"tsvListDefinition", "quote", "separator", "keypath", "quantifierDeclaration", 
		"featureName", "featureBaseName", "arrayOperator", "inListOperator", "operator", 
		"coveredTextArray", "coveredTextIgnoreCase", "coveredTextExactly", "literalArray", 
		"literal"
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
			setState(90);
			headerBlock();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATCHER) {
				{
				{
				setState(91);
				shortcutMatcherDeclaration();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RULE) {
				{
				{
				setState(97);
				ruleDeclaration();
				}
				}
				setState(102);
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
			setState(103);
			importDeclaration();
			setState(104);
			useDeclaration();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET || _la==RESOURCE) {
				{
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RESOURCE:
					{
					setState(105);
					externalListDeclaration();
					}
					break;
				case SET:
					{
					setState(106);
					optionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAVA_MATCHER) {
				{
				{
				setState(112);
				javaMatcherDeclaration();
				}
				}
				setState(117);
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
			setState(118);
			match(IMPORT);
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

	public static class UseDeclarationContext extends ParserRuleContext {
		public MainUseDeclarationContext mainUseDeclaration() {
			return getRuleContext(MainUseDeclarationContext.class,0);
		}
		public List<SecondaryUseDeclarationContext> secondaryUseDeclaration() {
			return getRuleContexts(SecondaryUseDeclarationContext.class);
		}
		public SecondaryUseDeclarationContext secondaryUseDeclaration(int i) {
			return getRuleContext(SecondaryUseDeclarationContext.class,i);
		}
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
			setState(122);
			mainUseDeclaration();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(123);
				match(T__0);
				setState(124);
				secondaryUseDeclaration();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MainUseDeclarationContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(UimaTokenRegexParser.USE, 0); }
		public TypeFullNameContext typeFullName() {
			return getRuleContext(TypeFullNameContext.class,0);
		}
		public TypeShortNameContext typeShortName() {
			return getRuleContext(TypeShortNameContext.class,0);
		}
		public MainUseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainUseDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterMainUseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitMainUseDeclaration(this);
		}
	}

	public final MainUseDeclarationContext mainUseDeclaration() throws RecognitionException {
		MainUseDeclarationContext _localctx = new MainUseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainUseDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(USE);
			setState(133);
			typeFullName();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(134);
				match(T__1);
				setState(135);
				typeShortName();
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

	public static class SecondaryUseDeclarationContext extends ParserRuleContext {
		public TypeFullNameContext typeFullName() {
			return getRuleContext(TypeFullNameContext.class,0);
		}
		public TypeShortNameContext typeShortName() {
			return getRuleContext(TypeShortNameContext.class,0);
		}
		public SecondaryUseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondaryUseDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterSecondaryUseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitSecondaryUseDeclaration(this);
		}
	}

	public final SecondaryUseDeclarationContext secondaryUseDeclaration() throws RecognitionException {
		SecondaryUseDeclarationContext _localctx = new SecondaryUseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_secondaryUseDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			typeFullName();
			setState(139);
			match(T__1);
			setState(140);
			typeShortName();
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

	public static class TypeFullNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public TypeFullNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFullName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterTypeFullName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitTypeFullName(this);
		}
	}

	public final TypeFullNameContext typeFullName() throws RecognitionException {
		TypeFullNameContext _localctx = new TypeFullNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeFullName);
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

	public static class TypeShortNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public TypeShortNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeShortName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterTypeShortName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitTypeShortName(this);
		}
	}

	public final TypeShortNameContext typeShortName() throws RecognitionException {
		TypeShortNameContext _localctx = new TypeShortNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeShortName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		enterRule(_localctx, 16, RULE_javaMatcherDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(JAVA_MATCHER);
			setState(147);
			match(COLON);
			setState(148);
			match(Identifier);
			setState(149);
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
		enterRule(_localctx, 18, RULE_optionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(SET);
			setState(152);
			match(Identifier);
			setState(153);
			match(T__2);
			setState(154);
			literal();
			setState(155);
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
		enterRule(_localctx, 20, RULE_shortcutMatcherDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(MATCHER);
			setState(158);
			match(Identifier);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(159);
				match(T__1);
				setState(160);
				labelIdentifier();
				}
			}

			setState(163);
			match(COLON);
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				setState(164);
				featureMatcherDeclaration();
				}
				break;
			case Regex:
				{
				setState(165);
				match(Regex);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(168);
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
		enterRule(_localctx, 22, RULE_labelIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		enterRule(_localctx, 24, RULE_ruleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(RULE);
			setState(173);
			ruleName();
			setState(174);
			match(COLON);
			setState(175);
			automatonDeclaration();
			setState(176);
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
		enterRule(_localctx, 26, RULE_automatonDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178);
				orBranchingDeclaration();
				}
				}
				setState(181); 
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
		enterRule(_localctx, 28, RULE_ruleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
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
		enterRule(_localctx, 30, RULE_matcherDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(185);
					match(IgnoreMatcher);
					}
				}

				setState(188);
				match(Regex);
				}
				break;
			case 2:
				{
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(189);
					match(IgnoreMatcher);
					}
				}

				setState(192);
				match(Identifier);
				}
				break;
			case 3:
				{
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(193);
					match(IgnoreMatcher);
					}
				}

				setState(196);
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
		enterRule(_localctx, 32, RULE_orBranchingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(199);
				match(LPAREN);
				setState(200);
				automatonDeclaration();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(201);
					match(OR);
					setState(202);
					automatonDeclaration();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				match(RPAREN);
				}
				break;
			case IgnoreMatcher:
			case LBRACK:
			case Identifier:
			case Regex:
				{
				setState(210);
				matcherDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURL) | (1L << QUESTION) | (1L << MUL) | (1L << PLUS))) != 0)) {
				{
				setState(213);
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
		enterRule(_localctx, 34, RULE_featureMatcherDeclaration);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(LBRACK);
				setState(217);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(LBRACK);
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(219);
					expression();
					}
					break;
				case 2:
					{
					setState(220);
					andexpression();
					}
					break;
				case 3:
					{
					setState(221);
					orexpression();
					}
					break;
				}
				setState(224);
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
		enterRule(_localctx, 36, RULE_andexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			expression();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(229);
				match(AND);
				setState(230);
				expression();
				}
				}
				setState(235);
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
		enterRule(_localctx, 38, RULE_orexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			expression();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(237);
				match(OR);
				setState(238);
				expression();
				}
				}
				setState(243);
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
		enterRule(_localctx, 40, RULE_expression);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				atomicExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(LPAREN);
				setState(246);
				orexpression();
				setState(247);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(LPAREN);
				setState(250);
				andexpression();
				setState(251);
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
		public MatcherIdentifierContext matcherIdentifier() {
			return getRuleContext(MatcherIdentifierContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_atomicExpression);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				matcherIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				featureName();
				setState(257);
				operator();
				setState(258);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				featureName();
				setState(261);
				arrayOperator();
				setState(262);
				literalArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				featureName();
				setState(265);
				inListOperator();
				setState(266);
				resourceIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(T__3);
				setState(269);
				match(EQUAL);
				setState(270);
				coveredTextIgnoreCase();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(271);
				match(T__3);
				setState(272);
				match(T__4);
				setState(273);
				coveredTextExactly();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				match(T__3);
				setState(275);
				inListOperator();
				setState(276);
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

	public static class MatcherIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public MatcherIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matcherIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterMatcherIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitMatcherIdentifier(this);
		}
	}

	public final MatcherIdentifierContext matcherIdentifier() throws RecognitionException {
		MatcherIdentifierContext _localctx = new MatcherIdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_matcherIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 46, RULE_resourceIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		enterRule(_localctx, 48, RULE_externalListDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(RESOURCE);
			setState(285);
			resourceIdentifier();
			setState(286);
			match(COLON);
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(287);
				simpleListDefinition();
				}
				break;
			case T__8:
				{
				setState(288);
				csvListDefinition();
				}
				break;
			case T__9:
				{
				setState(289);
				tsvListDefinition();
				}
				break;
			case T__7:
				{
				setState(290);
				jsonListDefinition();
				}
				break;
			case T__6:
				{
				setState(291);
				yamlListDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(294);
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
		enterRule(_localctx, 50, RULE_simpleListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__5);
			setState(297);
			match(LPAREN);
			setState(298);
			path();
			setState(299);
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
		enterRule(_localctx, 52, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		enterRule(_localctx, 54, RULE_yamlListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__6);
			setState(304);
			match(LPAREN);
			setState(305);
			path();
			setState(306);
			match(T__0);
			setState(307);
			keypath();
			setState(308);
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
		enterRule(_localctx, 56, RULE_jsonListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__7);
			setState(311);
			match(LPAREN);
			setState(312);
			path();
			setState(313);
			match(T__0);
			setState(314);
			keypath();
			setState(315);
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
		enterRule(_localctx, 58, RULE_csvListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__8);
			setState(318);
			match(LPAREN);
			setState(319);
			path();
			setState(320);
			match(T__0);
			setState(321);
			separator();
			setState(322);
			match(T__0);
			setState(323);
			quote();
			setState(324);
			match(T__0);
			setState(325);
			match(IntegerLiteral);
			setState(326);
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
		enterRule(_localctx, 60, RULE_tsvListDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__9);
			setState(329);
			match(LPAREN);
			setState(330);
			path();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(331);
				match(T__0);
				setState(332);
				match(IntegerLiteral);
				}
			}

			setState(335);
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
		enterRule(_localctx, 62, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
		enterRule(_localctx, 64, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		enterRule(_localctx, 66, RULE_keypath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		enterRule(_localctx, 68, RULE_quantifierDeclaration);
		int _la;
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(LCURL);
				setState(344);
				match(IntegerLiteral);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(345);
					match(T__0);
					setState(346);
					match(IntegerLiteral);
					}
				}

				setState(349);
				match(RCURL);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(MUL);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(QUESTION);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
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
		public FeatureBaseNameContext featureBaseName() {
			return getRuleContext(FeatureBaseNameContext.class,0);
		}
		public TypeShortNameContext typeShortName() {
			return getRuleContext(TypeShortNameContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_featureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(355);
				typeShortName();
				setState(356);
				match(T__10);
				}
				break;
			}
			setState(360);
			featureBaseName();
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

	public static class FeatureBaseNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public FeatureBaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureBaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterFeatureBaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitFeatureBaseName(this);
		}
	}

	public final FeatureBaseNameContext featureBaseName() throws RecognitionException {
		FeatureBaseNameContext _localctx = new FeatureBaseNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_featureBaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		enterRule(_localctx, 74, RULE_arrayOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==IN) ) {
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
		enterRule(_localctx, 76, RULE_inListOperator);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				arrayOperator();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(T__13);
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
		enterRule(_localctx, 78, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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
		enterRule(_localctx, 80, RULE_coveredTextArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(LBRACK);
			setState(374);
			match(StringLiteral);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(375);
				match(T__0);
				setState(376);
				match(StringLiteral);
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
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
		enterRule(_localctx, 82, RULE_coveredTextIgnoreCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
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
		enterRule(_localctx, 84, RULE_coveredTextExactly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
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
		enterRule(_localctx, 86, RULE_literalArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(LBRACK);
			setState(389);
			literal();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(390);
				match(T__0);
				setState(391);
				literal();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
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
		enterRule(_localctx, 88, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0194\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\2\7\2e\n\2\f\2\16\2"+
		"h\13\2\3\3\3\3\3\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\3\7\3t\n\3\f\3\16\3w"+
		"\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\u0080\n\5\f\5\16\5\u0083\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\5\6\u008b\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00a4"+
		"\n\f\3\f\3\f\3\f\5\f\u00a9\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\6\17\u00b6\n\17\r\17\16\17\u00b7\3\20\3\20\3\21\5\21\u00bd"+
		"\n\21\3\21\3\21\5\21\u00c1\n\21\3\21\3\21\5\21\u00c5\n\21\3\21\5\21\u00c8"+
		"\n\21\3\22\3\22\3\22\3\22\7\22\u00ce\n\22\f\22\16\22\u00d1\13\22\3\22"+
		"\3\22\3\22\5\22\u00d6\n\22\3\22\5\22\u00d9\n\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u00e1\n\23\3\23\3\23\5\23\u00e5\n\23\3\24\3\24\3\24\7\24"+
		"\u00ea\n\24\f\24\16\24\u00ed\13\24\3\25\3\25\3\25\7\25\u00f2\n\25\f\25"+
		"\16\25\u00f5\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0100"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0119\n\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0127\n\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u0150\n \3 \3 \3!\3!"+
		"\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u015e\n$\3$\3$\3$\3$\5$\u0164\n$\3%\3%\3"+
		"%\5%\u0169\n%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\5(\u0174\n(\3)\3)\3*\3*\3*"+
		"\3*\7*\u017c\n*\f*\16*\u017f\13*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\7-\u018b"+
		"\n-\f-\16-\u018e\13-\3-\3-\3.\3.\3.\2\2/\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\5\4\2\16\16++\3\2%"+
		"*\4\2\22\22\25\27\2\u0193\2\\\3\2\2\2\4i\3\2\2\2\6x\3\2\2\2\b|\3\2\2\2"+
		"\n\u0086\3\2\2\2\f\u008c\3\2\2\2\16\u0090\3\2\2\2\20\u0092\3\2\2\2\22"+
		"\u0094\3\2\2\2\24\u0099\3\2\2\2\26\u009f\3\2\2\2\30\u00ac\3\2\2\2\32\u00ae"+
		"\3\2\2\2\34\u00b5\3\2\2\2\36\u00b9\3\2\2\2 \u00c7\3\2\2\2\"\u00d5\3\2"+
		"\2\2$\u00e4\3\2\2\2&\u00e6\3\2\2\2(\u00ee\3\2\2\2*\u00ff\3\2\2\2,\u0118"+
		"\3\2\2\2.\u011a\3\2\2\2\60\u011c\3\2\2\2\62\u011e\3\2\2\2\64\u012a\3\2"+
		"\2\2\66\u012f\3\2\2\28\u0131\3\2\2\2:\u0138\3\2\2\2<\u013f\3\2\2\2>\u014a"+
		"\3\2\2\2@\u0153\3\2\2\2B\u0155\3\2\2\2D\u0157\3\2\2\2F\u0163\3\2\2\2H"+
		"\u0168\3\2\2\2J\u016c\3\2\2\2L\u016e\3\2\2\2N\u0173\3\2\2\2P\u0175\3\2"+
		"\2\2R\u0177\3\2\2\2T\u0182\3\2\2\2V\u0184\3\2\2\2X\u0186\3\2\2\2Z\u0191"+
		"\3\2\2\2\\`\5\4\3\2]_\5\26\f\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2"+
		"af\3\2\2\2b`\3\2\2\2ce\5\32\16\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2g\3\3\2\2\2hf\3\2\2\2ij\5\6\4\2jo\5\b\5\2kn\5\62\32\2ln\5\24\13\2mk"+
		"\3\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pu\3\2\2\2qo\3\2\2\2r"+
		"t\5\22\n\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\5\3\2\2\2wu\3\2\2"+
		"\2xy\7,\2\2yz\7\64\2\2z{\7\36\2\2{\7\3\2\2\2|\u0081\5\n\6\2}~\7\3\2\2"+
		"~\u0080\5\f\7\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\36"+
		"\2\2\u0085\t\3\2\2\2\u0086\u0087\7-\2\2\u0087\u008a\5\16\b\2\u0088\u0089"+
		"\7\4\2\2\u0089\u008b\5\20\t\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\13\3\2\2\2\u008c\u008d\5\16\b\2\u008d\u008e\7\4\2\2\u008e\u008f"+
		"\5\20\t\2\u008f\r\3\2\2\2\u0090\u0091\7\64\2\2\u0091\17\3\2\2\2\u0092"+
		"\u0093\7\64\2\2\u0093\21\3\2\2\2\u0094\u0095\7/\2\2\u0095\u0096\7 \2\2"+
		"\u0096\u0097\7\64\2\2\u0097\u0098\7\36\2\2\u0098\23\3\2\2\2\u0099\u009a"+
		"\7.\2\2\u009a\u009b\7\64\2\2\u009b\u009c\7\5\2\2\u009c\u009d\5Z.\2\u009d"+
		"\u009e\7\36\2\2\u009e\25\3\2\2\2\u009f\u00a0\7\62\2\2\u00a0\u00a3\7\64"+
		"\2\2\u00a1\u00a2\7\4\2\2\u00a2\u00a4\5\30\r\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\7 \2\2\u00a6\u00a9\5$\23"+
		"\2\u00a7\u00a9\7\67\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\7\36\2\2\u00ab\27\3\2\2\2\u00ac\u00ad\7\64"+
		"\2\2\u00ad\31\3\2\2\2\u00ae\u00af\7\63\2\2\u00af\u00b0\5\36\20\2\u00b0"+
		"\u00b1\7 \2\2\u00b1\u00b2\5\34\17\2\u00b2\u00b3\7\36\2\2\u00b3\33\3\2"+
		"\2\2\u00b4\u00b6\5\"\22\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\7\26\2"+
		"\2\u00ba\37\3\2\2\2\u00bb\u00bd\7\21\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c8\7\67\2\2\u00bf\u00c1\7\21\2\2"+
		"\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c8"+
		"\7\64\2\2\u00c3\u00c5\7\21\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c8\5$\23\2\u00c7\u00bc\3\2\2\2\u00c7\u00c0"+
		"\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8!\3\2\2\2\u00c9\u00ca\7\32\2\2\u00ca"+
		"\u00cf\5\34\17\2\u00cb\u00cc\7$\2\2\u00cc\u00ce\5\34\17\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\33\2\2\u00d3\u00d6\3"+
		"\2\2\2\u00d4\u00d6\5 \21\2\u00d5\u00c9\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d9\5F$\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2"+
		"\2\u00d9#\3\2\2\2\u00da\u00db\7\34\2\2\u00db\u00e5\7\35\2\2\u00dc\u00e0"+
		"\7\34\2\2\u00dd\u00e1\5*\26\2\u00de\u00e1\5&\24\2\u00df\u00e1\5(\25\2"+
		"\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e3\7\35\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00da\3\2\2\2"+
		"\u00e4\u00dc\3\2\2\2\u00e5%\3\2\2\2\u00e6\u00eb\5*\26\2\u00e7\u00e8\7"+
		"#\2\2\u00e8\u00ea\5*\26\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\'\3\2\2\2\u00ed\u00eb\3\2\2\2"+
		"\u00ee\u00f3\5*\26\2\u00ef\u00f0\7$\2\2\u00f0\u00f2\5*\26\2\u00f1\u00ef"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		")\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u0100\5,\27\2\u00f7\u00f8\7\32\2\2"+
		"\u00f8\u00f9\5(\25\2\u00f9\u00fa\7\33\2\2\u00fa\u0100\3\2\2\2\u00fb\u00fc"+
		"\7\32\2\2\u00fc\u00fd\5&\24\2\u00fd\u00fe\7\33\2\2\u00fe\u0100\3\2\2\2"+
		"\u00ff\u00f6\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100+\3"+
		"\2\2\2\u0101\u0119\5.\30\2\u0102\u0103\5H%\2\u0103\u0104\5P)\2\u0104\u0105"+
		"\5Z.\2\u0105\u0119\3\2\2\2\u0106\u0107\5H%\2\u0107\u0108\5L\'\2\u0108"+
		"\u0109\5X-\2\u0109\u0119\3\2\2\2\u010a\u010b\5H%\2\u010b\u010c\5N(\2\u010c"+
		"\u010d\5\60\31\2\u010d\u0119\3\2\2\2\u010e\u010f\7\6\2\2\u010f\u0110\7"+
		"\'\2\2\u0110\u0119\5T+\2\u0111\u0112\7\6\2\2\u0112\u0113\7\7\2\2\u0113"+
		"\u0119\5V,\2\u0114\u0115\7\6\2\2\u0115\u0116\5N(\2\u0116\u0117\5R*\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0101\3\2\2\2\u0118\u0102\3\2\2\2\u0118\u0106\3\2"+
		"\2\2\u0118\u010a\3\2\2\2\u0118\u010e\3\2\2\2\u0118\u0111\3\2\2\2\u0118"+
		"\u0114\3\2\2\2\u0119-\3\2\2\2\u011a\u011b\7\64\2\2\u011b/\3\2\2\2\u011c"+
		"\u011d\7\64\2\2\u011d\61\3\2\2\2\u011e\u011f\7\60\2\2\u011f\u0120\5\60"+
		"\31\2\u0120\u0126\7 \2\2\u0121\u0127\5\64\33\2\u0122\u0127\5<\37\2\u0123"+
		"\u0127\5> \2\u0124\u0127\5:\36\2\u0125\u0127\58\35\2\u0126\u0121\3\2\2"+
		"\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\36\2\2\u0129\63\3\2\2\2\u012a"+
		"\u012b\7\b\2\2\u012b\u012c\7\32\2\2\u012c\u012d\5\66\34\2\u012d\u012e"+
		"\7\33\2\2\u012e\65\3\2\2\2\u012f\u0130\7\26\2\2\u0130\67\3\2\2\2\u0131"+
		"\u0132\7\t\2\2\u0132\u0133\7\32\2\2\u0133\u0134\5\66\34\2\u0134\u0135"+
		"\7\3\2\2\u0135\u0136\5D#\2\u0136\u0137\7\33\2\2\u01379\3\2\2\2\u0138\u0139"+
		"\7\n\2\2\u0139\u013a\7\32\2\2\u013a\u013b\5\66\34\2\u013b\u013c\7\3\2"+
		"\2\u013c\u013d\5D#\2\u013d\u013e\7\33\2\2\u013e;\3\2\2\2\u013f\u0140\7"+
		"\13\2\2\u0140\u0141\7\32\2\2\u0141\u0142\5\66\34\2\u0142\u0143\7\3\2\2"+
		"\u0143\u0144\5B\"\2\u0144\u0145\7\3\2\2\u0145\u0146\5@!\2\u0146\u0147"+
		"\7\3\2\2\u0147\u0148\7\22\2\2\u0148\u0149\7\33\2\2\u0149=\3\2\2\2\u014a"+
		"\u014b\7\f\2\2\u014b\u014c\7\32\2\2\u014c\u014f\5\66\34\2\u014d\u014e"+
		"\7\3\2\2\u014e\u0150\7\22\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2"+
		"\u0150\u0151\3\2\2\2\u0151\u0152\7\33\2\2\u0152?\3\2\2\2\u0153\u0154\7"+
		"\26\2\2\u0154A\3\2\2\2\u0155\u0156\7\26\2\2\u0156C\3\2\2\2\u0157\u0158"+
		"\7\26\2\2\u0158E\3\2\2\2\u0159\u015a\7\30\2\2\u015a\u015d\7\22\2\2\u015b"+
		"\u015c\7\3\2\2\u015c\u015e\7\22\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3"+
		"\2\2\2\u015e\u015f\3\2\2\2\u015f\u0164\7\31\2\2\u0160\u0164\7!\2\2\u0161"+
		"\u0164\7\37\2\2\u0162\u0164\7\"\2\2\u0163\u0159\3\2\2\2\u0163\u0160\3"+
		"\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164G\3\2\2\2\u0165\u0166"+
		"\5\20\t\2\u0166\u0167\7\r\2\2\u0167\u0169\3\2\2\2\u0168\u0165\3\2\2\2"+
		"\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\5J&\2\u016bI\3\2"+
		"\2\2\u016c\u016d\7\64\2\2\u016dK\3\2\2\2\u016e\u016f\t\2\2\2\u016fM\3"+
		"\2\2\2\u0170\u0174\5L\'\2\u0171\u0174\7\17\2\2\u0172\u0174\7\20\2\2\u0173"+
		"\u0170\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174O\3\2\2\2"+
		"\u0175\u0176\t\3\2\2\u0176Q\3\2\2\2\u0177\u0178\7\34\2\2\u0178\u017d\7"+
		"\26\2\2\u0179\u017a\7\3\2\2\u017a\u017c\7\26\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7\35\2\2\u0181S\3\2\2\2\u0182\u0183"+
		"\7\26\2\2\u0183U\3\2\2\2\u0184\u0185\7\26\2\2\u0185W\3\2\2\2\u0186\u0187"+
		"\7\34\2\2\u0187\u018c\5Z.\2\u0188\u0189\7\3\2\2\u0189\u018b\5Z.\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\35\2\2\u0190"+
		"Y\3\2\2\2\u0191\u0192\t\4\2\2\u0192[\3\2\2\2!`fmou\u0081\u008a\u00a3\u00a8"+
		"\u00b7\u00bc\u00c0\u00c4\u00c7\u00cf\u00d5\u00d8\u00e0\u00e4\u00eb\u00f3"+
		"\u00ff\u0118\u0126\u014f\u015d\u0163\u0168\u0173\u017d\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}