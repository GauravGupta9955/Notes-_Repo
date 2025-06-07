package mainQUestion;

import java.util.Scanner;

public class Fabinocci {
	public static void main(String[] args) {
		System.out.println("enter the no for fabinocci");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int a=0,b=1,c=1;
		while(i<=n) {
			
			System.out.println(a);
			a=b;
			b=c;
			c=a+b;
			i++;
			
		}
	}

}
