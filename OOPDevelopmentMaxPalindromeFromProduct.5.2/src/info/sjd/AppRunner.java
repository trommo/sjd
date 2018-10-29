package info.sjd;

import java.util.logging.Logger;
import java.util.List;


import info.sjd.service.ProductService;

public class AppRunner {
	
	private static Logger logger = Logger.getLogger(AppRunner.class.getName()); 

	public static void main(String[] args) {
		List<Product> products = ProductService.getListOfProducts();
		
		logger.info("List of products contains " + products.size() + " palindromes. \tHere it is: " + products.toString() + ".");
		
		Product maxElement = ProductService.getMaxNumber(products);
		
		if (maxElement != null) {
			logger.info("The biggest palindrome is " + maxElement.toString() + ".");
		}
		
	}
}
