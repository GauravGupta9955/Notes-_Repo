package CodingQuestion;

import java.util.Scanner;

public class TofindPolindromenumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int temp,sum=0,rem;
	temp=num;
	while(num>0){
		rem=num%10;
		sum=sum*10+rem;
		num=num/10;
		
	}
	if(temp==sum)
		System.out.println("polindrome number");
	else
		System.out.println("not polindrome number");
}
}
