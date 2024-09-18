package demo_2;

public abstract class Feline extends Animal implements TailActions {

	public void moveTail(int input) {
		System.out.println("is happy");
	}

	@Override
	public void makeNoise() {
		System.out.println("meeeeow");
	}
	
	
	
}
