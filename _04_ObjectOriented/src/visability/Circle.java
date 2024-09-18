package visability;

public class Circle {

	public static final double PI = 3.14159;
	
	private static int count = 0;
	private int idNum;
	private double radius;
	private String color = "blue";
	private double circDub = 0;

	
	// ----- constructors -----------

	public Circle(double newRadius) {
		count++;
		idNum = count;
		radius = newRadius;
	}
	
	// ---------- code --------------
	
	// ---------- methods -----------

	public double getArea() {
		return radius * radius * 3.14159;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public static double get88() {
		return 88.2;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCircDub() {
		return circDub;
	}

	public void setCircDub(double circDub) {
		this.circDub = circDub;
	}

	public void setRadius(double radius) {
		if (radius < 0) {
			radius = 1;
		}
		this.radius = radius;
	};
	
	
}
