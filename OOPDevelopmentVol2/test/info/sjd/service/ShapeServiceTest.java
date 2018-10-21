package info.sjd.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import info.sjd.Shape;

public class ShapeServiceTest {

	
	@Test
	public void testGetMaxSquareShape() {
		List<Shape> shapes = ShapeService.getRandomShapeList();
		
		assertNotNull(shapes);
		assertTrue(!shapes.isEmpty());
		
		Shape maxElement = ShapeService.getMaxSquareShape(shapes);
		
		assertNotNull(maxElement);
		assertEquals("Square", maxElement.getClass().getSimpleName());
	}
	
	@Test
	public void testGetMinSquareShape() {
		List<Shape> shapes = ShapeService.getRandomShapeList();
		
		assertNotNull(shapes);
		assertTrue(!shapes.isEmpty());
		
		Shape minElement = ShapeService.getMinSquareShape(shapes);
		
		assertNotNull(minElement);
		assertEquals("Circle", minElement.getClass().getSimpleName());
	}

}
