package info.sjd;

import java.util.List;

public class ShapeService {
	
	// Finding an element of collection with maximal square
	
	public Shape getMaxSquare(List<Shape> shapes) {
		if (shapes.isEmpty()) {
			return null;
		}
		
		Shape maxElement = shapes.get(0);
		
		for (int i = 1; i < shapes.size(); i++) {
			if (maxElement.getArea() < shapes.get(i).getArea()) {
				maxElement = shapes.get(i);
			}		
		}
		return maxElement;
	}
	
	// Finding an element of collection with minimal square
	
	public Shape getMinSquare(List<Shape> shapes) {
		if (shapes.isEmpty()) {
			return null;
		}
		
		Shape minElement = shapes.get(0);
		
		for (int i = 1; i < shapes.size(); i++) {
			if (minElement.getArea() > shapes.get(i).getArea()) {
				minElement = shapes.get(i);
			}
		}
		return minElement;
	}
}
