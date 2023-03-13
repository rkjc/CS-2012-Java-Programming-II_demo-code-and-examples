package shapes1;

public class GeometryMain {

	public static void main(String[] args) {
		
		
		Circle circ1 = new Circle("blue");
		
		System.out.println(circ1.toString());
		Circle circ2 = new Circle();
		
		circ2 = circ1;
		
		Square bob = new Square();
		GeometricShape gomon = new GeometricShape();
		
		gomon = bob;
		
		System.out.println(  ( (Circle)gomon ).getRadius() );
			

	}

}
