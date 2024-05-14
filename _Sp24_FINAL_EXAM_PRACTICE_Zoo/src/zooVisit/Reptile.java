package zooVisit;

public class Reptile extends Animal implements Venomous {

	private Boolean isVenomous = false;
	private String typeOfSkin;
	
	public Reptile(String name) {
		super.setTypeOfAnimal(name);
	}
	
	public Reptile(String name, String sounds, double wight, String decoration) {
		super.setTypeOfAnimal(name);
		super.setSound(sounds);
		super.setWeight(wight);
	}
	
	public String getTypeOfSkin() {
		return typeOfSkin;
	}

	public void setTypeOfSkin(String skinType) {
		this.typeOfSkin = skinType;
	}
	
	@Override
	public String toString() {
		String outstr = getTypeOfAnimal() + " weighs: " + getWeight() + " - and makes the sound: " + getSound();
		return outstr;
	}

	@Override
	public Boolean getIsVenomous() {
		return isVenomous;
	}

	@Override
	public void setIsVenomous(boolean vstate) {
		isVenomous = vstate;
	}

}
