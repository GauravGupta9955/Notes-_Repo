class Demo1 extends Thread{
	public void run() {
		System.out.println("Banking task started");

		for (int i = 0; i < 3; i++) {
			try {
			Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("Exception occur in Banking");
			}
			System.out.println("Banking..................");
		}
		System.out.println("Banking Completed");
		System.out.println("---------------------------");
	}
}
class Demo2 extends Thread{
	public void run() {
		System.out.println("Printing Activity");

		for (int i = 0; i < 3; i++) {
			try {
			Thread.sleep(2000);}
			catch(Exception e) {
				System.out.println("exception Occur in Printing");
			}
			System.out.println("Printing..................");
		}
		System.out.println("Printing Completed");

		System.out.println("---------------------------");
	}
}

class Demo3 extends Thread{
	public void run() {
		System.out.println("Calculation Activity");

		for (int i = 0; i < 3; i++) {
			try {
			Thread.sleep(2000);}
			catch(Exception e) {
				System.out.println("exception Occur in Printing");
			}
			System.out.println("Calculation..................");
		}
		System.out.println("Calculation Completed");

		System.out.println("---------------------------");
	}
}
public class thread2 {
	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		d1.start();
		d2.start();
		d3.start();

	}
}
