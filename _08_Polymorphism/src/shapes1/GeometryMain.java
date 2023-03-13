package shapes1;

public class GeometryMain {

	public static void main(String[] args) {
		
		
		Circle circ1 = new Circle("blue");
		
		System.out.println(circ1.toString());
		Circle circ2 = new Circle();
		
		circ2 = circ1;
		
		Square bob = new Square();
		Object gomon = new Object();
		
		gomon = circ1;
		
		if (gomon instanceof Circle ) {
			System.out.println(  ( (Circle)gomon ).getRadius() );
		} else {
			System.out.println(  ( (Square)gomon ).getSide1() );
		}
			

	}

}
