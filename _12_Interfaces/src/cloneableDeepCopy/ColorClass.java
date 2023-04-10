package cloneableDeepCopy;

public class ColorClass implements Cloneable {
	
	private String color;

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

	@Override // Cloneable
	public ColorClass clone() throws CloneNotSupportedException {
		return (ColorClass) super.clone();
	}

	@Override
	public String toString() {
		return this.color;
	}
}
