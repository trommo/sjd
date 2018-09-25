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
	public float getArea() {
		return side * side;
	}

}
