package mainQUestion;

import java.util.ArrayList;
import java.util.Scanner;

public class toFindtheDuplicatecharatersinaString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String line");
	    String str1 =sc.next();
	    int leng =str1.length();
	    ArrayList<String> arr = new ArrayList<>();
	    for(int i =0;i<leng;i++) {
	    	if(arr.contains(String.valueOf(str1.charAt(i))))
	    		System.out.println("Duplicate character are : "+str1.charAt(i));
	    	
	    	arr.add(String.valueOf(str1.charAt(i)));
	    	
	    	
	    }
}
}
