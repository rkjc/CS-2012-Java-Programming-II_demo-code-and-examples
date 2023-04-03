package shapes1.shapeClasses;

public abstract class GeometricShape extends Object {

	private String color = "";
	
	private static double line = 1.0;
	
	protected String borderColor = "black";
	
	private int layer = 0;
	private String tags[];

	public static int objectCount = 0;

	// flavor
	// weight
	// border
	// highlight
	// pen
	// gradient 

	// -------- constructors -------------
	public GeometricShape() {
		super();
		objectCount++;
	}

	public GeometricShape(String inColor) {
		super();
		this.color = inColor;
		objectCount++;
	}

	// ------------ Methods ----------------


	public void setColor(String color) {
		this.color = color;
	}
	
	protected String getColor() {
		return this.color;
	}

	public double getLine() {
		return line;
	}

	public void setLine(double line) {
		this.line = line;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	public int getLayer() {
		return layer;
	}

	public void setLayer(int layer) {
		this.layer = layer;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public static void setObjectCount(int objectCount) {
		GeometricShape.objectCount = objectCount;
	}
	
	public static int getObjectCount() {
		return objectCount;
	}

}
