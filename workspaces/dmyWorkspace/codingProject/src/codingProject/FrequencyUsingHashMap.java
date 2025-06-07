package codingquestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FrequencyUsingHashMap {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(5,6,7,8,9,6,5,9,3,2,3,2,2);
		HashMap<Integer ,Integer> map = new HashMap<>();
		for(int i:arr) {
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

