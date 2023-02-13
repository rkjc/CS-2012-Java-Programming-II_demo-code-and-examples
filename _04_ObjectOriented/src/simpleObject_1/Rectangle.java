package simpleObject_1;

public class Rectangle {

	double width = 0.0;
	double height;
	
	String color = "black";
	double lineWeight = 0.0;
	int layer = 0;

	public double getArea() {
		return this.width * this.height;
	}
}
