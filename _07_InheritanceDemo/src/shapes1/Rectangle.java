package shapes1;

public class Rectangle extends Square {
	
	public Rectangle(String newColor) {
		super(newColor);
	}

	public Double side2 = 3.0;
	
	public double getArea() {
		return side1 * side2;
	}
	
}
