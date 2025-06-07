package StreamApi;

import java.util.Arrays;
import java.util.stream.Collectors;

/*Given a String,identify and remove duplicate words while maintaing the original 
orders:-
Input="java is awesome and java is powerfull"*/
public class duplicateWordRemovale {
	public static void main(String[] args) {
		String input="java is awesome and java is powerfull";
		String result=Arrays.stream(input.split(" ")).distinct().
				collect(Collectors.joining(" "));
		System.out.println(result);
	
	
	}

}
