package introCode;

import java.util.Random;

public class MyProgMain {

	int bob = 99;
	
	
	public static void main(String[] args) {
		System.out.println("started running MyProgMain");		
//		int num = 9;
//		int numPlus5 = addFive(num);	
//		System.out.println(numPlus5);
		
		OtherClassObj zork = new OtherClassObj("another example");

		System.out.println(zork.descStr);
		System.out.println();
		
//		OtherClassObj bleem = new OtherClassObj();
//		System.out.println(bleem.descStr);
		
		
////		System.out.println(zork.zoom);
////		System.out.println(zork.desc);
//		
//		
//		System.out.println(blamp.zoom);
//		
//		changeIt(zork);
//		
//		System.out.println(zork.largeness);
//		System.out.println(zork.zoom);
		
		
		Random rnt = new Random();	
		rnt.doubles();

	}
	
	public static int addFive(int x) {
		return x + 5;
	}
	
	public static void changeIt(OtherClassObj temp) {
		temp.largeness = 100023;
		temp.zoom = 7.77777777;
	}

}
