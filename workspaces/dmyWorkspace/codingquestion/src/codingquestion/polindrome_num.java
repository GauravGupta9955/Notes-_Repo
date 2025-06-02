package codingquestion;

import java.util.Scanner;

public class polindrome_num {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int s =sc.nextInt();
		int s1 =0,rem,temp;
		temp =s;
		while (s>0) {
			rem=s%10;
			s1 =(s1*10)+rem;
			s=s/10;
			
			
		}
		
		if(temp==s1)
			System.out.println("polindrome");
		else
			System.out.println("not Polindrome");
		
		
	}

}
