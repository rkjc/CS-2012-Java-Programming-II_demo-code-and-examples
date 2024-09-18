package wrappers;

import java.math.BigInteger;

public class IntegerDouble_1 {

	public static void main(String[] args) {
		System.out.println("running");

		int bleem = 2147483647;
		System.out.println(bleem);
		System.out.println(bleem + 1);

		Integer zork = 567;

		System.out.println(Integer.MAX_VALUE);

		Double dbub1 = 2.7;
		Double dbub2 = 4.567;
		
		Double dbub3 = new Double(345.98); 
		
		
		double dmip = 4.78;
		int iimp = 7;
		
		int ans = iimp + dbub1.intValue();
		
		Float fflt = 67.34F;
		
		int myint = Integer.parseInt("783");
		
		System.out.println(dbub1.intValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		BigInteger a = new BigInteger("9223372875634565758474564036854775807");
		BigInteger b = new BigInteger("2");
		
		
		
		BigInteger c = a.multiply(b); // 9223372036854775807 * 2
		
		c = a.add(b);
		
		System.out.println(c); 

	}
}
