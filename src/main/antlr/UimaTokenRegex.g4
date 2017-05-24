grammar UimaTokenRegex;
@header {
    package fr.univnantes.lina.uima.tkregex.antlr.generated;
}

/**
 * Define a grammar called Hello
 */
ruleList
	:	headerBlock shortcutMatcherDeclaration* ruleDeclaration+
	;
	
headerBlock 
	:  importDeclaration useDeclaration optionDeclaration* 
	;

importDeclaration
	: IMPORT Identifier ';'
	;

useDeclaration
	:  USE Identifier ('as' IdentifierPart )? ';'
	;

optionDeclaration
	:  SET Identifier '=' literal ';'
	;
	
shortcutMatcherDeclaration
	: MATCHER Identifier ('as' labelIdentifier)? ':'  (featureMatcherDeclaration | Regex ) ';' 
	;
	
labelIdentifier
	: Identifier
	;
	
ruleDeclaration
	: (TERM | VARIANT) ruleName (',' grammaticalCategory)? ':' orBranch ';'
	;

ruleName
	:	StringLiteral 
	;

grammaticalCategory
	:	StringLiteral 
	;
	

matcherDeclaration
	:  ( IgnoreMatcher? Regex 
		| IgnoreMatcher? Identifier 
		| IgnoreMatcher? featureMatcherDeclaration  
		| orBranchingDeclaration
	  ) quantifierDeclaration?
	;
	
orBranchingDeclaration
	:('(' orBranch ('|' orBranch)+)
	;

orBranch
	: matcherDeclaration+
	;

featureMatcherDeclaration
	:  '[' andexpression? ']'
	;

//first, we try to match all first level && (e.g. && not included in some sub-expression)
andexpression 
	: orexpression (AND orexpression)*
	;

//second, we try to match all first level || (e.g. || not included in some sub-expression)
orexpression 
	: expression (OR expression )* 
	;

expression
	: Identifier
	| featureName operator literal
	| builtinFunction
	| '(' andexpression ')'
	;
	
quantifierDeclaration
	: '{' IntegerLiteral '}'
	| '*'
	| '?'
	| '+'
	;
	
builtinFunction
	:  Identifier '(' ')'
	;

featureName
	: Identifier
	;
	

operator
	: '=='
	| '!='
	| '<'
	| '<='
	| '>'
	| '>='
	;
	
IgnoreMatcher
	: '~'
	;	
// Literals
literal
	: StringLiteral
	| IntegerLiteral
	| BooleanLiteral
	| FloatingPointLiteral
	;

// IntegerLiteral
IntegerLiteral
	: '0'
	| NonZeroDigit Digit*
	;
NonZeroDigit: [1-9];
Digit: [0-9];
	
// Boolean Literals
BooleanLiteral
	:   'true'
    |   'false'
    ;

// String Literals
StringLiteral
    :   '"' StringCharacters? '"'
    ;

fragment
StringCharacters
    :   StringCharacter+
    ;

fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;

fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    ;

// Floats literal
FloatingPointLiteral
    :   Digit+ '.' Digit+
    ;
    
// Syntactic tokens
LCURL          : '{';
RCURL          : '}';
LPAREN          : '(';
RPAREN          : ')';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';



//  Regex Quantifiers
QUESTION        : '?';
COLON           : ':';
MUL             : '*';
PLUS             : '+';


//  Logical Operators
AND             : '&';
OR              : '|';

//  Operators
GT              : '>';
LT              : '<';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
IN        : 'in';

//header block declaration
IMPORT	: 'import';
USE	: 'use';
SET	: 'set';

// Comments
LINE_COMMENT
    :   '#' ~[\r\n]* -> skip
    ;

// Matcher declaration
MATCHER	: 'matcher';
// Rule declaration
TERM	: 'term';
// Variant declaration
VARIANT	: 'variant';


Identifier
    :   IdentifierPart ('.' IdentifierPart)*
    ;

IdentifierPart
    :   FirstLetter JavaLetterOrDigit*
    ;

fragment
FirstLetter
    :   [a-zA-Z_] // these are the "java letters" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

	
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines


Regex: '/' (~[/]| EscapeSequence)* '/';


