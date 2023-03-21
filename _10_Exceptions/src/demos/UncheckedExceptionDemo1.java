package demos;

public class UncheckedExceptionDemo1 {

	// Java does not force you to provide exception handling for these potential
	// errors, it will just up and crash your whole program if you don't
	// provide any error handling for these situations

	public static void main(String[] args) {
		System.out.println("starting");

		int userIn1 = 10;
		int userIn2 = 25;

		try {

			doArray(userIn1, userIn2);

		} catch (Exception e) {
			System.out.println("*** you broke the array, please dont do that ***");
			System.out.println(e);
		} finally {
			System.out.println("+++ made it past the danger zone +++");
		}

		System.out.println("Did we survive that last Exception?");

	}

	static int doArray(int A, int B) throws Exception, ArrayIndexOutOfBoundsException {
		try {
			System.out.println("setup an array with size 10");
			int myIntArr[] = new int[A];
			System.out.println(myIntArr[3]);

			System.out.println("calling array index 25");
			System.out.println(myIntArr[B]);
		} catch (Exception e) {
			System.out.println("*** down in the method things broke ***");
			throw new ArrayIndexOutOfBoundsException ();
		} 

		return 0;
	}

}
