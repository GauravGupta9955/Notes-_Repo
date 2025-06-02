import java.util.*;
public class reverseLinkedList {
public static void main(String[] args) {
	List<Integer> linked= new LinkedList<Integer>();
	linked.add(10);
	linked.add(50);
	linked.add(60);
	linked.add(80);
	linked.add(100);
	//System.out.println(linked);
	
	ListIterator<Integer> s = linked.listIterator(linked.size());
	while(s.hasPrevious()) {
		System.out.println(s.previous());
	}
}
}
