package museum;

import java.util.ArrayList;

public class Exhibit {

	public enum DisplayType {WALL, GLASSCASE, PEDISTAL, HANGFROMCELING};

	private DisplayType dType;
	private ArrayList<Artifact> art;

	public Exhibit() {
		//dType = DisplayType.WALL;
		art = new ArrayList<>();
		//art.add(new Mummy());
	}

	public Exhibit(DisplayType dType, Artifact artIn) {
		this.dType = dType;
		art = new ArrayList<>();
		art.add(artIn);
	}

	
	public DisplayType getdType() {
		return dType;
	}

	public void setdType(DisplayType dType) {
		this.dType = dType;
	}

	public ArrayList<Artifact> getArtifact() {
		return art;
	}
	
	public void addArtifact(Artifact newArt) {
		art.add(newArt);
	}
	
	@Override
	public String toString() {
		String tmpstr = "* Display type is " + dType +
				" *\n" + art.get(0).toString();
		//this could get a loop when expecting more than one artifact
		return tmpstr;
	}

}
