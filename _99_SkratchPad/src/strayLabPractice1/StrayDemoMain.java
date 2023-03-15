package strayLabPractice1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StrayDemoMain {

	public static void main(String[] args) {

		String make = "";
		String model = "";
		int year = 0;
		String license = "";
		// Create an ArrayList of Car objects.
		ArrayList<CarObject> carList = new ArrayList<>();

		// open file for read "car.txt"

		try {
			// Create a Scanner for the file
			Scanner input;
			java.io.File file = new java.io.File("car.txt");
			input = new Scanner(file);

			// Read data from a file
			while (input.hasNext()) {
				String lineFromFile = input.next();
				System.out.println(lineFromFile);
			}

			// Close the file
			input.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// loop - grab line by line
		// sub-string by comma, trim
		// assign to variables

		CarObject tempCar1 = new CarObject("vroom", "kaboom", 1807, "akkkk");
		carList.add(tempCar1);

		CarObject tempCar2 = new CarObject("blongo", "arkam", 1912, "thu-009");
		carList.add(tempCar2);

		CarObject tempCar3 = new CarObject("mars", "phobos", 2387, "000-001");
		carList.add(tempCar3);

		for (int i = 0; i < carList.size(); i++) {
			System.out.println(carList.get(i).toString());
		}

	}

}
