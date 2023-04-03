package interfaceDemo1;

public class MedClass extends UpperClass  {

	
	public static void printHello() {
		System.out.println("hey from the static print");
	}
	
	public int getCounter() {
		return super.counter;	
	}

	
}
