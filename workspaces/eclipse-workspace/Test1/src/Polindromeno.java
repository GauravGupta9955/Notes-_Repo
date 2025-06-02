import java.util.Scanner;

public class Polindromeno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		 boolean isPolindrome = isPolindrome(n);
		 if(isPolindrome) {
			System.out.println("Polindrome no");
		 }
		 else {
			 System.out.println("Polindrome no not");
		 }
	}

	private static boolean isPolindrome(int n) {
     int temp,sum=0,r;
     temp=n;
     
     while(n>0) {
    	r= n%10;
    	sum = (sum*10)+r;
    	n=n/10;
    			
     }
     
     if(temp==sum) {
    	 return true;
     }
     else
		return false;
	}

}
