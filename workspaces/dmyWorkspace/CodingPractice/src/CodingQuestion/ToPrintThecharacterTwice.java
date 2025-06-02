package CodingQuestion;

import java.util.Scanner;

public class ToPrintThecharacterTwice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		StringBuilder str2 =new StringBuilder();
		for(int i=0;i<=str.length()-1;i++) {
			str2.append(str.charAt(i)).append(str.charAt(i));	
		}
		
		System.out.print(str2.toString());
	}

}
