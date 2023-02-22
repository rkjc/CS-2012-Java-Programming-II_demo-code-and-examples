package assortJavaClasses;

import java.util.Random;

public class RandomPlayMain {

	public static void main(String[] args) {
		
		Random rando1 = new Random(3);
		
		System.out.print("From rando1 with seed=3: ");
		for (int i = 0; i < 10; i++){
		   System.out.print(rando1.nextInt(1000) + " ");
		}
		
		Random rando2 = new Random(3);
		System.out.print("\nFrom rando2 with seed=3: ");
		for (int i = 0; i < 10; i++){
		   System.out.print(rando2.nextInt(1000) + " ");
		} 
		
		Random rando3 = new Random(7);
		System.out.print("\nFrom rando3 with seed=7: ");
		for (int i = 0; i < 10; i++){
		   System.out.print(rando3.nextInt(1000) + " ");
		}
		
		
	}
}
