package info.sjd;

import java.util.logging.Logger;

import info.sjd.service.SumOfDigitsService;

public class SumOfDigits {

	private static Logger logger = Logger.getLogger(SumOfDigits.class.getName());
	
	public static void main(String[] args) {
		int number = 12345;
		
		int sumOfDigitsByIntegerDivision = SumOfDigitsService.sumOfDigitsByIntegerDivision(number);
		int sumOfDigitsByCharSplitting = SumOfDigitsService.sumOfDigitsByCharSplitting(number);
		
		logger.info("The sum of digits of number " + number + " by integer division is " + sumOfDigitsByIntegerDivision);
		logger.info("The sum of digits of number " + number + " by character splitting is " + sumOfDigitsByCharSplitting);
	}



}
