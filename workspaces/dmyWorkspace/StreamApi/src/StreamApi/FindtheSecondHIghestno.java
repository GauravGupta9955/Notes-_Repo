package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindtheSecondHIghestno {
	public static void main(String[] args) {
		
	
	List<Integer> arr = Arrays.asList(5,9,4,8,78,4,44,155,45,28,14,15,54,45);
	 Integer result=arr.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
    System.out.println(result);
}
}
