// Generated from UimaTokenRegex.g4 by ANTLR 4.7

    package fr.univnantes.lina.uima.tkregex.antlr.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UimaTokenRegexParser}.
 */
public interface UimaTokenRegexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#ruleList}.
	 * @param ctx the parse tree
	 */
	void enterRuleList(UimaTokenRegexParser.RuleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#ruleList}.
	 * @param ctx the parse tree
	 */
	void exitRuleList(UimaTokenRegexParser.RuleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#headerBlock}.
	 * @param ctx the parse tree
	 */
	void enterHeaderBlock(UimaTokenRegexParser.HeaderBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#headerBlock}.
	 * @param ctx the parse tree
	 */
	void exitHeaderBlock(UimaTokenRegexParser.HeaderBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(UimaTokenRegexParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(UimaTokenRegexParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#useDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUseDeclaration(UimaTokenRegexParser.UseDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#useDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUseDeclaration(UimaTokenRegexParser.UseDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#javaMatcherDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterJavaMatcherDeclaration(UimaTokenRegexParser.JavaMatcherDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#javaMatcherDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitJavaMatcherDeclaration(UimaTokenRegexParser.JavaMatcherDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#optionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOptionDeclaration(UimaTokenRegexParser.OptionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#optionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOptionDeclaration(UimaTokenRegexParser.OptionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#shortcutMatcherDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterShortcutMatcherDeclaration(UimaTokenRegexParser.ShortcutMatcherDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#shortcutMatcherDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitShortcutMatcherDeclaration(UimaTokenRegexParser.ShortcutMatcherDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#labelIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterLabelIdentifier(UimaTokenRegexParser.LabelIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#labelIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitLabelIdentifier(UimaTokenRegexParser.LabelIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#ruleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRuleDeclaration(UimaTokenRegexParser.RuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#ruleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRuleDeclaration(UimaTokenRegexParser.RuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#automatonDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAutomatonDeclaration(UimaTokenRegexParser.AutomatonDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#automatonDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAutomatonDeclaration(UimaTokenRegexParser.AutomatonDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void enterRuleName(UimaTokenRegexParser.RuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void exitRuleName(UimaTokenRegexParser.RuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#matcherDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMatcherDeclaration(UimaTokenRegexParser.MatcherDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#matcherDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMatcherDeclaration(UimaTokenRegexParser.MatcherDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#orBranchingDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOrBranchingDeclaration(UimaTokenRegexParser.OrBranchingDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#orBranchingDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOrBranchingDeclaration(UimaTokenRegexParser.OrBranchingDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#featureMatcherDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFeatureMatcherDeclaration(UimaTokenRegexParser.FeatureMatcherDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#featureMatcherDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFeatureMatcherDeclaration(UimaTokenRegexParser.FeatureMatcherDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndexpression(UimaTokenRegexParser.AndexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndexpression(UimaTokenRegexParser.AndexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#orexpression}.
	 * @param ctx the parse tree
	 */
	void enterOrexpression(UimaTokenRegexParser.OrexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#orexpression}.
	 * @param ctx the parse tree
	 */
	void exitOrexpression(UimaTokenRegexParser.OrexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(UimaTokenRegexParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(UimaTokenRegexParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicExpression(UimaTokenRegexParser.AtomicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicExpression(UimaTokenRegexParser.AtomicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#quantifierDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterQuantifierDeclaration(UimaTokenRegexParser.QuantifierDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#quantifierDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitQuantifierDeclaration(UimaTokenRegexParser.QuantifierDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#featureName}.
	 * @param ctx the parse tree
	 */
	void enterFeatureName(UimaTokenRegexParser.FeatureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#featureName}.
	 * @param ctx the parse tree
	 */
	void exitFeatureName(UimaTokenRegexParser.FeatureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#arrayOperator}.
	 * @param ctx the parse tree
	 */
	void enterArrayOperator(UimaTokenRegexParser.ArrayOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#arrayOperator}.
	 * @param ctx the parse tree
	 */
	void exitArrayOperator(UimaTokenRegexParser.ArrayOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(UimaTokenRegexParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(UimaTokenRegexParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#coveredTextArray}.
	 * @param ctx the parse tree
	 */
	void enterCoveredTextArray(UimaTokenRegexParser.CoveredTextArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#coveredTextArray}.
	 * @param ctx the parse tree
	 */
	void exitCoveredTextArray(UimaTokenRegexParser.CoveredTextArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#coveredTextIgnoreCase}.
	 * @param ctx the parse tree
	 */
	void enterCoveredTextIgnoreCase(UimaTokenRegexParser.CoveredTextIgnoreCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#coveredTextIgnoreCase}.
	 * @param ctx the parse tree
	 */
	void exitCoveredTextIgnoreCase(UimaTokenRegexParser.CoveredTextIgnoreCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#coveredTextExactly}.
	 * @param ctx the parse tree
	 */
	void enterCoveredTextExactly(UimaTokenRegexParser.CoveredTextExactlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#coveredTextExactly}.
	 * @param ctx the parse tree
	 */
	void exitCoveredTextExactly(UimaTokenRegexParser.CoveredTextExactlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#literalArray}.
	 * @param ctx the parse tree
	 */
	void enterLiteralArray(UimaTokenRegexParser.LiteralArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#literalArray}.
	 * @param ctx the parse tree
	 */
	void exitLiteralArray(UimaTokenRegexParser.LiteralArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link UimaTokenRegexParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(UimaTokenRegexParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link UimaTokenRegexParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(UimaTokenRegexParser.LiteralContext ctx);
}