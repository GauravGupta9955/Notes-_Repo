package mainQUestion;

import java.util.Scanner;

public class toCountTheNumberofVowelsandConstant {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word1");
		String str = sc.next();
		int consonant = 0,vowel = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' ||str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') 
				vowel++;
			else
				consonant++;	
		}
		
		System.out.println("vowel "+vowel );
		System.out.println("consonant "+consonant );
	}
}
