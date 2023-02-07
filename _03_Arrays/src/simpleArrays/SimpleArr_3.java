package simpleArrays;

import java.util.Random;

public class SimpleArr_3 {

	public static void main(String[] args) {
		System.out.println("working");
		
		double[] myList = new double[7];		
		
		Random rndnum = new Random();
		
		for (int i = 0; i < myList.length; i++) {
			
			myList[i] = rndnum.nextDouble();
			
		}
		
		
		int myLength = myList.length;
		System.out.println( myLength );
		
		for (int i = 0; i < myList.length; i++) {
			System.out.print( i + " " );
			System.out.println( myList[i] );	
		}
		
	}

	
}
