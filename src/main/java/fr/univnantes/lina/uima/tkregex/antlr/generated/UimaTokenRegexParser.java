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
		LE=38, GE=39, NOTEQUAL=40, IN=41, TYPE_SYSTEM=42, IMPORT_MATCHERS_FROM=43, 
		USE=44, SET=45, JAVA_MATCHER=46, RESOURCE=47, LINE_COMMENT=48, MATCHER=49, 
		RULE=50, Identifier=51, IdentifierPart=52, WS=53, Regex=54;
	public static final int
		RULE_ruleList = 0, RULE_headerBlock = 1, RULE_typeSystemDeclaration = 2, 
		RULE_importMatchersDeclaration = 3, RULE_useDeclaration = 4, RULE_mainUseDeclaration = 5, 
		RULE_secondaryUseDeclaration = 6, RULE_typeFullName = 7, RULE_typeShortName = 8, 
		RULE_javaMatcherDeclaration = 9, RULE_optionDeclaration = 10, RULE_shortcutMatcherDeclaration = 11, 
		RULE_labelIdentifier = 12, RULE_ruleDeclaration = 13, RULE_automatonDeclaration = 14, 
		RULE_ruleName = 15, RULE_matcherDeclaration = 16, RULE_orBranchingDeclaration = 17, 
		RULE_featureMatcherDeclaration = 18, RULE_andexpression = 19, RULE_orexpression = 20, 
		RULE_expression = 21, RULE_atomicExpression = 22, RULE_matcherIdentifier = 23, 
		RULE_resourceIdentifier = 24, RULE_externalListDeclaration = 25, RULE_simpleListDefinition = 26, 
		RULE_path = 27, RULE_yamlListDefinition = 28, RULE_jsonListDefinition = 29, 
		RULE_csvListDefinition = 30, RULE_tsvListDefinition = 31, RULE_quote = 32, 
		RULE_separator = 33, RULE_keypath = 34, RULE_quantifierDeclaration = 35, 
		RULE_featureName = 36, RULE_featureBaseName = 37, RULE_arrayOperator = 38, 
		RULE_inStringListOperator = 39, RULE_operator = 40, RULE_coveredTextArray = 41, 
		RULE_coveredTextIgnoreCase = 42, RULE_coveredTextExactly = 43, RULE_literalArray = 44, 
		RULE_literal = 45;
	public static final String[] ruleNames = {
		"ruleList", "headerBlock", "typeSystemDeclaration", "importMatchersDeclaration", 
		"useDeclaration", "mainUseDeclaration", "secondaryUseDeclaration", "typeFullName", 
		"typeShortName", "javaMatcherDeclaration", "optionDeclaration", "shortcutMatcherDeclaration", 
		"labelIdentifier", "ruleDeclaration", "automatonDeclaration", "ruleName", 
		"matcherDeclaration", "orBranchingDeclaration", "featureMatcherDeclaration", 
		"andexpression", "orexpression", "expression", "atomicExpression", "matcherIdentifier", 
		"resourceIdentifier", "externalListDeclaration", "simpleListDefinition", 
		"path", "yamlListDefinition", "jsonListDefinition", "csvListDefinition", 
		"tsvListDefinition", "quote", "separator", "keypath", "quantifierDeclaration", 
		"featureName", "featureBaseName", "arrayOperator", "inStringListOperator", 
		"operator", "coveredTextArray", "coveredTextIgnoreCase", "coveredTextExactly", 
		"literalArray", "literal"
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
			setState(92);
			headerBlock();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATCHER) {
				{
				{
				setState(93);
				shortcutMatcherDeclaration();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RULE) {
				{
				{
				setState(99);
				ruleDeclaration();
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

	public static class HeaderBlockContext extends ParserRuleContext {
		public TypeSystemDeclarationContext typeSystemDeclaration() {
			return getRuleContext(TypeSystemDeclarationContext.class,0);
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
		public List<ImportMatchersDeclarationContext> importMatchersDeclaration() {
			return getRuleContexts(ImportMatchersDeclarationContext.class);
		}
		public ImportMatchersDeclarationContext importMatchersDeclaration(int i) {
			return getRuleContext(ImportMatchersDeclarationContext.class,i);
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
			setState(105);
			typeSystemDeclaration();
			setState(106);
			useDeclaration();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT_MATCHERS_FROM) | (1L << SET) | (1L << RESOURCE))) != 0)) {
				{
				setState(110);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RESOURCE:
					{
					setState(107);
					externalListDeclaration();
					}
					break;
				case SET:
					{
					setState(108);
					optionDeclaration();
					}
					break;
				case IMPORT_MATCHERS_FROM:
					{
					setState(109);
					importMatchersDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAVA_MATCHER) {
				{
				{
				setState(115);
				javaMatcherDeclaration();
				}
				}
				setState(120);
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

	public static class TypeSystemDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE_SYSTEM() { return getToken(UimaTokenRegexParser.TYPE_SYSTEM, 0); }
		public TerminalNode Identifier() { return getToken(UimaTokenRegexParser.Identifier, 0); }
		public TypeSystemDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSystemDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterTypeSystemDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitTypeSystemDeclaration(this);
		}
	}

	public final TypeSystemDeclarationContext typeSystemDeclaration() throws RecognitionException {
		TypeSystemDeclarationContext _localctx = new TypeSystemDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeSystemDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(TYPE_SYSTEM);
			setState(122);
			match(Identifier);
			setState(123);
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

	public static class ImportMatchersDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT_MATCHERS_FROM() { return getToken(UimaTokenRegexParser.IMPORT_MATCHERS_FROM, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ImportMatchersDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importMatchersDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterImportMatchersDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitImportMatchersDeclaration(this);
		}
	}

	public final ImportMatchersDeclarationContext importMatchersDeclaration() throws RecognitionException {
		ImportMatchersDeclarationContext _localctx = new ImportMatchersDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importMatchersDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IMPORT_MATCHERS_FROM);
			setState(126);
			path();
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
		enterRule(_localctx, 8, RULE_useDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			mainUseDeclaration();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(130);
				match(T__0);
				setState(131);
				secondaryUseDeclaration();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
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
		enterRule(_localctx, 10, RULE_mainUseDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(USE);
			setState(140);
			typeFullName();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(141);
				match(T__1);
				setState(142);
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
		enterRule(_localctx, 12, RULE_secondaryUseDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			typeFullName();
			setState(146);
			match(T__1);
			setState(147);
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
		enterRule(_localctx, 14, RULE_typeFullName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		enterRule(_localctx, 16, RULE_typeShortName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		enterRule(_localctx, 18, RULE_javaMatcherDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(JAVA_MATCHER);
			setState(154);
			match(COLON);
			setState(155);
			match(Identifier);
			setState(156);
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
		enterRule(_localctx, 20, RULE_optionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(SET);
			setState(159);
			match(Identifier);
			setState(160);
			match(T__2);
			setState(161);
			literal();
			setState(162);
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
		enterRule(_localctx, 22, RULE_shortcutMatcherDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(MATCHER);
			setState(165);
			match(Identifier);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(166);
				match(T__1);
				setState(167);
				labelIdentifier();
				}
			}

			setState(170);
			match(COLON);
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				setState(171);
				featureMatcherDeclaration();
				}
				break;
			case Regex:
				{
				setState(172);
				match(Regex);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(175);
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
		enterRule(_localctx, 24, RULE_labelIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		enterRule(_localctx, 26, RULE_ruleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(RULE);
			setState(180);
			ruleName();
			setState(181);
			match(COLON);
			setState(182);
			automatonDeclaration();
			setState(183);
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
		enterRule(_localctx, 28, RULE_automatonDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				orBranchingDeclaration();
				}
				}
				setState(188); 
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
		enterRule(_localctx, 30, RULE_ruleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		enterRule(_localctx, 32, RULE_matcherDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(192);
					match(IgnoreMatcher);
					}
				}

				setState(195);
				match(Regex);
				}
				break;
			case 2:
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(196);
					match(IgnoreMatcher);
					}
				}

				setState(199);
				match(Identifier);
				}
				break;
			case 3:
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(200);
					match(IgnoreMatcher);
					}
				}

				setState(203);
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
		enterRule(_localctx, 34, RULE_orBranchingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(206);
				match(LPAREN);
				setState(207);
				automatonDeclaration();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(208);
					match(OR);
					setState(209);
					automatonDeclaration();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(RPAREN);
				}
				break;
			case IgnoreMatcher:
			case LBRACK:
			case Identifier:
			case Regex:
				{
				setState(217);
				matcherDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURL) | (1L << QUESTION) | (1L << MUL) | (1L << PLUS))) != 0)) {
				{
				setState(220);
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
		enterRule(_localctx, 36, RULE_featureMatcherDeclaration);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(LBRACK);
				setState(224);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(LBRACK);
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(226);
					expression();
					}
					break;
				case 2:
					{
					setState(227);
					andexpression();
					}
					break;
				case 3:
					{
					setState(228);
					orexpression();
					}
					break;
				}
				setState(231);
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
		enterRule(_localctx, 38, RULE_andexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			expression();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(236);
				match(AND);
				setState(237);
				expression();
				}
				}
				setState(242);
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
		enterRule(_localctx, 40, RULE_orexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			expression();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(244);
				match(OR);
				setState(245);
				expression();
				}
				}
				setState(250);
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
		enterRule(_localctx, 42, RULE_expression);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				atomicExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(LPAREN);
				setState(253);
				orexpression();
				setState(254);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(LPAREN);
				setState(257);
				andexpression();
				setState(258);
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
		public InStringListOperatorContext inStringListOperator() {
			return getRuleContext(InStringListOperatorContext.class,0);
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
		enterRule(_localctx, 44, RULE_atomicExpression);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				matcherIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				featureName();
				setState(264);
				operator();
				setState(265);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				featureName();
				setState(268);
				arrayOperator();
				setState(269);
				literalArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				featureName();
				setState(272);
				inStringListOperator();
				setState(273);
				resourceIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				match(T__3);
				setState(276);
				match(EQUAL);
				setState(277);
				coveredTextIgnoreCase();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				match(T__3);
				setState(279);
				match(T__4);
				setState(280);
				coveredTextExactly();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(281);
				match(T__3);
				setState(282);
				inStringListOperator();
				setState(283);
				coveredTextArray();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(285);
				match(T__3);
				setState(286);
				inStringListOperator();
				setState(287);
				resourceIdentifier();
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
		enterRule(_localctx, 46, RULE_matcherIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		enterRule(_localctx, 48, RULE_resourceIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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
		enterRule(_localctx, 50, RULE_externalListDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(RESOURCE);
			setState(296);
			resourceIdentifier();
			setState(297);
			match(COLON);
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(298);
				simpleListDefinition();
				}
				break;
			case T__8:
				{
				setState(299);
				csvListDefinition();
				}
				break;
			case T__9:
				{
				setState(300);
				tsvListDefinition();
				}
				break;
			case T__7:
				{
				setState(301);
				jsonListDefinition();
				}
				break;
			case T__6:
				{
				setState(302);
				yamlListDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(305);
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
		enterRule(_localctx, 52, RULE_simpleListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__5);
			setState(308);
			match(LPAREN);
			setState(309);
			path();
			setState(310);
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
		enterRule(_localctx, 54, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
		enterRule(_localctx, 56, RULE_yamlListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__6);
			setState(315);
			match(LPAREN);
			setState(316);
			path();
			setState(317);
			match(T__0);
			setState(318);
			keypath();
			setState(319);
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
		enterRule(_localctx, 58, RULE_jsonListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__7);
			setState(322);
			match(LPAREN);
			setState(323);
			path();
			setState(324);
			match(T__0);
			setState(325);
			keypath();
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
		enterRule(_localctx, 60, RULE_csvListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__8);
			setState(329);
			match(LPAREN);
			setState(330);
			path();
			setState(331);
			match(T__0);
			setState(332);
			separator();
			setState(333);
			match(T__0);
			setState(334);
			quote();
			setState(335);
			match(T__0);
			setState(336);
			match(IntegerLiteral);
			setState(337);
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
		enterRule(_localctx, 62, RULE_tsvListDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__9);
			setState(340);
			match(LPAREN);
			setState(341);
			path();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(342);
				match(T__0);
				setState(343);
				match(IntegerLiteral);
				}
			}

			setState(346);
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
		enterRule(_localctx, 64, RULE_quote);
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
		enterRule(_localctx, 66, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
		enterRule(_localctx, 68, RULE_keypath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		enterRule(_localctx, 70, RULE_quantifierDeclaration);
		int _la;
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(LCURL);
				setState(355);
				match(IntegerLiteral);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(356);
					match(T__0);
					setState(357);
					match(IntegerLiteral);
					}
				}

				setState(360);
				match(RCURL);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(MUL);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				match(QUESTION);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
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
		enterRule(_localctx, 72, RULE_featureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(366);
				typeShortName();
				setState(367);
				match(T__10);
				}
				break;
			}
			setState(371);
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
		enterRule(_localctx, 74, RULE_featureBaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		enterRule(_localctx, 76, RULE_arrayOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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

	public static class InStringListOperatorContext extends ParserRuleContext {
		public ArrayOperatorContext arrayOperator() {
			return getRuleContext(ArrayOperatorContext.class,0);
		}
		public InStringListOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inStringListOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).enterInStringListOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UimaTokenRegexListener ) ((UimaTokenRegexListener)listener).exitInStringListOperator(this);
		}
	}

	public final InStringListOperatorContext inStringListOperator() throws RecognitionException {
		InStringListOperatorContext _localctx = new InStringListOperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_inStringListOperator);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				arrayOperator();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
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
		enterRule(_localctx, 80, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
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
		enterRule(_localctx, 82, RULE_coveredTextArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(LBRACK);
			setState(385);
			match(StringLiteral);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(386);
				match(T__0);
				setState(387);
				match(StringLiteral);
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
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
		enterRule(_localctx, 84, RULE_coveredTextIgnoreCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
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
		enterRule(_localctx, 86, RULE_coveredTextExactly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
		enterRule(_localctx, 88, RULE_literalArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(LBRACK);
			setState(400);
			literal();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(401);
				match(T__0);
				setState(402);
				literal();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
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
		enterRule(_localctx, 90, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u019f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\7\2a\n\2\f\2\16\2d\13\2\3\2\7\2g\n\2\f"+
		"\2\16\2j\13\2\3\3\3\3\3\3\3\3\3\3\7\3q\n\3\f\3\16\3t\13\3\3\3\7\3w\n\3"+
		"\f\3\16\3z\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u0087"+
		"\n\6\f\6\16\6\u008a\13\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0092\n\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\5\r\u00ab\n\r\3\r\3\r\3\r\5\r\u00b0\n\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u00bd\n\20\r\20\16\20"+
		"\u00be\3\21\3\21\3\22\5\22\u00c4\n\22\3\22\3\22\5\22\u00c8\n\22\3\22\3"+
		"\22\5\22\u00cc\n\22\3\22\5\22\u00cf\n\22\3\23\3\23\3\23\3\23\7\23\u00d5"+
		"\n\23\f\23\16\23\u00d8\13\23\3\23\3\23\3\23\5\23\u00dd\n\23\3\23\5\23"+
		"\u00e0\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e8\n\24\3\24\3\24\5"+
		"\24\u00ec\n\24\3\25\3\25\3\25\7\25\u00f1\n\25\f\25\16\25\u00f4\13\25\3"+
		"\26\3\26\3\26\7\26\u00f9\n\26\f\26\16\26\u00fc\13\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u0107\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0124\n\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0132\n\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\5!\u015b\n!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\5%\u0169"+
		"\n%\3%\3%\3%\3%\5%\u016f\n%\3&\3&\3&\5&\u0174\n&\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3)\5)\u017f\n)\3*\3*\3+\3+\3+\3+\7+\u0187\n+\f+\16+\u018a\13+\3+"+
		"\3+\3,\3,\3-\3-\3.\3.\3.\3.\7.\u0196\n.\f.\16.\u0199\13.\3.\3.\3/\3/\3"+
		"/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\\2\5\4\2\16\16++\3\2%*\4\2\22\22\25\27\2\u019f\2^\3"+
		"\2\2\2\4k\3\2\2\2\6{\3\2\2\2\b\177\3\2\2\2\n\u0083\3\2\2\2\f\u008d\3\2"+
		"\2\2\16\u0093\3\2\2\2\20\u0097\3\2\2\2\22\u0099\3\2\2\2\24\u009b\3\2\2"+
		"\2\26\u00a0\3\2\2\2\30\u00a6\3\2\2\2\32\u00b3\3\2\2\2\34\u00b5\3\2\2\2"+
		"\36\u00bc\3\2\2\2 \u00c0\3\2\2\2\"\u00ce\3\2\2\2$\u00dc\3\2\2\2&\u00eb"+
		"\3\2\2\2(\u00ed\3\2\2\2*\u00f5\3\2\2\2,\u0106\3\2\2\2.\u0123\3\2\2\2\60"+
		"\u0125\3\2\2\2\62\u0127\3\2\2\2\64\u0129\3\2\2\2\66\u0135\3\2\2\28\u013a"+
		"\3\2\2\2:\u013c\3\2\2\2<\u0143\3\2\2\2>\u014a\3\2\2\2@\u0155\3\2\2\2B"+
		"\u015e\3\2\2\2D\u0160\3\2\2\2F\u0162\3\2\2\2H\u016e\3\2\2\2J\u0173\3\2"+
		"\2\2L\u0177\3\2\2\2N\u0179\3\2\2\2P\u017e\3\2\2\2R\u0180\3\2\2\2T\u0182"+
		"\3\2\2\2V\u018d\3\2\2\2X\u018f\3\2\2\2Z\u0191\3\2\2\2\\\u019c\3\2\2\2"+
		"^b\5\4\3\2_a\5\30\r\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ch\3\2\2"+
		"\2db\3\2\2\2eg\5\34\17\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\3\3"+
		"\2\2\2jh\3\2\2\2kl\5\6\4\2lr\5\n\6\2mq\5\64\33\2nq\5\26\f\2oq\5\b\5\2"+
		"pm\3\2\2\2pn\3\2\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sx\3\2\2\2"+
		"tr\3\2\2\2uw\5\24\13\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\5\3\2"+
		"\2\2zx\3\2\2\2{|\7,\2\2|}\7\65\2\2}~\7\36\2\2~\7\3\2\2\2\177\u0080\7-"+
		"\2\2\u0080\u0081\58\35\2\u0081\u0082\7\36\2\2\u0082\t\3\2\2\2\u0083\u0088"+
		"\5\f\7\2\u0084\u0085\7\3\2\2\u0085\u0087\5\16\b\2\u0086\u0084\3\2\2\2"+
		"\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\36\2\2\u008c\13\3\2\2\2\u008d"+
		"\u008e\7.\2\2\u008e\u0091\5\20\t\2\u008f\u0090\7\4\2\2\u0090\u0092\5\22"+
		"\n\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\r\3\2\2\2\u0093\u0094"+
		"\5\20\t\2\u0094\u0095\7\4\2\2\u0095\u0096\5\22\n\2\u0096\17\3\2\2\2\u0097"+
		"\u0098\7\65\2\2\u0098\21\3\2\2\2\u0099\u009a\7\65\2\2\u009a\23\3\2\2\2"+
		"\u009b\u009c\7\60\2\2\u009c\u009d\7 \2\2\u009d\u009e\7\65\2\2\u009e\u009f"+
		"\7\36\2\2\u009f\25\3\2\2\2\u00a0\u00a1\7/\2\2\u00a1\u00a2\7\65\2\2\u00a2"+
		"\u00a3\7\5\2\2\u00a3\u00a4\5\\/\2\u00a4\u00a5\7\36\2\2\u00a5\27\3\2\2"+
		"\2\u00a6\u00a7\7\63\2\2\u00a7\u00aa\7\65\2\2\u00a8\u00a9\7\4\2\2\u00a9"+
		"\u00ab\5\32\16\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3"+
		"\2\2\2\u00ac\u00af\7 \2\2\u00ad\u00b0\5&\24\2\u00ae\u00b0\78\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\36"+
		"\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\7\65\2\2\u00b4\33\3\2\2\2\u00b5\u00b6"+
		"\7\64\2\2\u00b6\u00b7\5 \21\2\u00b7\u00b8\7 \2\2\u00b8\u00b9\5\36\20\2"+
		"\u00b9\u00ba\7\36\2\2\u00ba\35\3\2\2\2\u00bb\u00bd\5$\23\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\37\3\2\2\2\u00c0\u00c1\7\26\2\2\u00c1!\3\2\2\2\u00c2\u00c4\7\21\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cf\78"+
		"\2\2\u00c6\u00c8\7\21\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cf\7\65\2\2\u00ca\u00cc\7\21\2\2\u00cb\u00ca\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\5&\24\2\u00ce"+
		"\u00c3\3\2\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf#\3\2\2\2"+
		"\u00d0\u00d1\7\32\2\2\u00d1\u00d6\5\36\20\2\u00d2\u00d3\7$\2\2\u00d3\u00d5"+
		"\5\36\20\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da"+
		"\7\33\2\2\u00da\u00dd\3\2\2\2\u00db\u00dd\5\"\22\2\u00dc\u00d0\3\2\2\2"+
		"\u00dc\u00db\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00e0\5H%\2\u00df\u00de"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0%\3\2\2\2\u00e1\u00e2\7\34\2\2\u00e2"+
		"\u00ec\7\35\2\2\u00e3\u00e7\7\34\2\2\u00e4\u00e8\5,\27\2\u00e5\u00e8\5"+
		"(\25\2\u00e6\u00e8\5*\26\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\35\2\2\u00ea\u00ec\3"+
		"\2\2\2\u00eb\u00e1\3\2\2\2\u00eb\u00e3\3\2\2\2\u00ec\'\3\2\2\2\u00ed\u00f2"+
		"\5,\27\2\u00ee\u00ef\7#\2\2\u00ef\u00f1\5,\27\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3)\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f5\u00fa\5,\27\2\u00f6\u00f7\7$\2\2\u00f7\u00f9"+
		"\5,\27\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb+\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0107\5.\30\2"+
		"\u00fe\u00ff\7\32\2\2\u00ff\u0100\5*\26\2\u0100\u0101\7\33\2\2\u0101\u0107"+
		"\3\2\2\2\u0102\u0103\7\32\2\2\u0103\u0104\5(\25\2\u0104\u0105\7\33\2\2"+
		"\u0105\u0107\3\2\2\2\u0106\u00fd\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u0102"+
		"\3\2\2\2\u0107-\3\2\2\2\u0108\u0124\5\60\31\2\u0109\u010a\5J&\2\u010a"+
		"\u010b\5R*\2\u010b\u010c\5\\/\2\u010c\u0124\3\2\2\2\u010d\u010e\5J&\2"+
		"\u010e\u010f\5N(\2\u010f\u0110\5Z.\2\u0110\u0124\3\2\2\2\u0111\u0112\5"+
		"J&\2\u0112\u0113\5P)\2\u0113\u0114\5\62\32\2\u0114\u0124\3\2\2\2\u0115"+
		"\u0116\7\6\2\2\u0116\u0117\7\'\2\2\u0117\u0124\5V,\2\u0118\u0119\7\6\2"+
		"\2\u0119\u011a\7\7\2\2\u011a\u0124\5X-\2\u011b\u011c\7\6\2\2\u011c\u011d"+
		"\5P)\2\u011d\u011e\5T+\2\u011e\u0124\3\2\2\2\u011f\u0120\7\6\2\2\u0120"+
		"\u0121\5P)\2\u0121\u0122\5\62\32\2\u0122\u0124\3\2\2\2\u0123\u0108\3\2"+
		"\2\2\u0123\u0109\3\2\2\2\u0123\u010d\3\2\2\2\u0123\u0111\3\2\2\2\u0123"+
		"\u0115\3\2\2\2\u0123\u0118\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u011f\3\2"+
		"\2\2\u0124/\3\2\2\2\u0125\u0126\7\65\2\2\u0126\61\3\2\2\2\u0127\u0128"+
		"\7\65\2\2\u0128\63\3\2\2\2\u0129\u012a\7\61\2\2\u012a\u012b\5\62\32\2"+
		"\u012b\u0131\7 \2\2\u012c\u0132\5\66\34\2\u012d\u0132\5> \2\u012e\u0132"+
		"\5@!\2\u012f\u0132\5<\37\2\u0130\u0132\5:\36\2\u0131\u012c\3\2\2\2\u0131"+
		"\u012d\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7\36\2\2\u0134\65\3\2\2\2\u0135\u0136"+
		"\7\b\2\2\u0136\u0137\7\32\2\2\u0137\u0138\58\35\2\u0138\u0139\7\33\2\2"+
		"\u0139\67\3\2\2\2\u013a\u013b\7\26\2\2\u013b9\3\2\2\2\u013c\u013d\7\t"+
		"\2\2\u013d\u013e\7\32\2\2\u013e\u013f\58\35\2\u013f\u0140\7\3\2\2\u0140"+
		"\u0141\5F$\2\u0141\u0142\7\33\2\2\u0142;\3\2\2\2\u0143\u0144\7\n\2\2\u0144"+
		"\u0145\7\32\2\2\u0145\u0146\58\35\2\u0146\u0147\7\3\2\2\u0147\u0148\5"+
		"F$\2\u0148\u0149\7\33\2\2\u0149=\3\2\2\2\u014a\u014b\7\13\2\2\u014b\u014c"+
		"\7\32\2\2\u014c\u014d\58\35\2\u014d\u014e\7\3\2\2\u014e\u014f\5D#\2\u014f"+
		"\u0150\7\3\2\2\u0150\u0151\5B\"\2\u0151\u0152\7\3\2\2\u0152\u0153\7\22"+
		"\2\2\u0153\u0154\7\33\2\2\u0154?\3\2\2\2\u0155\u0156\7\f\2\2\u0156\u0157"+
		"\7\32\2\2\u0157\u015a\58\35\2\u0158\u0159\7\3\2\2\u0159\u015b\7\22\2\2"+
		"\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d"+
		"\7\33\2\2\u015dA\3\2\2\2\u015e\u015f\7\26\2\2\u015fC\3\2\2\2\u0160\u0161"+
		"\7\26\2\2\u0161E\3\2\2\2\u0162\u0163\7\26\2\2\u0163G\3\2\2\2\u0164\u0165"+
		"\7\30\2\2\u0165\u0168\7\22\2\2\u0166\u0167\7\3\2\2\u0167\u0169\7\22\2"+
		"\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016f"+
		"\7\31\2\2\u016b\u016f\7!\2\2\u016c\u016f\7\37\2\2\u016d\u016f\7\"\2\2"+
		"\u016e\u0164\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016d"+
		"\3\2\2\2\u016fI\3\2\2\2\u0170\u0171\5\22\n\2\u0171\u0172\7\r\2\2\u0172"+
		"\u0174\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0176\5L\'\2\u0176K\3\2\2\2\u0177\u0178\7\65\2\2\u0178M\3\2"+
		"\2\2\u0179\u017a\t\2\2\2\u017aO\3\2\2\2\u017b\u017f\5N(\2\u017c\u017f"+
		"\7\17\2\2\u017d\u017f\7\20\2\2\u017e\u017b\3\2\2\2\u017e\u017c\3\2\2\2"+
		"\u017e\u017d\3\2\2\2\u017fQ\3\2\2\2\u0180\u0181\t\3\2\2\u0181S\3\2\2\2"+
		"\u0182\u0183\7\34\2\2\u0183\u0188\7\26\2\2\u0184\u0185\7\3\2\2\u0185\u0187"+
		"\7\26\2\2\u0186\u0184\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2"+
		"\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c"+
		"\7\35\2\2\u018cU\3\2\2\2\u018d\u018e\7\26\2\2\u018eW\3\2\2\2\u018f\u0190"+
		"\7\26\2\2\u0190Y\3\2\2\2\u0191\u0192\7\34\2\2\u0192\u0197\5\\/\2\u0193"+
		"\u0194\7\3\2\2\u0194\u0196\5\\/\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019b\7\35\2\2\u019b[\3\2\2\2\u019c\u019d\t\4\2\2"+
		"\u019d]\3\2\2\2!bhprx\u0088\u0091\u00aa\u00af\u00be\u00c3\u00c7\u00cb"+
		"\u00ce\u00d6\u00dc\u00df\u00e7\u00eb\u00f2\u00fa\u0106\u0123\u0131\u015a"+
		"\u0168\u016e\u0173\u017e\u0188\u0197";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}