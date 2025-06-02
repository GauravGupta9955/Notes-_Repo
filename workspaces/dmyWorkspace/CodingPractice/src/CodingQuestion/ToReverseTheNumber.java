package CodingQuestion;

import java.util.Scanner;

//Java program to Reverse Number
public class ToReverseTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number");
		int a =  sc.nextInt();
		reverseThenumber(a);
	}

	private static void reverseThenumber(int a) {
		// TODO Auto-generated method stub
		int sum =0,remainder=0,quo=0;
		
		while(a>0) {
			remainder=a%10;
			sum =sum*10+remainder;
			a=a/10;
		}
		
		System.out.println(sum);
		
		
		
	}

}
