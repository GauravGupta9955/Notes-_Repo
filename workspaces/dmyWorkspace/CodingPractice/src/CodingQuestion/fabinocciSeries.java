package CodingQuestion;

import java.util.Scanner;

public class fabinocciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    System.out.println("enter the Number");
		int a =  sc.nextInt();
		Fibinocci(a);
	}

	private static void Fibinocci(int n) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=1,d=0;
		while(d<=n) {
			System.out.print(a+" ");
			a=b;
			b=c;
			c=a+b;
			
			d++;
		}
	} 

}
