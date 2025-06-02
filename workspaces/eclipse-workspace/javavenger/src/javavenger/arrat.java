package javavenger;
import java.util.Scanner;

public class arrat {
	public static void main(String[] args) {
		int []a=new int[5];
		Scanner sc =new Scanner(System.in);
		for (int i=0;i<a.length;i++) {
			System.out.println("please enter the " +(i+1)+ " "
					+ "student marks");
			a[i]=sc.nextInt();
		}
		
		for (int i=0;i<a.length;i++) {
			
			System.out.println("The marks of " + (i+1) +" student is " 
			+a[i]);
		}
	}

}
