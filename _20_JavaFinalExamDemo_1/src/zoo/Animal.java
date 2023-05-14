package zoo;

public abstract class Animal {

	public static enum FoodType {CARNIVOR, HERBIVOR, OMNIVORE};   
	
	private String typeOfAnimal;  //variable to hold the name of that type of animal, for example cat, or elephant
	private double weight;		// variable
	private FoodType foodType;   // variable to store the type of food it eats
	private String sound;    // variable to store the noise it makes - for example "deep burping croak"
	
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
	public FoodType getFoodType() {
		return foodType;
	}
	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
}
