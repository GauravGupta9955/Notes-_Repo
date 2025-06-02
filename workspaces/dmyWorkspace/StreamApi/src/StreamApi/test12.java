package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Solution {
    public String gcdOfStrings(String str1, String str2) {
    	
    		String largestSubstring1=largestSubstring(str1);
    		String largestSubstring2=largestSubstring(str2);
    		if(largestSubstring1.equalsIgnoreCase(largestSubstring2)) {
            return largestSubstring1; 
    		}
    		
    		return null;
    		
    }

	private String largestSubstring(String str1) {
		// TODO Auto-generated method stub
		
		String current="",longest="";
		
		for(int i=0;i<str1.length();i++) {
			if(current.contains(String.valueOf(str1.charAt(i))))
				current=current.substring(current.indexOf(str1.charAt(i))+1);
			
			current=current+String.valueOf(str1.charAt(i));
			
			
			if(longest.length()<current.length()) {
				longest=new String(current);
			}
			
		}
		
		return longest;	
	}
}
public class test12 {

    public static void main(String[] args) {
    	String str1="ABCABC";
    	String str2="ABAB";
    	Solution sol = new Solution();
    	String result =sol.gcdOfStrings(str1, str2);
    	System.out.println(result);
    	
    }

   
}
