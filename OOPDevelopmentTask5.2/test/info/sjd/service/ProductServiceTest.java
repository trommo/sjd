import static org.junit.Assert.*;

import org.junit.Test;

import info.sjd.service.ProductService;

public class ProductServiceTest {

	@Test
	public void testIsPalindrome() {
		int testNumber = 1234321;
		assertNotNull(testNumber);
		
		assertTrue(ProductService.isPalindrome(testNumber));
	}

}
