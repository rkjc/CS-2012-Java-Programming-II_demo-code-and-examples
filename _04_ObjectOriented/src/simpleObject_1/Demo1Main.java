package simpleObject_1;

import java.util.Random;

public class Demo1Main {

	public static void main(String[] args) {
		System.out.println("Demo1Main running");

		Drawing paper = new Drawing();

		Circle zork = new Circle(99.3);

		paper.setThing1(zork);
		
		

		System.out.println("zort rad = " + zork.getRadius());
		System.out.println("paper zort rad = " + paper.getThing1().getRadius());

		zork.setRadius(547.1);

		System.out.println("zort rad = " + zork.getRadius());
		System.out.println("paper zort rad = " + paper.getThing1().getRadius());

	}

//========================================================================
// Methods

}
