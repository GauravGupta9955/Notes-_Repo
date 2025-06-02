package CodingQuestion;

public class TofindtheLongestnonRepeatingSubstring {
	public static void main(String[] args) {
		String input = "abcabcbb";
	    System.out.println(findLongestUniqueSubstring(input)); 
	}
	
	public static String findLongestUniqueSubstring(String input) {
		
		String current="";
		String longest="";
		
		for(int i=0;i<input.length();i++) {
			String ch=String.valueOf(input.charAt(i));
			
			if(current.contains(ch)) {
				current=current.substring(current.indexOf(ch)+1);
			}
			current+=ch;
			
			if(longest.length()<current.length()) {
				longest=new String(current);
			}
		}
				
		
		return longest;
	}

}
