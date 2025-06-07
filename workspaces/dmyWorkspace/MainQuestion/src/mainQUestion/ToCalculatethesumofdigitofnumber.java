package mainQUestion;

import java.util.Scanner;

public class ToCalculatethesumofdigitofnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n =sc.nextInt();
		int sum=0,rem;
		while(n>0) {
		    rem=n%10;
		    sum =sum+rem;
			n=n/10;
		}
		System.out.println("sum of digit is :" +sum);
	}

}
