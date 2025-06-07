package mainQUestion;

import java.util.ArrayList;

public class ToFindThePairOfSumAccordingtotarget {
	public static void main(String[] args) {
		
		int[]a= {1,2,3,7,5,6};
		int target=8;
		ArrayList<String> arr = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			for(int k=i+1;k<a.length;k++) {
				if(a[i]+a[k]==target)
					arr.add("("+ a[i]+" "+a[k]+" )");		
			}
		}
		
		System.out.println(arr);
	}
}
