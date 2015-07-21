package fr.univnantes.lina.uima.tkregex;


public class Rule {
	private Automaton automaton;
	private String name;
	private String grammaticalCategory;
	
	public Rule(Automaton automaton, String name,
			String grammaticalCategory) {
		super();
		this.automaton = automaton;
		this.automaton.setRule(this);
		this.name = name;
		this.grammaticalCategory = grammaticalCategory;
	}

	public Automaton getAutomaton() {
		return automaton;
	}

	public String getName() {
		return name;
	}

	public String getGrammaticalCategory() {
		return grammaticalCategory;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rule)
			return name.equals(((Rule)obj).name);
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
