import java.util.Scanner;

public class Polidrome {
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
		String str = sc.nextLine().toLowerCase().replaceAll("//s", "");
		boolean Polin =polindrom(str);
		if(Polin) {
			System.out.println("polindrome");
		}
		else
			System.out.println("notpolindrom");
	}
    

	private static boolean polindrom(String str) {
		// TODO Auto-generated method stub
		
		int length =str.length()-1;
		String temp = "";
		for (int i=length;i>=0;i--) {
			temp = temp+str.charAt(i);
		}
			System.out.println(temp);
		if(str.equals(temp))
			return true;
		else 
		 return false;	
		
	}
}
