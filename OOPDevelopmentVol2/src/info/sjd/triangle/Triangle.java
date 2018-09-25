package info.sjd.triangle;

import info.sjd.AbstractShape;

public class Triangle extends AbstractShape {

	private int aSide, bSide, cSide;
	private float halfPerimeter = (float) (aSide + bSide + cSide) / 2;
	
	public int getaSide() {
		return aSide;
	}

	public void setaSide(int aSide) {
		this.aSide = aSide;
	}

	public int getbSide() {
		return bSide;
	}

	public void setbSide(int bSide) {
		this.bSide = bSide;
	}

	public int getcSide() {
		return cSide;
	}

	public void setcSide(int cSide) {
		this.cSide = cSide;
	}

	public float getHalfPerimeter() {
		return halfPerimeter;
	}

	public void setHalfPerimeter(int halfPerimeter) {
		this.halfPerimeter = halfPerimeter;
	}
	
		@Override
	public float getArea() {
		return (float) Math.sqrt(halfPerimeter * (halfPerimeter - aSide) * (halfPerimeter - bSide) * (halfPerimeter - cSide));
	}

}
