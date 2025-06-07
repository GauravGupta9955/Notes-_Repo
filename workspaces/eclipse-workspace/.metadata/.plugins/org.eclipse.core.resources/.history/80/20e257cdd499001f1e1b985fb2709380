class demo12 extends Thread{
	int total =0;
	
	public void run() {
		synchronized(this){
			System.out.println("child Thread");
			for(int i=0;i<=10;i++) {
				total=total+i;
			}
			this.notify();
		};
	}

	
	
}
public class Consumerproducer {
	public static void main(String[] args) throws InterruptedException {
		demo12 d1 = new demo12();
		d1.start();
		synchronized(d1){
			d1.wait();
			System.out.println(d1.total);
			
		};
	}

}
