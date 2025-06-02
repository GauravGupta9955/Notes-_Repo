package CodingQuestion;

import java.util.*;

public class TofindtheLongestsubStringfromString {
	public static void main(String[] args) {
		String str = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
		str=sc.next();
		
		LinkedHashSet<Character> current = new LinkedHashSet<>();
		LinkedHashSet<Character> longest = new LinkedHashSet<>();
		
		int start=0,end=0;
		
		while(end<str.length()) {
			if(!current.contains(str.charAt(end))) {
				current.add(str.charAt(end));
				end++;	
			}
			else {
				current.remove(str.charAt(start));
				start++;
			}
			
			if(current.size()>longest.size()) {
				longest=new LinkedHashSet<>(current);
			}
			
		}
		
		longest.stream().forEach(System.out::print);
		int length =longest.size();
		System.out.print(" size of the string is "+length);
	}

}
