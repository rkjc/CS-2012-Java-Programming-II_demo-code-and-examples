package zoo_unfinishedAlt;

import java.util.ArrayList;

public class LandAnimal extends Animal{

	public static enum LAND_TYPE {FOREST, DESERT, PRAIRIE, JUNGLE, WETLANDS, COASTAL, NONE};
		
	private LAND_TYPE landType = LAND_TYPE.NONE; 
	// can be "forest" or "desert" or "prairie" "jungle" "wetlands", "coastal"
	private ArrayList<LAND_TYPE> landtypeList = new ArrayList<LAND_TYPE>();
	
	public  LandAnimal(String name) {
		setTypeOfAnimal(name);
	}
	
	public LandAnimal(String name, String foodtype, String sounds, String environment) {
		setTypeOfAnimal(name);
		super.setFoodType(foodtype);
		setSound(sounds);
	}

	
	
	@Override
	public void setEnvironment(String env) {
		// TODO Auto-generated method stub
		// check that it is only "forest" or "desert"
		setEnvironment(env);
	}
	
	@Override
	public String toString() {
		String outstr = "Type: " + getTypeOfAnimal() + "\nCovering: "  + "\n"
				+  "\nSounds: " + getSound() ;
		// "FoodType: " + getFoodType().toString() +
		return outstr;
	}
}
