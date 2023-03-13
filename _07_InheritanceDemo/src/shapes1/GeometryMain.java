package shapes1;

public class GeometryMain {

	public static void main(String[] args) {
		
		
		
		Circle circ1 = new Circle("blue");
		Circle circ4 = circ1;
			
		Circle circ2 = new Circle(1.0, "blue");
		
		Square sqr1 = new Square(3.4, "red");
		Square sqr4 = new Square();
		
		System.out.println( sqr4.getColor() );
		
		System.out.println(circ1.getColor());
		System.out.println(sqr1.getColor());
		
		System.out.println( circ1.toString() );
		
		Integer zonk = 345; 
		
		System.out.println( zonk.toString() ); 
		
		Object wow = new Object();
		
		String voltron = "go team go";
		
		String derp;
		
		wow = zonk; 
		
		Integer buzz = 9;
		
		//buzz = wow;
		
//		GeometricObject[] geoArray = new GeometricObject[10];
//		
//		geoArray[0] = circ1;
//		
//		geoArray[1] = sqr12;
//		
//		
//		Object oCirc = new Circle();
//		
//		Circle circ3 = (Circle)oCirc;
		
//		System.out.println( geoArray[0] instanceof Circle);
//		System.out.println( geoArray[0] instanceof Square);
		
    	
    	
    	
    	
    	//System.out.println(circ1.toString());
    	
		

//		Square sqr1 = new Square("green");
//		
//		Line lion1 = new Line();
//		
//		
//		System.out.println("line= " + lion1.color  );
//		System.out.println("line area= " + lion1.getArea()  );
//		
//		System.out.println("square1 color= " + sqr1.color);
//		System.out.println("square1 color= " + sqr1.color);
//
//		System.out.println("square1 area= " + sqr1.getArea());
//
//		
		
		
		
		
		
		
		//Line myLine1 = new Line();
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		System.out.println("circle color= " + circ1.Xpos);
//		System.out.println("circle color= " + circ1.Ypos);
//		
//		System.out.println("circle area= " + circ1.getArea());
//		System.out.println("square area= " + sqr1.getArea());
//		System.out.println("line area= " + myLine1.getArea());
	}

}
