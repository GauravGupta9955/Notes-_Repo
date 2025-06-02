import java.util.*;

//Write java program to check if two array contain same elements
public class writejavaProgaramToCheckTwoArrayContainSameElement {
	public static void main(String[] args) {
		int num[]= {5,4,3,2,2,1,7,9};
		int num1[]= {5,3,4,2,1,7,10};
		
		Set <Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		
		for(Integer i:num) {
			s1.add(i);
		}
		for(Integer i :num) {
			s2.add(i);
		}
		
		if(s1.equals(s2)) {
			System.out.println("all elements are same");
		}
		else
		{
			System.out.println("all elements are not same");
		}
		
		
		
		
		
		
	}

}
