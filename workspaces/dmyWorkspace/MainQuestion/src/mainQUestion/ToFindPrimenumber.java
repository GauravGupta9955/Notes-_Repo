package mainQUestion;

import java.util.Scanner;

public class ToFindPrimenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number");
		int a = sc.nextInt();
		boolean prime = primeOrNot(a);

		if (prime)
			System.out.println("prime number");
		else
			System.out.println("not Prime");

	}

	private static boolean primeOrNot(int a) {
		// TODO Auto-generated method stub
		if (a == 0 || a == 1)
			return false;
		if (a == 2)
			return true;

		int n = 2;
		while (n < a) {
			if (a % n == 0)
				return false;
			n++;
		}
		return true;
	}}
