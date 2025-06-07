package Excepions;

import java.util.Scanner;

public class Exceptions1 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the first number to divide");
			int a = scan.nextInt();
			System.out.println("enter the next number");
			int b = scan.nextInt();
			int res = a / b;
			System.out.println("The result is " + res);
		} catch (Exception e) {
			System.out.println("Thanks for using application");
		}
	}
}
