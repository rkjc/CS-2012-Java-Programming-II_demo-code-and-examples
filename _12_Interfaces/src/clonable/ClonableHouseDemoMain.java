package clonable;

import java.util.concurrent.TimeUnit;

public class ClonableHouseDemoMain {

	public static void main(String[] args) {

		try {
			House houseOne = new House(11, 1234);
			System.out.println("------------");
			//Thread.sleep(1500);
			System.out.println("------------");
			House houseTwo = new House(22, 9400);
			//Thread.sleep(1500);
			System.out.println("------------");

			System.out.println(houseOne);
			System.out.println(houseTwo);

			// houseOne = houseTwo;

			// houseOne = houseTwo.makeItAgain();

			houseOne = (House) houseTwo.clone();
			//Thread.sleep(1500);
			System.out.println("------------");

			System.out.println(houseOne);
			System.out.println(houseTwo);

			houseTwo.setID(99);

			System.out.println(houseOne);
			System.out.println(houseTwo);

		} catch (Exception e) {
			System.out.println("ooops " + e);
		}

		// ----------------------------

		
//		Integer intA = 99;
//		Integer intB = 101;
//
//		System.out.println(intA);
//		System.out.println(intB);
//
//		intA = intB;
//
//		System.out.println(intA);
//		System.out.println(intB);
//
//		intB = 333;
//
//		System.out.println(intA);
//		System.out.println(intB);

	}

}
