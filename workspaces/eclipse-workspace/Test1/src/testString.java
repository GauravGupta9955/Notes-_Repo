import java.util.*;

 class testString {
	 public static void main(String[] args) {
		 int []nums = {4,9,5,5,8,3,6,1,3};
			Map <Integer, Integer> countMap = new HashMap<>();
			for(int i:nums) {
				if(countMap.containsKey(i)) {
					countMap.put(i ,countMap.get(i)+1);	
				}
				else {
					countMap.put(i ,1);	
				}
			}
			
			Set s =countMap.entrySet();
			Iterator itr = s.iterator();
			while(itr.hasNext()) {
				Map.Entry Data = (Map.Entry)itr.next();
				System.out.println(Data.getKey() + " :" +Data.getValue());

			}
			
	}
 }

	
 


 
