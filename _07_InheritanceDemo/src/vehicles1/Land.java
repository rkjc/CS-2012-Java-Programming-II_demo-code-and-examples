package vehicles1;

public class Land extends Vehicle {

	int numWheels = 0;

	// ------- Constructor ------

	public Land() {
		super();
	}

	public Land(String inColor, int inNumWheels) {
		super(inColor);
		numWheels = inNumWheels;
	}

	public boolean equals(Land other) {
		return this.color.equals(other.color) && this.numWheels == other.numWheels;
	}

	public String toString() {
		String tempStr = "Land vehicle, number of wheels = " + numWheels;
		tempStr = tempStr + "; " + super.toString();
		return tempStr;
	}

}
