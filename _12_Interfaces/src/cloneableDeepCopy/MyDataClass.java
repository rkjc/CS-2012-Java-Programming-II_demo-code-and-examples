package cloneableDeepCopy;

public class MyDataClass  implements Cloneable { 

	public String name = "";

	public ColorClass color;

// ----------------- constructors ---------------

	public MyDataClass(String val) {
		this.name = val;
		this.color = new ColorClass("black");
	}
	
	public MyDataClass(String val, String col) {
		this.name = val;
		this.color = new ColorClass(col);
	}
// ---------------- getter and setter methods -------------------
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ColorClass getColor() {
		return color;
	}

	public void setColor(ColorClass color) {
		this.color = color;
	}

	// ------------------- additional methods -----------------------	

	
	@Override // Cloneable
	public MyDataClass clone() throws CloneNotSupportedException {
		return (MyDataClass) super.clone();
	}

	@Override
	public String toString() {
		return "name= " + name + "; color= " + color;
	}
}
