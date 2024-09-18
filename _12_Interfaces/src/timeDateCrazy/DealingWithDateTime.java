package timeDateCrazy;

import java.time.LocalDate;
import java.time.LocalTime;

public class DealingWithDateTime {

	public static void main(String[] args) {
		LocalTime thisTime = LocalTime.now();
		
		System.out.println(thisTime);
		
		LocalDate thisDate = LocalDate.now();
		System.out.println(thisDate);
		
	}

}
