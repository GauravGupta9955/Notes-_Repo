package CodingQuestion;

import java.util.Scanner;

public class toPrintEvenIndexedcharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.next();
		for(int i=0;i<=str.length() - 1;i++) {
			if(i%2==0)
				System.out.println(str.charAt(i));
			
		}
	}

}
