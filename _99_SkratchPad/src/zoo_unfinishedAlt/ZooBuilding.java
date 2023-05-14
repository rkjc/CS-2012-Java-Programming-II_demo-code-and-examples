package zoo_unfinishedAlt;

import java.util.ArrayList;

public class ZooBuilding {

	private ArrayList<Exhibit> xhibit;
	
	private String buildingName = "default";
	
	public ZooBuilding(String name) {
		this.buildingName = name; 
		xhibit = new ArrayList<Exhibit>();
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public ArrayList<Exhibit> getXhibit() { 
		return xhibit;
	}
	
}
