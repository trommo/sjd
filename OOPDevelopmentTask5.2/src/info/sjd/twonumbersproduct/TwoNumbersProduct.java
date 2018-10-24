package info.sjd.twonumbersproduct;

import info.sjd.AbstractProduct;

public class TwoNumbersProduct extends AbstractProduct {
	private int firstNumber, secondNumber;

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	@Override
	public int getProduct() {
	
		return firstNumber * secondNumber;
	}
	
	public String toString() {
		return String.valueOf(firstNumber * secondNumber);
	}

}
