package simpleArrays;

public class SimpleArr_2 {

	public static void main(String[] args) {
		System.out.println("working");
		
		double[] myList = new double[7];		
		
		myList[0] = 7654;
		myList[1] = 800.3;
		myList[2] = 3453;
		myList[3] = 876.43;
		myList[4] = 77.3;
		myList[5] = 97564.3987;
		myList[6] = 123.4;
		
		
		int myLength = myList.length;
		System.out.println( myLength );
		
		for (int i = 0; i < myList.length; i++) {
			System.out.print( i + " " );
			System.out.println( myList[i] );	
		}
		
	}

	
}
