package StreamApi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Q)Given an array of integers ,write a java program to re-arrange
it so that all negative number appears First,Followed by non-negative number,while
maintaing the relative order of both groups
Input="2,3,5,-1,-5,-6,-9,1,4,-4,-11,12,13"
output=-1,-5,-6,-9,-4,-11,2,3,5,1,4,12,13,
*
*
*/
public class writeaProramtogettheouputFromInput {
	public static void main(String[] args) {
		List<Integer> arr=List.of(2,3,5,-1,-5,-6,-9,1,4,-4,-11,12,13); 
		
		Map<Boolean,List<Integer>> map=arr.stream().collect(Collectors.partitioningBy(a->Character.isDigit(String.valueOf(a).charAt(0))));
	    
		List<Integer> neg=map.get(false);
		List<Integer> pos=map.get(true);
		
		neg.stream().forEach(a->System.out.print(a+","));
	    pos.stream().forEach(a->System.out.print(a+","));
	
	}

}
