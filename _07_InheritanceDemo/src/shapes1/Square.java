package shapes1;

public class Square extends GeometricObject{
	
	public Double side1 = 2.0;
	
	public Square() {
		color = "blue";
	}
	
	public Square(String newColor) {
		color = newColor;
	}
	
	public double getArea() {
		return side1 * side1;
	}

	
}
