package poly_2;

public class PolyRunMain {

	public static void main(String[] args) {
		
		System.out.println("running -> PolyRunMain");

		Object ooby = new Object();
		
		GeometryObject bob = new GeometryObject();
		
		Rectangle reggy = new Rectangle(5,9);
		Square skurky  = new Square(7);
		Circle rounndy = new Circle(3);
		
		GeometryObject [] geoarry = new GeometryObject[10];
		
		geoarry[0] = reggy;
		geoarry[1] = skurky;
		geoarry[2] = rounndy;
		
		Circle rounndy2 = (Circle)geoarry[2];
		
		
		Integer innty = 34;
		Double dubby = 78.3;
		
		
		
		
		ooby = bob;
		//bob = hope; 
		ooby = innty;
		ooby = dubby;
		
	}


}
