package simpleWriteRead;

import java.io.File;
import java.io.PrintWriter;

public class WriteData {
	public static void main(String[] args) {
		// this will expect the file to exist in the default location
		String pathString = "writeOneFile.txt";

		try {
			File aFile = new File(pathString);

			PrintWriter prtout = new PrintWriter(aFile);

			prtout.println("hello text to file writing world!");
			prtout.println("are you sure?");
			prtout.println("more text, more tests?");
			
			prtout.flush();
			prtout.close();

		} catch (Exception e) {
			// if something breaks catch and print out what went wrong
			System.err.println(e);
		}
	}
}
