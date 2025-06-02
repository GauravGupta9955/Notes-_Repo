package CodingQuestion;

import java.util.Scanner;

public class tocountThenumberofwordsinString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
	    String[] str1 =sc.nextLine().split(" ");
	    
	    int count =0;
	    for(String str :str1) {
	    	count++;
	    }
	    
	    System.out.println("the number of words are" +count);
	}

}
