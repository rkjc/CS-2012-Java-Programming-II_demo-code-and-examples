package comparable;

public class ComparableDemoMain {

	public static void main(String[] args) {
		// typical examples of using the sort() method

		String[] cities = { "Savannah", "Boston", "Atlanta", "Tampa" };

		for (String city : cities)
			System.out.print(city + " ");
		System.out.println("\n-------------------");
		
		java.util.Arrays.sort(cities);

		for (String city : cities)
			System.out.print(city + " ");
		
		System.out.println();

		// -------------------------------------

		Integer[] intNumbers = { 9910, 1322, 5292 };
		
		java.util.Arrays.sort(intNumbers);
		for (Integer number : intNumbers)
			System.out.print(number + " ");

		// -------------------------------------

	}

}
