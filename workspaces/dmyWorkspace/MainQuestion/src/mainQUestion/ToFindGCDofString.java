package mainQUestion;

import java.util.Scanner;

public class ToFindGCDofString {
	public static void main(String[] args) {
		String str="ABABABAB";
		String str1="ABABAB";
		String largestString=gcdOfString(str,str1);
		
		System.out.println("GCD of String"+largestString);
	}

	private static String gcdOfString(String str, String str1) {
		// TODO Auto-generated method stub
		if(!(str+str1).equals(str1+str))
				return "";
		else {
			int length =str.length(),length1=str1.length();
			while(length1!=0) {
				int temp=length1;
				length1=length%length1;
				length=temp;
					
			}
			
			return str.substring(0,length);
		}
	}
	
	

}
