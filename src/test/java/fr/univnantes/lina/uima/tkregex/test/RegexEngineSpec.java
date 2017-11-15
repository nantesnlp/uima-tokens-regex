package fr.univnantes.lina.uima.tkregex.test;

import com.google.common.collect.Lists;
import fr.univnantes.lina.test.uima.A;
import fr.univnantes.lina.test.uima.B;
import fr.univnantes.lina.test.uima.C;
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
import java.util.List;
import java.util.stream.Collectors;

public class RegexEngineSpec {

	private static class Result {
		Rule rule;
		RegexOccurrence episode;

		Result(Rule rule, RegexOccurrence episode) {
			this.rule = rule;
			this.episode = episode;
		}
	}
	private JCas cas;
	private Rule ruleAB, ruleAC, ruleBC, ruleCA, ruleAA, ruleA, ruleB, ruleC, ruleBA;
	private Type typeA, typeB, typeC;

	/*
	    B----
	    B-- C
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
		Mocks.anno(cas, C.class, 6,7);
		typeA = Fixtures.getType(A.class);
		typeB = Fixtures.getType(B.class);
		typeC = Fixtures.getType(C.class);
		ruleA = toRule("ruleA", A.class);
		ruleB = toRule("ruleB", B.class);
		ruleC = toRule("ruleC", C.class);
		ruleAB = toRule("ruleAB", A.class, B.class);
		ruleAC = toRule("ruleAC", A.class, C.class);
		ruleBC = toRule("ruleBC", B.class, C.class);
		ruleCA = toRule("ruleCA", C.class, A.class);
		ruleAA = toRule("ruleAA", A.class, A.class);
		ruleBA = toRule("ruleAA", B.class, A.class);
	}

	private List<Result> processRules(Rule... rules) {
		List<Result> recognizedOccurrences = Lists.newArrayList();

		RegexEngine regexEngine = new RegexEngine(
				Lists.newArrayList(rules),
				Lists.newArrayList(typeA, typeB, typeC),
				(cas, episode, rule) -> recognizedOccurrences.add(new Result(rule, episode))
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
	public void testAC() {
		List<Result> occurrences = processRules(ruleAC);
		Assertions.assertThat(occurrences)
				.hasSize(1)
				.extracting("episode.begin", "episode.end", "rule.name")
				.containsExactly(Tuple.tuple(4, 7, "ruleAC"));
	}

	@Test
	public void testAB() {
		List<Result> occurrences = processRules(ruleAB);
		Assertions.assertThat(occurrences)
				.hasSize(2)
				.extracting("episode.begin", "episode.end", "rule.name")
				.containsExactly(
						Tuple.tuple(0, 5, "ruleAB"),
						Tuple.tuple(0, 7, "ruleAB")
						);
	}

	@Test
	public void testAA() {
		List<Result> occurrences = processRules(ruleAA);
		Assertions.assertThat(occurrences)
				.hasSize(4)
				.extracting("episode.begin", "episode.end", "rule.name")
				.containsExactly(
						Tuple.tuple(0, 3, "ruleAA"),
						Tuple.tuple(2, 5, "ruleAA"),
						Tuple.tuple(4, 7, "ruleAA"),
						Tuple.tuple(6, 9, "ruleAA")
				);
	}


	@Test
	public void testBA() {
		List<Result> occurrences = processRules(ruleBA);
		Assertions.assertThat(occurrences)
				.hasSize(2)
				.extracting("episode.begin", "episode.end", "rule.name")
				.containsExactly(
						Tuple.tuple(2, 7, "ruleBA"),
						Tuple.tuple(2, 9, "ruleBA")
				);
	}

	@Test
	public void testBC() {
		List<Result> occurrences = processRules(ruleBC);
		Assertions.assertThat(occurrences)
				.hasSize(1)
				.extracting("episode.begin", "episode.end", "rule.name")
				.containsExactly(Tuple.tuple(2, 7, "ruleBC"));
	}

	@Test
	public void testB() {
		List<Result> occurrences = processRules(ruleB);
		Assertions.assertThat(occurrences)
				.hasSize(2)
				.extracting("begin", "end", "rule.name")
				.containsExactly(
						Tuple.tuple(2, 7, "ruleB"),
						Tuple.tuple(2, 5, "ruleB")
						);
	}


	@Test
	public void testC() {
		List<Result> occurrences = processRules(ruleC);
		Assertions.assertThat(occurrences)
				.hasSize(1)
				.extracting("begin", "end", "rule.name")
				.containsExactly(
						Tuple.tuple(6, 7, "ruleC")
				);
	}

	@Test
	public void testA() {
		List<Result> occurrences = processRules(ruleA);
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
