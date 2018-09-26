package info.sjd.triangle;

import info.sjd.AbstractShape;

public class Triangle extends AbstractShape {

	private float aSide, bSide, cSide;
	
	public float getaSide() {
		return aSide;
	}

	public void setaSide(float aSide) {
		this.aSide = aSide;
	}

	public float getbSide() {
		return bSide;
	}

	public void setbSide(float bSide) {
		this.bSide = bSide;
	}

	public float getcSide() {
		return cSide;
	}

	public void setcSide(float cSide) {
		this.cSide = cSide;
	}

	public float getHalfPerimeter() {
	    return (float) ((aSide + bSide + cSide) * 0.5);
	}

		@Override
	public float getArea() {
		return (float) Math.sqrt(getHalfPerimeter() * (getHalfPerimeter() - aSide) * (getHalfPerimeter() - bSide) * (getHalfPerimeter() - cSide));
	}

}
