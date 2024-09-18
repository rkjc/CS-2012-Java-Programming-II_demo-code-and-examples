package geometryObjectsAbstract;

public class Rectangle extends GeometryObject {

	int width;
	private int height;

	// -------- constructors ------

	public Rectangle() {
		super();
	}
	
	public Rectangle(String color) {
		super();
		super.setColor(color);
	}

	public Rectangle(int height, int width) {
		this();
		this.width = width;
		this.height = height;
	}

	public Rectangle(int height, int width, String color) {
		// chain loading constructors

		this(width, height);
		super.setColor(color);
	}

	
	// -------- methods -----------

	
	public double getArea() {
		return height * width;
	}
		
	// ---------------

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	} 
	
	public String toString() {
		return "rectangle: width- " + this.width +  "  height- " + this.height;
	}
	
}
