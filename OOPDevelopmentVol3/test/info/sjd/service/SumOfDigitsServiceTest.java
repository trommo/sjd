import static org.junit.Assert.*;

import org.junit.Test;

import info.sjd.service.SumOfDigitsService;

public class SumOfDigitsServiceTest {
	

	@Test
	public void testSumOfDigitsByIntegerDivision() {
		int testNumber = 241458;
		
		assertNotNull(testNumber);
		
		int sumOfDigitsByIntegerDivision = SumOfDigitsService.sumOfDigitsByIntegerDivision(testNumber);

		assertNotNull(sumOfDigitsByIntegerDivision);
		assertEquals(24, SumOfDigitsService.sumOfDigitsByIntegerDivision(testNumber));
	}
	

	@Test
	public void testSumOfDigitsByCharSplitting() {
		int testNumber = 241458;

		assertNotNull(testNumber);

		int sumOfDigitsByCharSplitting = SumOfDigitsService.sumOfDigitsByCharSplitting(testNumber);	
		
		assertNotNull(sumOfDigitsByCharSplitting);
		assertEquals(24, SumOfDigitsService.sumOfDigitsByCharSplitting(testNumber));

	}

}