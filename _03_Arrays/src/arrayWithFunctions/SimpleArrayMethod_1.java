package arrayWithFunctions;

public class SimpleArrayMethod_1 {

	public static void main(String[] args) {

		int someNum = 27; // someNum represents a primitive int value
		int[] yoArrr = new int[10]; // yoArrr is the name of an array of int values
		yoArrr[7] = 345;
		
		System.out.println("these are the values before being changed in the method call");
		System.out.println("someNum is " + someNum);
		System.out.println("yoArrr[7] is " + yoArrr[7]);

		zotarJob(someNum, yoArrr); // Invoke m with arguments x and y

		System.out.println("-------------------");
		System.out.println("these are the values after being changed in the method call");
		System.out.println("someNum is " + someNum);
		System.out.println("yoArrr[7] is " + yoArrr[7]);
	}

	public static void zotarJob(int inNumber, int[] inNumbersss) {
		inNumber = 10099001; // Assign a new value to inNumber
		inNumbersss[7] = 5555; // Assign a new value to inNumbersss[7]
		// we accessed the same location in the passed array, even though it has a different 
		// array name in the scope of this method
	}

}
