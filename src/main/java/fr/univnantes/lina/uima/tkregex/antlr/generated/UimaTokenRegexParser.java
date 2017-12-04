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
		public List<ImportMatchersDeclarationContext> importMatchersDeclaration() {
			return getRuleContexts(ImportMatchersDeclarationContext.class);
		}
		public ImportMatchersDeclarationContext importMatchersDeclaration(int i) {
			return getRuleContext(ImportMatchersDeclarationContext.class,i);
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
			setState(105);
			typeSystemDeclaration();
			setState(106);
			useDeclaration();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT_MATCHERS_FROM) {
				{
				{
				setState(107);
				importMatchersDeclaration();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET || _la==RESOURCE) {
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RESOURCE:
					{
					setState(113);
					externalListDeclaration();
					}
					break;
				case SET:
					{
					setState(114);
					optionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAVA_MATCHER) {
				{
				{
				setState(120);
				javaMatcherDeclaration();
				}
				}
				setState(125);
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
			setState(126);
			match(TYPE_SYSTEM);
			setState(127);
			match(Identifier);
			setState(128);
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
			setState(130);
			match(IMPORT_MATCHERS_FROM);
			setState(131);
			path();
			setState(132);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			mainUseDeclaration();
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					match(T__0);
					setState(136);
					secondaryUseDeclaration();
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(142);
				match(T__0);
				setState(143);
				secondaryUseDeclaration();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			setState(151);
			match(USE);
			setState(152);
			typeFullName();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(153);
				match(T__1);
				setState(154);
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
			setState(157);
			typeFullName();
			setState(158);
			match(T__1);
			setState(159);
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
			setState(161);
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
			setState(163);
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
			setState(165);
			match(JAVA_MATCHER);
			setState(166);
			match(COLON);
			setState(167);
			match(Identifier);
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
			setState(170);
			match(SET);
			setState(171);
			match(Identifier);
			setState(172);
			match(T__2);
			setState(173);
			literal();
			setState(174);
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
			setState(176);
			match(MATCHER);
			setState(177);
			match(Identifier);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(178);
				match(T__1);
				setState(179);
				labelIdentifier();
				}
			}

			setState(182);
			match(COLON);
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				setState(183);
				featureMatcherDeclaration();
				}
				break;
			case Regex:
				{
				setState(184);
				match(Regex);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(187);
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
			setState(189);
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
			setState(191);
			match(RULE);
			setState(192);
			ruleName();
			setState(193);
			match(COLON);
			setState(194);
			automatonDeclaration();
			setState(195);
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
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				orBranchingDeclaration();
				}
				}
				setState(200); 
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
			setState(202);
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
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(204);
					match(IgnoreMatcher);
					}
				}

				setState(207);
				match(Regex);
				}
				break;
			case 2:
				{
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(208);
					match(IgnoreMatcher);
					}
				}

				setState(211);
				match(Identifier);
				}
				break;
			case 3:
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IgnoreMatcher) {
					{
					setState(212);
					match(IgnoreMatcher);
					}
				}

				setState(215);
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
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(218);
				match(LPAREN);
				setState(219);
				automatonDeclaration();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(220);
					match(OR);
					setState(221);
					automatonDeclaration();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				match(RPAREN);
				}
				break;
			case IgnoreMatcher:
			case LBRACK:
			case Identifier:
			case Regex:
				{
				setState(229);
				matcherDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURL) | (1L << QUESTION) | (1L << MUL) | (1L << PLUS))) != 0)) {
				{
				setState(232);
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
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(LBRACK);
				setState(236);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(LBRACK);
				setState(241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(238);
					expression();
					}
					break;
				case 2:
					{
					setState(239);
					andexpression();
					}
					break;
				case 3:
					{
					setState(240);
					orexpression();
					}
					break;
				}
				setState(243);
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
			setState(247);
			expression();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(248);
				match(AND);
				setState(249);
				expression();
				}
				}
				setState(254);
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
			setState(255);
			expression();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(256);
				match(OR);
				setState(257);
				expression();
				}
				}
				setState(262);
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				atomicExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(LPAREN);
				setState(265);
				orexpression();
				setState(266);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(LPAREN);
				setState(269);
				andexpression();
				setState(270);
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
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				matcherIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				featureName();
				setState(276);
				operator();
				setState(277);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				featureName();
				setState(280);
				arrayOperator();
				setState(281);
				literalArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				featureName();
				setState(284);
				inStringListOperator();
				setState(285);
				resourceIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				match(T__3);
				setState(288);
				match(EQUAL);
				setState(289);
				coveredTextIgnoreCase();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(290);
				match(T__3);
				setState(291);
				match(T__4);
				setState(292);
				coveredTextExactly();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(293);
				match(T__3);
				setState(294);
				inStringListOperator();
				setState(295);
				coveredTextArray();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				match(T__3);
				setState(298);
				inStringListOperator();
				setState(299);
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
			setState(303);
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
			setState(305);
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
			setState(307);
			match(RESOURCE);
			setState(308);
			resourceIdentifier();
			setState(309);
			match(COLON);
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(310);
				simpleListDefinition();
				}
				break;
			case T__8:
				{
				setState(311);
				csvListDefinition();
				}
				break;
			case T__9:
				{
				setState(312);
				tsvListDefinition();
				}
				break;
			case T__7:
				{
				setState(313);
				jsonListDefinition();
				}
				break;
			case T__6:
				{
				setState(314);
				yamlListDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(317);
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
			setState(319);
			match(T__5);
			setState(320);
			match(LPAREN);
			setState(321);
			path();
			setState(322);
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
			setState(324);
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
			setState(326);
			match(T__6);
			setState(327);
			match(LPAREN);
			setState(328);
			path();
			setState(329);
			match(T__0);
			setState(330);
			keypath();
			setState(331);
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
			setState(333);
			match(T__7);
			setState(334);
			match(LPAREN);
			setState(335);
			path();
			setState(336);
			match(T__0);
			setState(337);
			keypath();
			setState(338);
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
			setState(340);
			match(T__8);
			setState(341);
			match(LPAREN);
			setState(342);
			path();
			setState(343);
			match(T__0);
			setState(344);
			separator();
			setState(345);
			match(T__0);
			setState(346);
			quote();
			setState(347);
			match(T__0);
			setState(348);
			match(IntegerLiteral);
			setState(349);
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
			setState(351);
			match(T__9);
			setState(352);
			match(LPAREN);
			setState(353);
			path();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(354);
				match(T__0);
				setState(355);
				match(IntegerLiteral);
				}
			}

			setState(358);
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
			setState(360);
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
			setState(362);
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
			setState(364);
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
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(LCURL);
				setState(367);
				match(IntegerLiteral);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(368);
					match(T__0);
					setState(369);
					match(IntegerLiteral);
					}
				}

				setState(372);
				match(RCURL);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(MUL);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				match(QUESTION);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
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
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(378);
				typeShortName();
				setState(379);
				match(T__10);
				}
				break;
			}
			setState(383);
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
			setState(385);
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
			setState(387);
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
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				arrayOperator();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
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
			setState(394);
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
			setState(396);
			match(LBRACK);
			setState(397);
			match(StringLiteral);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(398);
				match(T__0);
				setState(399);
				match(StringLiteral);
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
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
			setState(407);
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
			setState(409);
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
			setState(411);
			match(LBRACK);
			setState(412);
			literal();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(413);
				match(T__0);
				setState(414);
				literal();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
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
			setState(422);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\7\2a\n\2\f\2\16\2d\13\2\3\2\7\2g\n\2\f"+
		"\2\16\2j\13\2\3\3\3\3\3\3\7\3o\n\3\f\3\16\3r\13\3\3\3\3\3\7\3v\n\3\f\3"+
		"\16\3y\13\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\7\6\u008c\n\6\f\6\16\6\u008f\13\6\3\6\3\6\7\6\u0093\n"+
		"\6\f\6\16\6\u0096\13\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u009e\n\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\5\r\u00b7\n\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u00c9\n\20\r\20\16\20\u00ca"+
		"\3\21\3\21\3\22\5\22\u00d0\n\22\3\22\3\22\5\22\u00d4\n\22\3\22\3\22\5"+
		"\22\u00d8\n\22\3\22\5\22\u00db\n\22\3\23\3\23\3\23\3\23\7\23\u00e1\n\23"+
		"\f\23\16\23\u00e4\13\23\3\23\3\23\3\23\5\23\u00e9\n\23\3\23\5\23\u00ec"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f4\n\24\3\24\3\24\5\24\u00f8"+
		"\n\24\3\25\3\25\3\25\7\25\u00fd\n\25\f\25\16\25\u0100\13\25\3\26\3\26"+
		"\3\26\7\26\u0105\n\26\f\26\16\26\u0108\13\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0113\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0130\n\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u013e\n\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\5!\u0167\n!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\5%\u0175\n%\3%"+
		"\3%\3%\3%\5%\u017b\n%\3&\3&\3&\5&\u0180\n&\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		")\5)\u018b\n)\3*\3*\3+\3+\3+\3+\7+\u0193\n+\f+\16+\u0196\13+\3+\3+\3,"+
		"\3,\3-\3-\3.\3.\3.\3.\7.\u01a2\n.\f.\16.\u01a5\13.\3.\3.\3/\3/\3/\2\2"+
		"\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\\2\5\4\2\16\16++\3\2%*\4\2\22\22\25\27\2\u01ac\2^\3\2\2"+
		"\2\4k\3\2\2\2\6\u0080\3\2\2\2\b\u0084\3\2\2\2\n\u0088\3\2\2\2\f\u0099"+
		"\3\2\2\2\16\u009f\3\2\2\2\20\u00a3\3\2\2\2\22\u00a5\3\2\2\2\24\u00a7\3"+
		"\2\2\2\26\u00ac\3\2\2\2\30\u00b2\3\2\2\2\32\u00bf\3\2\2\2\34\u00c1\3\2"+
		"\2\2\36\u00c8\3\2\2\2 \u00cc\3\2\2\2\"\u00da\3\2\2\2$\u00e8\3\2\2\2&\u00f7"+
		"\3\2\2\2(\u00f9\3\2\2\2*\u0101\3\2\2\2,\u0112\3\2\2\2.\u012f\3\2\2\2\60"+
		"\u0131\3\2\2\2\62\u0133\3\2\2\2\64\u0135\3\2\2\2\66\u0141\3\2\2\28\u0146"+
		"\3\2\2\2:\u0148\3\2\2\2<\u014f\3\2\2\2>\u0156\3\2\2\2@\u0161\3\2\2\2B"+
		"\u016a\3\2\2\2D\u016c\3\2\2\2F\u016e\3\2\2\2H\u017a\3\2\2\2J\u017f\3\2"+
		"\2\2L\u0183\3\2\2\2N\u0185\3\2\2\2P\u018a\3\2\2\2R\u018c\3\2\2\2T\u018e"+
		"\3\2\2\2V\u0199\3\2\2\2X\u019b\3\2\2\2Z\u019d\3\2\2\2\\\u01a8\3\2\2\2"+
		"^b\5\4\3\2_a\5\30\r\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ch\3\2\2"+
		"\2db\3\2\2\2eg\5\34\17\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\3\3"+
		"\2\2\2jh\3\2\2\2kl\5\6\4\2lp\5\n\6\2mo\5\b\5\2nm\3\2\2\2or\3\2\2\2pn\3"+
		"\2\2\2pq\3\2\2\2qw\3\2\2\2rp\3\2\2\2sv\5\64\33\2tv\5\26\f\2us\3\2\2\2"+
		"ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x}\3\2\2\2yw\3\2\2\2z|\5\24\13"+
		"\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\5\3\2\2\2\177}\3\2\2\2"+
		"\u0080\u0081\7,\2\2\u0081\u0082\7\65\2\2\u0082\u0083\7\36\2\2\u0083\7"+
		"\3\2\2\2\u0084\u0085\7-\2\2\u0085\u0086\58\35\2\u0086\u0087\7\36\2\2\u0087"+
		"\t\3\2\2\2\u0088\u008d\5\f\7\2\u0089\u008a\7\3\2\2\u008a\u008c\5\16\b"+
		"\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u0094\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\3\2\2\u0091"+
		"\u0093\5\16\b\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7\36\2\2\u0098\13\3\2\2\2\u0099\u009a\7.\2\2\u009a\u009d\5\20\t"+
		"\2\u009b\u009c\7\4\2\2\u009c\u009e\5\22\n\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\r\3\2\2\2\u009f\u00a0\5\20\t\2\u00a0\u00a1\7\4\2"+
		"\2\u00a1\u00a2\5\22\n\2\u00a2\17\3\2\2\2\u00a3\u00a4\7\65\2\2\u00a4\21"+
		"\3\2\2\2\u00a5\u00a6\7\65\2\2\u00a6\23\3\2\2\2\u00a7\u00a8\7\60\2\2\u00a8"+
		"\u00a9\7 \2\2\u00a9\u00aa\7\65\2\2\u00aa\u00ab\7\36\2\2\u00ab\25\3\2\2"+
		"\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\7\65\2\2\u00ae\u00af\7\5\2\2\u00af\u00b0"+
		"\5\\/\2\u00b0\u00b1\7\36\2\2\u00b1\27\3\2\2\2\u00b2\u00b3\7\63\2\2\u00b3"+
		"\u00b6\7\65\2\2\u00b4\u00b5\7\4\2\2\u00b5\u00b7\5\32\16\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\7 \2\2\u00b9"+
		"\u00bc\5&\24\2\u00ba\u00bc\78\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\36\2\2\u00be\31\3\2\2\2\u00bf\u00c0"+
		"\7\65\2\2\u00c0\33\3\2\2\2\u00c1\u00c2\7\64\2\2\u00c2\u00c3\5 \21\2\u00c3"+
		"\u00c4\7 \2\2\u00c4\u00c5\5\36\20\2\u00c5\u00c6\7\36\2\2\u00c6\35\3\2"+
		"\2\2\u00c7\u00c9\5$\23\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\37\3\2\2\2\u00cc\u00cd\7\26\2"+
		"\2\u00cd!\3\2\2\2\u00ce\u00d0\7\21\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00db\78\2\2\u00d2\u00d4\7\21\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00db\7\65"+
		"\2\2\u00d6\u00d8\7\21\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\5&\24\2\u00da\u00cf\3\2\2\2\u00da\u00d3\3\2"+
		"\2\2\u00da\u00d7\3\2\2\2\u00db#\3\2\2\2\u00dc\u00dd\7\32\2\2\u00dd\u00e2"+
		"\5\36\20\2\u00de\u00df\7$\2\2\u00df\u00e1\5\36\20\2\u00e0\u00de\3\2\2"+
		"\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\33\2\2\u00e6\u00e9\3\2\2\2"+
		"\u00e7\u00e9\5\"\22\2\u00e8\u00dc\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00ec\5H%\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"%\3\2\2\2\u00ed\u00ee\7\34\2\2\u00ee\u00f8\7\35\2\2\u00ef\u00f3\7\34\2"+
		"\2\u00f0\u00f4\5,\27\2\u00f1\u00f4\5(\25\2\u00f2\u00f4\5*\26\2\u00f3\u00f0"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\7\35\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00ef\3"+
		"\2\2\2\u00f8\'\3\2\2\2\u00f9\u00fe\5,\27\2\u00fa\u00fb\7#\2\2\u00fb\u00fd"+
		"\5,\27\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff)\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0106\5,\27\2"+
		"\u0102\u0103\7$\2\2\u0103\u0105\5,\27\2\u0104\u0102\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107+\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u0113\5.\30\2\u010a\u010b\7\32\2\2\u010b\u010c\5"+
		"*\26\2\u010c\u010d\7\33\2\2\u010d\u0113\3\2\2\2\u010e\u010f\7\32\2\2\u010f"+
		"\u0110\5(\25\2\u0110\u0111\7\33\2\2\u0111\u0113\3\2\2\2\u0112\u0109\3"+
		"\2\2\2\u0112\u010a\3\2\2\2\u0112\u010e\3\2\2\2\u0113-\3\2\2\2\u0114\u0130"+
		"\5\60\31\2\u0115\u0116\5J&\2\u0116\u0117\5R*\2\u0117\u0118\5\\/\2\u0118"+
		"\u0130\3\2\2\2\u0119\u011a\5J&\2\u011a\u011b\5N(\2\u011b\u011c\5Z.\2\u011c"+
		"\u0130\3\2\2\2\u011d\u011e\5J&\2\u011e\u011f\5P)\2\u011f\u0120\5\62\32"+
		"\2\u0120\u0130\3\2\2\2\u0121\u0122\7\6\2\2\u0122\u0123\7\'\2\2\u0123\u0130"+
		"\5V,\2\u0124\u0125\7\6\2\2\u0125\u0126\7\7\2\2\u0126\u0130\5X-\2\u0127"+
		"\u0128\7\6\2\2\u0128\u0129\5P)\2\u0129\u012a\5T+\2\u012a\u0130\3\2\2\2"+
		"\u012b\u012c\7\6\2\2\u012c\u012d\5P)\2\u012d\u012e\5\62\32\2\u012e\u0130"+
		"\3\2\2\2\u012f\u0114\3\2\2\2\u012f\u0115\3\2\2\2\u012f\u0119\3\2\2\2\u012f"+
		"\u011d\3\2\2\2\u012f\u0121\3\2\2\2\u012f\u0124\3\2\2\2\u012f\u0127\3\2"+
		"\2\2\u012f\u012b\3\2\2\2\u0130/\3\2\2\2\u0131\u0132\7\65\2\2\u0132\61"+
		"\3\2\2\2\u0133\u0134\7\65\2\2\u0134\63\3\2\2\2\u0135\u0136\7\61\2\2\u0136"+
		"\u0137\5\62\32\2\u0137\u013d\7 \2\2\u0138\u013e\5\66\34\2\u0139\u013e"+
		"\5> \2\u013a\u013e\5@!\2\u013b\u013e\5<\37\2\u013c\u013e\5:\36\2\u013d"+
		"\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\36\2\2\u0140"+
		"\65\3\2\2\2\u0141\u0142\7\b\2\2\u0142\u0143\7\32\2\2\u0143\u0144\58\35"+
		"\2\u0144\u0145\7\33\2\2\u0145\67\3\2\2\2\u0146\u0147\7\26\2\2\u01479\3"+
		"\2\2\2\u0148\u0149\7\t\2\2\u0149\u014a\7\32\2\2\u014a\u014b\58\35\2\u014b"+
		"\u014c\7\3\2\2\u014c\u014d\5F$\2\u014d\u014e\7\33\2\2\u014e;\3\2\2\2\u014f"+
		"\u0150\7\n\2\2\u0150\u0151\7\32\2\2\u0151\u0152\58\35\2\u0152\u0153\7"+
		"\3\2\2\u0153\u0154\5F$\2\u0154\u0155\7\33\2\2\u0155=\3\2\2\2\u0156\u0157"+
		"\7\13\2\2\u0157\u0158\7\32\2\2\u0158\u0159\58\35\2\u0159\u015a\7\3\2\2"+
		"\u015a\u015b\5D#\2\u015b\u015c\7\3\2\2\u015c\u015d\5B\"\2\u015d\u015e"+
		"\7\3\2\2\u015e\u015f\7\22\2\2\u015f\u0160\7\33\2\2\u0160?\3\2\2\2\u0161"+
		"\u0162\7\f\2\2\u0162\u0163\7\32\2\2\u0163\u0166\58\35\2\u0164\u0165\7"+
		"\3\2\2\u0165\u0167\7\22\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0169\7\33\2\2\u0169A\3\2\2\2\u016a\u016b\7\26\2"+
		"\2\u016bC\3\2\2\2\u016c\u016d\7\26\2\2\u016dE\3\2\2\2\u016e\u016f\7\26"+
		"\2\2\u016fG\3\2\2\2\u0170\u0171\7\30\2\2\u0171\u0174\7\22\2\2\u0172\u0173"+
		"\7\3\2\2\u0173\u0175\7\22\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2"+
		"\u0175\u0176\3\2\2\2\u0176\u017b\7\31\2\2\u0177\u017b\7!\2\2\u0178\u017b"+
		"\7\37\2\2\u0179\u017b\7\"\2\2\u017a\u0170\3\2\2\2\u017a\u0177\3\2\2\2"+
		"\u017a\u0178\3\2\2\2\u017a\u0179\3\2\2\2\u017bI\3\2\2\2\u017c\u017d\5"+
		"\22\n\2\u017d\u017e\7\r\2\2\u017e\u0180\3\2\2\2\u017f\u017c\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\5L\'\2\u0182K\3\2\2\2\u0183"+
		"\u0184\7\65\2\2\u0184M\3\2\2\2\u0185\u0186\t\2\2\2\u0186O\3\2\2\2\u0187"+
		"\u018b\5N(\2\u0188\u018b\7\17\2\2\u0189\u018b\7\20\2\2\u018a\u0187\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018bQ\3\2\2\2\u018c\u018d"+
		"\t\3\2\2\u018dS\3\2\2\2\u018e\u018f\7\34\2\2\u018f\u0194\7\26\2\2\u0190"+
		"\u0191\7\3\2\2\u0191\u0193\7\26\2\2\u0192\u0190\3\2\2\2\u0193\u0196\3"+
		"\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u0198\7\35\2\2\u0198U\3\2\2\2\u0199\u019a\7\26\2"+
		"\2\u019aW\3\2\2\2\u019b\u019c\7\26\2\2\u019cY\3\2\2\2\u019d\u019e\7\34"+
		"\2\2\u019e\u01a3\5\\/\2\u019f\u01a0\7\3\2\2\u01a0\u01a2\5\\/\2\u01a1\u019f"+
		"\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7\35\2\2\u01a7[\3\2\2\2"+
		"\u01a8\u01a9\t\4\2\2\u01a9]\3\2\2\2#bhpuw}\u008d\u0094\u009d\u00b6\u00bb"+
		"\u00ca\u00cf\u00d3\u00d7\u00da\u00e2\u00e8\u00eb\u00f3\u00f7\u00fe\u0106"+
		"\u0112\u012f\u013d\u0166\u0174\u017a\u017f\u018a\u0194\u01a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}