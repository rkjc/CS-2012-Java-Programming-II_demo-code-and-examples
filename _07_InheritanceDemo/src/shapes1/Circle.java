package shapes1;

public class Circle extends GeometricObject {

	public final Double PI = 3.14159;
	
	public Double radius = 1.0;
	
	// ------ Constructors -------------
	public Circle() {
		
	}
	
	public Circle(String newColor) {
		//super(newColor);
		color = newColor;
	}
	
	
	// -------------- Methods -------------
	public double getArea() {
		return 2 * 3.14159 * radius * radius;
	}
	
	public String toString() {
		return "circle color= " + this.color + " radius= " + this.radius;
	}
	
	public boolean equals() {
		return true;
	}

}
