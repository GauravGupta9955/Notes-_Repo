import java.util.*;

class Result extends Thread {

	int total=0;
	public void run() {
	synchronized(this){
		for(int i=0;i<=10;i++) {
			total+=i;
		}
		this.notify();
	};
	}

}
public class test123 {
public static void main(String[] args) throws InterruptedException {
	 Result demo= new Result();
	 demo.start();
	 synchronized(demo) {
		 demo.wait();
		 System.out.println(demo.total);
		 
	 }
	
}
}
