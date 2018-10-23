package info.sjd.service;

public class SumOfDigitsService {
	public static int sumOfDigitsByIntegerDivision(int number) {
		int sumOfDigits = 0;
		while (number > 0) {
			sumOfDigits = sumOfDigits + (number % 10);
			number = number / 10;
		}
		return sumOfDigits;
	}

	public static int sumOfDigitsByCharSplitting(int number) {
		int sumOfDigits = 0;
		String stringNumber = String.valueOf(number);
		for (int i = 0; i < String.valueOf(number).length(); i++) {
			sumOfDigits = sumOfDigits + Integer.parseInt(String.valueOf(stringNumber.charAt(i)));

		}

		return sumOfDigits;
	}

}
