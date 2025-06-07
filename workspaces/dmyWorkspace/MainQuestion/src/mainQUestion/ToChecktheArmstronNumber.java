package mainQUestion;

import java.util.Scanner;

/*input=370

output=3*3*3+7*7*7+0*0*0*/

public class ToChecktheArmstronNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n =sc.nextInt();
		int count =0;
		int temp =n,sum=0,rem;
		while(n>0) {
			count++;
			n=n/10;
		}
		
		n=temp;
		
		while(n>0) {
			rem=n%10;
			sum=(int) (sum+ Math.pow(rem, count));
			n=n/10;
		}
		
		if(temp==sum)
			System.out.println("armstrong number");
		else
			System.out.println("not Armstrong number");
		
	}
}
