package finalspractice_1_zoo;

import java.util.ArrayList;

public class ExhibitEnvironment {
	
	public enum Climate  {ARCTIC, FOREST, JUNGLE, DESERT};   		
	
	private ArrayList<Animal> animals;
	private ArrayList<String> decorations; 
	private Climate environment;   // a variable to store the climate type in
	
	public ExhibitEnvironment() {
		animals = new ArrayList();
		decorations = new ArrayList();
		environment = Climate.FOREST;
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
	
	public Climate getEnvironment() {
		return environment;
	}
	
	public void setEnvironment(Climate environment) {
		this.environment = environment;
	}
}
