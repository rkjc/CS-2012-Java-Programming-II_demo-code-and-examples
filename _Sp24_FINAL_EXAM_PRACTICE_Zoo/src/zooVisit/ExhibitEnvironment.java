package zooVisit;

import java.util.ArrayList;

public class ExhibitEnvironment {
		
	
	private ArrayList<Animal> animals;
	private ArrayList<String> decorations; 
	private String environment;   // a variable to store the climate type in
	
	public ExhibitEnvironment() {
		animals = new ArrayList();
		decorations = new ArrayList();
		environment = "";
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
	
	public String getEnvironment() {
		return environment;
	}
	
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
}
