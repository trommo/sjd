package info.sjd.triangle2;

import info.sjd.AbstractShape;

public class Triangle2 extends AbstractShape {
	
	private int base, height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double) ((double) base * height * 0.5);
	}

	public String toString() {
		return String.valueOf(base * height * 0.5);
	}
}
