package info.sjd.service;

public class LongMultiplicationService {
	
	private static int shiftNumber = 20;
	
	public static int findLongerNumber(int firstNumber, int secondNumber) {
		
		int longerNumber = 0;
		if (String.valueOf(firstNumber).length() < String.valueOf(secondNumber).length()) {
			longerNumber = secondNumber;
		} else {
			longerNumber = firstNumber;
		}
		return longerNumber;
	}

	public static int findShorterNumber(int firstNumber, int secondNumber) {
		
		int shorterNumber = 0;
		if (String.valueOf(firstNumber).length() > String.valueOf(secondNumber).length()) {
			shorterNumber = secondNumber;
		} else {
			shorterNumber = firstNumber;
		}
		return shorterNumber;
	}

	public static void repeatNSymbols(int n, String symbol) {
		
		String resultString = "";
		for (int i = 0; i < n; i++) {
			resultString += symbol;
			
		}
		System.out.print(resultString);		
	}

	public static void repeatNSymbolsNewLine (int n, String symbol) {
		
		String resultString = "";
		for (int i = 0; i < n; i++) {
			resultString += symbol;
			
		}
		System.out.print(resultString);	
		System.out.println("");
	}

	public static void intermediateMultiplication(int firstNumber, int secondNumber) {

		int rightShift = 1;
		while (secondNumber > 0) {
			System.out.println(firstNumber * (secondNumber % 10));
			secondNumber /= 10;
			repeatNSymbols(shiftNumber - rightShift, " ");
			rightShift++;
		}
		repeatNSymbols(1, " ");
	}

	public static void printLongMultiplication(int firstNumber, int secondNumber) {
	
		repeatNSymbols(shiftNumber, " ");
		System.out.println(String.valueOf(findLongerNumber(firstNumber, secondNumber)));
		repeatNSymbols(shiftNumber - 1, " ");
		System.out.println("x");
		repeatNSymbols(shiftNumber, " ");
		repeatNSymbols(String.valueOf(findLongerNumber(firstNumber, secondNumber)).length() - String.valueOf(findShorterNumber(firstNumber, secondNumber)).length(), " ");
		System.out.println(String.valueOf(findShorterNumber(firstNumber, secondNumber)));
		repeatNSymbols(shiftNumber, " ");
		repeatNSymbolsNewLine(String.valueOf(findLongerNumber(firstNumber, secondNumber)).length(), "_");
		repeatNSymbols(shiftNumber, " ");
		intermediateMultiplication(findLongerNumber(firstNumber, secondNumber), findShorterNumber(firstNumber, secondNumber));
		repeatNSymbolsNewLine(String.valueOf(String.valueOf(firstNumber * secondNumber)).length(), "_");
		repeatNSymbols(shiftNumber - (String.valueOf(findLongerNumber(firstNumber, secondNumber)).length() - String.valueOf(findShorterNumber(firstNumber, secondNumber)).length()) - 1, " ");
		System.out.println(firstNumber * secondNumber);
	}
	


}
