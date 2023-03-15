package demos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("running");
		
		File zork = new File("readme.txt");
		
		File myBad = new File("news.txt");
		
		try {
			FileWriter fw = new FileWriter(zork);
			
			FileReader frd = new FileReader(myBad);
			
		} catch (IOException e) {
			System.out.println("--- oooops ---");
			e.printStackTrace();	
		}

		System.out.println("continuing on after an exception. Unharmed and ready to go!");
		
	}
}
