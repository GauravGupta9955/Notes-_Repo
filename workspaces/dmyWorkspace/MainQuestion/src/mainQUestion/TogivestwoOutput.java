package mainQUestion;

import java.util.Scanner;

public class TogivestwoOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word");
		String str = sc.next();
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder upperCase = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char str1=str.charAt(i);
			if(Character.isLowerCase(str1)) {
				lowerCase.append(str1);
			}
			if(Character.isUpperCase(str1)) {
				upperCase.append(str1);
			}
		}
		
		System.out.println("LowerCase letter: "+lowerCase.toString());
		System.out.println("UpperCase letter: "+upperCase.toString());
		
	}

}
