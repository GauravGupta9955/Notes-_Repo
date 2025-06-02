package codingquestion;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Remove_duplicate_character_from_string {
	public static void main(String[] args) {
		String str1 = "mynameisgauravkumargupta";
		char[] str2 =str1.toCharArray();
		LinkedHashSet <String> lh = new LinkedHashSet<>();
		for(char ch:str2) {
			String ch1 =Character.toString(ch);
			lh.add(ch1);
			ch1="";
		}
	   lh.forEach(System.out::print);
	}

}
