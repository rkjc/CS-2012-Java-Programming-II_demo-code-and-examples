package clonealbleShapes;

public class ShapeData {

	private double borderWidth = 1.0; // primitive value stored on stack

	protected String borderColor = "black";

// ------ Constructors -------------

// -------------- Getter and Setter Methods ------------- 

	public double getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}
	
// -------------- Additional Methods ------------- 

}
