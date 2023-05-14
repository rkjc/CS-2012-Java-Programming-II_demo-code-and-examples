package zoo;

import java.util.ArrayList;
import java.util.Scanner;

import zoo.Animal.FoodType;
import zoo.LandAnimal.CoveringType;

public class StartZoo {

	public static void main(String[] args) {
		System.out.println("Welcome to the Zoo. Enjoy your journey of discovery today as you visit the exhibits.");
	
		LandAnimal animal_1 = new LandAnimal();
		
		animal_1.setTypeOfAnimal("Capybara");
		animal_1.setCovering(CoveringType.FUR);
		animal_1.setFoodType(FoodType.HERBIVOR);
		animal_1.setSound("high pitched fluttering whinny");
		animal_1.setWeight(45.0);
		animal_1.setDecoration("medium length light brown fur");
		
		LandAnimal animal_2 = new LandAnimal("Zeebra", CoveringType.FUR,  FoodType.HERBIVOR, "Mule type of Brey", 150.5, "white and black stripes" );
			
		Exhibit xhibit_1 = new Exhibit();
		xhibit_1.getDecorations().add("rocks");
		xhibit_1.getAnimals().add(animal_1);

		Exhibit xhibit_2 = new Exhibit();	
		xhibit_2.getDecorations().add("pond");
		xhibit_2.getAnimals().add(animal_2);

		ArrayList<Exhibit> zoo = new ArrayList<>();
		zoo.add(xhibit_1);
		zoo.add(xhibit_2);
		
		Scanner userinput = new Scanner(System.in);
		int count = 0;
		while (count < zoo.size()) {
			System.out.println("Press Enter to view next exhibit");
			userinput.nextLine();
			// display exhibit
			System.out.println("--------------------------------");
			
			LandAnimal tempan = (LandAnimal) zoo.get(count).getAnimals().get(0);
			System.out.println(tempan.getInfo());
			System.out.println("Exhibit Decoration: " + zoo.get(count).getDecorations().get(0));
			
			count += 1;
		}
		
		System.out.println("--------------------------------");
		System.out.println("Thank you for visiting the Zoo. Looking forward to seeing you again in the future!");	
	}
}
