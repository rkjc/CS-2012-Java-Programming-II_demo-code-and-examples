package defaultVal;

public class BadLoop {

	public static void main(String[] args) {
		int in1;
		int in2;
		Circle myCirc1;
		Circle myCirc2;
		
		myCirc1 = new Circle(2);
		myCirc2 = new Circle(99);
		in1 = 45;
		in2 = 1001;
		
		System.out.println(myCirc1.radius);
		System.out.println(myCirc2.radius);
//		System.out.println(in1);
//		System.out.println(in2);
//		System.out.println("------------");
//		in1 = in2;
//		System.out.println(in1);
//		System.out.println(in2);
//		in2 = 777;
//		System.out.println(in1);
//		System.out.println(in2);
		System.out.println("------------");
		
		myCirc1 = myCirc2;
		
		System.out.println(myCirc1.radius);
		System.out.println(myCirc2.radius);
		myCirc2.radius = 2020;
		System.out.println(myCirc1.radius);
		System.out.println(myCirc2.radius);
		
	}

}
