package StreamApi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sorttheStringAlphabetically1 {
	public static void main(String[] args) {
		String input ="ilovejava8";
		String output=input.chars().mapToObj(a->String.valueOf((char)a))
				.sorted().collect(Collectors.joining());
		System.out.println(output);
	}

}
