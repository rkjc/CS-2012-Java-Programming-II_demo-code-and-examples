package zooVisit;

public abstract class Animal {

	private String typeOfAnimal; // variable to hold the name of that type of animal
	private double weight; // variable
	private String sound; // variable to store the noise it makes - for example "deep burping croak"

	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}

	public void setTypeOfAnimal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public abstract String toString();

}
