package mainQUestion;

import java.util.Scanner;

public class toReverseTheString {
	public static void main(String[] args) {
		String str =new String();
		Scanner sc = new Scanner(System.in);
		String str1=new String();
		System.out.println("enter the String line");
		str =sc.nextLine().replaceAll("[^0-9a-zA-Z]", "");
		int size =str.length()-1;
		for(int i =size;i>=0;i--) {
			str1 =str1+str.charAt(i);
		}
		
		System.out.println(str1);
		
		
	}
}
