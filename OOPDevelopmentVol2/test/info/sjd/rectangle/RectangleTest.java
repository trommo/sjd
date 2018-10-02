package info.sjd.rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testGetArea() {
		Rectangle test = new Rectangle();
		test.setHeight(3);
		test.setWidth(7);
		double output = test.getArea();
		assertEquals(21, output, 0.01);
	}

}
