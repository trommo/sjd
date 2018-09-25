package info.sjd;

import java.util.logging.Logger;

import info.sjd.circle.Circle;
import info.sjd.rectangle.Rectangle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;

public class AppRunner {
	
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		
		// Founding Square Area
		
		Square square1 = new Square();
		square1.setSide(15);
		logger.info("Square with side " + square1.getSide() + " has area " + square1.getArea());

		Square square2 = new Square();
		square2.setSide(20);
		logger.info("Square with side " + square2.getSide() + " has area " + square2.getArea());

		Square square3 = new Square();
		square3.setSide(115);
		logger.info("Square with side " + square3.getSide() + " has area " + square3.getArea());
		
		// Founding Circle Area
		
		Circle circle1 = new Circle();
		circle1.setRadius(15);
		logger.info("Circle with radius " + circle1.getRadius() + " has area " + circle1.getArea());

		Circle circle2 = new Circle();
		circle2.setRadius(20);
		logger.info("Circle with radius " + circle2.getRadius() + " has area " + circle2.getArea());
		
		Circle circle3 = new Circle();
		circle3.setRadius(115);
		logger.info("Circle with radius " + circle3.getRadius() + " has area " + circle3.getArea());
		
		// Founding Rectangle Area		

		Rectangle rectangle11 = new Rectangle();
		Rectangle rectangle12 = new Rectangle();
		rectangle11.setWidth(15);
		rectangle12.setHeight(20);
		logger.info("Rectangle with width=" + rectangle11.getWidth() + " and height=" + rectangle12.getHeight() + " has area " + (rectangle11).getArea());
		
		// Founding Triangle Area
		
		Triangle triangle11 = new Triangle();
		Triangle triangle12 = new Triangle();
		Triangle triangle13 = new Triangle();
		triangle11.setaSide(15);
		triangle12.setbSide(20);
		triangle13.setcSide(115);
		logger.info("Triangle with a side=" + triangle11.getaSide() + ", b side=" + triangle12.getbSide() + " and c side=" + triangle13.getcSide() + " has area " + (triangle11).getArea());

	}

}
