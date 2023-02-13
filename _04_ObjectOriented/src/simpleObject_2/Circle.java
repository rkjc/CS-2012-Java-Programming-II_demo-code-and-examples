package simpleObject_2;

public class Circle {

	double radius = 0.0;
	String color = "black";
	double lineWeight = 0.0;
	int layer = 0;

	
	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}
}
