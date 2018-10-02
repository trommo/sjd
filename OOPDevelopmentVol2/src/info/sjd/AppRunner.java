package info.sjd;

import java.util.logging.Logger;

import info.sjd.circle.Circle;
import info.sjd.rectangle.Rectangle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;
import info.sjd.triangle2.Triangle2;

public class AppRunner {
	
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		
		// Finding Square Area
		
		Square square1 = new Square();
		square1.setSide(15);
		logger.info("Square with side " + square1.getSide() + " has area " + square1.getArea());

		Square square2 = new Square();
		square2.setSide(20);
		logger.info("Square with side " + square2.getSide() + " has area " + square2.getArea());

		Square square3 = new Square();
		square3.setSide(115);
		logger.info("Square with side " + square3.getSide() + " has area " + square3.getArea());
		
		// Finding Circle Area
		
		Circle circle1 = new Circle();
		circle1.setRadius(1);
		logger.info("Circle with radius " + circle1.getRadius() + " has area " + circle1.getArea());

		Circle circle2 = new Circle();
		circle2.setRadius(20);
		logger.info("Circle with radius " + circle2.getRadius() + " has area " + circle2.getArea());
		
		Circle circle3 = new Circle();
		circle3.setRadius(115);
		logger.info("Circle with radius " + circle3.getRadius() + " has area " + circle3.getArea());
		
		// Finding Rectangle Area		

		Rectangle rectangle11 = new Rectangle();
		rectangle11.setWidth(15);
		rectangle11.setHeight(20);
		logger.info("Rectangle with width=" + rectangle11.getWidth() + " and height=" + rectangle11.getHeight() + " has area " + rectangle11.getArea());

		
		Rectangle rectangle12 = new Rectangle();
		rectangle12.setWidth(25);
		rectangle12.setHeight(33);
		logger.info("Rectangle with width=" + rectangle12.getWidth() + " and height=" + rectangle12.getHeight() + " has area " + rectangle12.getArea());
		
		// Finding Triangle Area through three sides
		
		Triangle triangle11 = new Triangle();
		triangle11.setaSide(3);
		triangle11.setbSide(4);
		triangle11.setcSide(5);
		logger.info("Triangle with a side=" + triangle11.getaSide() + ", b side=" + triangle11.getbSide() + " and c side=" + triangle11.getcSide() + " has area " + triangle11.getArea());

		Triangle triangle12 = new Triangle();
		triangle12.setaSide(13);
		triangle12.setbSide(14);
		triangle12.setcSide(15);
		logger.info("Triangle with a side=" + triangle12.getaSide() + ", b side=" + triangle12.getbSide() + " and c side=" + triangle12.getcSide() + " has area " + triangle12.getArea());

		Triangle triangle13 = new Triangle();
		triangle13.setaSide(10);
		triangle13.setbSide(11);
		triangle13.setcSide(12);
		logger.info("Triangle with a side=" + triangle13.getaSide() + ", b side=" + triangle13.getbSide() + " and c side=" + triangle13.getcSide() + " has area " + triangle13.getArea());

		// Finding Triangle Area through its base and height
		
		Triangle2 triangle21 = new Triangle2();
		triangle21.setBase(10);
		triangle21.setHeight(5);
		logger.info("Triangle with base=" + triangle21.getBase() + "and height=" + triangle21.getHeight() + " has area=" + triangle21.getArea());
		
		Triangle2 triangle22 = new Triangle2();
		triangle22.setBase(13);
		triangle22.setHeight(7);
		logger.info("Triangle with base=" + triangle22.getBase() + "and height=" + triangle22.getHeight() + " has area=" + triangle22.getArea());
	}

}
