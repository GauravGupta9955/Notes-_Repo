package CodingQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//input ="ilovejava8"
//output="8aaeijlovv"

public class sortthestringalphabetically {
	public static void main(String[] args) {
		String input ="ilovejava8";
		String output=input.chars().mapToObj(a->String.valueOf((char)a)).sorted(Comparator.reverseOrder())
				.collect(Collectors.joining());
		System.out.println(output);
	}

}
