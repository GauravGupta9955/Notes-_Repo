package mainQUestion;

import java.util.Scanner;

public class ToSwaptwoStringwithouttwovariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.next();
		String str2 =sc.next();
		str =str+str2;
		str2=str.substring(0, str.length()-str2.length());
		str=str.substring(str2.length());
		System.out.println(str);
		System.out.println(str2);
	}
}
