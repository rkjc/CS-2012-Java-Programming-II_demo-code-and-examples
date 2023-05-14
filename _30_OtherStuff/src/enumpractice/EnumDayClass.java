package enumpractice;

public class EnumDayClass {

	public static enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	};

	Day day;

	public EnumDayClass(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		case SATURDAY:
			System.out.println("wooo Hoooo");
			break;
			
		case SUNDAY:
			System.out.println("Pre-Monday panic day!");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}
}

// thank you  https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html 
