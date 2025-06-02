package CodingQuestion;

import java.util.Scanner;

public class waptoFindthePolidromeoftheString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		boolean isPolindrome=polidrome(str);
		if(isPolindrome)
			System.out.println("polindrome");
		else
			System.out.println("not polindrome");
	}

	private static boolean polidrome(String str) {
		// TODO Auto-generated method stub
		int start =0,end=str.length()-1;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}

}
