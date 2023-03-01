package stringDemo1;

public class StringInterned2 {

	public static void main(String[] args) {
		
		String myStr_1 = "happy darkness";
		String myStr_2 = "happy darkness";
		String myStr_3 = new String("happy darkness");
				
		System.out.println("myStr_1 is: " + myStr_1);
		System.out.println("myStr_2 is: " + myStr_2);
		
		System.out.println("myStr_1 == myStr_2 => " + (myStr_1 == myStr_2));
		System.out.println("myStr_1 == myStr_3 => " + (myStr_1 == myStr_3));
		
		System.out.println("myStr_1.equals(myStr_3) => " + myStr_1.equals(myStr_3));
		
		System.out.println("--------");
		
		myStr_1 = myStr_2; //set both to point to same heap location
	
		
		System.out.println("myStr_1 == myStr_2 => " + (myStr_1 == myStr_2));
		System.out.println("myStr_1 is: " + myStr_1);
		System.out.println("myStr_2 is: " + myStr_2);
		System.out.println("--------");
		myStr_2 = "happy darkness";
		
		System.out.println("myStr_1 == myStr_2 => " + (myStr_1 == myStr_2));
		System.out.println("myStr_1 is: " + myStr_1);
		System.out.println("myStr_2 is: " + myStr_2);
		System.out.println("--------");
		
		
		
	}

}
