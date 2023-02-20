package simpleObject_2;

import java.util.Random;

public class Demo2Main {

	public static void main(String[] args) {
		System.out.println("Demo1Main running");
		
		
//		Circle zork = new Circle(99.3);
//		System.out.println("zort count = " + zork.count);
//		Circle blort = new Circle(21.0);
//		
//		
//		System.out.println("zort rad = " + zork.radius);
//		System.out.println("zort count = " + zork.count);
//		
//		zork.radius = 1000.1;
//		//zork.count = 7;
//		
//		System.out.println("zort rad = " + zork.radius);
//		System.out.println("zort count = " + zork.count);
//		
//		//blort.count = 200;
//		
//		System.out.println("---------------- ");
//		System.out.println("blort rad = " + blort.radius);
//		System.out.println("blort count = " + blort.count);
//		
//		System.out.println("zort count = " + zork.count);
//		
//		System.out.println( Circle.getArea(44.5) );
		
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
