package shapes1;

public class GeometryMain {

	public static void main(String[] args) {
		
		GeometricShape zondar;  // = new GeometricShape();
		
		Circle circ1 = new Circle("blue");
		Circle circ4 = circ1;
		System.out.println("working?" + circ1.toString());
		System.out.println("color= " + circ1.getColor());
		
		System.out.println(GeometricShape.color);
		
		
		
		//System.out.println( zondar instanceof  GeometricShape);
		
		zondar = circ1;
		
		System.out.println( zondar.getClass() );
		System.out.println( zondar.getColor() );
		
		System.out.println();
		
	}

}
