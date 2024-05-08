package finalspractice_1_zoo;

public class Reptile extends Animal implements Venomous {

	
	
	public Reptile(String name, String sounds, double wight, String decoration) {
		super.setTypeOfAnimal(name);
		super.setSound(sounds);
		super.setWeight(wight);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am a reptile";
	}

}
