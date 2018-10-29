import static org.junit.Assert.*;

import org.junit.Test;

import info.sjd.twonumbersproduct.TwoNumbersProduct;

public class TwoNumbersProductTest {

	@Test
	public void testGetProduct() {

		TwoNumbersProduct test = new TwoNumbersProduct();
		test.setFirstNumber(101);
		test.setSecondNumber(890);
		long output = test.getProduct();
		assertEquals(89890, output);
		
	}

}