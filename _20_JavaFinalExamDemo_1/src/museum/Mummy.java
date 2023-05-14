package museum;

public class Mummy extends Artifact implements Cursed {

	private String nameOfPerson;
	private boolean isCursed;
	private boolean magicSealActivated;

//	public Mummy() {
//		super();
//		nameOfPerson = "unknown";
//		isCursed = false;
//		magicSealActivated = false;
//	}

	public Mummy(String nameOfPerson, boolean isCursed, boolean magicProtection, String nameOfArtifact,
			String descrption, String fromYear) {
		
		super(nameOfArtifact);
		
		this.nameOfPerson = nameOfPerson;
		this.isCursed = isCursed;
		this.magicSealActivated = magicProtection;
		//setNameOfArtifact(nameOfArtifact);
		setDescription(descrption);
		setWhatYear(fromYear);
	}

	public void setNameOfPerson(String nameOfPerson) {
		this.nameOfPerson = nameOfPerson;
	}

	public String getNameOfPerson() {
		return nameOfPerson;
	}

	@Override
	public void applyMagicSeal() {
		magicSealActivated = true;
	}

	@Override
	public boolean checkMagicSeal() {
		return magicSealActivated;
	}

	@Override
	public boolean getIsCursed() {
		return isCursed;
	}

	@Override
	public void setIsCursed(boolean x) {
		isCursed = x;
	}

	
	//-------------------
	@Override
	public String toString() {
		String tempstr = super.toString() 
				+ "\nName of Person: " + this.nameOfPerson 
				+ "\nArtifact is Cursed: " + isCursed 
				+ "\nProtected by Magic Seal: " + this.magicSealActivated;

		return tempstr;
	}


}


//