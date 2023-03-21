package errorsInClassesAndMethods;

public class Circle {

	public final Double PI = 3.14159;

	//private Double radius = 1.0;
	private Double radius;

	// ------ Constructors -------------
	public Circle() {
		super();
	}

	// -------------- Methods -------------
	public void setRadius(Double newRadius) {
		if (newRadius >= 0)
			radius = newRadius;
		else
			throw new IllegalArgumentException("Radius cannot be negative");
	}
	

	public double getArea() {
		return 2 * 3.14159 * radius * radius;
	}

	public Double getRadius() {
		return radius;
	}

}
