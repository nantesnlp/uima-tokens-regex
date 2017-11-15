package fr.univnantes.lina.uima.tkregex.test;

import com.google.common.collect.Lists;
import fr.univnantes.lina.test.uima.A;
import fr.univnantes.lina.test.uima.B;
import fr.univnantes.lina.test.uima.C;
import fr.univnantes.lina.uima.tkregex.ae.MultiTypeIterator;
import fr.univnantes.lina.uima.tkregex.ae.NoOverlapMultiTypeIterator;
import fr.univnantes.lina.uima.tkregex.test.utils.Fixtures;
import fr.univnantes.lina.uima.tkregex.test.utils.Mocks;
import org.apache.uima.UIMAException;
import org.apache.uima.cas.Type;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.groups.Tuple.tuple;

public class NoOverlapMultiTypeIteratorSpec {

	JCas cas;
	Type typeA,typeB,typeC;
	/*
	B:   ---   -----
	A: - - - - - - -
	 */
	@Before
	public void setup() throws UIMAException {
		cas = JCasFactory.createJCas();
		typeA = Fixtures.getType(A.class);
		typeB = Fixtures.getType(B.class);
		typeC = Fixtures.getType(C.class);
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
		ArrayList<Annotation> actual = Lists.newArrayList(new NoOverlapMultiTypeIterator(cas, Lists.newArrayList(typeA)));
		Assertions.assertThat(actual)
				.hasSize(7)
				.doesNotContainNull()
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

		Assertions.assertThat(Lists.newArrayList(new NoOverlapMultiTypeIterator(cas, Lists.newArrayList(typeB))))
				.hasSize(2)
				.extracting("class.simpleName", "begin", "end")
				.containsExactly(
						tuple("B", 2, 5),
						tuple("B", 8, 13)
				);
	}

	@Test
	public void testZeroType() {
		Assertions.assertThat(Lists.newArrayList(new NoOverlapMultiTypeIterator(cas, Lists.newArrayList())))
				.hasSize(4)
				.extracting("class.simpleName", "begin", "end")
				.containsExactly(
						tuple("A", 0, 1),
						tuple("B", 2, 5),
						tuple("A", 6, 7),
						tuple("B", 8, 13)
				);

	}

	@Test
	public void testTwoTypes() {
		Assertions.assertThat(Lists.newArrayList(new NoOverlapMultiTypeIterator(cas, Lists.newArrayList(typeA, typeB))))
				.hasSize(4)
				.extracting("class.simpleName", "begin", "end")
				.containsExactly(
						tuple("A", 0, 1),
						tuple("B", 2, 5),
						tuple("A", 6, 7),
						tuple("B", 8, 13)
				);
	}

}
