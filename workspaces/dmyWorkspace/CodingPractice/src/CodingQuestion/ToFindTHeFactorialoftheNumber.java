package CodingQuestion;

import java.util.Scanner;

//Java program to Find Factorial on given Number
public class ToFindTHeFactorialoftheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number");
		int a =  sc.nextInt();
	     factorial(a);
	}

	private static void factorial(int a) {
		// TODO Auto-generated method stub
		int sum =1;
		while (a>0) {
			sum =sum*a;
			a--;
		}
		System.out.println(sum);
	}

}
