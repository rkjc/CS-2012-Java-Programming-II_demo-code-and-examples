package museum;

public abstract class Artifact {

	private String nameOfArtifact;
	private String description;
	private String whatYear;

		
	// does not have default invisible constructor
	public Artifact(String name) { 
		super();
		nameOfArtifact = name;
	}
	
	
	public String getNameOfArtifact() {
		return nameOfArtifact;
	}

	public void setNameOfArtifact(String nameOfArtifact) {
		this.nameOfArtifact = nameOfArtifact;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWhatYear() {
		return whatYear;
	}

	public void setWhatYear(String thatYear) {
		this.whatYear = thatYear;
	}
    
	@Override
	public String toString() {
		String tempstr = "Name of Artifact: " + nameOfArtifact 
				+ "\nDescription of Artifact: " + description
				+ "\nTime period of Artifact: " + whatYear;
		return tempstr;
	}
}
