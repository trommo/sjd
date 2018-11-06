package service;

import static org.junit.Assert.*;

import org.junit.Test;

import info.sjd.service.LongMultiplicationService;

public class LongMultiplicationServiceTest {

	@Test
	public final void testFindLongerNumber() {
		int firstNumber = 123456;
		int secondNumber = 345;
		assertEquals(123456, LongMultiplicationService.findLongerNumber(firstNumber, secondNumber));
	}

	@Test
	public final void testFindShorterNumber() {
		int firstNumber = 2345;
		int secondNumber = 2413523;
		assertEquals(2345, LongMultiplicationService.findShorterNumber(firstNumber, secondNumber));
	}

	@Test
	public final void testRepeatNSymbols() {
		int testNumber = 15;
		String testSymbol = "*";
		assertEquals("***************", LongMultiplicationService.repeatNSymbols(testNumber, testSymbol));
	}

}
