package simpleObject_1;

public class Circle { 
	
	private double radius;
	String color;
	double lineWeight;
	int layer;
	static int count = 0;

	Circle(){ 
		color = "red";
	}
	
	Circle(double inputRadius) {	
		count ++;
		this.radius = inputRadius;
		color = "black";
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		radius = Math.abs(radius);
		this.radius = radius;
	}
	
	
	
	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}
	
	public void doubleTheRadius() {
		this.radius =  this.radius;
	}
	
	static double getArea(double somerad) {
		return  3.1*somerad*somerad;
	}


}
