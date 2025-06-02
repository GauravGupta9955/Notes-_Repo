package java8Feature;



public class multiThread1 {
public static void main(String[] args) {
	Runnable r =()->{
		for(int i=0;i<10;i++) {
			System.out.println("child Thread 1");
		}
	};
	Thread th = new Thread(r);
    th.start();
	for(int i=0;i<10;i++) {
		System.out.println("main Thread 1");
	}
}
}
