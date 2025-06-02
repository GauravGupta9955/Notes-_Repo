package codingquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addEventoRight7oddtoLeft {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(5,6,7,8,9,6,5,9,3,2,3,2,2);
		ArrayList <Integer> arr1 = new ArrayList<Integer>();
		arr.stream().filter(n->n%2==0).toList().forEach(n->System.out.print(n+" "));
		arr.stream().filter(n->n%2!=0).toList().forEach(n->System.out.print(n+" "));
		
	}
	
	

}
