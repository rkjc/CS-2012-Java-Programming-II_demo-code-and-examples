package shapeStuff;

public class Circle {

	public static final double PI = 3.14159;
	
	public static int count = 0;
	
	public int idNum;
	
	public double radius;
	public String color = "blue";
	public double circDub = 0;

	
	// ----- constructors -----------

	public Circle(double newRadius) {
		count++;
		idNum = count;
		radius = newRadius;
	}
	// ---------- code --------------
	
	// ---------- methods -----------

	public double getArea() {
		return radius * radius * 3.14159;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public static double get88() {
		return 88.2;
	};
	
}
