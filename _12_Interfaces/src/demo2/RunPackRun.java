package demo2;

public class RunPackRun {
	public static void main(String[] args) {
		
		House one = new House(1200, 1, "pink");
		House two = new House(1200, 1, "pink");
		House three = new House(3300, 3, "black");
		
		System.out.println(one);
		//one = three;
		one.deepCopy(three);
		
		System.out.println(one);
		
		three.color = "orange";
		System.out.println(one);
		
		
	}
}
