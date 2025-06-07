package mainQUestion;

import java.util.Scanner;

class oddOrEven extends Thread{
	public void run() {
		String t = Thread.currentThread().getName();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		Integer a=sc.nextInt();
		
		if(t.equals("even"))
			even(a);
		if(t.equals("odd"))
			odd(a);
	}

	private void odd(Integer a) {
		// TODO Auto-generated method stub
		if(a%2==0)
			System.out.println("Even number"+a);
	}

	private void even(Integer a) {
		// TODO Auto-generated method stub
		if(a%2!=0)
			System.out.println("Odd number"+a);
	}
}
public class ToCheckiftheNumberisoddorevenusingthread {
	public static void main(String[] args) {
		oddOrEven Demo= new oddOrEven();
		oddOrEven Demo1= new oddOrEven();
		
		Demo.setName("even");
		Demo1.setName("odd");
		
		Demo.start();
		Demo1.start();
		
	}

}
