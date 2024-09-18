package poly_1;

public class PolyRunMain {

	public static void main(String[] args) {

		System.out.println("running -> PolyRunMain");
		
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());
	}

	public static void m(Object x) {
		System.out.println(x.toString());
	}
}

class Person extends Object {
	public String toString() {
		return "Person";
	}
}

class Student extends Person {
	public String toString() {
		return "Student";
	}
}

class GraduateStudent extends Student {
}