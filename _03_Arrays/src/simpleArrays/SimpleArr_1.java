package simpleArrays;

public class SimpleArr_1 {

	public static void main(String[] args) {
		System.out.println("working");

		// declaring and then initializing a primitive variable type
		double thisThing;
		thisThing = 9.0;
		System.out.println(thisThing);

		// declaring an array data type
		double[] myList;
		// creating the array object and setting its size
		myList = new double[18];

		// storing new values in the individual elements - they work just like variables
		myList[0] = 7654;
		myList[4] = 77.3;
		myList[6] = 123.4;
		myList[0] = 0.000003;

		// printing out the value stored in one of the array elements
		System.out.println(myList[0]);

	}
}
