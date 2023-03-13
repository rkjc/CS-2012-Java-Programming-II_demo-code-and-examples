package polyApp;

public class PolymorphMain {

	public static void main(String[] args) {
	
		GraduateStudent zork = new GraduateStudent();
		
		meth( zork );
		meth( new Student() );
		meth( new Person() );
		//meth( new Object() );
		//meth( new Integer("56") );
		
	}


	public static void meth( Person myob ) {
		
		System.out.println(myob.toString());
		
	}
}

