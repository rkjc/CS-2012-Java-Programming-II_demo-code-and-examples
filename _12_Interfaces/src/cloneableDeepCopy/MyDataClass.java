package cloneableDeepCopy;

public class MyDataClass implements Cloneable { 

	private String name = "";

	private ColorClass color = new ColorClass("blank");

// ----------------- constructors ---------------
	
	public MyDataClass(String val, String col) {
		this.name = val;
		//this.color = new ColorClass(col);
		this.color.setColor(col);
	}
	
	public MyDataClass(MyDataClass mdc) {
		this.name = mdc.getName();
		this.color = mdc.getColor();
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
		//this.color = color.clone();
		//return (MyDataClass) super.clone();
		return new MyDataClass(this.name, this.color.getColor());
	}

	@Override
	public String toString() {
		return "name= " + name + "; color= " + color;
	}
}
