
package museum;

import java.util.ArrayList;
import java.util.Scanner;

import museum.Exhibit.DisplayType;
import zoo.LandAnimal;

public class StartMuseum {

	public static void main(String[] args) {
		
		//Artifact arrty = new Artifact();
		
		System.out.println("Welcome to the Museum. Enjoy your journey of discovery today as you visit the exhibits.");	
		
		ArrayList<Exhibit> displays = new ArrayList<>();
		
		Mummy mum_1 = new Mummy("Amenophis II", true, false, "Egyptian Mummy", "found in Pyramid","1397 BCE");
		Exhibit ex_1 = new Exhibit(DisplayType.PEDISTAL, mum_1 );
		
		Mummy mum_2 = new Mummy("Ötzi", false, false, "Frozen Iceman", "found in French mountains","3300 BCE");
		Exhibit ex_2 = new Exhibit(DisplayType.GLASSCASE, mum_2);
		
		displays.add(ex_1);
		displays.add(ex_2);
		
		Scanner userinput = new Scanner(System.in);
		int index = 0;
		while (index < displays.size()) {
			System.out.println("\nPress Enter to view next exhibit");
			userinput.nextLine();
			System.out.println("--------------------------------");
			
			// display exhibit
			System.out.println(displays.get(index).toString());
						
			index += 1;
			System.out.println("--------------------------------");
		}
		
		System.out.println("\nThank you for visiting the Museum. Looking forward to seeing you again in the future!");
	}
}


