package errorsInClassesAndMethods;

import java.io.IOException;

public class CircleExceptionDamagerMain {

	public static void main(String[] args) {

		NullPointerException bob = new NullPointerException("null out wow");
		Circle zork = new Circle();

		try {
			zork.setRadius(4.5);

			// double badRadius = zork.getRadius();
			// zork.setRadius(badRadius);

			// zork.setRadius(-3.2);

			double printRadius = zork.getRadius();

			// int scale = 1;
			int scale = 0;

			printRadius = printRadius /scale;
			//int inPrintRad = (Integer.parseInt(String.valueOf(printRadius)) / scale);

			System.out.println("yep it ran. radius is: " + printRadius);

			// manually throw the exception;
			// throw new IOException("oooooops");
			throw new BogusException();
			
		} catch (BogusException e) {
			
		} catch (NullPointerException e) {

			System.out.println(e);
			System.out.println("\ncontinue with the NULL fix it program\n");
			throw e;
			
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println("\nnumber format\n");

		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("\nalso -> this radius is just plain illegal, give up!\n");

		} catch (Exception e) {
			System.out.println("general purpose BROKE");
			System.out.println(e);

		} finally {
			System.out.println("in the finallys");
		}

		System.out.println("the even if the circle crashed but we are continuing on");
	}

}
