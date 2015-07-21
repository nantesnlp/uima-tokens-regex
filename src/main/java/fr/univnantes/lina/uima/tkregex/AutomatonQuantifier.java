package fr.univnantes.lina.uima.tkregex;

public class AutomatonQuantifier {
	public static final String ZERO_ONE = "?";
	public static final String ONE = "No quantifier given";
	public static final String ZERO_N = "*";
	public static final String ONE_N = "+";
	public static final String M_N = "{m,n}";
	public static final String N = "{n}";
	
	private String quantifierType;
	private int lowerBound;
	private int upperBound;
	
	public AutomatonQuantifier(String quantifierType, int lowerBound,
			int upperBound) {
		this(quantifierType);
		if(this.lowerBound > this.upperBound)
			throw new IllegalArgumentException("Lower bound ("+lowerBound+") > upper bound ("+upperBound+")");

		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	public AutomatonQuantifier(String quantifierType) {
		super();
		this.quantifierType = quantifierType;
		switch(this.quantifierType) {
		case ZERO_ONE: 
			this.lowerBound = 0;
			this.upperBound = 1;
			break;
		case ZERO_N: 
			this.lowerBound = 0;
			break;
		case ONE: 
			this.lowerBound = 1;
			this.upperBound = 1;
			break;
		case ONE_N: 
			this.lowerBound = 1;
			break;
		case M_N: 
			break;
		case N: 
			break;
		default:
			throw new IllegalArgumentException("Unknown quantifier type: " + quantifierType);
		}
	}

	public String getQuantifierType() {
		return quantifierType;
	}

	public int getLowerBound() {
		return lowerBound;
	}

	public int getUpperBound() {
		return upperBound;
	}

	public static AutomatonQuantifier getOneOne() {
		return new AutomatonQuantifier(ONE);
	}
	
	public static AutomatonQuantifier getZeroOne() {
		return new AutomatonQuantifier(ZERO_ONE);
	}
	
	public static AutomatonQuantifier getZeroN() {
		return new AutomatonQuantifier(ZERO_N);
	}

	public static AutomatonQuantifier getN(int n) {
		return new AutomatonQuantifier(N, n, n);
	}

	public static AutomatonQuantifier getMN(int m, int n) {
		return new AutomatonQuantifier(M_N, m, n);
	}

	public static AutomatonQuantifier getOneN() {
		return new AutomatonQuantifier(ONE_N);
	}
	
	@Override
	public String toString() {
		switch(this.quantifierType) {
		case ZERO_ONE: 
		case ZERO_N: 
		case ONE_N: 
			return quantifierType;
		case ONE: 
			return "";
		case M_N: 
			return "{" + this.getLowerBound() + "," + this.upperBound + "}"; 
		case N: 
			return "{" + this.getLowerBound() + "}"; 
		default:
			return this.quantifierType;
		}
	}

}
