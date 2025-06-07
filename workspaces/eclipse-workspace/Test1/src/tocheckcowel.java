import java.util.*;

public class tocheckcowel {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String in =sc.next();
        Boolean bool = toCheckAlpha(in);
        if(bool)
        System.out.println("vowel is present");
        else
        System.out.println("vowel is not present");
    }

	private static Boolean toCheckAlpha(String str) {
		// TODO Auto-generated method stub
		return str.toLowerCase().matches(".*[aeiou].*");
		
	}

}
