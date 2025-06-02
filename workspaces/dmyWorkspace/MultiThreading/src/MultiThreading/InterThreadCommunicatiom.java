package MultiThreading;
class Demo extends Thread{
	int total =0;
	
	public void run() {
		synchronized(this){
			System.out.println("child Thread");
			for(int i=0;i<=100;i++) {
				total+=i;
			}
			this.notify();
		};
	}
}

public class InterThreadCommunicatiom {
	public static void main(String[] args) throws InterruptedException {
		Demo d1 = new Demo();
		d1.start();
		synchronized(d1) {
			d1.wait();
			System.out.println(d1.total);
			
		}
	}

}
