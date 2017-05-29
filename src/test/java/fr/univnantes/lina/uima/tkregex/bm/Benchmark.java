package fr.univnantes.lina.uima.tkregex.bm;

import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.apache.uima.UIMAFramework;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.impl.XmiCasDeserializer;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.factory.ExternalResourceFactory;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.fit.factory.TypeSystemDescriptionFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ExternalResourceDescription;
import org.apache.uima.resource.metadata.TypeSystemDescription;

import com.google.common.base.Stopwatch;
import com.google.common.primitives.Booleans;

import fr.univnantes.lina.uima.tkregex.ae.RegexListResource;
import fr.univnantes.lina.uima.tkregex.ae.TokenRegexAE;

public class Benchmark {
	private static final Path TERMSUITE_TYPE_SYSTEM = Paths.get("src", "test", "resources", "TermSuite_TS.xml");
	private static final Path FRENCH_MWT_RULES = Paths.get("src", "test", "resources", "french-multi-word-rule-system.regex");
	private static final Path FRENCH_PREPARED_CAS = Paths.get("src", "test", "resources", "wind-energy-french-file6.xmi");

	private static final int NB_ITERATIONS = 10;

	public static void main(String[] args) throws Exception {

		Stopwatch sw = Stopwatch.createUnstarted();
		long last = 0;
		for(Boolean allowOverlappingOccurrence:Booleans.asList(false, true)) {
			for(Boolean useCache:Booleans.asList(false, true)) {
				AnalysisEngineDescription aeDesc = createAE(allowOverlappingOccurrence, useCache);
				AnalysisEngine ae = UIMAFramework.produceAnalysisEngine(aeDesc);
				System.out.println("--------------------------------");
				System.out.println("allowOverlappingOccurrence: " + allowOverlappingOccurrence);
				System.out.println("useCache:                   " + useCache);
				for(int i= 0; i < NB_ITERATIONS; i++) {
					JCas cas = createCAS();
					sw.start();
					ae.process(cas);
					sw.stop();
					
					System.out.format("%4d. %10d %10d - words: %d terms: %d %n", 
							i+1, 
							sw.elapsed(TimeUnit.MILLISECONDS),
							sw.elapsed(TimeUnit.MILLISECONDS) - last,
							count(cas, "WordAnnotation"),
							count(cas, "TermOccAnnotation")
							);
					last = sw.elapsed(TimeUnit.MILLISECONDS);
					
				}
				
			}	
		}
	}

	private static int count(JCas cas, String typeName) {
		int cnt = 0;
		FSIterator<Annotation> it = cas.getAnnotationIndex().iterator();
		while(it.hasNext()) {
			Annotation next = it.next();
			if(next.getType().getShortName().equals(typeName))
				cnt++;
		}

		return cnt;
	}

	private static AnalysisEngineDescription createAE(boolean allowOverlappingOccurrence, boolean useCache) throws Exception {
			AnalysisEngineDescription ae = AnalysisEngineFactory.createEngineDescription(
					CountingEngine.class,
					TokenRegexAE.PARAM_ALLOW_OVERLAPPING_OCCURRENCES, allowOverlappingOccurrence,
					TokenRegexAE.PARAM_USE_MATCHER_CACHES, useCache
				);
			
			ExternalResourceDescription rules = ExternalResourceFactory.createExternalResourceDescription(
					RegexListResource.class, 
					FRENCH_MWT_RULES.toUri().toString()
					);
			
			ExternalResourceFactory.bindResource(
					ae,
					RegexListResource.KEY_TOKEN_REGEX_RULES, 
					rules
				);

			return ae;
	}

	private static JCas createCAS() throws Exception {
		TypeSystemDescription typeSystemDescription = TypeSystemDescriptionFactory.createTypeSystemDescriptionFromPath(TERMSUITE_TYPE_SYSTEM.toString());
		JCas cas = JCasFactory.createJCas(typeSystemDescription);
		XmiCasDeserializer.deserialize(new FileInputStream(FRENCH_PREPARED_CAS.toFile()), cas.getCas());
		return cas;
	}
}
