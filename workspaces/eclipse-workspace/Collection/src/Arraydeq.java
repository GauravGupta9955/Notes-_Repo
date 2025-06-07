import java.util.ArrayDeque;

public class Arraydeq {
public static void main(String[] args) {
	ArrayDeque ad = new ArrayDeque();
	
	ad.add(10);
	ad.add(20);
	ad.add("ineuron");
	ad.add("Bengaluru");
	System.out.println(ad);
	ad.addFirst(100);
	ad.addLast(200);
	System.out.println(ad);
}
}
