package fr.univnantes.lina.uima.tkregex.test;

import fr.univnantes.lina.test.uima.OccAnno;
import fr.univnantes.lina.test.uima.TypeA;
import fr.univnantes.lina.test.uima.TypeB;
import fr.univnantes.lina.uima.tkregex.ae.RegexListResource;
import fr.univnantes.lina.uima.tkregex.ae.TokenRegexAE;
import fr.univnantes.lina.uima.tkregex.test.utils.Mocks;
import fr.univnantes.lina.uima.tkregex.test.utils.RecogEngine;
import org.apache.uima.UIMAException;
import org.apache.uima.UIMAFramework;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.factory.ExternalResourceFactory;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ExternalResourceDescription;
import org.assertj.core.api.Assertions;
import org.assertj.core.groups.Tuple;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class MultitypeFunctionalSpec {
	private AnalysisEngine engine;
	private JCas cas;

	@Before
	public void setup() throws UIMAException, MalformedURLException {
	AnalysisEngineDescription ae = AnalysisEngineFactory.createEngineDescription(RecogEngine.class);
		ExternalResourceDescription mwtRulesResources = ExternalResourceFactory.createExternalResourceDescription(
				RegexListResource.class,
				AutomatonTests.RESOURCES.resolve("regex-files/multiple-type-use-case.regex").toUri().toURL().toString()
		);
		ExternalResourceFactory.bindResource(
				ae,
				TokenRegexAE.TOKEN_REGEX_RULES,
				mwtRulesResources);
		engine = UIMAFramework.produceAnalysisEngine(ae);
		setupCas();
	}

	private void setupCas() throws UIMAException {
		cas = JCasFactory.createJCas();
		TypeA a1 = Mocks.anno(cas, TypeA.class, 0, 1);
		a1.setFInt(2);
		TypeB a2 = Mocks.anno(cas, TypeB.class, 2, 3);
		a2.setFStringForTypeB("toto");
	}

	@Test
	public void test1() throws AnalysisEngineProcessException {
		engine.process(cas);

		Assertions.assertThat(cas.getAnnotationIndex(OccAnno.class).iterator())
				.extracting("begin", "end", "rule")
				.containsExactly(Tuple.tuple(0, 3, "rule1"));
	}
}
