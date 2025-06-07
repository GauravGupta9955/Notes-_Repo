package mainQUestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ToFindCoomonElementbetweenTwoArray {
	public static void main(String[] args) {
	int[] array1 = {1, 2, 3, 4, 5}; 
	int[] array2 = {4, 5, 6, 7, 8};
	
	List<Integer> arr = new ArrayList<>();
	for(int i:array1) 
		arr.add(i);
	HashSet<Integer> set =new HashSet<>();
	
	for(int i=0;i<array2.length;i++) {
		if(arr.contains(array2[i])) {
			set.add(array2[i]);	
		}
	}
	
	System.out.println(set);
	
}}
