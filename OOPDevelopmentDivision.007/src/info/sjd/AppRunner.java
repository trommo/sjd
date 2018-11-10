package info.sjd;

import java.util.logging.Logger;

import info.sjd.division.Division;

public class AppRunner {
	
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		
		Division division = new Division();
		division.setNumerator(1000);
		division.setDenominator(0);
		
		try {
			logger.info(division.getNumerator() + "/" + division.getDenominator() + "=" + division.getOperation());
		} catch (ArithmeticException exc) {
			logger.info("Division by zero!");
		}
	}

}
