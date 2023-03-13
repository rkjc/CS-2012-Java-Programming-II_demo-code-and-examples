package application;

import stuff.Square;

public class DrawingAppMain {

	public static void main(String[] args) {
		
//		Circle circ1 = new Circle("blue");
//		Circle circ4 = circ1;
//			
//		Circle circ2 = new Circle(1.0, "blue");
		
		Square sqr1 = new Square(3.4, "red");

		System.out.println( sqr1.getColor() );
		
		//System.out.println( sqr1.color );
		//System.out.println( sqr1.happiness );
		//System.out.println( sqr1.confusion );
		//System.out.println( sqr1.side );

	}

}
