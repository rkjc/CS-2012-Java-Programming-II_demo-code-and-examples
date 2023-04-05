package clonealbleShapes;

public class Circle  implements Cloneable {

	private Double radius = 1.0; // Immutable Class variable stored on heap

	private String color = ""; // Immutable Class variable stored on heap
	
	private int layerNum = 1;
	
	private ShapeData sdata;

	
	// ------ Constructors -------------
	public Circle() {
	}

	public Circle(Double rad, String newColor) {
		this.color = "blue";
		this.radius = rad;
		this.sdata = new ShapeData();
	}

// -------------- Getter and Setter Methods -------------

	public Double getRadius() {
		return radius;
	}
	
	public void setRadius(Double rad) {
		this.radius = rad;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String clr) {
		this.color = clr;
	}
	
	
// -------- Getter and Setter Methods for ShapeData Class Object ------------	
	
	public double getBorderWidth() {
		return this.sdata.getBorderWidth();
	}

	public void setBorderWidth(double lin) {
		this.sdata.setBorderWidth(lin);
	}

	public String getBorderColor() {
		return this.sdata.getBorderColor();
	}

	public void setBorderColor(String borderColor) {
		this.sdata.setBorderColor(borderColor);
	}

	
// -------------- Additional Methods ------------- 
	
	public double getArea() {
		return 2 * 3.14159 * radius * radius;
	}
	
	@Override
	public String toString() {
		return "circle color= " + this.color + " radius= " + this.radius;
	}

}
