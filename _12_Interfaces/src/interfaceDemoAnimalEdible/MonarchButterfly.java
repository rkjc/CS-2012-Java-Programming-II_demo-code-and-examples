package interfaceDemoAnimalEdible;

public class MonarchButterfly extends Animal implements Edible{

	@Override
	public String sound() {
		return "Monarch Butterfly: Flutter flutter flutter";
	}

	@Override
	public String howToEat() {
		return "Monarch Butterfly: Danger - Do Not Eat!";
	}
}
