package simpleObject_1;

public class Demo1Main {

	public static void main(String[] args) {
		System.out.println("Demo1Main running");

		
		
	}

	
	
	
	
	
	
	
	
//========================================================================
// Methods

	public static int[][] makeRandArray(int col, int row) {
		int[][] tempArr = new int[col][row];
		for (int rowIndex = 0; rowIndex < tempArr[0].length; rowIndex++) {
			for (int colIndex = 0; colIndex < tempArr.length; colIndex++) {
				tempArr[colIndex][rowIndex] = (int) ((Math.random() * 900) + 100);
			}
		}
		return tempArr;
	}

	public static int sumArray(int[][] myArrr) {
		int total = 0;
		for (int rowIndex = 0; rowIndex < myArrr[0].length; rowIndex++) {
			for (int colIndex = 0; colIndex < myArrr.length; colIndex++) {
				total += myArrr[colIndex][rowIndex];
			}
		}
		return total;
	}
	
	public static void printArray(int[][] myArrr) {
		for (int rowIndex = 0; rowIndex < myArrr[0].length; rowIndex++) {
			for (int colIndex = 0; colIndex < myArrr.length; colIndex++) {
				System.out.print(myArrr[colIndex][rowIndex] + "  ");
			}
			System.out.println();
		}
	}

}
