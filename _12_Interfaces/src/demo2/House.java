package demo2;

public class House {
	
	public double area = 0.0;
	public int numStories = 1;
	public String color = "white";
	
	public House(double a, int s, String c) {
		area = a;
		numStories = s;
		color = c;
	}
	
	@Override
	public String toString() {
		return area + " " + numStories + " " + color;
	}
	
	public void deepCopy(House o) {
		area = o.area;
		numStories = o.numStories;
		color = o.color;	
	}
}
