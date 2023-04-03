package shapes1.shapeClasses;

public class Square extends GeometricShape {

	private Double side1 = 2.0;

// ------ Constructors -------------
	public Square() {
		super();
		this.setColor("blue");
	}

	public Square(String newColor) {
		super(newColor);
	}

	public Square(double side, String newColor) {
		super(newColor);
		// this.color = newColor;
		this.side1 = side;
		super.borderColor = "cyan";
	}

// -------------- Methods ------------- 

	public String getColor() {
		return super.getColor();
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

	@Override
	public String toString() {
		String mystr = "Square object, side = " + side1.toString();
		return mystr;
	}

}
