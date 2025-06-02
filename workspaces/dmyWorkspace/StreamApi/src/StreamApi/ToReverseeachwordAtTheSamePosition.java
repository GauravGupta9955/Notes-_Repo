package StreamApi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ToReverseeachwordAtTheSamePosition {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the word");
	String str=sc.nextLine();
	
	String str2=Arrays.stream(str.split(" ")).map(a->new StringBuilder(a).reverse()).collect(Collectors.joining(" "));
	System.out.println(str2);
	
	
}
}
