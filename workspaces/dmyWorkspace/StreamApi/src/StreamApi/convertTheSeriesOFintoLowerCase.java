package StreamApi;

import java.util.Arrays;
import java.util.List;

public class convertTheSeriesOFintoLowerCase {
	public static void main(String[] args) {
		List<String> arr = Arrays.asList("main","Gaurav","Rahul");
		arr.stream().map(a->a.toLowerCase()).forEach(System.out::println);

		
	}

}
