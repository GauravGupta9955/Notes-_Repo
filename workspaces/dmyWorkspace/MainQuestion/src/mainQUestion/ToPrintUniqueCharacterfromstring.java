package mainQUestion;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ToPrintUniqueCharacterfromstring {
 
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the word");
	String str =sc.next();
	int length =str.length()-1;
	HashMap<Character,Integer> MapCount = new HashMap<Character,Integer>();
	for(int i=0;i<=length;i++) {
		if(MapCount.containsKey(str.charAt(i)))
			MapCount.put(str.charAt(i), MapCount.get(str.charAt(i))+1);
		
		else
			MapCount.put(str.charAt(i), 1);	
	}
	System.out.println(MapCount);
	
	MapCount.entrySet().stream().filter((a)->(a.getValue()==1)).collect(Collectors.toList()).forEach(System.out::println);;
	

}}
