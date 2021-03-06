package info.sjd.rectangle;

import info.sjd.AbstractShape;

public class Rectangle extends AbstractShape {

	private int width, height;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return (double) width * height;
	}

	public String toString() {
		return String.valueOf(width * height);
	}
}
