package zoo_unfinishedAlt;

import java.util.ArrayList;

public class Exhibit {
	
	// Climate  {ARCTIC, FOREST, JUNGLE, DESERT};   		
	
	private ArrayList<Animal> animals;
	private ArrayList<String> decorations; 
	private ArrayList<String> environment;   // a variable to store the climate type in
	
	public Exhibit() {
		animals = new ArrayList();
		decorations = new ArrayList();
	}
	
	public ArrayList<Animal> getAnimals() {
		return animals;
	}
	
	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}
	
	public ArrayList<String> getDecorations() {
		return decorations;
	}
	
	public void addDecoration(String decor) {
		this.decorations.add(decor);
	}
	
//	public Climate getEnvironment() {
//		return environment;
//	}
	
//	public void setEnvironment(Climate environment) {
//		this.environment = environment;
//	}
}
