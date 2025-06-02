package javavenger;

import java.util.Scanner;

public class Launcharr1 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int [][]arr =new int[3][];
	arr[0]=new int[3];
	arr[1]=new int[2];
	arr[2]=new int[3];
	
	for(int i = 0; i< arr.length; i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Enter the marks of class " +(1+i)+ 
					" student" + (1+j));
			arr[i][j]=sc.nextInt();
		}
		
	}
	
	for(int i = 0; i< arr.length; i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println(" the marks of class " +(1+i)+ 
					" student" + (1+j)+ " is  " + arr[i][j] );
			System.out.println("  ");
		}
		
	}
	}
 
}
