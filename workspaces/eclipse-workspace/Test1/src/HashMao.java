import java.util.*;

public class HashMao {
	public static void main(String[] args) {
		int []nums = {4,9,5,5,8,3,6,1,3};
		Map <Integer, Integer> countMap = new HashMap<>();
		
		for(int num:nums) {
			if(countMap.containsKey(num)) {
				countMap.put(num, countMap.get(num)+1);
			}
			else {
				countMap.put(num,1);
			}
			
		}
		
		Set s = countMap.entrySet();
      
		Iterator itr =s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry data = (Map.Entry) itr.next();
			System.out.println(data.getKey() + " :" +data.getValue());
		}
		
	}

}
