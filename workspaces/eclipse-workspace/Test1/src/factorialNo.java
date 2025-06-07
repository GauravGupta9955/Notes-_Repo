import java.util.Scanner;

public class factorialNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of which factorial ");
		int a =sc.nextInt();
		int b= fact(a);
		System.out.println(b);
	}

	private static int fact(int a) {
		int mul;
		mul=1;
		while(a>0) {
		 mul=mul*a;
		 a--;
			
		}
		return mul;
	}

}
