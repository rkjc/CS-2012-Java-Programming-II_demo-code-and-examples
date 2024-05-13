package museum;

import java.util.ArrayList;

public class StartMuseumMain {

	static int score = 0;
	static int xtraScore = 0;
	static int xtraMissScore = 0;

	public static void main(String[] args) {
		
		try {
			// make the person object visiting the Museum
			MyPersona happyVisitor = new MyPersona();
			// program didn't crash, get some points
			score = score + 25;

			System.out.println("Hi there " + happyVisitor.getName()
					+ ".\nWelcome to the Museum.\nEnjoy your journey of discovery today as you visit the exhibits");
			// every time your program survives another call to a class or method, your
			// score increases.
			score = score + 5;

			ArrayList<Exhibit> displays = new ArrayList<>();
			score = score + 5;

			Mummy mum_1 = new Mummy("Egyptian Mummy", "Amenophis II", true, false, "found in Pyramid", "1397 BCE");
			score = score + 5;

			Mummy mum_2 = new Mummy("Frozen Iceman");
			mum_2.setNameOfPerson("Ötzi");
			mum_2.setDescription("found in French mountains");
			mum_2.setWhatYear("3300 BCE");
			mum_2.setIsCursed(true);
			mum_2.applyMagicSeal();
			score = score + 5; 
			
			

			Dinosaurs dino_1 = new Dinosaurs("Tyranasaurus Rex", "Bipedal with tail",
					"Armored mechanical battle dinasaur with machinegun used in WW2", "1945");
			score = score + 5;

			Dinosaurs dino_2 = new Dinosaurs("Pterodactyl");
			dino_2.setTypeOfDinosaur("Flying Pterodactyloidea");
			dino_2.setDescription("Monsterous flying terror with a huge tooth filled bill");
			dino_2.setWhatYear("Jurassic and Cretaceous Periods");
			
			score = score + 5;

			MedievalArmor armor_1 = new MedievalArmor("King Charlemane Gold Plated Armor", "King Charlemane", false,
					false, "Full suit of battle ready plate armor", "1066", "plate armor");
			score = score + 5;

			MedievalArmor armor_2 = new MedievalArmor("Prince Johns Sheild and Crest");
			armor_2.setOriginalOwner("Prince John of Nauhtingham");
			armor_2.setArmorType("One handed round shield");
			armor_2.setDescription(
					"This type of shield was weak against Ballista, as can be seen by the large hole in it that killed Prince John");
			armor_2.setWhatYear("1642 AD");
			armor_2.setIsCursed(true);
			armor_2.applyMagicSeal();
			score = score + 5;

			// make exhibits and add items to them
			Exhibit ex_1 = new Exhibit("PEDISTAL", mum_1);
			score = score + 2;
			Exhibit ex_2 = new Exhibit("GLASSCASE", mum_2);
			score = score + 2;
			Exhibit ex_3 = new Exhibit("PEDISTAL", dino_1);
			score = score + 2;
			Exhibit ex_4 = new Exhibit("HANGFROMCELING", dino_2);
			score = score + 2;
			Exhibit ex_5 = new Exhibit("PEDISTAL", armor_1);
			score = score + 2;
			Exhibit ex_6 = new Exhibit("WALL", armor_2);
			score = score + 2;

			// add the exhibits to the museum
			displays.add(ex_1);
			displays.add(ex_4);
			displays.add(ex_3);
			displays.add(ex_5);
			displays.add(ex_6);
			displays.add(ex_2);
			score = score + 6;

			// running through the museum, lets see what is here
			int index = 0;
			int numDisplays = displays.size();
			score = score + 1;
			while (index < numDisplays) {

				pause(200);
				System.out.println("--------------------------------");

				// display exhibit
				String displayOut = displays.get(index).toString();	
				
				System.out.println(displayOut);
				System.out.println("   user saying --> " + happyVisitor.getName() + " said: " + happyVisitor.getRandomSaying());
				score = score + 1;

				index += 1;
			}
			score = score + 10;
			
			// * note - checking the output to see that the toString() methods have been
			// configured
			// Up to 9 points off if it gives the Object.toString() default output. (3
			// points off for each class that does not implement it).

			// ****** uncomment the next 4 lines of code to check that they can not be run

//			Artifact artThing = new Artifact();
//			Mummy obj_1 = new Mummy();
//			MedievalArmor obj_2 = new MedievalArmor();
//			Dinasaurs obj_3 = new Dinasaurs();

			// Artifact class must be abstract or -5 points
			// All three subclasses must not have a no-argument constructor: -3 each
			
			

			// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
			// final check that all methods are accounted for
			int extraScore = 0;

			String testStr;
			// System.out.println((testStr.equals( -check_variable- ) ? "pass" : doFail()) +
			// " string name of check_variable");
			boolean testBool;
			// check for true System.out.println(((testBool) ? "pass" : doFail()) + "
			// string_name_test");
			// check for false System.out.println(((!testBool) ? "pass" : doFail()) + "
			// string_name_test");

			String check_nameOfTisArtifact;
			String check_description;
			String check_year;

			// String result = (time < 18) ? "Good day." : "Good evening.";
			// ------- mummy testing ---------
			String check_nameOfPerson;

			try {
				check_nameOfTisArtifact = "name artifact mum 3";
				check_description = "desc mum 3";
				check_year = "year mum 3";
				check_nameOfPerson = "person mum 3";

				// mummy full constructor tests
				System.out.println("\n--- mummy full constructor tests ---");
				// (String nameOfThisArtifact, String nameOfPerson, boolean isCursed, boolean
				// magicProtection,
				// String descrption, String fromYear)
				Mummy mum_3 = new Mummy(check_nameOfTisArtifact, check_nameOfPerson, true, true, check_description,
						check_year);

				testStr = mum_3.getNameOfPerson(); // test this
				System.out.println((testStr.equals(check_nameOfPerson) ? doPass() : doFail()) + " - getNameOfPerson()");

				testStr = mum_3.getNameOfArtifact(); // check this
				System.out.println(
						(testStr.equals(check_nameOfTisArtifact) ? doPass() : doFail()) + " - getNameOfArtifact()");

				testStr = mum_3.getWhatYear(); // check this
				System.out.println((testStr.equals(check_year) ? doPass() : doFail()) + " - getWhatYear()");

				testStr = mum_3.getDescription(); // check this
				System.out.println((testStr.equals(check_description) ? doPass() : doFail()) + " - getDescription()");

				testBool = mum_3.checkMagicSeal(); // check for true
				System.out.println(((testBool) ? doPass() : doFail()) + " - checkMagicSeal()");

				testBool = mum_3.getIsCursed(); // test for true
				System.out.println(((testBool) ? doPass() : doFail()) + " - getIsCursed()");

				mum_3 = new Mummy(check_nameOfTisArtifact, check_nameOfPerson, false, false, check_description,
						check_year);
				testBool = mum_3.checkMagicSeal(); // check for false
				System.out.println(((!testBool) ? doPass() : doFail()) + " - checkMagicSeal()");
				testBool = mum_3.getIsCursed(); // test for false
				System.out.println(((!testBool) ? doPass() : doFail()) + " - getIsCursed()");

			} catch (Exception e) {
				System.out.println(" ***** mummy full constructor failed ***** ");
			}

			// mummy single constructor tests

			try {
				System.out.println("\n--- mummy single constructor tests ---");

				check_nameOfTisArtifact = "name artifact mum 4";
				check_description = "desc mum 4";
				check_year = "year mum 4";
				check_nameOfPerson = "person mum 4";

				Mummy mum_4 = new Mummy(check_nameOfTisArtifact);
				testStr = mum_4.getNameOfArtifact(); // test this
				System.out.println(
						(testStr.equals(check_nameOfTisArtifact) ? doPass() : doFail()) + " - getNameOfArtifact()");

				mum_4.setNameOfPerson(check_nameOfPerson);
				testStr = mum_4.getNameOfPerson(); // test this
				System.out.println((testStr.equals(check_nameOfPerson) ? doPass() : doFail()) + " - getNameOfPerson()");

				// artifact super class tests
				mum_4.setNameOfArtifact(check_nameOfTisArtifact + " b");
				testStr = mum_4.getNameOfArtifact(); // check this
				System.out.println((testStr.equals(check_nameOfTisArtifact + " b") ? doPass() : doFail())
						+ " - getNameOfArtifact()");

				mum_4.setDescription(check_description);
				testStr = mum_4.getDescription(); // check this
				System.out.println((testStr.equals(check_description) ? doPass() : doFail()) + " - getDescription()");

				mum_4.setWhatYear(check_year);
				testStr = mum_4.getWhatYear(); // check this
				System.out.println((testStr.equals(check_year) ? doPass() : doFail()) + " - getWhatYear()");

				// ---- interface ----
				mum_4.applyMagicSeal();
				testBool = mum_4.checkMagicSeal(); // check for true
				System.out.println(((testBool) ? doPass() : doFail()) + " - checkMagicSeal()");

				mum_4.removeMagicSeal();
				testBool = mum_4.checkMagicSeal(); // check for false
				System.out.println(((!testBool) ? doPass() : doFail()) + " - checkMagicSeal()");

				mum_4.setIsCursed(true);
				testBool = mum_4.getIsCursed(); // test for true
				System.out.println(((testBool) ? doPass() : doFail()) + " - getIsCursed()");

				mum_4.setIsCursed(false);
				testBool = mum_4.getIsCursed(); // test for false
				System.out.println(((!testBool) ? doPass() : doFail()) + " - getIsCursed()");

			} catch (Exception e) {
				System.out.println(" ***** mummy single constructor failed ***** ");
			}

			
			// ====== dino testing =============
			String check_typOfDinasaur;
			
			try {

				check_nameOfTisArtifact = "name artifact dino 5";
				check_description = "desc dino 5";
				check_year = "year dino 5";
				check_typOfDinasaur = "type dino 5";

				// dino multi constructor
				System.out.println("\n\n--- dino full constructor tests ---");
				Dinosaurs dino_5 = new Dinosaurs(check_nameOfTisArtifact, check_typOfDinasaur, check_description,
						check_year);

				testStr = dino_5.getTypeOfDinosaur(); // check this
				System.out.println(
						(testStr.equals(check_typOfDinasaur) ? doPass() : doFail()) + " - getTypeOfDinasaur()");

				// artifact super class
				testStr = dino_5.getNameOfArtifact(); // check this
				System.out.println(
						(testStr.equals(check_nameOfTisArtifact) ? doPass() : doFail()) + " - getNameOfArtifact()");

				testStr = dino_5.getDescription(); // check this
				System.out.println((testStr.equals(check_description) ? doPass() : doFail()) + " - getDescription()");

				testStr = dino_5.getWhatYear(); // check this
				System.out.println((testStr.equals(check_year) ? doPass() : doFail()) + " - getWhatYear()");

			} catch (Exception e) {
				System.out.println(" ***** mummy full constructor failed ***** ");
			}

			try {
				// dino single constructor
				System.out.println("\n--- dino single constructor tests ---");

				check_nameOfTisArtifact = "name artifact dino 6";
				check_description = "desc dino 6";
				check_year = "year dino 6";
				check_typOfDinasaur = "type dino 6";

				Dinosaurs dino_6 = new Dinosaurs(check_nameOfTisArtifact);
				testStr = dino_6.getNameOfArtifact(); // check this
				System.out.println(
						(testStr.equals(check_nameOfTisArtifact) ? doPass() : doFail()) + " - getNameOfArtifact()");

				dino_6.setTypeOfDinosaur(check_typOfDinasaur);
				testStr = dino_6.getTypeOfDinosaur(); // check this
				System.out.println(
						(testStr.equals(check_typOfDinasaur) ? doPass() : doFail()) + " - getTypeOfDinasaur()");

				// artifact super class
				dino_6.setNameOfArtifact(check_nameOfTisArtifact + " b");
				testStr = dino_6.getNameOfArtifact(); // check this
				System.out.println((testStr.equals(check_nameOfTisArtifact + " b") ? doPass() : doFail())
						+ " - getNameOfArtifact()");

				dino_6.setDescription(check_description);
				testStr = dino_6.getDescription(); // check this
				System.out.println((testStr.equals(check_description) ? doPass() : doFail()) + " - getDescription()");

				dino_6.setWhatYear(check_year);
				testStr = dino_6.getWhatYear(); // check this
				System.out.println((testStr.equals(check_year) ? doPass() : doFail()) + " - getWhatYear()");

			} catch (Exception e) {
				System.out.println(" ***** dino single constructor failed ***** ");
			}

			// ============ MedievalArmor ==============
			String check_originalOwner;
			String check_armorType;

			try {

				// ---- medieval armor full constructor tests -----
				System.out.println("\n\n--- medieval armor full constructor tests ---");

				check_nameOfTisArtifact = "name artifact armor 7";
				check_description = "desc armor 7";
				check_year = "year armor 7";
				check_originalOwner = "owner armor 7";
				check_armorType = "type armor 7";

				// (nameOfThisArtifact, String originalOwner, boolean isCursed,
				// boolean magicProtection, String descrption, String fromYear, String
				// armorType)
				MedievalArmor armor_7 = new MedievalArmor(check_nameOfTisArtifact, check_originalOwner, false, false,
						check_description, check_year, check_armorType);
				testStr = armor_7.getNameOfArtifact(); // check this
				System.out.println((testStr.equals(check_nameOfTisArtifact) ? doPass() : doFail())
						+ " - getNameOfArtifact()");

				testStr = armor_7.getWhatYear(); // check this
				System.out.println((testStr.equals(check_year) ? doPass() : doFail()) + " - getWhatYear()");

				testStr = armor_7.getDescription(); // check this
				System.out.println((testStr.equals(check_description) ? doPass() : doFail()) + " - getDescription()");

				testBool = armor_7.checkMagicSeal(); // check for false
				System.out.println(((!testBool) ? doPass() : doFail()) + " - checkMagicSeal()");

				testBool = armor_7.getIsCursed(); // test for false
				System.out.println(((!testBool) ? doPass() : doFail()) + " - getIsCursed()");

				armor_7 = new MedievalArmor(check_nameOfTisArtifact, check_originalOwner, true, true, check_description,
						check_year, check_armorType);

				testBool = armor_7.checkMagicSeal(); // check for true
				System.out.println(((testBool) ? doPass() : doFail()) + " - checkMagicSeal()");

				testBool = armor_7.getIsCursed(); // test for true
				System.out.println(((testBool) ? doPass() : doFail()) + " - getIsCursed()");

			} catch (Exception e) {
				System.out.println(" ***** armor full constructor failed ***** ");
			}

			try {
				// -- armor single constructor tests ---
				System.out.println("\n--- medieval armor single constructor tests ---");

				check_nameOfTisArtifact = "name artifact armor 8";
				check_description = "desc armor 8";
				check_year = "year armor 8";
				check_originalOwner = "owner armor 8";
				check_armorType = "type armor 8";

				MedievalArmor armor_8 = new MedievalArmor(check_nameOfTisArtifact);

				armor_8.setOriginalOwner(check_originalOwner);
				testStr = armor_8.getArmorType();
				armor_8.setArmorType(check_armorType);
				testStr = armor_8.getOriginalOwner();

				// artifact super class tests
				armor_8.setNameOfArtifact(check_nameOfTisArtifact + " b");
				testStr = armor_8.getNameOfArtifact(); // check this
				System.out.println((testStr.equals(check_nameOfTisArtifact + " b") ? doPass() : doFail())
						+ " - getNameOfArtifact()");

				armor_8.setDescription(check_description);
				testStr = armor_8.getDescription(); // check this
				System.out.println((testStr.equals(check_description) ? doPass() : doFail()) + " - getDescription()");

				armor_8.setWhatYear(check_year);
				testStr = armor_8.getWhatYear(); // check this
				System.out.println((testStr.equals(check_year) ? doPass() : doFail()) + " - getWhatYear()");

				// ---- interface ----
				armor_8.applyMagicSeal();
				testBool = armor_8.checkMagicSeal(); // check for true
				System.out.println(((testBool) ? doPass() : doFail()) + " - checkMagicSeal()");

				armor_8.removeMagicSeal();
				testBool = armor_8.checkMagicSeal(); // check for false
				System.out.println(((!testBool) ? doPass() : doFail()) + " - checkMagicSeal()");

				armor_8.setIsCursed(true);
				testBool = armor_8.getIsCursed(); // test for true
				System.out.println(((testBool) ? doPass() : doFail()) + " - getIsCursed()");

				armor_8.setIsCursed(false);
				testBool = armor_8.getIsCursed(); // test for false
				System.out.println(((!testBool) ? doPass() : doFail()) + " - getIsCursed()");

			} catch (Exception e) {
				System.out.println(" ***** armor single constructor failed ***** ");
			}

			// ======== end method checks =====================

			System.out.println("\nThank you " + happyVisitor.getName()
					+ " for visiting the Museum.\nLooking forward to seeing you again in the future!");

		} catch (Exception e) {
			System.out.println("Something broke. Your partial score is " + score);
		} finally {
			System.out.println("--------------------------------");
			System.out.println("your score is " + score);
			System.out.println("your additional methods score tests is " + xtraScore + " out of 40");
			Double methodsScore = xtraScore * 0.5;
			methodsScore = (Math.ceil(methodsScore));
			System.out.println("\nfinal score is " + (score + methodsScore.intValue()) + " out of 120");
			System.out.println("--------------------------------");
		}

	}
	
	public static String doPass() {
		xtraScore ++;
		return "pass";
	}
	
	public static String doFail() {
		xtraMissScore ++;
		return "fail";
	}

	public static void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
