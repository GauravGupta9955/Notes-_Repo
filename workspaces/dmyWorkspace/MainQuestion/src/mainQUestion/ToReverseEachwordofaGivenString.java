package mainQUestion;

import java.util.Scanner;

public class ToReverseEachwordofaGivenString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String line");
		String str1[] =sc.nextLine().split(" ");
		StringBuilder str2 = new StringBuilder();
		
		for(String word:str1) {
			for(int i=word.length()-1;i>=0;i--) {
				str2.append(word.charAt(i));
			}
			str2.append(" ");
		}
		
		System.out.println(str2.toString().trim());
	
	}
}
