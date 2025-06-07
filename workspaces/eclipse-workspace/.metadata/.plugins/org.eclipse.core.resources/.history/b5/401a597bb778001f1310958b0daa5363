import java.util.*;

/*find the second largest and smallest element in an array and 
 * multiply it*/
public class secondLargestAndSmallestElementInAnArray {
public static void main(String[] args) {
	int []num= {3,4,5,6,4,9,2,8,4,4,2,4};
	Set<Integer> set = new HashSet<Integer>();
	ArrayList<Integer> arr = new ArrayList<Integer>();
	for(int i :num) 
		set.add(i);
	for (int i :set) 
	    arr.add(i);
	Collections.sort(arr);
	int len =arr.size()-1;
	int ind =1,ind1=len-1,small = 0,large=0;
	for(int i=0;i<len;i++) {
		if(i==ind) {
			System.out.println(arr.get(i));
			small=arr.get(i);
		}
		else if(i==ind1){
			System.out.println(arr.get(i));
			large =arr.get(i);
		}
		
	}
	System.out.println("arr is "+ arr);
	System.out.println("multiplication of two number is "+small*large);
}
}
