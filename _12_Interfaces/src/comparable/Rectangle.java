package comparable;

public class Rectangle extends GeometricObject implements Comparable {
	private double width;
	private double height;

	
// ----------------- constructors ---------------
	
	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

// ------------------ methods -------------------
	
	
	@Override
	public int compareTo(Object o) {
		if (this.width > ((Rectangle) o).getWidth())
			return 1;
		else if (this.width < ((Rectangle) o).getWidth())
			return -1;
		else
			return 0;
	}

//	@Override
//	public int compareTo(Object arg0) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	
	@Override
	public String toString() {
		return "area= " + getArea() + " width= " + width;
	}
	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}

	/** Return height */
	public double getHeight() {
		return height;
	}

	/** Set a new height */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override /** Return area */
	public double getArea() {
		return width * height;
	}

	@Override /** Return perimeter */
	public double getPerimeter() {
		return 2 * (width + height);
	}





}
