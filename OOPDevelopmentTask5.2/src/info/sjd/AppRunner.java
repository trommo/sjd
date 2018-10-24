package info.sjd;

import java.util.List;
import java.util.logging.Logger;
import info.sjd.service.ProductService;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName()); 
	
	private static void main(String[] args) {
		List<Product> products = ProductService.getListOfProducts();
		
		Product maxElement = ProductService.getMaxNumber(products);
		
		if (maxElement != null) {
			logger.info("The biggest palindrome is " + maxElement.toString() + ".");
		}
		
	}
}
