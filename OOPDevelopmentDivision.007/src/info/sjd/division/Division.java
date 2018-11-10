package info.sjd.division;

import info.sjd.AbstractOperation;

public class Division extends AbstractOperation {
	
	private float numerator;
	private float denominator;
	
	public float getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public float getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	@Override
	public float getOperation() {
		float result = 0;
		
			result = numerator / denominator;
		
		return result;
	}

}
