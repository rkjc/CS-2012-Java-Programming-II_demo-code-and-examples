package shapeStuff;

public class ShapesMain {

	public static void main(String[] args) {
		System.out.println("running");
		
		Circle round1 = new Circle(345);
		System.out.println( "rad circ1 " +  round1.getRadius()  );
		System.out.println(  round1.get88()  );
		System.out.println( "count circ1 " + round1.count );
		
		Circle round2 = new Circle(111);
		System.out.println( "rad circ2 " +   round2.getRadius()  );
		System.out.println(  round2.get88()  );
		System.out.println( "count circ2 " + round2.count );
		
		double nuwnum = Circle.get88();
		//int acount = Circle.count;
		System.out.println("count class level " + Circle.count);
		//Circle.count = 91;
		System.out.println("count class level " + Circle.count);
		System.out.println( "count circ1 " + round1.count );
		System.out.println( "count circ2 " + round2.count );
		System.out.println( "rad circ1 " +  round1.getRadius()  );
		System.out.println( "rad circ2 " +  round2.getRadius()  );
		//round2.count = 30303030;
		System.out.println("count class level " + Circle.count);
		System.out.println( "count circ1 " + round1.count );
		System.out.println( "count circ2 " + round2.count );
		System.out.println( "rad circ1 " +  round1.getRadius()  );
		System.out.println( "rad circ2 " +  round2.getRadius()  );
		
		System.out.println( "PI " +  Circle.PI );
		System.out.println( "PI " +  round2.PI );
		System.out.println( "PI math " +  Math.PI );
		
		
//		double dedub = getAmainDub();
//		System.out.println(dedub);
		
	}
	
	// ---------- methods -----------
	
	public static double getAmainDub() {
		return 89.33;
	};

}
