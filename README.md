[![Build Status](https://travis-ci.org/nantesnlp/uima-tokens-regex.svg?branch=master)](https://travis-ci.org/nantesnlp/uima-tokens-regex)](https://travis-ci.org/JuleStar/uima-tokens-regex)  [ ![Download](https://api.bintray.com/packages/pompadour/maven/uima-tokens-regex/images/download.svg) ](https://bintray.com/pompadour/maven/uima-tokens-regex/_latestVersion) 
*UIMA Tokens Regex* is a *UIMA* Analysis Engine (AE) that implements regex-like pattern matching over a sequence of UIMA annotations.


#### Publication

*UIMA Tokens Regex* has been described together with [TermSuite](http://termsuite.github.io/) and published as system demonstration at ACL2016:

<blockquote>
<p><span>Damien Cram and Béatrice Daille.</span> <em>Terminology Extraction with Term Variant Detection.</em> Proceedings of ACL-2016 System Demonstrations. <a href="https://aclweb.org/anthology/P/P16/P16-4003.pdf">Download PDF</a></p>
</blockquote>

* [Getting started](#getting-started)
  * [1. Classpath](#1-classpath)
  * [2. Create your custom regex rule file](#2-create-your-custom-regex-rule-file)
  * [3. Inherit from TokenRegexAE](#3-inherit-from-tokenregexae)
  * [4. Glue everything together with UIMAfit](#4-glue-everything-together-with-uimafit)
* [Documentation](#documentation)
  * [The <em>UIMA Tokens Regex</em> resource file](#the-uima-tokens-regex-resource-file)
    * [Rule file header: import, <code>use</code>, <code>set</code>](#rule-file-header-import-use-set)
      * [import](#import)
       * [use](#use)
       * [set](#set)
    * [Rule definition: the keyword rule](#rule-definition-the-keyword-rule)
    * [Matcher definition](#matcher-definition)
       * [The feature structure matcher](#the-feature-structure-matcher)
       * [The covered text string matcher, defined with /~/](#the-covered-text-string-matcher-defined-with-)
    * [Matcher predefinition: the keyword matcher](#matcher-predefinition-the-keyword-matcher)
    * [The keyword as](#the-keyword-as)
    * [The quantifiers: <code>?</code>, <code>*</code>, <code>+</code>, <code>{n}</code>, <code>{m,n}</code>](#the-quantifiers----n-mn)
    * [Sub-rule disjunctions |](#sub-rule-disjunctions-)
    * [Sub-rule quantifiers](#sub-rule-quantifiers)
    * [The universal matcher []](#the-universal-matcher-)
    * [Ignoring labels with ~](#ignoring-labels-with-)
    * [Commenting with #](#commenting-with-)
    * [Example rule list resource file](#example-rule-list-resource-file)
  * [<em>UIMA Tokens Regex</em> Analysis Engine (AE)](#uima-tokens-regex-analysis-engine-ae)
    * [Sequential scanning of annotations](#sequential-scanning-of-annotations)
    * [Definition of the Java handler method](#definition-of-the-java-handler-method)
     * [Extending the class TokenRegexAE](#extending-the-class-tokenregexae)
     * [The Occurrence class](#the-occurrence-class)
     * [The Rule class](#the-rule-class)
  * [Example implementation of <em>UIMA Tokens Regex</em> AE](#example-implementation-of-uima-tokens-regex-ae)


# Getting started

### 1. Classpath

Add *UIMA Tokens Regex* to your classpath, with *Maven* or *Gradle*:

Maven:

```xml
<dependency>
    <groupId>fr.univ-nantes.julestar</groupId>
    <artifactId>uima-tokens-regex</artifactId>
    <version>1.5</version>
</dependency>
```

Gradle:

```
compile 'fr.univ-nantes.julestar:uima-tokens-regex:1.5'
```

Or [download the *jar*](http://central.maven.org/maven2/fr/univ-nantes/julestar/uima-tokens-regex/1.5/uima-tokens-regex-1.5.jar) and add it manually to your classpath.


### 2. Create your custom regex rule file

The next thing to do is writing the regex rules in valid *UIMA Tokens Regex* format.
Example:

```
# file: my-regex-list.txt

# your UIMA type system
import fr.univnantes.termsuite.types.TermSuiteTypeSystem;

# the annotation type your need to analyse
use fr.univnantes.termsuite.types.WordAnnotation;

rule "rule 1": [category="noun"] /^of$/ /^the$/? [category="noun"] ;
```
The minimalist file above defines only one rule: `rule 1`, which matches in a sequence of word annotations any subsequence starting with a *noun*, followed by the preprosition *of*, followed optionnaly by (see the quantifier "`?`") the determiner *the*, followed by a *noun* again.

For example, this rule matches the following subsequences: `top of the tower`, `source of energy`, `power of the wind`, etc.

The `import` statement points to your UIMA type system  (must-be accessible from UIMAfit). The `use` statement points to the UIMA annotation type being analyzed in the type system. See [Documentation](#documentation) for more details on the syntax.


### 3. Inherit from TokenRegexAE

Create a java class extending `TokenRegexAE`. It will be called whenever a rule has matched. The following example creates a new UIMA annotation of type *OccAnno* whenever a rule matches.

```java
public class RecogEngine extends TokenRegexAE {
	@Override
	protected void ruleMatched(JCas jCas, RegexOccurrence occurrence) {
		OccAnno a = new OccAnno(jCas);
		a.setBegin(occurrence.getBegin());
		a.setEnd(occurrence.getEnd());
		a.setRule(occurrence.getRule().getName());
		a.setPattern(occurrence.getLabelledAnnotations().stream()
        .map(LabelledAnnotation::getLabel)
        .collect(Collectors.joining(" ")));
		a.addToIndexes();
	}
}
```

### 4. Glue everything together with UIMAfit

Create your AE description and and run the pipeline:

```java
// The AE description
AnalysisEngineDescription ae = AnalysisEngineFactory.createEngineDescription(RecogEngine.class);

// The UIMA resource description of your list of regex rules
ExternalResourceDescription	resDesc = ExternalResourceFactory.createExternalResourceDescription(
    RegexListResource.class,
    "file:my-regex-list.txt"
  );

// Bind AE description to the resource description
ExternalResourceFactory.bindResource(
    ae,
    TokenRegexAE.TOKEN_REGEX_RULES,
    resDesc);

// Run the pipeline
AnalysisEngine engine = UIMAFramework.produceAnalysisEngine(ae);
SimplePipeline.runPipeline(cas, engine);
```

# Documentation

Getting *UIMA Tokens Regex* to work requires two mandatory phases: defining the *UIMA Tokens Regex* resource file (a list of rules, see [The *UIMA Tokens Regex* resource file](#the-uima-tokens-regex-resource-file)) and implementing the engine logic in `Java` ([*UIMA Tokens Regex* AE](#uima-tokens-regex-analysis-engine-ae)).

### The *UIMA Tokens Regex* resource file

The *UIMA Tokens Regex* resource file is the list of rules that *UIMA Tokens Regex* AE needs as input. This resource file consists in three parts, details in next subsections :

 1. the file header (mandatory)
 1. the definition of matchers (optional)
 1. the definition of rules (mandatory)

**Example**

```
# Header
import eu.project.ttc.types.TermSuiteTypeSystem;
use eu.project.ttc.types.WordAnnotation;
set inline = false;

# Definition of matchers
matcher A: [category=="adjective"];
matcher N: [category=="noun"];

# Definition of rules
rule "an": A N;
rule "nnn": N N N;
rule "nn": N N;
```

#### Rule file header: `import`, `use`, `set`

##### `import`

The `import` statement is mandatory and unique. It takes as value the path to the type system definition of the CAS to analyse.

##### `use`

The `use` statement is mandatory and unique. It takes as value the fully qualified name of the analysed type (must be defined in the type system). The feature names available in matcher declarations (see [Matcher definition](#matcher-definition)) are the features contained in the type declared with the keyword `use`.

##### `set`

The `set` statement is optional and may be declared multiple times. It configures the options of the *UIMA Tokens Regex*'s resource parser. Available options are :

 * `inline` (*boolean*, default: `true`) : when set to `true`, matchers can be declared "inline", *i.e.* directly in the right parts of the rules. When set to `true`, the matcher definition part is optional.


#### Rule definition: the keyword `rule`

Each rule is defined with the keyword `rule`, a mandatory rule name, a colon `:`, the regular expression part (*i.e.* a sequence of annotation matchers with associated quantifiers) and a semi-colon `;`.

The example below defines the rule named *My rule*, with two annotation matchers : one that matches any annotation with a feature `category` having a value of "noun" (occurring 1 to n times sequentially), followed by one that matches exactly one annotation with a feature `category` having a value of "adjective".

```
rule "My rule": [category=="noun"]+ [category=="adjective"];
```

#### Matcher definition

There are two types of matcher, each defined with its own syntax : the The feature structure matcher and the covered text string matcher.

##### The feature structure matcher

The feature structure matcher applies to *UIMA* feature structures, *i.e.* annotations. It is a boolean expression defined within brackets `[` and `]`.

Each boolean expression has the form `feature` `op` `literal`. In the example below, the rule has one matcher, where `feature` is *category*, `op` is the equality operator `==`, and `literal` is the string value *noun*.

```
rule "My rule": [category=="noun"];
```

Boolean expressions within brackets can also be composed of sub-expressions with the help of parentheses and three types of boolean operators :


| operator | description |
|:---------|:-----------:|
| `&` | the logical conjunction |
| `\|` |  the logical disjunction |


The operators `&` and `|` are n-ary:

```
rule "My rule": [category=="noun" & (lemma == "chair" |
    (stem=="mang" & mood="participle" & tense="past") | lemma=="vitesse")];
```

**UIMA types' features**

All features declared in the type used (see [use](#use)}) can be referenced from the left part of a boolean expression in matchers. For example, if the type used is the UIMA `WordAnnotation` type from [platform TermSuite](https://termsuite.github.io/), the available features would be:

| feature | literal type |
|---|---|
| `begin` | `Integer` |
| `end` |  `Integer` |
| `category` | `String` |
| `lemma` | `String` |
| `stem` | `String` |
| `tag` | `String` |
| `subCategory` | `String` |
| `number` | `String` |
| `gender` | `String` |
| `case` | `String` |
| `mood` | `String` |
| `tense` | `String` |
| `person` | `String` |
| `possessor` | `String` |
| `degree` | `String` |
| `formation` | `String` |


**Operators**

There exists 6 different operators :

| operator | description |
|---|---|
| `==` | the equality |
| `!=` | the inequality |
| `<=` | less than or equal to |
| `<` | less than |
| `>=` | greater than or equal to |
| `>` | greater than |

**Literals**

Four different types of literals are defined:

| Literal type | Possible values in *UIMA Tokens Regex* syntax | Mapped *UIMA* types |
|---|---|
| `String` | "noun", "chair", "axe" | `String` |
| `Integer` | $123$ | `Integer`, `Short`, `Long` |
| `Float` | $123.456$ | `Float`, `Double` |
| `Boolean` | true, false | `Boolean` |

*UIMA* array and list types and associated collection operators (`in`, `not in`, etc.) are not yet supported by *UIMA Tokens Regex*.

##### The covered text string matcher, defined with /~/

The covered text string matcher applies to any *UIMA* textual annotation, *i.e.* annotation with `begin` and `end` features applying on string SOFAs. It is a `Java` regular expressions language  defined between two slashes `/` that matches against the raw text covered by the annotation, *i.e.* the value returned by the method `getCoveredText()`.


For example, the rule below has exactly one matcher that matches any annotation covering a text starting with "mang".

```
rule "My rule": /^mang.*$/;
```

#### Matcher predefinition: the keyword `matcher`

Matcher predefinitions are a list a `matcher` statements occurring after the header and before the `rule` statements.

So far, our examples showed matchers defined *inline*, *i.e.* directly on the right part of the rule. The keyword `matcher` allow to predefine matchers before they are used in rule declaration.

```
matcher M1 : /^mang.*$/;
matcher M2 : [category=="noun"];

rule "My rule": M1 M2;
```

The matcher predefinition declares a *matcher label* (`M1` and `M2` in the example above) and the actual matcher definition.

Matcher labels can be invoked both in rule statements and in other matcher statements. Pay attention that a matcher label invoked in a matcher statement must be defined prior to this statement.


```
matcher B : /^mang.*$/;
matcher B2 : [B & category=="noun"];

rule "My rule": B2+;
```

With such a predefinition syntax, a matcher can be reused several times in different rules, without having to copy many times the same matcher code, hence improving the readability of the rule list.

#### The keyword `as`


The keyword `as` can be optionally used in a matcher predefinition to rename its matcher label.

```
matcher A1 as A: [category=="adjective"];
matcher A2 as A: [category=="verb" & tense="past" & mood="participle"];
matcher N: [category=="noun"];

rule "My rule 1": A1 N;
rule "My rule 2": A2 N;
```

For both rules above, the sequence of matcher labels attached to each rule occurrence extracted by *UIMA Tokens Regex*'s engine (see [*UIMA Tokens Regex* AE](#uima-tokens-regex-analysis-engine-ae)) will be `A N`, instead of `A1 N` for the first rule and `A2 N` for the second rule, because of the `as` keyword.

The keyword `as` has no effect in rule declaration nor in the way the *UIMA Tokens Regex* engine extracts rule occurrences, it only renames labels for later reuse by other AEs in the *UIMA* AE process flow.

#### The quantifiers: `?`, `*`, `+`, `{n}`, `{m,n}`

Any matcher can be associated with one the the following regular expression quantifiers.

| Quantifier | Quantity of successive matching annotations |
|---|---|
| `?` | zero or one |
| `*` | any number (zero or n) |
| `+` | at least one (one or n) |
| `{n}` | exactly n |
| `{m,n}` | from m to n (m ≤ n) |

Example:

```
matcher A: [category=="adjective"];
matcher N: [category=="noun"];
matcher N: [category=="preposition"];

# Matches NA, NRA, NRRA, NRRRA, etc.
rule "My rule 1": N R* A;

# Matches NPN and NPDN
rule "My rule 2": N P D? N;

# Matches NA, NAA, NAAA, etc.
rule "My rule 3": N A+;
```

The quantifiers can be associated to any type of matcher : feature structure matchers, regular expression matchers, and matcher labels :

```
matcher N: [category=="noun"];
matcher N: [category=="adjective"];

# A quantifier associated to a feature structure matcher
rule "My rule 1": N [category="adverb"]* A;

# A quantifier associated to a regular expression matcher
rule "My rule 2": N P /^(de)|(des)|(du)$/? N;

# A quantifier associated to a matcher label (predefined matcher)
rule "My rule 3": N A+;
```

#### Sub-rule disjunctions `|`

Since version 1.5, *UIMA Tokens Regex* allows to declare alternative sub-rule, as with usual regular expressions:

```
rule "My rule 4": N (P N | A) ;
```

#### Sub-rule quantifiers

Since version 1.5, *UIMA Tokens Regex* allows to quantify sub-rule groups as with any matcher:

```
rule "My rule 4": N (P N | A)+ ;
```

All [matcher quantifiers available](#the-quantifiers----n-mn) are also allowed on sub-rules.


#### The universal matcher `[]`

The universal matcher `[]` matches any annotation. It is the equivalent of the dot `.` in string regular expressions.

```
# Matches any subsequence of one of the forms: NPN, NPDN, NPAN, NPDAN, etc.
rule "complex term 1": N P []* N;
```

#### Ignoring labels with `~`


In the right part of rule declaration, any matcher label can be prefixed with the special character `~` to refrain the following label to appear in the rule occurrences extracted by *UIMA Tokens Regex*'s engine.

Each time the engine finds a matching occurrence for a rule, it produces an instance of the class *Occurrence* (see [*UIMA Tokens Regex* AE](#uima-tokens-regex-analysis-engine-ae)). The class *Occurrence* has a method named `getPattern()` returning the sequence of matcher labels that have matched. The effect of the special character `~` is to remove some labels from the pattern.

This functionality is useful when some annotation are mandatory to specify a matching context but useless for further analysis.

The example illustrates this functionality in the case of terminology extraction. We need the rule `My rule` to extract all subsequences having the pattern `NPN`, but we need to appear after a determiner `D`. As we don't want the `D` to appear in the subsequence's pattern, we hide it from the pattern by prefixing it with `~`.

```
matcher N: [category=="noun"];
matcher P: [category=="preposition"];
matcher D: [category=="determiner"];

# The following rule matches DNPDN or DNPN
# but getPattern() will always return NPN
rule "My rule": ~D N P ~D? N;
```

The character `~` does not apply to feature structure matchers nor to regular expression matchers.


#### Commenting with `#`

Any sequence of characters starting with `#` will be considered as a comment and will be ignored by the *UIMA Tokens Regex* parser until the end of the line.

```
# This is ignored
rule "My rule 1": [category=="noun"]

rule "My rule 2": [category=="adjective"];# This is ignored
```


#### Example rule list resource file


The example below is a complete example of a *UIMA Tokens Regex* rule list that is used in the context of complex term detection over english word annotations (`WordAnnotation`) in [TermSuite](https://termsuite.github.io/).

```
import fr.univnantes.termsuite.types.TermSuiteTypeSystem;
use fr.univnantes.termsuite.types.WordAnnotation;
set inline = false;

matcher Prep: [category=="adposition" & subCategory=="preposition"];
matcher P1: [lemma=="of" | lemma=="with"]; # on? between?
matcher P as P: [Prep & P1];
matcher V: [category=="verb"];
matcher A: [category=="adjective" & lemma!="same" & lemma!="many" & lemma!="other" & lemma!="much" & lemma!="several" & lemma!="new"];
matcher Vpp as A: [V & tag=="VBN"]; # past participle
matcher Ving as A: [V & tag=="VBG"]; # gerund or present participle
matcher A2 as A: [A | Vpp | Ving];
matcher N: [category=="noun"];
matcher N1 as N: [category=="noun" & lemma!="number"];
matcher D: [category=="determiner" | category=="article"];

rule "n": N;
rule "a": A2;
rule "r": R;
# from ruta
rule "an": A2 N;
rule "nn": N N;
rule "npn": N1 P ~D? N ;	# modified
# ...
```

See the complete regex file [here](https://github.com/termsuite/termsuite-core/blob/master/src/main/resources/fr/univnantes/termsuite/resources/en/english-multi-word-rule-system.regex).


### *UIMA Tokens Regex* Analysis Engine (AE)


The *UIMA Tokens Regex* AE takes its resource file (*c.f.* [The *UIMA Tokens Regex* resource file](#the-uima-tokens-regex-resource-file)) as input, scans all annotations sequentially (see [Sequential scanning of annotations](#sequential-scanning-of-annotations) for more details) and notifies a `Java` handler method, which must be implemented (See [Definition of the Java handler method](#definition-of-the-java-handler-method)), every time a rule matches.

#### Sequential scanning of annotations

The *UIMA Tokens Regex* AE parses the rule list and creates for each rule exactly one finite state automaton, where each annotation matcher plays the role of a transition label (There are as many annotation matchers as there are transitions). The engine iterates over the sequence of all annotations of the type declared by the keyword `set` (*c.f.* [set](#set)) taken in their natural *UIMA* order (`begin` ascending, `end` descending). The engine propagates the current annotation to all automaton, *i.e.* to n automata, where n is the number of rules declared.

Each time an automaton fails, *i.e.* an automaton cannot propagate the current annotation, the AE behaves as follows:

 * if the automaton was in an acceptable state before failing, then a new occurrence of the rule is created and the handler method `ruleMatched()` is invoked. All other automaton instances of the same automaton are dropped,
 * if the automaton was in no acceptable state before the annotation, the AE drops the current automaton instance and tries to create a new one with the current annotation.


We can deduce two important consequences of this behaviour:

 1. the AE will never produce two overlapping occurrences of a single rule,
 1. occurrences of different rules are produced independently from each other can overlap.

**Example:**

Let's consider the two following rules :

```
matcher N : [myFeat=="N"];
matcher P : [myFeat=="P"];
matcher A : [myFeat=="A"];

rule "Rule1": N P N;
rule "Rule2": N P A N;
```

And the following sequence of annotations (actually figure below represents only the values of the annotations for the feature `myFeat`):

```
NPNPANPN
```

The occurrences recognized by the AE will be :

| --- | --- |
|---|---|
| Occurrences for `Rule1` | [0,3], [5,8], [7,10]  |
| Occurrences extracted by the AE for `Rule1` | [0,3], [5,8] |
| Occurrences for `Rule2` | [2,6] |
| Occurrences extracted by the AE for `Rule2` | [2,6] |
| **Final occurrence set** | `Rule1`: [0,3], [5,8] -- `Rule2`: [2,6] |

In this example, the occurrence [5,8] of `Rule1` overlaps with the previous occurrence of the same rule [0,3]. It is then not recognized by the AE.


#### Definition of the Java handler method

As explained in Section [Sequential scanning of annotations](#sequential-scanning-of-annotations), every time an occurrence is recognized, the method `ruleMatched()` is invoked. All the developer has to do is to extends the class  `TokenRegexAE` and to override its methods (including `ruleMatched()`) so as to implement the desired behaviour of the AE.

##### Extending the class `TokenRegexAE`

Here is the list of the abstract methods of the class `TokenRegexAE` that the user can override :

| Method | Description |
|---|---|
| `ruleMatched(JCas, Occurrence)` | Invoked whenever a rule has matched the sequence of annotations. It is given the *UIMA* CAS object and an instance of the class `Occurrence` with all the details about the matching rule and the matched annotation. (See [`Occurrence`](#the-occurrence-class)) |
| `beforeRuleProcessing(JCas)` | Invoked before the AE starts processing the sequence of annotations. This is where the developer can implement pre-processing instructions. |
| `afterRuleProcessing(JCas)` | Invoked after the AE ends processing the sequence of annotations. This is where the developer can implement post-processing instructions. |


##### The `Occurrence` class


Whenever a rule matches in the sequence of annotations, the AE invokes the method `ruleMatched()` and passes to it an instance of the class `Occurrence`. Here is the list of public methods of this class that the developer can invoke so as to access all matching information available.



| Method | Description |
|--------|-------------|
| `int getBegin()` | returns the *begin* offset of the matching occurrence in the document string. |
| `int getEnd()` | returns the end offset of the matching occurrence in the SOFA string. |
| `Rule getRule()` | returns the rule that this occurrence has matched, as a `Rule` object (see [Rule](#the-rule-class)). |
| `List getAllMatchingAnnotations()` | returns the list of all annotations that make the occurrence of the matching rule. The list includes ignored annotations, *i.e.* annotations being prefixed with [`~`](#ignoring-labels-with). |
| `List getLabelledAnnotations()` | returns the list of annotations that make the occurrence of the matching rule (without ignored annotations) |
| `List getLabels()` | returns the list of the labels of the annotations that make the matching occurrence. |
| `String asPatternString()` | returns the string representation of the labels  returned by `getLabels()`, *i.e.* the labels joined with white spaces. |
| `int size()` | returns the number of annotations that make the occurrence of the matching rule, *i.e.* the size of the list returned by the method `getLabelledAnnotations()`. |

##### The `Rule` class


Each occurrence object has a reference to its matching rule. This rule is an instance of the class `Rule` and has the following public methods.

| Method | Description |
|--------|-------------|
| Method | Description |
| `String getName()` | Returns the rule name as declared by in the left part of the rule statement.|


#### Example implementation of *UIMA Tokens Regex* AE

In the example implementation below, we create on each occurrence recognized an annotation of type `OccAnno` and we set its `begin`, `end`, and `pattern` features from the `Occurrence` object and and its associated rule's name and id.

```java
public class RecogEngine extends TokenRegexAE {
	@Override
	protected void ruleMatched(JCas jCas, RegexOccurrence occurrence) {
		OccAnno a = new OccAnno(jCas);
		a.setBegin(occurrence.getBegin());
		a.setEnd(occurrence.getEnd());
		a.setRule(occurrence.getRule().getName());
		a.setPattern(occurrence.getLabelledAnnotations().stream().map(LabelledAnnotation::getLabel).collect(Collectors.joining(" ")));
		a.addToIndexes();
	}
}
```
