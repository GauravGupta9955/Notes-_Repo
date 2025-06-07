import java.util.*;

public class hashset {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		System.out.println(hs);
		
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add(10);
		lhs.add(0);
		lhs.add(5);
		lhs.add(4);
		lhs.add(8);
		lhs.add(100);
		
		System.out.println(lhs);
	}

}
