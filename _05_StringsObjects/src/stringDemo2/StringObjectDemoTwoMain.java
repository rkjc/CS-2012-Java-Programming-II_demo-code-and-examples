package stringDemo2;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringObjectDemoTwoMain {

	public static void main(String[] args) {
		
		// Fun with Unicode Printing

		String someStr1 = "𐃵";
		System.out.println(someStr1);
		System.out.println(someStr1.codePointAt(0));
		System.out.println("65781 = " + Integer.toHexString(65781));
		


		String var1 = "Cyntia";
        String var2 = new String(" is my daughter!");

        System.out.println(var1 + " \u263A" + var2);


        
        System.out.println("---------------------------------------------------");
        byte[] b = new byte[] { (byte) 0xD8, (byte) 0xA1 };
        String s = new String(b, StandardCharsets.UTF_8);
        System.out.println("The string: " + s);
        System.out.println("The codepoint for that first char: " + (int) s.charAt(0));
        
        byte[] b2 = new byte[] {(byte) 0xD8, (byte) 0xA1 };
        String s2 = new String(b2, StandardCharsets.UTF_8);
        System.out.println("The string: " + s2);
        System.out.println("The codepoint for that first char: " + (int) s2.charAt(0));
        
        int[] intArr = {0x10398};
        
        String s3 = new String(intArr, 0, 1);
        System.out.println("The string s3: " + s3);
        
        // unicode codepoints are hexadecimal, so we specify them using hex notation:
        int start = 0x103A0;
        int end = 0x103AF;

        // The unicode building version of new String needs an array of ints,
        // even if we're only trying to build a single-letter String.
        int[] data = {0};

        for(int i=start; i<=end; i++) {
          data[0] = i;
          System.out.print( new String(data, 0, 1) + "  ");
        }
        
	}

}
