class Demo4 implements Runnable{
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
class Demo5 implements Runnable{
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

class Demo6 implements Runnable{
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
public class thread3 {
	public static void main(String[] args) {
		
		Demo4 d1 = new Demo4();
		Demo5 d2 = new Demo5();
		Demo6 d3 = new Demo6();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		Thread t3= new Thread(d3);
		
		t1.start();
		t2.start();
		t3.start(); 
	}
}