package interfaceDemo2;

public class TestEdibleMain {

	public static void main(String[] args) {
		
		Object[] objects = { new Tiger(), new Chicken(), new Apple(), new Orange(), new MonarchButterfly() };
		
		for (int i = 0; i < objects.length; i++) {
		
			if (objects[i] instanceof Edible)
				System.out.println(((Edible) objects[i]).howToEat());

			if (objects[i] instanceof Animal) {
				System.out.println(((Animal) objects[i]).sound());
			}
		}
		
		Object waxox = new Object();

		
	}

}
