
public class thread1 {
public static void main(String[] args) {
	System.out.println("hello focus there");
	Thread t=Thread.currentThread();
	System.out.println(t);
	t.setName("gaurav");
	t.setPriority(4);
	System.out.println(t);
}
}
 