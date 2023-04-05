package interfaceDemoGeneric1;

public class DemorunnerMain {

	public static void main(String[] args) {
		System.out.println("demo is running");
		
		UpperClass zondar = new UpperClass();
		
		//MedClass xoe = new MedClass();
		
		LowerClass pixie = new LowerClass();
		
		pixie.printHello();
		MedClass.printHello();
		LowerClass.printHello();
//		
//		zondar.counter = 99;
//		
//		System.out.println(xoe.sayHappy());
		
//		System.out.println(dondar.favoriteFlavor);
		
		
		
	}

}
