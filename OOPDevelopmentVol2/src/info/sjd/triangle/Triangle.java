package info.sjd.triangle;

import info.sjd.AbstractShape;

public class Triangle extends AbstractShape {

	private double aSide, bSide, cSide;
	
	public double getaSide() {
		return aSide;
	}

	public void setaSide(double aSide) {
		this.aSide = aSide;
	}

	public double getbSide() {
		return bSide;
	}

	public void setbSide(double bSide) {
		this.bSide = bSide;
	}

	public double getcSide() {
		return cSide;
	}

	public void setcSide(double cSide) {
		this.cSide = cSide;
	}

	public double getHalfPerimeter() {
	    return (double) ((aSide + bSide + cSide) * 0.5);
	}

		@Override
	public double getArea() {
		return (double) Math.sqrt(getHalfPerimeter() * (getHalfPerimeter() - aSide) * (getHalfPerimeter() - bSide) * (getHalfPerimeter() - cSide));
	}
		
	public String toString() {
		return String.valueOf(Math.sqrt(getHalfPerimeter() * (getHalfPerimeter() - aSide) * (getHalfPerimeter() - bSide) * (getHalfPerimeter() - cSide)));
	}	

}
