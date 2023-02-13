package simpleObject_1;

public class Circle {
	
	Circle(){ 
		color = "red";
	}
	
	Circle(double inputRadius) {	
		radius = inputRadius;
		color = "black";
	}
	
	double radius;
	String color;
	double lineWeight;
	int layer;

	
	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}
}
