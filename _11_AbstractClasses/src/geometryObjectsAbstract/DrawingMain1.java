package geometryObjectsAbstract;

public class DrawingMain1 {
	
	public static void main(String[] args) {
		System.out.println("running -> DrawingMain1");
	
		//GeometryObject bob = new GeometryObject();
		//bob.getArea();
		
		GeometryObject bob = null;
		
		
		
		Rectangle rectit = new Rectangle(7, 3, "green");
		System.out.println(  rectit.toString()  );
		
		bob = rectit;
		
	

		Object thing = new Object();
		
		Square pants = new Square(5);
		System.out.println(  pants.toString()  );
		
		Integer zim = 56;
		System.out.println(  zim.toString()  );
		
		Square blocky = new Square(7);
		
		
		System.out.println("squares equal?  " + (pants.equals(blocky)) );
		
	
	}
}
