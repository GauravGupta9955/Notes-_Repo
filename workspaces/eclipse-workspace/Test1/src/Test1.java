import java.util.Arrays;
import java.util.*;
class Test1{
	public static void main(String[] args) {
		int [] arr = {10,4,43,5,57,91,45,9,7};
		bubblesort(arr);
	}

	private static void bubblesort(int[] arr) {
		// TODO Auto-generated method stub
		int length =arr.length-1;
		for(int i=0;i<=length;i++) {
			for(int j=0;j<=length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int a :arr) {
			System.out.print(a+" ");
		}
       System.out.println();
		
	}
}