package fr.univnantes.lina.uima.tkregex.test;

import static fr.univnantes.lina.uima.tkregex.test.TestUtils.automatonTest;
import static fr.univnantes.lina.uima.tkregex.test.TestUtils.getSimpleLetterAutomaton;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

import fr.univnantes.lina.uima.tkregex.Automaton;
import fr.univnantes.lina.uima.tkregex.AutomatonFactory;

public class AutomatonFactoryTestCase {
	
	private Automaton a;
	private Automaton b;
	private Automaton c;

	@Before
	public void setUp() throws Exception {
		this.a = getSimpleLetterAutomaton("a");
		this.b = getSimpleLetterAutomaton("b");
		this.c = getSimpleLetterAutomaton("c");
	}
	

	@Test
	public void testCreateMNAutomaton() {
		Automaton a24 = AutomatonFactory.createMNAutomaton(this.a, 2,4);
		automatonTest(
				"",
				a24,
				""
				);
		automatonTest(
				"a",
				a24,
				""
				);
		automatonTest(
				"a a",
				a24,
				"a a (0,2)"
				);
		automatonTest(
				"a a a",
				a24,
				"a a a (0,3)"
				);
		automatonTest(
				"a a a a",
				a24,
				"a a a a (0,4)"
				);
		automatonTest(
				"a a a a a",
				a24,
				"a a a a (0,4)"
				);
		automatonTest(
				"a a a a a a",
				a24,
				"a a a a (0,4) | a a (4,6)"
				);
	}

	@Test
	public void testCreateNAutomaton() {
		Automaton a3 = AutomatonFactory.createNAutomaton(this.a, 3);
		automatonTest(
				"",
				a3,
				""
				);
		automatonTest(
				"a",
				a3,
				""
				);
		automatonTest(
				"a a",
				a3,
				""
				);
		automatonTest(
				"a a a",
				a3,
				"a a a (0,3)"
				);
		automatonTest(
				"a a a a",
				a3,
				"a a a (0,3)"
				);
		automatonTest(
				"a a a a a",
				a3,
				"a a a (0,3)"
				);
		automatonTest(
				"a a a a a a",
				a3,
				"a a a (0,3) | a a a (3,6)"
				);
		automatonTest(
				"a b a a",
				a3,
				""
				);
		automatonTest(
				"a b a a a c",
				a3,
				"a a a (2,5)"
				);

	}

	@Test
	public void testCreateZeroOneAutomaton() {
		Automaton a01 = AutomatonFactory.createZeroOneAutomaton(this.a);
		automatonTest(
				"",
				a01,
				" (none)"
				);
		automatonTest(
				"a",
				a01,
				"a (0,1) |  (none)"
				);
		automatonTest(
				"a b a",
				a01,
				"a (0,1) |  (none) | a (2,3) |  (none)"
				);
		automatonTest(
				"a a",
				a01,
				"a (0,1) | a (1,2) |  (none)"
				);
		automatonTest(
				"b c d",
				a01,
				" (none) |  (none) |  (none) |  (none)"
				);
	}

	@Test
	public void testCreatePlusAutomaton() {
		Automaton aPlus = AutomatonFactory.createPlusAutomaton(this.a);
		automatonTest(
				"a",
				aPlus,
				"a (0,1)"
				);
		automatonTest(
				"a a a a",
				aPlus,
				"a a a a (0,4)"
				);
		automatonTest(
				"",
				aPlus,
				""
				);
	}

	@Test
	public void testCreateStarAutomaton() {
		Automaton aStar = AutomatonFactory.createStarAutomaton(this.a);
		automatonTest(
				"a",
				aStar,
				"a (0,1) |  (none)"
				);
		automatonTest(
				"a a a a",
				aStar,
				"a a a a (0,4) |  (none)"
				);
		automatonTest(
				"",
				aStar,
				" (none)"
				);

	}

	@Test
	public void testCreateOrAutomaton() {
		Automaton a_bc = AutomatonFactory.createConcatenation(ImmutableList.of(
				AutomatonFactory.createOrAutomaton(ImmutableList.of(this.a, this.b)),
				this.c
				));
		automatonTest(
				"",
				a_bc,
				""
				);
		automatonTest(
				"a",
				a_bc,
				""
				);
		automatonTest(
				"b",
				a_bc,
				""
				);
		automatonTest(
				"c",
				a_bc,
				""
				);
		automatonTest(
				"a c",
				a_bc,
				"a c (0,2)"
				);
		automatonTest(
				"b c",
				a_bc,
				"b c (0,2)"
				);
		automatonTest(
				"a b c d a c d",
				a_bc,
				"b c (1,3) | a c (4,6)"
				);
	}

	@Test
	public void testCreateConcatenation() {
		ImmutableList<Automaton> list = ImmutableList.of(this.a, this.b);
		Automaton ab = AutomatonFactory.createConcatenation(list);
		automatonTest(
				"a",
				ab,
				""
				);
		automatonTest(
				"b",
				ab,
				""
				);
		automatonTest(
				"",
				ab,
				""
				);
		automatonTest(
				"a b",
				ab,
				"a b (0,2)"
				);
		
		automatonTest(
				"a a b b a a b a b",
				ab,
				"a b (1,3) | a b (5,7) | a b (7,9)"
				);
		
	}

	@Test
	public void testCreateSimpleAutomaton() {
		automatonTest(
				"a",
				this.a,
				"a (0,1)"
				);
		automatonTest(
				"a a",
				this.a,
				"a (0,1) | a (1,2)"
				);
	}

}
