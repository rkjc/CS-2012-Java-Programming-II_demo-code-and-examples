package demos;

public class UncheckedExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println( "starting");

		int myIntArr[] = new int[10];
		
		System.out.println( myIntArr[3]);
		
		// Unchecked Exceptions
		// the possibility of going out of bounds exists,
		// but the compiler (as checked by Eclipse) does not force us
		// to deal with the possibility ahead of time
		
		System.out.println( myIntArr[25]);
		
		System.out.println( "Did we survive that last Exception?");

	}
}

