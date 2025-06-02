package codingquestion;

public class SelectionSort {
	public static void main(String[] args) {
		int [] arr = {10,4,43,5,57,91,45,9,7};
		selectionSort(arr);
	}

	private static void selectionSort(int[] arr) {
		int length =arr.length-1,min=0,temp=0;
		for(int i =0;i<=length;i++) {
			min =i;
			for(int k =i+1;k<=length;k++) {
				if(arr[min]>arr[k]) {
					min=k;
				}		
			}
			 temp =arr[i];
			 arr[i]=arr[min];
			 arr[min]=temp;
		
		}
		for(int j:arr)
			System.out.print(j +" ");
	}
	

}
