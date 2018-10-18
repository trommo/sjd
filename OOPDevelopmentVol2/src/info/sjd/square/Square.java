package info.sjd.square;

import info.sjd.AbstractShape;

public class Square extends AbstractShape {

	private int side;
	
	public int getSide() {
	return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}
	
	public String toString() {
		return String.valueOf(side * side);
	}

}
