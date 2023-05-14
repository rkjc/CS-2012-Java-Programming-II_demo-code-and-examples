package zoo_unfinishedAlt;

import java.util.ArrayList;
import java.util.Scanner;

public class StartZooMain {

	public static void main(String[] args) {
	
		// make a building 
		ZooBuilding myZoo = new ZooBuilding("Zondar Memorial City Zoo");
		System.out.println("Welcome to the " + myZoo.getBuildingName() +  
				". Enjoy your journey of discovery today as you visit the exhibits.");
		
		// make 2 different animals to each exhibit (6 total)
		LandAnimal animal_1 = new LandAnimal("Capybara");
		LandAnimal animal_2 = new LandAnimal("Zeebra");
		
		// add 3 exhibits to the building
		
		Exhibit xhib1 = new Exhibit();
		Exhibit xhib2 = new Exhibit();
		
		myZoo.getXhibit().add(xhib1);
		myZoo.getXhibit().add(xhib2);
		
		xhib1.getAnimals().add(animal_1);
		xhib1.getAnimals().add(animal_2);
		
		// add animals and decoration to each exhibit 
		xhib1.getDecorations().add("beach ball");
		xhib2.getDecorations().add("climbing rope");
		
		
		
		
		// run a tour through the zoo 
		
		System.out.println(myZoo.getXhibit().get(0).getAnimals().get(0));
		
		//LandAnimal animal_1 = new LandAnimal();
		
//		animal_1.setTypeOfAnimal("Capybara");
//		animal_1.setFoodType("watermelon"); 
//		animal_1.setSound("high pitched fluttering whinny");

		
		Scanner userinput = new Scanner(System.in);
		int count = 0;
		while (count < myZoo.getXhibit().size()) {
			System.out.println("Press Enter to view next exhibit");
			userinput.nextLine();
			// display exhibit
			System.out.println("--------------------------------");
			
			Animal tempani =  myZoo.getXhibit().get(count).getAnimals().get(0);
			// loop this to get all animals
			
			System.out.println(tempani.getTypeOfAnimal());
			System.out.println("Exhibit Decoration: " + myZoo.getXhibit().get(count).getDecorations().get(0));
			count += 1;
		}
		
		System.out.println("--------------------------------");
		System.out.println("Thank you for visiting the Zoo. Looking forward to seeing you again in the future!");	
	}
}
