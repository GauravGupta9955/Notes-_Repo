package producer;
class Demo extends Thread{
	int total =0;
	public void run() {
		synchronized(this) {
			System.out.println("child thread starts the calculation");
			for(int i=1; i<=100;i++) {
				total+=i;
			}
			System.out.println("child thread is giving notification call to main Thread");
	        this.notify();
		}
	}
}
public class test {
	public static void main(String[] args) throws InterruptedException {
		Demo d1 =new Demo();
		d1.start();
		synchronized(d1){
			System.out.println("Main Thread is calling wait() method");
			d1.wait(); 
		     System.out.println(d1.total);
		}
	}

}
