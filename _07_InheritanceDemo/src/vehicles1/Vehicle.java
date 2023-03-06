package vehicles1;

public class Vehicle extends Object {
	
	public String color;
	
	public static int objCount = 0;
	
	// ---- Constructors ----
	public Vehicle() {
		super();
		objCount++;
	}
	
	public Vehicle(String inColor) {
		super();
		color = inColor;
		objCount++;
	}
	
	// ---- Methods -------
	
	public String getColor() {
		return color;
	}
	
	public static int getCount() {
		return objCount;
	}
	
	
	public String toString() {
		return "vehicle color is " + color;
	}
	
	
	protected String sayHappy() {
		return "happy";
	}
	
//	public boolean equals(Vehicle inVeh) {
//		return this.color.equals(inVeh.color);
//	}

}
