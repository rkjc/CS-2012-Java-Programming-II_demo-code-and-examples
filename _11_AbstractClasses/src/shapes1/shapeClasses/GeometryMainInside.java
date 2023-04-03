package shapes1.shapeClasses;

public class GeometryMainInside {

	public static void main(String[] args) {
		
		// can not use "new" because GeometricShape is Abstract
		GeometricShape zondar;  // = new GeometricShape(); 
		
		
		Circle circ1 = new Circle(4.5, "blue");
		
		System.out.println("circ using default toString result =>  " + circ1.toString());
		System.out.println("circ overload toString result =>  " + circ1.toString(35));
		System.out.println("circle color= " + circ1.getColor());
		zondar = circ1;
		System.out.println("circle as zondar color= " + zondar.getColor());
		System.out.println("circ1 show protected border color =>  " + circ1.borderColor); 
		
		//System.out.println(GeometricShape.color);
		System.out.println("-----------------------------------");
		
		Square sqr1 = new Square(2.7, "red");
		System.out.println("sqr1 using default toString result =>  " + sqr1.toString());
		System.out.println("sqr1 overload toString result =>  " + sqr1.toString());
		System.out.println("sqr1 color= " + sqr1.getColor());
		zondar = sqr1;
		System.out.println("sqr1 as zondar color= " + zondar.getColor());
		
		System.out.println();
		
	}

}
