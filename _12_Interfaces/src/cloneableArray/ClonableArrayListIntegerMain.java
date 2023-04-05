package cloneableArray;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ClonableArrayListIntegerMain {

	public static void main(String[] args) {

		ArrayList<Integer> arrInt1 = new ArrayList<Integer>();
		arrInt1.add(43);
		arrInt1.add(99);
		arrInt1.add(1001);
		arrInt1.add(17);
		printArray("arrInt1", arrInt1);

//		ArrayList<Integer> arrInt2;
//		ArrayList<Integer> arrInt3;
//				
//		arrInt2 = arrInt1; 
//		arrInt3 = (ArrayList<Integer>) arrInt1.clone();  // Using the .clone() method that ArrayList has available
//		
//		System.out.println("arrInt2 == arrInt1 is " + (arrInt2 == arrInt1));
//		System.out.println("arrInt3 == arrInt1 is " + (arrInt3 == arrInt1));
//		
//		printArray("arrInt2", arrInt2);
//		printArray("arrInt3", arrInt3);
//		
//		System.out.println("------------------------------------");
//
//		System.out.println("change a value in arrInt1 => arrInt1.set(2, 8)");
//		arrInt1.set(2, 8);
//		
//		printArray("arrInt1", arrInt1);		
//		printArray("arrInt2", arrInt2);
//		printArray("arrInt3", arrInt3);
//		
//		System.out.println("------------------------------------");
//		
//		System.out.println("change a value in arrInt2 => arrInt2.set(0, 222)");
//		arrInt1.set(0, 222);
//		
//		printArray("arrInt1", arrInt1);		
//		printArray("arrInt2", arrInt2);
//		printArray("arrInt3", arrInt3);
//		
//		System.out.println("------------------------------------");
	}

// ---------------- Methods -----------------------

	public static void printArray(String name, ArrayList<Integer> arrr) {
		// System.out.println("------------------------------------");
		System.out.print(name + " => ");
		for (Integer num : arrr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
