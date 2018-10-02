package info.sjd.circle;

import info.sjd.AbstractShape;

public class Circle extends AbstractShape {
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return (double) (Math.PI*radius*radius);
	}
}
