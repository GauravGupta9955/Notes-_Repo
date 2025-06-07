package mainQUestion;

import java.util.ArrayList;
import java.util.List;

/*Q)Given an array of integers ,write a java program to re-arrangeAdd commentMore actions
it so that all negative number appears First,Followed by non-negative number,while
maintaing the relative order of both groups
Input="2,3,5,-1,-5,-6,-9,1,4,-4,-11,12,13"
output=
*
*
*/
public class WaptogetanOutput {
	public static void main(String[] args) {
		List<Integer> arr=List.of(2,3,5,-1,-5,-6,-9,1,4,-4,-11,12,13); 
		
		ArrayList<Integer> negative =new ArrayList<Integer>();
		ArrayList<Integer> positive =new ArrayList<Integer>();
		
		for(Integer i:arr) {
			char j=(String.valueOf(i)).charAt(0);
			if(Character.isDigit(j)) {
				positive.add(i);
			}
			else {
				negative.add(i);
			}
			
		}
		
		negative.stream().forEach(a->System.out.print(a+","));
		positive.stream().forEach(a->System.out.print(a+","));
	} 

}