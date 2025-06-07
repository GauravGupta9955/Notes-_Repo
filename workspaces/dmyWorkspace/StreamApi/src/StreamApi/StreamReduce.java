package StreamApi;

import java.util.ArrayList;

public class StreamReduce {
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
	int sum =1;
	for(int i:arr) {
		sum =sum*i;
	}
	System.out.println(sum);
	
	int i =arr.stream().reduce(1,(a,b)->a*b);
	System.out.println(i);
}
}
