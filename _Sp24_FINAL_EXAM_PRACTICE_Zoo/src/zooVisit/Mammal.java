package zooVisit;

public class Mammal extends Animal{

	private String typeOfFur;
	

	public  Mammal(String name) {
		setTypeOfAnimal(name);
		setSound("");
		setWeight(0.0);
		setFurType("");
	}
	
	public Mammal(String name, String sounds, double wight, String furType) {
		setTypeOfAnimal(name);
		setSound(sounds);
		setWeight(wight);
		setFurType(furType);
	}

	public String getFurType() {
		return typeOfFur;
	}

	public void setFurType(String furType) {
		this.typeOfFur = furType;
	}


	@Override
	public String toString() {
		String outstr = getTypeOfAnimal() + " weighs: " + getWeight() + " - and makes the sound: " + getSound();
		return outstr;
	}
}
