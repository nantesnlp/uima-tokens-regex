/*******************************************************************************
 * Copyright 2015-2017 - CNRS (Centre National de Recherche Scientifique)
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 *******************************************************************************/
grammar UimaTokenRegex;
@header {
}

ruleList
	:	headerBlock shortcutMatcherDeclaration* ruleDeclaration*
	;
	
headerBlock 
	:  typeSystemDeclaration
	useDeclaration
	importMatchersDeclaration* // Force matcher declarations before java matcher declarations
	(externalListDeclaration | optionDeclaration)*
	javaMatcherDeclaration*
	;

typeSystemDeclaration
	: TYPE_SYSTEM Identifier ';'
	;

importMatchersDeclaration
	: IMPORT_MATCHERS_FROM path ';' ;


useDeclaration
	:  mainUseDeclaration
	  ( ',' secondaryUseDeclaration )*
	  ( ',' secondaryUseDeclaration )*
	  ';'

	;

mainUseDeclaration : USE typeFullName ('as' typeShortName )? ;



secondaryUseDeclaration : typeFullName 'as' typeShortName ;
typeFullName : Identifier ;

typeShortName : Identifier ;

javaMatcherDeclaration
	: JAVA_MATCHER ':' Identifier ';'
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
	: RULE ruleName ':' automatonDeclaration ';'
	;
	
	
automatonDeclaration
	: orBranchingDeclaration +
	;
	
ruleName
	:	StringLiteral 
	;
	

matcherDeclaration
	:  ( IgnoreMatcher? Regex 
		| IgnoreMatcher? Identifier 
		| IgnoreMatcher? featureMatcherDeclaration  
	  ) 
	;
	
orBranchingDeclaration
	: (	'(' automatonDeclaration ('|' automatonDeclaration)* ')'
		| 	matcherDeclaration
		) quantifierDeclaration? 
	;

featureMatcherDeclaration
	: '[' ']'
	|  '[' ( expression | andexpression | orexpression ) ']'
	;

//first, we try to match all first level && (e.g. && not included in some sub-expression)
andexpression 
	: expression (AND expression)*
	;

//second, we try to match all first level || (e.g. || not included in some sub-expression)
orexpression 
	: expression (OR expression )* 
	;

expression
	: atomicExpression
	| '(' orexpression  ')'
	| '(' andexpression ')'
	;
	
	
atomicExpression
	: matcherIdentifier
	| featureName operator literal
	| featureName arrayOperator literalArray
	| featureName inStringListOperator resourceIdentifier
	| 'text' '==' coveredTextIgnoreCase
	| 'text' '===' coveredTextExactly
	| 'text' inStringListOperator coveredTextArray
	| 'text' inStringListOperator resourceIdentifier
	;

matcherIdentifier : Identifier ;

resourceIdentifier
	: Identifier
	;

externalListDeclaration
	: RESOURCE resourceIdentifier ':'
	 (simpleListDefinition
		| csvListDefinition
		| tsvListDefinition
		| jsonListDefinition
		| yamlListDefinition)
	';'
	;

simpleListDefinition : 'list' '(' path ')' ;

path : StringLiteral ;

yamlListDefinition : 'yaml' '(' path ',' keypath ')' ;

jsonListDefinition : 'json' '(' path ',' keypath ')' ;

csvListDefinition : 'csv' '(' path ','  separator ','  quote ',' IntegerLiteral  ')' ;

tsvListDefinition : 'tsv' '(' path (',' IntegerLiteral) ? ')' ;

quote : StringLiteral ;

separator
	: StringLiteral
	;

keypath
	: StringLiteral
	;


quantifierDeclaration
	: '{' IntegerLiteral (',' IntegerLiteral)? '}'
	| '*'
	| '?'
	| '+'
	;
	
featureName
	: (typeShortName '.' )? featureBaseName
	;

featureBaseName : Identifier ;

arrayOperator
	: 'in'
	| 'nin'
	;

inStringListOperator
	: arrayOperator
	| 'inIgnoreCase'
	| 'ninIgnoreCase'
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
	
// covered text
coveredTextArray
	: '[' StringLiteral (',' StringLiteral)* ']'
	;

// covered text
coveredTextIgnoreCase
	: StringLiteral;
	
// covered text
coveredTextExactly
	: StringLiteral;

literalArray
	: '[' literal (',' literal)* ']'
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
TYPE_SYSTEM	: 'type-system';
IMPORT_MATCHERS_FROM	: 'import-matchers-from';
USE	: 'use';
SET	: 'set';
JAVA_MATCHER	: 'java-matcher';
RESOURCE : 'resource';

// Comments
LINE_COMMENT
    :   '#' ~[\r\n]* -> channel(HIDDEN)
    ;

// Matcher declaration
MATCHER	: 'matcher';
// Rule declaration
RULE	: 'rule';


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

	
WS : [ \t\r\n]+ -> channel(HIDDEN) ; // skip spaces, tabs, newlines


Regex: '/' (~[/]| EscapeSequence)* '/';


