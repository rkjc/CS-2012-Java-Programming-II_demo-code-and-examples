package finalspractice_1_zoo;

public class Mammal extends Animal{

	private String decoration;    // variable to store the description of color and patterns - for example "blue fur with orange spots"

	public  Mammal(String name) {
		setTypeOfAnimal(name);
		setSound("");
		setWeight(0.0);
		setDecoration("");
	}
	
	public Mammal(String name, String sounds, double wight, String decoration) {
		setTypeOfAnimal(name);
		setSound(sounds);
		setWeight(wight);
		setDecoration(decoration);
	}

	public String getDecoration() {
		return decoration;
	}

	public void setDecoration(String decoration) {
		this.decoration = decoration;
	}

	@Override
	public String toString() {
		String outstr = getTypeOfAnimal() ;
		return outstr;
	}
}
