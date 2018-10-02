package info.sjd.square;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testGetArea() {
		Square test = new Square();
		test.setSide(5);
		double output = test.getArea();
		assertEquals(25, output, 0.01);
	}

}
