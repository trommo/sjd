package info.sjd.service;

import java.util.ArrayList;
import java.util.List;

import info.sjd.Product;
import info.sjd.twonumbersproduct.TwoNumbersProduct;

public class ProductService {

	public static boolean isPalindrome(int number) {
	
		char[] charNumber = String.valueOf(number).toCharArray();
		int iLeft = 0;
		int iRight = charNumber.length - 1; 
		while (iRight > iLeft) {
			if (charNumber[iLeft] != charNumber[iRight]) {
				return false;
			}
			++iLeft;
			--iRight;
		}
		
		return true;
	}
	

	public static List<Product> getListOfProducts() {
		int minLimit = 10;
		int maxLimit = 100;
		List<Product> products = new ArrayList<>();
		for (int i = minLimit; i < maxLimit; i++) {
			for (int j = minLimit; j < maxLimit; j++) {
				TwoNumbersProduct product = new TwoNumbersProduct();
				product.setFirstNumber(i);
				product.setSecondNumber(j);
				if (isPalindrome(product.getProduct())) {
					products.add(product);
				}
				
			}
		}
		return products;
	}


	public static Product getMaxNumber(List<Product> products) {
		if (products.isEmpty()) {
			return null;
		}
		
		Product maxElement = products.get(0);
		for (int i = 1; i < products.size(); i++) {
			if (maxElement.getProduct() < products.get(i).getProduct()) {
				maxElement = products.get(i);
			}
		}
		
		return maxElement;
	}
}
