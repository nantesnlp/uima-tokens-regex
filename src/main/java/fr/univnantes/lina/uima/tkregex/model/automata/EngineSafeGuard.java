package fr.univnantes.lina.uima.tkregex.model.automata;

public class EngineSafeGuard {
	public static final EngineSafeGuard NONE = new EngineSafeGuard()
			.maxEpisodeLength(Integer.MAX_VALUE)
			.maxIterations(Integer.MAX_VALUE)
			.maxTransitions(Integer.MAX_VALUE)
			.maxBacktrack(Integer.MAX_VALUE)
			.maxRuleMatchingDurationMillis(Long.MAX_VALUE)
			;

	private int maxIterations  = 50;
	private int maxTransitions = 100;
	private int maxBacktrack = 20;
	private int maxEpisodeLength = 25;
	private long maxRuleMatchingDurationMillis = 5000;


	public int getMaxEpisodeLength() {
		return maxEpisodeLength;
	}

	public EngineSafeGuard maxEpisodeLength(int maxEpisodeLength) {
		this.maxEpisodeLength = maxEpisodeLength;
		return this;
	}

	public void setMaxEpisodeLength(int maxEpisodeLength) {
		this.maxEpisodeLength = maxEpisodeLength;
	}

	public int getMaxIterations() {
		return maxIterations;
	}

	public void setMaxIterations(int maxIterations) {
		this.maxIterations = maxIterations;
	}

	public EngineSafeGuard maxIterations(int maxIterations) {
		this.maxIterations = maxIterations;
		return this;
	}


	public int getMaxTransitions() {
		return maxTransitions;
	}

	public void setMaxTransitions(int maxTransitions) {
		this.maxTransitions = maxTransitions;
	}

	public EngineSafeGuard maxTransitions(int maxTransitions) {
		this.maxTransitions = maxTransitions;
		return this;
	}

	public int getMaxBacktrack() {
		return maxBacktrack;
	}

	public void setMaxBacktrack(int maxBacktrack) {
		this.maxBacktrack = maxBacktrack;
	}

	public EngineSafeGuard maxBacktrack(int maxBacktrack) {
		this.maxBacktrack = maxBacktrack;
		return this;
	}

	public long getMaxRuleMatchingDurationMillis() {
		return maxRuleMatchingDurationMillis;
	}

	public void setMaxRuleMatchingDurationMillis(long maxRuleMatchingDurationMillis) {
		this.maxRuleMatchingDurationMillis = maxRuleMatchingDurationMillis;
	}

	public EngineSafeGuard maxRuleMatchingDurationMillis(long maxRuleMatchingDurationMillis) {
		this.maxRuleMatchingDurationMillis = maxRuleMatchingDurationMillis;
		return this;
	}
}
