import java.util.*;

public class LInkedList {
public static void main(String[] args) {
	LinkedList il1 =new LinkedList();
	il1.add(10);
	il1.add("gaurav");
	il1.add("M");
	il1.add("Ranchi");
	System.out.println(il1);
	il1.add(3, 70);
	il1.addFirst("ineuron");
	il1.addLast(30);
	System.out.println(il1);
}
}
