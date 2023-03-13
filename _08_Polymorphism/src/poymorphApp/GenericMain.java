package poymorphApp;

public class GenericMain {
	public static void main(String[] args) {

		Object myob = new Object();
		
		Student mystu1 = new Student();
		Person zondar = new Person();
		
		System.out.println(myob.toString());
		System.out.println(mystu1.toString());
				
		myob = mystu1; 
		
		System.out.println(myob == mystu1);
		System.out.println("-----------------------");
		System.out.println(myob.toString());
		System.out.println(myob instanceof Student);
		System.out.println(myob instanceof Object);
		System.out.println(myob instanceof Person);
		System.out.println(myob instanceof String);
		
		System.out.println("-----------------------");
		myob = zondar;
		System.out.println(myob.toString());
		System.out.println(myob instanceof Student);
		System.out.println(myob instanceof Object);
		System.out.println(myob instanceof Person);
		System.out.println(myob instanceof String);
		
	}		

}




class GraduateStudent extends Student {
}

class Student extends Person {
	public String toString() {
		return "Student";
	}
}

class Person extends Object {
	public String toString() {
		return "Person";
	}
}
