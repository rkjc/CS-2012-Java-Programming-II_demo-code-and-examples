package simpleObject_1;

import java.util.Random;

public class Demo1Main {

	public static void main(String[] args) {
		System.out.println("Demo1Main running");
		
		Circle bob = new Circle();
		
		Circle zork = new Circle(99.3);
		zork = new Circle(1111.7);
		
		bob.radius = 3.7;
		
		Rectangle bizz = new Rectangle();
		bizz.height = 34.2;
		bizz.width = 1;
		System.out.println("rectangle height " + bizz.height);
		System.out.println(bizz.getArea());
		
		System.out.println(bob.radius);
		System.out.println(bob.getArea());
		
		System.out.println(zork.radius);
		System.out.println(zork.getArea());
		 
	}


	
	
	
	
	
	
//========================================================================
// Methods

	public static int[][] makeRandArray(int col, int row) {
		int[][] tempArr = new int[col][row];
		for (int rowIndex = 0; rowIndex < tempArr[0].length; rowIndex++) {
			for (int colIndex = 0; colIndex < tempArr.length; colIndex++) {
				tempArr[colIndex][rowIndex] = (int) ((Math.random() * 900) + 100);
			}
		}
		return tempArr;
	}

	public static int sumArray(int[][] myArrr) {
		int total = 0;
		for (int rowIndex = 0; rowIndex < myArrr[0].length; rowIndex++) {
			for (int colIndex = 0; colIndex < myArrr.length; colIndex++) {
				total += myArrr[colIndex][rowIndex];
			}
		}
		return total;
	}
	
	public static void printArray(int[][] myArrr) {
		for (int rowIndex = 0; rowIndex < myArrr[0].length; rowIndex++) {
			for (int colIndex = 0; colIndex < myArrr.length; colIndex++) {
				System.out.print(myArrr[colIndex][rowIndex] + "  ");
			}
			System.out.println();
		}
	}

}
