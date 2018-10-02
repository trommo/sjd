package info.sjd.circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testGetArea() {
		Circle test = new Circle();
		test.setRadius(10);
		double output = test.getArea();
		assertEquals(314.15, output, 0.01);
	}

}
