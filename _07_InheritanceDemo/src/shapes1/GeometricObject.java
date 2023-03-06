package shapes1;

public class GeometricObject extends Object {

	public String color = "red";

	public Double Xpos = 0.0;
	public Double Ypos = 0.0;
	
	public static int objectCount = 0;

	// flavor
	// weight
	// border
	// highlight
	// pen
	// gradient 

	// -------- constructors -------------
	public GeometricObject() {
		super();
		objectCount++;
	}

	public GeometricObject(String inColor) {
		super();
		color = inColor;
		objectCount++;
	}

	
	// ------------ Methods ----------------
	public double getArea() {
		return 0.0;
	}
	
	public static int getObjectCount() {
		return objectCount;
	}

}
