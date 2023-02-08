package FileClassUseage;

import java.io.File;

public class FileNameCheck {

	public static void main(String[] args) {


		File testFile1 = new File("jabberwocky.txt");
		File testFile2 = new File("lastNames.txt");
		File testFile3 = new File("mindkiller.txt");
		File testFile4 = new File("areacode.txt.txt");

		System.out.println("jabbwerwocky.txt " + testFile1.exists());
		System.out.println("lastNames.txt exist " +  testFile2.exists());
		System.out.println("mindkiller.txt exist " + testFile3.exists()) ;
		System.out.println("areacode.txt exist " + testFile4.exists());

	}
}

//jabberwocky.txt
//lastNames.txt
//mindkiller.txt
//writeOneFile.txt
