package stuff;

public class Square extends GeometricShape {
	
	private Double side = 2.0;
	
	public Square() {
		super();
		this.setColor("blue");
		
		//this.line = 2;
		this.happiness = 5;
		this.confusion = 9;
	}
	
	
	public String getColor() {
		// the square is a lie, it always tells you it is 'mauve'
		return "mauve";
	}
	
	public Square(String newColor) {
		//color = newColor;
	}
	
	public Square(double side, String newColor) {
		this.setColor(newColor);
		this.setSide(side);
	}
	
	public double getArea() {
		return side * side;
	}

	public Double getSide() {
		return side;
	}

	public void setSide(Double side) {
		this.side = side;
	}
	
	public String toString() {
		// just using the default inherited version of toString()
		return this.toString();
	}
	
	public Boolean equals(Square otherSq) {
		// just using the default inherited version of equals()
		return this.equals(otherSq);
	}
}
