package mainQUestion;

import java.util.Scanner;

public class ToPrintEvenIndexCharacter {
	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		for(int i=0;i<str.length();i++) {
			if(i%2==0)
				System.out.println(str.charAt(i));
		}
	}

}
