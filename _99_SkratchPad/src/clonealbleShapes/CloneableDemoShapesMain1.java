package clonealbleShapes;

public class CloneableDemoShapesMain1 {

	public static void main(String[] args) {

		Circle circ1 = new Circle(4.5, "blue");
		
		Circle circ2;
		circ2 = circ1;  // very shallow copy, they share the reference to the same circle object

		// changes to one copy reflected as changes in the other copy
		System.out.println("circ1 color= " + circ1.getColor());
		System.out.println("circ2 color= " + circ1.getColor());
		
		System.out.println("change circ1 color to orange");
		
		circ1.setColor("orange");
		
		System.out.println("circ1 color= " + circ1.getColor());
		System.out.println("circ2 color= " + circ1.getColor());
		//-----------------------------------------------------------
		
		Circle circ3;
		//circ3.clone(circ1);  // very shallow copy, they share the reference to the same circle object

	}

}
