package vehicles1;

import java.util.ArrayList;

public class RunSimulationMain {

	public static void main(String[] args) {
		// System.out.println("yep, it's running");

		Land lanVeh1 = new Land("blue", 4);
		Land lanVeh2 = new Land("green", 6);
		Land lanVeh3 = new Land("blue", 4);

		
		System.out.println( lanVeh1 );
			
		System.out.println( ( (Land)lanVeh3 ).numWheels   ) ;
		
		

		ArrayList<Vehicle> vehArr2 = new ArrayList<Vehicle>();

		vehArr2.add(lanVeh1);
		vehArr2.add(lanVeh2);
		vehArr2.add(lanVeh3);
		
		vehArr2.add(new Land("orange", 14));
		
		vehArr2.add(new Space());
		
		Air plane1 = new Air("pruple");
		
		vehArr2.add(plane1);
//		
//		//System.out.println(vehArr2.get(0).equals(lanVeh3));	
//		
		
		for (int i = 0; i < vehArr2.size(); i++) {
			
				System.out.println( vehArr2.get(i) );
				
		}
		
		
		for (int i = 0; i < vehArr2.size(); i++) {
			if(vehArr2.get(i) instanceof Land )
				System.out.println( (  (Land)vehArr2.get(i)  ).numWheels );
			else if(vehArr2.get(i) instanceof Air )
				System.out.println( (  (Air)vehArr2.get(i)  ).numPropellers );
			else
				System.out.println("no clue");
		}
		

		

		
//		System.out.println(lanVeh1.color + " " + lanVeh1.numWheels);
//		System.out.println(lanVeh2.color + " " + lanVeh2.numWheels);
//		System.out.println(lanVeh1.equals(lanVeh3));

		
	}

}




//Vehicle[] vehArr = new Vehicle[3];
//
//vehArr[0] = lanVeh1;
//vehArr[1] = lanVeh2;
//vehArr[2] = lanVeh3;
//
//Vehicle vek1 = new Land("red", 8);
//
//vehArr[3] = vek1;