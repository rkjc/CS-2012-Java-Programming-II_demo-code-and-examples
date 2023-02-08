package arrayWithFunctions;

public class ReturningArrayFromMethod {

	public static void main(String[] args) {
		
		// declaring an array but not creating an array object
		int[] yoArrr;
		//System.out.println("this should crash the program" + yoArrr[1]);
		
		// using a method to make a special purpose array
		System.out.println("calling the method to make array");
		yoArrr = myArrayMaker();
		
		System.out.println("=========================");
		// proving that it works
		System.out.println("testing individual array element");
		System.out.println(yoArrr[7]);
		System.out.println("-------------------------");
		System.out.println("showing all of the array elements");
		for(int i = 0; i < yoArrr.length; i++) {
			System.out.println(yoArrr[i]);
		}
	}

	public static int[] myArrayMaker() {
		System.out.println("in the method");
		int[] locArr = new int[10]; // yoArrr is the name of an array of int values
		for(int i = 0; i < locArr.length; i++) {
			locArr[i] = (i+5)*3;
			System.out.println(locArr[i]);
		}
		return locArr;
	}
}
