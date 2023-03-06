package shapes1;

public class GeometryMain {

	public static void main(String[] args) {
		
		
		Triangle trig1 = new Triangle();
		
		
		
		Circle circ1 = new Circle("blue");
		Circle circ2 = new Circle("blue");
		
		Square sqr12 = new Square("green");
		
		
		System.out.println(circ1.equals(circ2));
		

		
		GeometricObject[] geoArray = new GeometricObject[10];
		
		geoArray[0] = circ1;
		
		geoArray[1] = sqr12;
		
		
		Object oCirc = new Circle();
		
		Circle circ3 = (Circle)oCirc;
		
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
