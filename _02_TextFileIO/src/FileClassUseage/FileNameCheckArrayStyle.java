package FileClassUseage;

import java.io.File;

public class FileNameCheckArrayStyle {

	public static void main(String[] args) {
		File tester;

		String[] fileNameList;
		fileNameList = new String[10];

		fileNameList[0] = "jabberwocky.txt";
		fileNameList[1] = "lastNames.txt";
		fileNameList[2] = "mindkiller.txt";
		fileNameList[3] = "areacode.txt.txt";

		for (int i = 0; i < fileNameList.length; i++) {
			if (fileNameList[i] == null) {
				break;
			}
			tester = new File(fileNameList[i]);
			System.out.println(fileNameList[i] + " - " + tester.exists());
		}

	}
}

//jabberwocky.txt
//lastNames.txt
//mindkiller.txt
//writeOneFile.txt
