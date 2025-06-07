package codingquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*Input :{"nat","bat","ate","eat","tea","tan"}
output:{{"ate","eat","tea"},{"nat","tan"},{"bat"}}

Contraints
*words in string array will not consists of any numeric and alpha numeric values

*Word in string array will be of lower case

*words will not be blank In java 8*/
public class TogetTheOutputfrom {
	public static void main(String[] args) {
		
		String []str = {"nat","bat","ate","eat","tea","tan"};
		Map<String,List<String>> map = new LinkedHashMap<>();
		for(String str1:str) {
			String key =sortedString(str1);
			if(!map.containsKey(key))
				map.put(key, new ArrayList<>());
			
				map.get(key).add(str1);
		}
		
		List<List<String>> values =new ArrayList<>(map.values());
		System.out.println(values);
		
		

	}

	private static String sortedString(String str1) {
		// TODO Auto-generated method stub
		char[] str=str1.toCharArray();
		Arrays.sort(str);
		return new String(str);
	}
}
