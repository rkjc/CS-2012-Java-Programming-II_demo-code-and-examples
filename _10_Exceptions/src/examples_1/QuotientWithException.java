package examples_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuotientWithException {
	
	

	public static int quotient(int number1, int number2) {
		if (number2 == 0) {
			
			ArithmeticException bob = new ArithmeticException("Divisor cannot be zero");
			throw bob;
		}
		
		return number1 / number2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("running -> QuotientWithException");

		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");

		try {
			int number1 = input.nextInt();
			int number2 = input.nextInt();

			int result = quotient(number1, number2);
			System.out.println(number1 + " / " + number2 + " is " + result);
		} catch (InputMismatchException ex) {
			System.out.println(ex);
			// System.out.println("Exception: an integer " + "cannot be divided by zero ");
		} catch (Exception e) {
			System.out.println("inoup");
			//throw e;
		}

		System.out.println("Execution continues ... kidding");

	}
}
