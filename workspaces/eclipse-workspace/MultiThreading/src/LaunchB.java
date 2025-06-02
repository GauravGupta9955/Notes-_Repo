class BathRoom implements Runnable{

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(Thread.currentThread().getName()+"has Entered Bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is using Bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"Exited the Bathroom");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class LaunchB {
	public static void main(String[] args) {
		

	BathRoom b =new BathRoom(); 
	
	Thread t1 = new Thread(b);
	Thread t2 = new Thread(b);
	Thread t3 = new Thread(b);
	
	t1.setName("BOY");
	t2.setName("GIRL");
	t3.setName("TICKTOKER");
	
	t1.start();
	t2.start();
	t3.start();
	}

}
