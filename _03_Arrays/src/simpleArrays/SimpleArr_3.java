package simpleArrays;

import java.util.Random;

public class SimpleArr_3 {

	public static void main(String[] args) {
		System.out.println("working");
		Random rndnum = new Random();
		
		// declare the array and then create an array object
		double[] myList = new double[7];		
		
		for (int i = 0; i < myList.length; i++) {
			//accessing individual array elements using an int variable as the index value
			myList[i] = rndnum.nextDouble();
		}
		
		// showing the length (number of elements) of an array
		int myLength = myList.length;
		System.out.println( myLength );
		
		
		for (int i = 0; i < myList.length; i++) {
			System.out.print( i + " " );
			System.out.println( myList[i] );	
		}
		
	}	
}
