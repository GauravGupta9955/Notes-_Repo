package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*Write a program to get output

[Input]String="I Love India";[output]String="India Love I";*/

public class WriteaProgramTogetoutpu {
	public static void main(String[] args) {
		
		String str="I Love India";
		String str2= Arrays.stream(str.split(" ")) // Split by space
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(), // Collect into a list
                        list -> {
                            Collections.reverse(list); // Reverse the list of words
                            return String.join(" ", list); // Join back into a string
                        }
                    ));
		
		System.out.println(str2);
		
		
	}

}
