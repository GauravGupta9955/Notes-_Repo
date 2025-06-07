import java.util.*;
public class FailsafeFailPass {
public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<Integer> ();
	
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	a1.add(60);
	
	Iterator itr = a1.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
		a1.add(10);
	}
			
			
	
}
}
