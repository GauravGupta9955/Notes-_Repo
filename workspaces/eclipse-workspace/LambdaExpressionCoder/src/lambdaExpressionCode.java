 
/*class Test extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
 			try {
 				System.out.println("Child Thread");
 				Thread.sleep(1000);
 			} catch (InterruptedException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
 		}
	}
	
}*/
/*class Test implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
 			try {
 				System.out.println("Child Thread");
 				Thread.sleep(1000);
 			} catch (InterruptedException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
 		}
	}
}*/
public class lambdaExpressionCode {
public static void main(String[] args) {
	/*
	 * new Thread(new Runnable() { public void run() { for (int i = 1; i <= 5; i++)
	 * { try { System.out.println("Child Thread"); Thread.sleep(1000); } catch
	 * (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } } } }).start();
	 */
	
	Thread t1 =new Thread(()->{
		for(int i=1;i<=5;i++) {
 			try {
 				System.out.println("Child Thread");
 				Thread.sleep(1000);
 			} catch (InterruptedException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
 		}
	});
	t1.start();
	for(int i=1;i<=5;i++) {
			try {
				System.out.println("Main Thread");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
}
}
