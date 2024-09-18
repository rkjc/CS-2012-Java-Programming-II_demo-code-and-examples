package geometryObjects;

public class Square extends Rectangle {

	
	public Square(int sideleng) {
		super(sideleng,sideleng);
	}
	
	
	public double sideLength() {
		return super.getWidth();
	}
	
	public void setLength(int newleng) {
		super.setWidth(newleng);
		super.setHeight(newleng);
	}
	
	public String toString() {
		return "square with side length = " + super.getWidth();
	}
	
	public boolean equals(Square testSqr) {	
		Integer w1 = super.getWidth();  
		Integer w2 = testSqr.getWidth();	
		return w1.equals(w2); 
	}
	
}
