package codingquestion;

import java.util.Scanner;

public class reverse_the_word_by_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] str1 =str.split(" ");
		String str2 ="",str3=" ";
		for(String s:str1) {
			int length=s.length()-1;
			
			while(length>=0) {
				str2 = str2 +s.charAt(length);
				length--;
			}
			
			str3 =str3+str2;
			str3= str3+" ";
			str2 ="";
			}
		
		System.out.println(str3);
		
		
	}

}
