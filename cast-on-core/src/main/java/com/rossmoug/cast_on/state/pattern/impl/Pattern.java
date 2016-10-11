package com.rossmoug.cast_on.state.pattern.impl;

import com.rossmoug.cast_on.state.gauge.IGauge;
import com.rossmoug.cast_on.state.pattern.IPattern;
import com.rossmoug.cast_on.state.pattern.builder.PatternBuilder;

/**
 *
 * @author Ross Moug (ross.moug@gmail.com)
 * @version 1.1
 */
public class Pattern implements IPattern, Comparable<Pattern> {

	private IGauge userGauge;
	private IGauge patternGauge;
	private double dimension;

	public Pattern(PatternBuilder builder) {
		this.userGauge = builder.userGauge;
		this.patternGauge = builder.patternGauge;
		this.dimension = builder.dimension;
	}

	public IGauge getUserGauge() {
		return userGauge;
	}

	public IGauge getPatternGauge() {
		return patternGauge;
	}

	public double getDimension() {
		return dimension;
	}

	@Override
	/*
	 * (nonJavadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Pattern [userGauge=" + userGauge + ", patternGauge=" + patternGauge + ", dimension=" + dimension + "]";
	}

	/*
	 * (nonJavadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pattern other = (Pattern) obj;
		if (Double.doubleToLongBits(dimension) != Double.doubleToLongBits(other.dimension))
			return false;
		if (patternGauge == null) {
			if (other.patternGauge != null)
				return false;
		} else if (!patternGauge.equals(other.patternGauge))
			return false;
		if (userGauge == null) {
			if (other.userGauge != null)
				return false;
		} else if (!userGauge.equals(other.userGauge))
			return false;
		return true;
	}

	/*
	 * (nonJavadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(dimension);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((patternGauge == null) ? 0 : patternGauge.hashCode());
		result = prime * result + ((userGauge == null) ? 0 : userGauge.hashCode());
		return result;
	}

	@Override
	public int compareTo(Pattern o) {
		return 0;
	}

}