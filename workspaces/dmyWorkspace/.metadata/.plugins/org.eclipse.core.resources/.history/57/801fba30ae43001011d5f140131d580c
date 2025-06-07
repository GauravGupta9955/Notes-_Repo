package mainQUestion;

import java.util.LinkedHashSet;

public class ToFindTheLongestnonSubstring {
	public static void main(String[] args) {
		String str ="abcvvereve";
		LinkedHashSet<Character> current = new LinkedHashSet<>();
		LinkedHashSet<Character> longest = new LinkedHashSet<>();
		
		int right=0,left=0;
		
		while(right<str.length()) {
			if(!current.contains(str.charAt(right))) {
				current.add(str.charAt(right));
				right++;
			}
			else {
				current.remove(str.charAt(left));
				left++;
			}
			
			if(current.size()>longest.size()) {
				longest=new LinkedHashSet(current);
			}
				
		}
		
		longest.stream().forEach(System.out::print);
	}

}
