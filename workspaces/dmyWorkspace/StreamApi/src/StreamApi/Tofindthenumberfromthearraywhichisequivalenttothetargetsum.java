package StreamApi;
/*In an array of numbers find the pair which sum is equal to the
target. use stream api

Input:
	arr= {1,2,3,4,5,7}
target =8;*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tofindthenumberfromthearraywhichisequivalenttothetargetsum {
	public static void main(String[] args) {
		
		List<Integer> arr = Arrays.asList(1,2,3,4,5,7);
		Integer target=8;
		arr.stream().filter(i->i<target).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
