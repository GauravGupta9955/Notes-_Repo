package codingquestion;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseLikedList {
	public static void main(String[] args) {
		List<Integer> linked= new LinkedList<Integer>();
		linked.add(10);
		linked.add(50);
		linked.add(60);
		linked.add(80);
		linked.add(100);
		
		ListIterator<Integer> ltr =linked.listIterator(linked.size());
		
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
	}

}
