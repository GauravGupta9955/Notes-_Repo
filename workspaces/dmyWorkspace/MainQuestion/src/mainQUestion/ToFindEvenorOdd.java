package mainQUestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToFindEvenorOdd {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(4,5,6,34,4,6,3);
		List<Integer> evenNo=arr.stream().filter(n->n%2==0).collect(Collectors.toList());
		List<Integer> oddNo=arr.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.print("Even number are ");
		evenNo.forEach(n->System.out.printf( "%d\s",n));
		System.out.println();
		System.out.print("odd number are ");
		oddNo.forEach(n->System.out.printf( "%d\s",n));
	
	}
}
