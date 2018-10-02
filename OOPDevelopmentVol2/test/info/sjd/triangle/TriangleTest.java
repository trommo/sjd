package info.sjd.triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testGetArea() {
		Triangle test = new Triangle();
		test.setaSide(3);
		test.setbSide(5);
		test.setcSide(4);
		double output = test.getArea();
		assertEquals(6.0, output, 0.01);
		
	}

}
