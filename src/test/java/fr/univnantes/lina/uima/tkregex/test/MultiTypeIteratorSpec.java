package fr.univnantes.lina.uima.tkregex.test;

import com.google.common.collect.Lists;
import fr.univnantes.lina.test.uima.A;
import fr.univnantes.lina.test.uima.B;
import fr.univnantes.lina.uima.tkregex.ae.MultiTypeIterator;
import fr.univnantes.lina.uima.tkregex.test.utils.Mocks;
import org.apache.uima.UIMAException;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.groups.Tuple.tuple;

public class MultiTypeIteratorSpec {

	JCas cas;

	/*
	B:   ---   -----
	A: - - - - - - -
	 */
	@Before
	public void setup() throws UIMAException {
		cas = JCasFactory.createJCas();
		Mocks.anno(cas, A.class, 0,1);
		Mocks.anno(cas, A.class, 2,3);
		Mocks.anno(cas, A.class, 4,5);
		Mocks.anno(cas, A.class, 6,7);
		Mocks.anno(cas, A.class, 8,9);
		Mocks.anno(cas, A.class, 10,11);
		Mocks.anno(cas, A.class, 12,13);
		Mocks.anno(cas, B.class, 2,5);
		Mocks.anno(cas, B.class, 8,13);
	}

	@Test
	public void testOneType() {
		Assertions.assertThat(Lists.newArrayList(new MultiTypeIterator(cas, A.class)))
				.hasSize(7)
				.extracting("class.simpleName", "begin", "end")
				.containsExactly(
						tuple("A", 0, 1),
						tuple("A", 2, 3),
						tuple("A", 4, 5),
						tuple("A", 6, 7),
						tuple("A", 8, 9),
						tuple("A", 10, 11),
						tuple("A", 12, 13)
				);

		Assertions.assertThat(Lists.newArrayList(new MultiTypeIterator(cas, B.class)))
				.hasSize(2)
				.extracting("class.simpleName", "begin", "end")
				.containsExactly(
						tuple("B", 2, 5),
						tuple("B", 8, 13)
				);
	}

	@Test
	public void testZeroType() {
		Assertions.assertThat(Lists.newArrayList(new MultiTypeIterator(cas)))
				.hasSize(9)
				.extracting("class.simpleName", "begin", "end")
				.containsExactly(
						tuple("A", 0, 1),
						tuple("B", 2, 5),
						tuple("A", 2, 3),
						tuple("A", 4, 5),
						tuple("A", 6, 7),
						tuple("B", 8, 13),
						tuple("A", 8, 9),
						tuple("A", 10, 11),
						tuple("A", 12, 13)
				);

	}

	@Test
	public void testTwoTypes() {
		Assertions.assertThat(Lists.newArrayList(new MultiTypeIterator(cas, A.class, B.class)))
				.hasSize(9)
				.extracting("class.simpleName", "begin", "end")
				.containsExactly(
						tuple("A", 0, 1),
						tuple("B", 2, 5),
						tuple("A", 2, 3),
						tuple("A", 4, 5),
						tuple("A", 6, 7),
						tuple("B", 8, 13),
						tuple("A", 8, 9),
						tuple("A", 10, 11),
						tuple("A", 12, 13)
				);

	}

}
