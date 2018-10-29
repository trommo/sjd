import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import info.sjd.Product;
import info.sjd.service.ProductService;

public class ProductServiceTest {

	@Test
	public void testIsPalindrome() {
		int testNumber = 1234321;
		assertNotNull(testNumber);
		
		assertTrue(ProductService.isPalindrome(testNumber));
	}
	
	@Test
	public final void testGetListOfProducts() {
		assertNotNull(ProductService.getListOfProducts(100, 1000));
		assertTrue(!ProductService.getListOfProducts(100, 1000).isEmpty());
	}

	@Test
	public final void testGetMaxNumber() {
		List<Product> products = ProductService.getListOfProducts(100, 1000);
		
		Product maxElement = ProductService.getMaxNumber(products);
		assertEquals("906609", maxElement.toString());
	}


}