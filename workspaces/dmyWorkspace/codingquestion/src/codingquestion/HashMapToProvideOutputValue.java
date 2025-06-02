package codingquestion;

import java.util.HashMap;

public class HashMapToProvideOutputValue {
	public static void main(String[] args) {
		HashMap<Integer,Integer> h1 =new HashMap<>();
		h1.put(5, 3);
		h1.put(6, 10);
		h1.put(9, 10);
		
		h1.entrySet().stream().forEach(n->System.out.println(n.getValue()));
		
	}
	
	
	

}
