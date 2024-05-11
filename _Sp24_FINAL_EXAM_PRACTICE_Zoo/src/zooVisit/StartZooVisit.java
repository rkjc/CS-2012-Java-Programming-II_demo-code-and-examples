package zooVisit;

import java.util.ArrayList;
import java.util.Scanner;

public class StartZooVisit {

	public static void main(String[] args) {
		System.out.println("Welcome to the Zoo. Enjoy your journey of discovery today as you visit the exhibits.");

		Mammal animal_1 = new Mammal("Capybara");

		animal_1.setSound("high pitched fluttering whinny");
		animal_1.setWeight(45.0);
		animal_1.setFurType("medium length light brown fur");

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
		System.out.println("-----------------------------------------------");
		System.out.println("| Welcome and enjoy your trip through the zoo |");

		while (count < zoo.size()) {
			pause(600);
			// display exhibit
			System.out.println("-----------------------------------------------");

			Animal tempan = zoo.get(count).getAnimals().get(0);
			System.out.println(tempan.toString());
			System.out.println("Exhibit Decoration: " + zoo.get(count).getDecorations().get(0));

			count += 1;
		}

		System.out.println("--------------------------------");
		System.out.println("Thank you for visiting the Zoo. Looking forward to seeing you again in the future!");

		// ----------------------- testing -----------------------------------

		int score = 0;
		System.out.println("\n----------------- additional testing ----------------------\n");
		try {
			System.out.println("check Mammel class");
			Mammal tmam;
			tmam = new Mammal("generic");
			if (tmam.getTypeOfAnimal().equals("generic")) {
				System.out.println("correct");
				score++;
			} else {
				System.out.println("incorrect");
			}
			
			tmam = new Mammal("generic2", "bland", 1.1, "transparent");
			if (tmam.getTypeOfAnimal().equals("generic2")) {
				System.out.println("correct");
				score++;
			} else {
				System.out.println("incorrect");
			}
			
			tmam.setTypeOfAnimal("generic3");
					if (tmam.getTypeOfAnimal().equals("generic3")) {
						System.out.println("correct");
						score++;
					} else {
						System.out.println("incorrect");
					}

		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Number of tests passed: " + score);
		
	}

	public static void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
