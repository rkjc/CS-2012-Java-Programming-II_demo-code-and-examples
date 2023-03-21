package demos;

public class UncheckedExceptions_2 {

	public static void main(String[] args) {
		System.out.println("program start");
		
		int x = 7; int y = 0;
		System.out.println( y/x );
		//System.out.println( x/y );
		
		String z = "4";
		int w = Integer.parseInt(z);
		int myIntArr[] = new int[10];
		myIntArr[4] = 99;
		System.out.println( myIntArr[w] );
		
		
	}

}
