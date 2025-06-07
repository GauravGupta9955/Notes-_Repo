package mainQUestion;

import java.util.Scanner;

public class factorialofNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number for which you want factorial");
    int n=sc.nextInt();
    int sum=1;
    while(n>0) {
    	sum=sum*n;
    	n--;
    }
    
    System.out.println(sum);

}
}
