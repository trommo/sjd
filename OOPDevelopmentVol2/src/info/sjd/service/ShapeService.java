package info.sjd.service;

import java.util.ArrayList;
import java.util.List;

import info.sjd.Shape;
import info.sjd.circle.Circle;
import info.sjd.rectangle.Rectangle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;
import info.sjd.triangle2.Triangle2;

public class ShapeService {
		
	// Finding an element of collection with maximal square
	
	public static Shape getMaxSquareShape(List<Shape> shapes) {
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
	
	public static Shape getMinSquareShape(List<Shape> shapes) {
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

	public static List<Shape> getRandomShapeList() {
		// Finding Square Area
		
				Square square1 = new Square();
				square1.setSide(15);

				Square square2 = new Square();
				square2.setSide(20);

				Square square3 = new Square();
				square3.setSide(115);
				
				// Finding Circle Area
				
				Circle circle1 = new Circle();
				circle1.setRadius(1);

				Circle circle2 = new Circle();
				circle2.setRadius(20);
				
				Circle circle3 = new Circle();
				circle3.setRadius(55);
				
				// Finding Rectangle Area		

				Rectangle rectangle11 = new Rectangle();
				rectangle11.setWidth(15);
				rectangle11.setHeight(20);
				
				Rectangle rectangle12 = new Rectangle();
				rectangle12.setWidth(25);
				rectangle12.setHeight(33);
				
				// Finding Triangle Area through three sides
				
				Triangle triangle11 = new Triangle();
				triangle11.setaSide(3);
				triangle11.setbSide(4);
				triangle11.setcSide(5);

				Triangle triangle12 = new Triangle();
				triangle12.setaSide(13);
				triangle12.setbSide(14);
				triangle12.setcSide(15);

				Triangle triangle13 = new Triangle();
				triangle13.setaSide(10);
				triangle13.setbSide(11);
				triangle13.setcSide(12);

				// Finding Triangle Area through its base and height
				
				Triangle2 triangle21 = new Triangle2();
				triangle21.setBase(10);
				triangle21.setHeight(5);
				
				Triangle2 triangle22 = new Triangle2();
				triangle22.setBase(13);
				triangle22.setHeight(7);
				
				// Creating collection
				
				List<Shape> shapes = new ArrayList<>();
				shapes.add(square1);
				shapes.add(square2);
				shapes.add(square3);
				shapes.add(circle1);
				shapes.add(circle2);
				shapes.add(circle3);
				shapes.add(rectangle11);
				shapes.add(rectangle12);
				shapes.add(triangle11);
				shapes.add(triangle12);
				shapes.add(triangle13);
				shapes.add(triangle21);
				shapes.add(triangle22);
				
				return shapes;
	}
}
