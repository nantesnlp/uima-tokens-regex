package fr.univnantes.lina.uima.tkregex;

public enum Op {
	EQ("=="),
	NEQ("!="),
	STRICTLY_EQ("==="),
	LT("<"),
	LTE("<="),
	GT(">"),
	GTE(">="),
	IN("in"),
	NIN("nin"),
	IN_IGNORE_CASE("inIgnoreCase"),
	NIN_IGNORE_CASE("ninIgnoreCase")
	;

	private String string;

	Op(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public static Op fromString(String s) {
		for(Op op:values())
			if(op.getString().equals(s))
				return op;
		throw new IllegalArgumentException("No such operator: " + s);
	}
}
