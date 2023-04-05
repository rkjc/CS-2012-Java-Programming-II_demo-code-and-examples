package cloneableArray;

public class ColorClass {
	public String color;
	
// ----------------- constructors ---------------
	public ColorClass(String clr) {
		this.color = clr;
	}
	
	
// ---------------- getter and setter methods -------------------
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
// ------------------- additional methods -----------------------		
	@Override
	public String toString() {
		return this.color;
	}
}
