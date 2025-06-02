package javavenger;
import java.util.*;

class Calculate{
	public int add(int num1 , int num2) {
		int sum =num1+num2;
		return sum;
	}
	
	public int add(int num1 , int num2,int num3) {
		int sum =num1+num2+num3;
		return sum;
	}
}

public class hello {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first digit");
		int num1=sc.nextInt();
		System.out.println("enter second digit");
		int num2 =sc.nextInt();
		System.out.println("enter third digit");
		int num3 =sc.nextInt();
		Calculate calc=new Calculate();
		int result= calc.add(num1, num2);
		int result2= calc.add(num1, num2,num3); 
		System.out.println(result);
		System.out.println(result2);
	}

}
