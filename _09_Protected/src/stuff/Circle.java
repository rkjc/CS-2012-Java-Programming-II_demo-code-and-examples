package stuff;

public class Circle extends GeometricShape {

	public final Double PI = 3.14159;
	
	private Double radius = 1.0; 
	
	
	// ------ Constructors -------------
	public Circle() {
		super();
	}
	
	public Circle(String newColor) {
		//super(newColor);
		super.setColor(newColor);
	}
	
	public Circle(double rad, String newColor) {
		//super(newColor);
		this.radius = rad;
		//this.color = newColor;
	}
	
	// -------------- Methods -------------
	public double getArea() {
		return 2 * 3.14159 * radius * radius;
	}
	

	
	public boolean equals(Circle bob) {
		return(this.radius.equals(bob.radius) && super.getColor().equals(bob.getColor()));
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public String toString() {
		return "circle color= " + super.getColor() + " radius= " + this.radius;
	}
	
	public String toString(int x) {
		String mystr = "Circle object, radius = " + radius.toString();
		return mystr;
	}
}
