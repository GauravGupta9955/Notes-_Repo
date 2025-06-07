package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Input :{"nat","bat","ate","eat","tea","tan"}
output:{{"ate","eat","tea"},{"nat","tan"},{"bat"}}

Contraints
*words in string array will not consists of any numeric and alpha numeric values

*Word in string array will be of lower case

*words will not be blank In java 8*/

public class WaptogetOUtput3 {
	
	public static void main(String[] args) {
		String []str = {"nat","bat","ate","eat","tea","tan"};
		Map<String,List<String>> map= Arrays.stream(str).collect(Collectors.groupingBy(WaptogetOUtput3::sortedWord));
		
		
		
		List<List<String>> result= new ArrayList<>(map.values());
		System.out.println(result);
	}

	private static String sortedWord(String words1) {
		// TODO Auto-generated method stub
		char[] word =words1.toCharArray();
		Arrays.sort(word);
		return new String(word);
	}
}
