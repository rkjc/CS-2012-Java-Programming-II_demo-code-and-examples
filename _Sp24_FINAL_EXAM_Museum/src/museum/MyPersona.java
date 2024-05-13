package museum;

import java.util.ArrayList;
import java.util.Random;

public class MyPersona {

	//You must customize this to include your information for grading information, and fun quotes
	
	public final String name = "yourname goes here";
	public final String myEmail = "yourCalStateEmail@calstatela.edu";
	
	private ArrayList<String> sayings = new ArrayList<String>();
	
	public MyPersona() {
		// things that you might say at a Fair or whatever
		sayings.add("Hmm, this is interesting.");
		sayings.add("Oops, sorry I'm late");
		sayings.add("Don't forget to save early, save often.");
		sayings.add("Golly gosh gee willikers that was fun");
		// keep going, need at least 5
	}
	
	public String getRandomSaying() {
		Random rndx = new Random();
		int sayNum = rndx.nextInt(sayings.size());
		return sayings.get(sayNum);
	}
		
	public ArrayList<String> getSayingList(){
		return sayings;
	}

	public String getName() {
		return name;
	}

	public String getMyEmail() {
		return myEmail;
	}
}
