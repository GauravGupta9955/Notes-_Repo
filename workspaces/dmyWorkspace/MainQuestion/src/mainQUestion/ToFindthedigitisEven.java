package mainQUestion;

import java.util.Scanner;

public class ToFindthedigitisEven {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
	    int count =0;
		while(num>0) {
			count++;
			num=num/10;
		}
		
		System.out.println("the length of the number"+count);
		
	}
}
