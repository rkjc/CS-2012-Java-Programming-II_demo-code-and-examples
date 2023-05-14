package enumpractice;

import enumpractice.EnumDayClass.Day;

public class EnumDayTesterMain {

	public static void main(String[] args) {

		Day sat = Day.SATURDAY;
		
		EnumDayClass firstDay = new EnumDayClass(Day.MONDAY);
		firstDay.tellItLikeItIs();

		EnumDayClass thirdDay = new EnumDayClass(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();

		EnumDayClass fifthDay = new EnumDayClass(Day.FRIDAY);
		fifthDay.tellItLikeItIs();

		EnumDayClass sixthDay = new EnumDayClass(Day.SATURDAY);
		sixthDay.tellItLikeItIs();

		EnumDayClass seventhDay = new EnumDayClass(Day.SUNDAY);
		seventhDay.tellItLikeItIs();

	}

}
