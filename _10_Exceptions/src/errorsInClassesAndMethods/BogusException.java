package errorsInClassesAndMethods;

public class BogusException extends ClassNotFoundException {
	
	public BogusException() {
       super("you triggered the bogus exception");
    }

}
