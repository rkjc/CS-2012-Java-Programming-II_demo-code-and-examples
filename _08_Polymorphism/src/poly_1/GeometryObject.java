package poly_1;

public class GeometryObject extends Object {

	private String color = "black";
	private double lineWeight;
	private int layer; 
	
	// -------- constructors -----------
	
	public GeometryObject() {
		
	}
	
	public GeometryObject(String color) {
		this.color = color;
	}
	
	
	// ----------- methods --------------
	
	public double getArea() {
		return 0.0;
	}
	
	
	
	// ------
	
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
	
	public String toString() {
		return "undefined geometryObject";
	}

}
