package zoo_unfinishedAlt;

public abstract class Animal {

	private String typeOfAnimal; // variable to hold the name of that type of animal, for example cat, or
									// elephant
	private String foodType; // variable to store the type of food it eats
	private String sound; // variable to store the noise it makes - for example "deep burping croak"
	private String environment;

	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}

	public void setTypeOfAnimal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String env) {
		environment = env;
	}

}
