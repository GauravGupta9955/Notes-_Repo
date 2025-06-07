package mainQUestion;

import java.util.stream.Collectors;

public class SortingTheStringAlphabetically {
	public static void main(String[] args) {
		String input ="ilovejava8";
		String output=input.chars().
				mapToObj(a->String.valueOf((char)a))
				.sorted().collect(Collectors.joining());
		System.out.println(output.toString());
	}
}
