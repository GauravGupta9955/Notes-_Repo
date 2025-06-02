import java.util.Scanner;

interface Calculator{
	void add();
	void sub();
}

class MyCalculat implements Calculator{


	public void add() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first digit");
		int a =sc.nextInt();
		System.out.println("Enter the second digit");
		int b =sc.nextInt();
		int c =a+b;
		System.out.println(c);
		
		
	}


	public void sub() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first digit");
		int a =sc.nextInt();
		System.out.println("Enter the second digit");
		int b =sc.nextInt();
		int c =a-b;
		System.out.println(c);	
	}
	
}
class MyCalculat1 implements Calculator{


	public void add() {
		int a =10;
		int b =20;
		int c=a+b;
		System.out.println(c);
				
	}


	public void sub() {
		int a =30;
		int b =20;
		int c=a-b;
		System.out.println(c);
}
	
}

class Cal{
	public void permits (Calculator calt) {
		calt.add();
		calt.sub();
		
	}
}
public class Interface {
	public static void main(String[] args) {
		
		MyCalculat m1=new MyCalculat();
		MyCalculat1 m2 =new MyCalculat1();
		
		Cal call=new Cal();
		call.permits(m2);
		call.permits(m1);
	}
	
	
}
