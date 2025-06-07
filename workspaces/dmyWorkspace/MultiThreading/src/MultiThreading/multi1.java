package MultiThreading;

class Demo1 extends Thread{
	 
	public void run() {
		String str = Thread.currentThread().getName();
		if(str.equalsIgnoreCase("banking")) {
			banking();
		}
		if(str.equalsIgnoreCase("printing")) {
			banking();
		}
		if(str.equalsIgnoreCase("calculation")) {
			banking();
		}
	}
	
	
	public void banking() {
		System.out.println("Banking Started");
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(Exception ex) {
				System.out.println("Exception Occured");
			}
			System.out.println("Printing Completed");
		}
		System.out.println("--------------");
	}
	
	public void printing() {
		System.out.println("Printing Started");
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(Exception ex) {
				System.out.println("Exception Occured");
			}
			System.out.println("Banking Completed");
		}
		System.out.println("--------------");
	}
	
	public void calculation() {
		System.out.println("Calculation Started");
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(Exception ex) {
				System.out.println("Exception Occured");
			}
			System.out.println("Calculation Completed");
		}
		System.out.println("--------------");
	}
}


public class multi1 {
	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		Demo1 d3= new Demo1();
		d1.setName("printing");
		d1.setName("banking");
		d3.setName("calculation");
		
		
		d1.start();
		d2.start();
		d3.start();
		
	}

}
