package codingquestion;

import java.util.Scanner;

public class LOwerToUpper {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	String s1 ="";
	s =s.replaceAll("[^A-Z a-z 0-9]", " ");
	
	int length =s.length()-1;
	
	for(int i=0;i<=length;i++) {
		if(s.charAt(i)<'a') {
			s1=s1+s.charAt(i);
		}
		
		else {
			s1= s1+(char)(s.charAt(i)-32);
		}
	}
	System.out.println(s1);
}

}
