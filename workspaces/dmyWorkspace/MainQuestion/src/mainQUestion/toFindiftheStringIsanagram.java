package mainQUestion;

import java.util.Arrays;
import java.util.Scanner;

public class toFindiftheStringIsanagram {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the word1");
	String str =sc.next();
	System.out.println("enter the word2");
	String str1 =sc.next();
	Boolean isanagram=anagram(str,str1);
	if(isanagram)
		System.out.println("anagram");
	else
		System.out.println("not anagram");
}

private static boolean anagram(String str, String str1) {
	
	// TODO Auto-generated method stub
	char[] word1 =str.toCharArray();
	char[] word2=str1.toCharArray();
	Arrays.sort(word1);
	Arrays.sort(word2);
	
	return Arrays.equals(word1, word2);
	
}}
