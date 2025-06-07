package codingquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoveAlltheZeroToTheEd {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(5,6,0,7,8,9,0,6,5,0,0,9,0,3,2,3,2,0,0,2);
		ArrayList <Integer> arr1 = new ArrayList<Integer>();
		
		Map<Boolean, List<Integer>> map=arr.stream().
				collect(Collectors.partitioningBy(a->a!=0));
		List<Integer>zero=map.get(false);
		List<Integer>number=map.get(true);
		System.out.print(number);
		System.out.print(zero);
		arr.stream().filter(n->n!=0).toList().forEach(n->System.out.print(n+" "));
		arr.stream().filter(n->n==0).toList().forEach(n->System.out.print(n+" "));
		
	
	}

}
