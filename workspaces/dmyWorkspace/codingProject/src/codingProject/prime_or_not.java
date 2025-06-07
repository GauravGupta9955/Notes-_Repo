package codingquestion;

import java.util.Scanner;

public class prime_or_not {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int s =sc.nextInt();
	if(s==0 && s==1)
		System.out.println("not prime");
	if(s==2)
		System.out.println("prime");
    int i=2;
    
    while(i<s) {
    	if(s%i==0) {
    		System.out.println("not prime");
    		break;
    	}
    	i++;
    				
    }
    System.out.println("prime ");
}
}
