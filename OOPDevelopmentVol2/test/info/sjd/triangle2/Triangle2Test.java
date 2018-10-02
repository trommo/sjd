package info.sjd.triangle2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Triangle2Test {

	@Test
	public void testGetArea() {
		Triangle2 test = new Triangle2();
		test.setBase(8);
		test.setHeight(7);
		double output = test.getArea();
		assertEquals(28.0, output, 0.01);
	}

}
