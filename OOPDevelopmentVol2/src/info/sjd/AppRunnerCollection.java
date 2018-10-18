package info.sjd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

import info.sjd.circle.Circle;
import info.sjd.rectangle.Rectangle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;
import info.sjd.triangle2.Triangle2;

public class AppRunnerCollection {
	
	private static Logger logger = Logger.getLogger(AppRunnerCollection.class.getName());
	
	public static void main(String[] args) {
		
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
		// logger.info("Triangle with base=" + triangle21.getBase() + "and height=" + triangle21.getHeight() + " has area=" + triangle21.getArea());
		
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
		
		logger.info("Our collection contains the following elements: ");
		
		for (Shape shape : shapes) {
			logger.info("The object belongs to the type " + shape.getClass().getSimpleName() + " and its square equals to " + shape.toString());
		}
		
		// Finding the minimal and maximal elements of collection
		
		Shape maxElement = null, minElement = null;
		
		if (!shapes.isEmpty()) {
			maxElement = shapes.get(0);
			minElement = shapes.get(0);
		}
		
		for (int i = 1; i < shapes.size(); i++) {
			if (maxElement.getArea() < shapes.get(i).getArea()) {
				maxElement = shapes.get(i);
			}
			
			if (minElement.getArea() > shapes.get(i).getArea()) {
				minElement = shapes.get(i);
			}
				
		}
		
		logger.info("The minimal square object is " + minElement.getClass().getSimpleName() + ", its square equals to " + minElement.toString() + ".\n\t The maximum square object is " + maxElement.getClass().getSimpleName() + ", its square equals to " + maxElement.toString() + ".");
		

		
		
	}

}
