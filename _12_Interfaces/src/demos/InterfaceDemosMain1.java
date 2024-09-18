package demos;

public class InterfaceDemosMain1 {

	public static void main(String[] args) {
		Integer inum_1 = 56;
		Integer inum_2 = 56;
		Integer inum_3 = 99;
		Integer inum_4 = 7;
		System.out.println("inum_1.compareTo(inum_2)   " + inum_1 + " to " + inum_2 + " gives:  " + inum_1.compareTo(inum_2));
		System.out.println("inum_1.compareTo(inum_3):  " + inum_1 + " to " + inum_3 + " gives:  "  + inum_1.compareTo(inum_3)); 
		System.out.println("inum_1.compareTo(inum_4):  " + inum_1 + " to " + inum_4 + " gives:  "  + inum_1.compareTo(inum_4));
		System.out.println("-------------------------------------");
		
		System.out.println("'ABC'.compareTo('ABC')  " + "ABC".compareTo("ABC"));
		System.out.println("'ABC'.compareTo('ABE')  " + "ABC".compareTo("ABE"));
		System.out.println("'R'.compareTo('Q')  " + "R".compareTo("Q"));
		System.out.println("'R'.compareTo('R')  " + "R".compareTo("R"));
		System.out.println("'R'.compareTo('S')  " + "R".compareTo("S"));
		System.out.println("'R'.compareTo('T')  " + "R".compareTo("T"));
		System.out.println("'R'.compareTo('U')  " + "R".compareTo("U"));
		
		System.out.println("'R'.compareTo('r')  " + "R".compareTo("r"));
		System.out.println("-------------------------------------");
		    
		java.util.Date date1 = new java.util.Date(2013, 1, 1);
		    
		java.util.Date date2 = new java.util.Date(2012, 1, 1);
		
		    
		System.out.println(date1.compareTo(date2));

	}

}
