package mainQUestion;

import java.util.Scanner;

public class ToPrintTheCharacterTwice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		for(int i=0;i<=str.length()-1;i++) {
			for(int k=0;k<2;k++) {
				System.out.print(str.charAt(i));
			}
			
		}
	}
}
