package zoo_unfinishedAlt;

public class WaterAnimal extends Animal{
	
	private String waterType = ""; // "salt" or "fresh"
	
	public WaterAnimal() {
		waterType = "undetermined";
	}
	
	
	public WaterAnimal(String waterType) {
		this.waterType = waterType;
	}
	
	
}
