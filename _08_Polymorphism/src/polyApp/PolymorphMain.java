package polyApp;

public class PolymorphMain {

	public static void main(String[] args) {
		meth(new GraduateStudent());
		meth(new Student());
		meth(new Person());
		meth(new Object());
	}

	
	public static void meth(Object myob) {
		System.out.println(myob.toString());
	}
}

