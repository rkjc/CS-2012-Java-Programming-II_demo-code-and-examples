package defaultVal;

import java.util.Random;

public class Circle {

	public double radius = 1.0;
	public String color = "blue";
	public Random bob = new Random();

	public Circle() {
	}

	public Circle(double newRadius) {
		radius = newRadius;
	}

	public double getArea() {
		return radius * radius * 3.14159;
	}
}
