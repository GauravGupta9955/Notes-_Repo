import java.util.*;

public class iter2 {
public static void main(String[] args) {
	LinkedList a1 = new LinkedList();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add("ineuron");
	a1.add("bengaluru"); 
	
	ListIterator litr  =a1.listIterator(a1.size());
	
	while(litr.hasPrevious()) {
		System.out.println(litr.previous());
	}
	
	
	LinkedList a12 = new LinkedList();
	a12.add(10);
	a12.add(20);
	a12.add(30);
	a12.add("ineuron");
	a12.add("bengaluru"); 
	
	Iterator ditr=a12.descendingIterator();
	
	while(ditr.hasNext()) {
		System.out.println(ditr.next());
	}
	
}
}
