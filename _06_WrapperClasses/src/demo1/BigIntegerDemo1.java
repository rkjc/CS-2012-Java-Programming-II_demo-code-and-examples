package demo1;

import java.math.BigInteger;

public class BigIntegerDemo1 {

	public static void main(String[] args) {
		BigInteger izBig1 = new BigInteger("92233720368847656843984372048750928374098230487523098475098234760938476321498763874985732970980809346436093425477580700000000");
		
		BigInteger izBig2 = new BigInteger("1001");
		
		BigInteger izBig3 = izBig1.add(izBig2);
		System.out.println(izBig3);
		
		BigInteger izBig4 = BigInteger.valueOf(2147483647);
		BigInteger izBig5 = BigInteger.valueOf(9223372036854775807L);
	
		//long max = 9223372036854775807
	
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
	}

}
