package demo1;

public class IntegerDemo1 {

	public static void main(String[] args) {

		String sNumz1 = "3000000";

		int iNumz2 = 999;
		int iNumz3 = 1234;
		Integer iInumz4 = 8080;

		iNumz3 = Integer.parseInt(sNumz1);
		//iNumz3 = Integer.ValueOf(sNumz1);

		iInumz4 = Integer.parseInt(sNumz1);
		iInumz4 = Integer.valueOf(sNumz1);

		int iNumz5 = 12;
		Integer iInumz6 = 32;

		// inumz5 = iInumz6;
		// iInumz6 = inumz5;

		// inumz5.
		// iInumz6.

		// this form is being deprecated
		Integer iInumz7 = new Integer(23);

		Integer[] izIntArray1 = { 1, 2, 3 };
		System.out.println(izIntArray1[0] + izIntArray1[1] + izIntArray1[2]);

		int a = 3, b = 5, c = 9;
		Integer[] izIntArray2 = { a, b, c };
		System.out.println(izIntArray2[0] + izIntArray2[1] + izIntArray2[2]);

	}

}
