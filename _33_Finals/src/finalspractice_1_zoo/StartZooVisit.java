package finalspractice_1_zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class StartZooVisit {

	public static void main(String[] args) {
		System.out.println("Welcome to the Zoo. Enjoy your journey of discovery today as you visit the exhibits.");

		Mammal animal_1 = new Mammal("Capybara");

		animal_1.setSound("high pitched fluttering whinny");
		animal_1.setWeight(45.0);
		animal_1.setDecoration("medium length light brown fur");

		// ----------------------------
		Mammal animal_2 = new Mammal("Zeebra", "Mule type of Brey", 150.5, "white and black stripes");

		Reptile animal_3 = new Reptile("Coaral Snake", "Hsssssss", 3.0, "multi-colored rings");

		// ----------------------------

		ExhibitEnvironment xhibit_1 = new ExhibitEnvironment();
		xhibit_1.getDecorations().add("Wooded grotto with pond");
		xhibit_1.getAnimals().add(animal_1);

		// ----------------------------
		ExhibitEnvironment xhibit_2 = new ExhibitEnvironment();
		xhibit_2.getDecorations().add("grassy savana");
		xhibit_2.getAnimals().add(animal_2);

		// ----------------------------

		ExhibitEnvironment xhibit_3 = new ExhibitEnvironment();
		xhibit_3.getDecorations().add("desert sand");
		xhibit_3.getAnimals().add(animal_3);

		// ----------------------------

		ArrayList<ExhibitEnvironment> zoo = new ArrayList<>();
		zoo.add(xhibit_1);
		zoo.add(xhibit_2);
		zoo.add(xhibit_3);

		Scanner userinput = new Scanner(System.in);
		int count = 0;
		while (count < zoo.size()) {
			System.out.println("Press Enter to view next exhibit");
			userinput.nextLine();
			// display exhibit
			System.out.println("--------------------------------");

			Animal tempan = zoo.get(count).getAnimals().get(0);
			System.out.println(tempan.toString());
			System.out.println("Exhibit Decoration: " + zoo.get(count).getDecorations().get(0));

			count += 1;
		}

		System.out.println("--------------------------------");
		System.out.println("Thank you for visiting the Zoo. Looking forward to seeing you again in the future!");

		// ----------------------- testing -----------------------------------

		System.out.println("\n----------------- testing ----------------------\n");

	}
}
