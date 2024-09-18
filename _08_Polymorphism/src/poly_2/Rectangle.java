package poly_2;

public class Rectangle extends GeometryObject {

	private int width;
	private int height;

	// -------- constructors ------

	public Rectangle() {

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
		return this.height * this.width;
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
