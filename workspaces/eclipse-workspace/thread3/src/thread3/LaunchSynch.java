package thread3;
class iNeuron implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i =0;i<5;i++) {
				System.out.println(i);
			}
			Thread.sleep(3000);
			synchronized(this) {
			for(int i=0;i<5;i++) {
				System.out.println((char)(i+65));
			}
			}
		}
		catch(Exception e) {
			System.out.println("some Interuption");
		}
	}
	
}

public class LaunchSynch {
	public static void main(String[] args) {
		iNeuron in = new iNeuron();
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(in);
		Thread t3 = new Thread(in);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	
}
