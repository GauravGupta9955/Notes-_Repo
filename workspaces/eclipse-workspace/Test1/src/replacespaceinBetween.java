import java.util.Scanner;

public class replacespaceinBetween {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String str =sc.nextLine();
	 String output= torepaceSpace(str);
	 System.out.println(output);
}

private static String torepaceSpace(String input) {
	
	StringBuilder Output =new StringBuilder();
	char[] str2 = input.toCharArray();
	
	for(char c :str2) {
		if(!Character.isWhitespace(c))
			Output.append(c);
		
	}
	return Output.toString();
}
}
