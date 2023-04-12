package skratchPak;

import java.util.ArrayList;

public class QuickSkratch1 {

	public static void main(String[] args) {

		ArrayList<ArrayList> arr = new ArrayList<ArrayList>();
		ArrayList<String> arrInside = new ArrayList<String>();
		ArrayList<String> arrInside2 = new ArrayList<String>();

		arrInside.add("happy");
		arrInside.add("sad");
		arrInside.add("bunny");
		arr.add(arrInside);
		arrInside2.add("rock");
		arrInside2.add("tree");
		arr.add(arrInside2);
		
		

		System.out.println(arr);
	}
}
