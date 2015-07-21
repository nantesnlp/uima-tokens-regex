package fr.univnantes.lina.uima.tkregex.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	AutomatonParserTestCase.class,
	AutomatonTestCase.class,
	AutomatonFactoryTestCase.class,
	RegexCoveredTextMatcherTestCase.class 
	}
)
public class AutomatonTests {

}
