package poly_2;

public class Circle extends GeometryObject { 
	
	private double radius;
	private String color;
	private double lineWeight;
	private int layer;
	private static int count = 0;

	// -------- constructors ------
	
//	public Circle(){ 
//		color = "black";
//	}
	
	public Circle(double radius) {
		super("red");
		this.radius = radius;
	}
	
	// -------- methods -----------
	
	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}
	
	// --------------------
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		radius = Math.abs(radius);
		this.radius = radius;
	}
	
	
	public void doubleTheRadius() {
		this.radius =  this.radius * 2;
	}
	
	static double getArea(double somerad) {
		return  3.1*somerad*somerad;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getLineWeight() {
		return lineWeight;
	}


	public void setLineWeight(double lineWeight) {
		this.lineWeight = lineWeight;
	}


	public int getLayer() {
		return layer;
	}


	public void setLayer(int layer) {
		this.layer = layer;
	}


	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Circle.count = count;
	}


}
