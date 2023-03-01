package stringDemo1;

import java.math.BigInteger;

public class StringObjectDemo1Main {

	public static void main(String[] args) {

		String myStr_1 = "happy darkness";
		String myStr_2 = "panic sunshine";
		
		System.out.println("myStr_1 is: " + myStr_1);
		System.out.println("myStr_2 is: " + myStr_2);
		
		System.out.println("myStr_1 == myStr_2 => " + (myStr_1 == myStr_2));
		System.out.println("--------");
		
		
		myStr_1 = myStr_2; //set both to point to same heap location
		
		System.out.println("myStr_1 == myStr_2 => " + (myStr_1 == myStr_2));
		System.out.println("myStr_1 is: " + myStr_1);
		System.out.println("myStr_2 is: " + myStr_2);
		System.out.println("--------");
		
		//System.out.println("myStr_1 == myStr_2 => " + (myStr_1 == myStr_2));

	}

}


//String myStr_3 = new String("crazy space");
//System.out.println("myStr_3 is: " + myStr_3);
