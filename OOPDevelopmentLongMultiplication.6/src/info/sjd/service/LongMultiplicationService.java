package info.sjd.service;

public class LongMultiplicationService {
	
	private static int shiftNumber = 20;
	
    public static int findLongerNumber(int firstNumber, int secondNumber) {
        int longerNumber = 0;
        if (String.valueOf(firstNumber).length() < String.valueOf(secondNumber).length()) {
            longerNumber = secondNumber;
        } else if (String.valueOf(firstNumber).length() == String.valueOf(secondNumber).length()) {
            longerNumber = firstNumber;
        } else {
        	longerNumber = firstNumber;
        }
        return longerNumber;
    }

	public static int findShorterNumber(int firstNumber, int secondNumber) {
		int shorterNumber = 0;
		if (String.valueOf(firstNumber).length() > String.valueOf(secondNumber).length()) {
			shorterNumber = secondNumber;
		} else if (String.valueOf(firstNumber).length() == String.valueOf(secondNumber).length()) {
			shorterNumber = secondNumber;
		} else {
			shorterNumber = firstNumber;
		}
		return shorterNumber;
	}

	public static String repeatNSymbols(int n, String symbol) {
		String resultString = "";
		for (int i = 0; i < n; i++) {
			resultString += symbol;
		}
		return resultString;		
	}

    public static void intermediateMultiplication(int firstNumber, int secondNumber) {
        int rightShift = 0;
        if (secondNumber == 0) {
        	System.out.println(0);
        } else if (secondNumber < 10) {
        	System.out.println(firstNumber * secondNumber);
        } else {
        	while (secondNumber > 0) {
            int number = firstNumber * (secondNumber % 10);
            secondNumber /= 10;
            System.out.print(repeatNSymbols(width - rightShift - String.valueOf(number).length(), " "));
            System.out.println(number);
            rightShift++;
        	}
        System.out.print(repeatNSymbols(1, " "));
        }
    }

	static int width = 0;
	
    public static void printLongMultiplication(int firstNumber, int secondNumber) {
        width = 0;
        shiftNumber = 20;
        System.out.print(repeatNSymbols(shiftNumber, " "));
        System.out.println(String.valueOf(findLongerNumber(firstNumber, secondNumber)));
        width = shiftNumber + String.valueOf(findLongerNumber(firstNumber, secondNumber)).length();
        System.out.print(repeatNSymbols(shiftNumber - 1, " "));
        System.out.println("x");
        System.out.print(repeatNSymbols(shiftNumber, " "));
        System.out.print(repeatNSymbols(String.valueOf(findLongerNumber(firstNumber, secondNumber)).length() - String.valueOf(findShorterNumber(firstNumber, secondNumber)).length(), " "));
        System.out.println(String.valueOf(findShorterNumber(firstNumber, secondNumber)));
        System.out.print(repeatNSymbols(shiftNumber, " "));
        System.out.println(repeatNSymbols(String.valueOf(findLongerNumber(firstNumber, secondNumber)).length(), "_"));
        intermediateMultiplication(findLongerNumber(firstNumber, secondNumber), findShorterNumber(firstNumber, secondNumber));
        System.out.print(repeatNSymbols(width -String.valueOf(String.valueOf(firstNumber * secondNumber)).length() -1, " "));
        System.out.println(repeatNSymbols(String.valueOf(String.valueOf(firstNumber * secondNumber)).length(), "_"));
        System.out.print(repeatNSymbols(width - String.valueOf(firstNumber * secondNumber).length(), " "));
        System.out.println(firstNumber * secondNumber);
    }
}
