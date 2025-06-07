package StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class flatMap {
	public static void main(String[] args) {
		
	
	List<List<Integer>> lst= List.of(List.of(5,6,8,9),List.of(11,12,13),List.of(0,85,48,56),List.of(91,92,93));
   List<Integer> flatmap= lst.stream().flatMap(a->a.stream()).collect(Collectors.toList());
   System.out.println(flatmap);
}
}
