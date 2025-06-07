package StreamApi;

import java.util.ArrayList;
import java.util.Optional;

public class Stream1 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(15);
		arr.add(13);
		arr.add(19);
		arr.add(160);
		arr.add(15);
		arr.add(14);
		arr.add(25);
		arr.add(39);
		arr.add(1);
		arr.add(3);
	//find the maximum value using stream
	Optional <Integer> max =arr.stream().max(Integer::compare);
	if(max.isPresent()) {
		System.out.println(max.get());
	}
	//find the minimum value using Stream
	Optional <Integer> min =arr.stream().min(Integer::compare);
	if(min.isPresent()) {
		System.out.println(min.get());
	}
	
	//sort the arraylist
	arr.stream().sorted().forEach(n->System.out.print(n+" "));
	System.out.println();
	//display only odd value using stream
	
	arr.stream().filter(n->(n%2!=0)).forEach(n->System.out.print(n+" "));
	System.out.println();
	
	//display only odd value using stream i.e. greater than 5;
	arr.stream().filter(n->(n%2!=0 && n>5)).forEach(n->System.out.print(n+" "));
	
	

		
	}

}
