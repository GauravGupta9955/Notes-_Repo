package codingquestion;

import java.util.HashMap;

public class remove_and_count_the_frequency {
	public static void main(String[] args) {
		String s= "This is a test ,test sentence to find, find a repetitive words, repetitive words!";
		s.replaceAll("[^a-zA-Z0-9]", " ");
		String [] s1 =s.split(" ");
		HashMap<String ,Integer> map = new HashMap<>();
		for(String i :s1) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
				else {
					map.put(i, 1);
				}
			
		}
		
		System.out.println(map);
		
	}

}
