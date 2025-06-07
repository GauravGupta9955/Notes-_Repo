package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given a list of words,reverse each word and concetenate them in single Word:-
*/
public class GivenAlistofStringreveritandconcetanateit {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Java","Stream","Are","Awesome");
		
		String str1 =str.stream().
				map(a->new StringBuilder(a).reverse().toString()).collect(Collectors.joining(" "));
		
		System.out.println(str1);
		
	}

}
