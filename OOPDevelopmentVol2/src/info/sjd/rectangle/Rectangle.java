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
	public float getArea() {
		return (float) width * height;
	}

}
