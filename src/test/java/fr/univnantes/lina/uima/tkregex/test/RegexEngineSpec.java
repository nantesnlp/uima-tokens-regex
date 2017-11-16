package fr.univnantes.lina.uima.tkregex.test;

import com.google.common.collect.Lists;
import fr.univnantes.lina.test.uima.A;
import fr.univnantes.lina.test.uima.B;
import fr.univnantes.lina.test.uima.D;
import fr.univnantes.lina.uima.tkregex.ae.RegexEngine;
import fr.univnantes.lina.uima.tkregex.model.automata.AutomatonFactory;
import fr.univnantes.lina.uima.tkregex.model.automata.RegexOccurrence;
import fr.univnantes.lina.uima.tkregex.model.automata.Rule;
import fr.univnantes.lina.uima.tkregex.test.utils.Fixtures;
import fr.univnantes.lina.uima.tkregex.test.utils.Mocks;
import org.apache.uima.UIMAException;
import org.apache.uima.cas.Type;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.assertj.core.api.Assertions;
import org.assertj.core.groups.Tuple;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class RegexEngineSpec {

	private JCas cas;
	private Rule ruleAB, ruleAD, ruleBD, ruleDA, ruleAA, ruleA, ruleB, ruleD, ruleBA;
	private Type typeA, typeB, typeD;

	/*
	    B----
	    B-- D
	  A A A A A
	  */
	@Before
	public void setup() throws UIMAException {
		cas = JCasFactory.createJCas();
		Mocks.anno(cas, A.class, 0,1);
		Mocks.anno(cas, A.class, 2,3);
		Mocks.anno(cas, A.class, 4,5);
		Mocks.anno(cas, A.class, 6,7);
		Mocks.anno(cas, A.class, 8,9);
		Mocks.anno(cas, B.class, 2,5);
		Mocks.anno(cas, B.class, 2,7);
		Mocks.anno(cas, D.class, 6,7);
		typeA = Fixtures.getType(A.class);
		typeB = Fixtures.getType(B.class);
		typeD = Fixtures.getType(D.class);
		ruleA = toRule("ruleA", A.class);
		ruleB = toRule("ruleB", B.class);
		ruleD = toRule("ruleD", D.class);
		ruleAB = toRule("ruleAB", A.class, B.class);
		ruleAD = toRule("ruleAD", A.class, D.class);
		ruleBD = toRule("ruleBD", B.class, D.class);
		ruleDA = toRule("ruleDA", D.class, A.class);
		ruleAA = toRule("ruleAA", A.class, A.class);
		ruleBA = toRule("ruleBA", B.class, A.class);
	}

	private List<RegexOccurrence> processRules(Rule... rules) {
		List<RegexOccurrence> recognizedOccurrences = Lists.newArrayList();

		RegexEngine regexEngine = new RegexEngine(
				Lists.newArrayList(rules),
				Lists.newArrayList(typeA, typeB, typeD),
				(cas, episode) -> recognizedOccurrences.add(episode)
		);
		regexEngine.process(cas);

		return recognizedOccurrences;
	}

	private Rule toRule(String ruleName, Class<? extends Annotation> cls, Class<? extends Annotation>... classes) {
		List<Class<? extends Annotation>> list = new ArrayList<>();
		list.add(cls);
		for(Class<? extends Annotation> c:classes)
			list.add(c);
		Rule rule = new Rule(AutomatonFactory.createConcatenation(
			list.stream()
				.map(c -> AutomatonFactory.createSimpleAutomaton(Fixtures.createTypeMatcher(c)))
				.collect(Collectors.toList())
		), ruleName);
		return rule;
	}

	@Test
	public void testAD() {
		List<RegexOccurrence> occurrences = processRules(ruleAD);
		Assertions.assertThat(occurrences)
				.hasSize(1)
				.extracting("begin", "end", "rule.name")
				.containsExactly(Tuple.tuple(4, 7, "ruleAD"));
	}

	@Test
	public void testAB() {
		List<RegexOccurrence> occurrences = processRules(ruleAB);
		Assertions.assertThat(occurrences)
				.hasSize(2)
				.extracting("begin", "end", "rule.name")
				.containsExactly(
						Tuple.tuple(0, 5, "ruleAB"),
						Tuple.tuple(0, 7, "ruleAB")
						);
	}

	@Test
	public void testAA() {
		List<RegexOccurrence> occurrences = processRules(ruleAA);
		Assertions.assertThat(occurrences)
				.hasSize(4)
				.extracting("begin", "end", "rule.name")
				.containsExactly(
						Tuple.tuple(0, 3, "ruleAA"),
						Tuple.tuple(2, 5, "ruleAA"),
						Tuple.tuple(4, 7, "ruleAA"),
						Tuple.tuple(6, 9, "ruleAA")
				);
	}


	@Test
	public void testBA() {
		List<RegexOccurrence> occurrences = processRules(ruleBA);
		Assertions.assertThat(occurrences)
				.hasSize(2)
				.extracting("begin", "end", "rule.name")
				.containsExactly(
						Tuple.tuple(2, 7, "ruleBA"),
						Tuple.tuple(2, 9, "ruleBA")
				);
	}

	@Test
	public void testBD() {
		List<RegexOccurrence> occurrences = processRules(ruleBD);
		Assertions.assertThat(occurrences)
				.hasSize(1)
				.extracting("begin", "end", "rule.name")
				.containsExactly(Tuple.tuple(2, 7, "ruleBD"));
	}

	@Test
	public void testB() {
		List<RegexOccurrence> occurrences = processRules(ruleB);
		Assertions.assertThat(occurrences)
				.hasSize(2)
				.extracting("begin", "end", "rule.name")
				.containsExactly(
						Tuple.tuple(2, 7, "ruleB"),
						Tuple.tuple(2, 5, "ruleB")
						);
	}


	@Test
	public void testD() {
		List<RegexOccurrence> occurrences = processRules(ruleD);
		Assertions.assertThat(occurrences)
				.hasSize(1)
				.extracting("begin", "end", "rule.name")
				.containsExactly(
						Tuple.tuple(6, 7, "ruleD")
				);
	}

	@Test
	public void testA() {
		List<RegexOccurrence> occurrences = processRules(ruleA);
		Assertions.assertThat(occurrences)
				.hasSize(5)
				.extracting("begin", "end", "rule.name")
				.containsExactly(
						Tuple.tuple(0, 1, "ruleA"),
						Tuple.tuple(2, 3, "ruleA"),
						Tuple.tuple(4, 5, "ruleA"),
						Tuple.tuple(6, 7, "ruleA"),
						Tuple.tuple(8, 9, "ruleA")
				);
	}
}
