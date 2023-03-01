package demo1;

public class IntegerWrapperDemo1 {

	public static void main(String[] args) {

		int anintnum = 456;
		anintnum = 9999;

		String mystrnum = String.valueOf(anintnum);

		Integer zIntnum = 3675;

		anintnum = zIntnum;

		zIntnum = 53423;

		Integer bingo = Integer.parseInt("7654");
		System.out.println(bingo + 1000001);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE); 
		
		

	}

}
