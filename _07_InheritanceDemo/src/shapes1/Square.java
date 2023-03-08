package shapes1;

public class Square extends GeometricShape {
	
	private Double side1 = 2.0;
	
	public Square() {
		super();
		this.setColor("blue");
	}
	
	
	public String getColor() {
		return "mauve";
	}
	
	public Square(String newColor) {
		//color = newColor;
	}
	
	public Square(double side, String newColor) {
		//this.color = newColor;
		//this.side1 = side;
	}
	
	public double getArea() {
		return side1 * side1;
	}

	public Double getSide1() {
		return side1;
	}

	public void setSide1(Double side1) {
		this.side1 = side1;
	}
	
	
}
