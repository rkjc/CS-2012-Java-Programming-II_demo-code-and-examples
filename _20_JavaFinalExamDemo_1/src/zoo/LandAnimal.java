package zoo;

import zoo.Animal.FoodType;
import zoo.LandAnimal.CoveringType;

public class LandAnimal extends Animal{

	public enum CoveringType  {FUR,  SKIN,  SCALES};    

	private String decoration;    // variable to store the description of color and patterns - for example "blue fur with orange spots"
	private CoveringType covering;    //variable to store CoveringType 
	
	public  LandAnimal() {
	}
	
	public LandAnimal(String name, CoveringType coverType, FoodType foodtype, String sounds, double wight, String decoration) {
		setTypeOfAnimal(name);
		setCovering(coverType);
		setFoodType(foodtype);
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

	public CoveringType getCovering() {
		return covering;
	}

	public void setCovering(CoveringType covering) {
		this.covering = covering;
	}
	
	public String getInfo() {
		String outstr = "Type: " + getTypeOfAnimal() + "\nCovering: " + getCovering().toString() + "\n"
				+ "FoodType: " + getFoodType().toString() + "\nSounds: " + getSound() +"\n"
						+ "Weight: " + getWeight() + "\nLandAnimal Decoration: "+ getDecoration();
		return outstr;
	}
}
