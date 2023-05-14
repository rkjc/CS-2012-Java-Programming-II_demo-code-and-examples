package PassByValue;

public class PassByValue_1 {

	public static void main(String[] args) {
		    Dog aDog = new Dog("Max");
		    Dog oldDog = aDog;
		    System.out.println("aDog.getName() " + aDog.getName());
		    System.out.println("oldDog.getName() " + oldDog.getName());

		    foo(aDog);
		    // when foo(...) returns, the name of the dog has been changed to "Fifi"
		    System.out.println("aDog.getName().equals(\"Fifi\") " + aDog.getName().equals("Fifi")); // true
		    // but it is still the same dog:
		    System.out.println("aDog == oldDog  " + (aDog == oldDog)); // true
		}

	public static void foo(Dog d) {
		d.getName().equals("Max"); // true
		// this changes the name of d to be "Fifi"
		d.setName("Fifi");
	}

}

class Dog {
	String name;

	public Dog(String namein) {
		name = namein;
	}

	public void setName(String namein) {
		name = namein;
	}

	public String getName() {
		return name;
	}
}

//stolen from here - https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value