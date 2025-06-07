package codingquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class find_the_duplicate_words {
public static void main(String[] args) {
	String str ="my name is gaurav gupta gupta rahul kumar rahul rahul";
	
	String [] str2 =str.split(" ");
	ArrayList<String> arr = new ArrayList<String>();
	for(String s :str2) {
		if(arr.contains(s)) {
			System.out.println(s);
		}
		else {
			arr.add(s);
		}
	}
	
	/*
	 * String str ="my name is gaurav gupta gupta rahul kumar rahul rahul";
	 * Map<Object, Long> map=Arrays.stream(str.split(" "))
	 * .collect(Collectors.groupingBy(a->a,Collectors.counting()));
	 * 
	 * map.entrySet().stream().filter(a->a.getValue()>1).forEach(a->System.out.
	 * println(a.getKey().toString()));
	 */
}
}
