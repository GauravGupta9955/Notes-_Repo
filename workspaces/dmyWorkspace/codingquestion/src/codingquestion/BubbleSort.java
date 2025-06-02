package codingquestion;

public class BubbleSort {
	public static void main(String[] args) {
		int [] arr = {10,4,43,5,57,91,45,9,7};
		bubblesort(arr);
		
	}

	private static void bubblesort(int[] arr) {
		// TODO Auto-generated method stub
		int length =arr.length-1;
		for(int i=0;i<=length;i++) {
			for(int k =0;k<length;k++) {
				int temp =0;
				if(arr[k]>arr[k+1]) {
					temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		for(int i:arr)
		System.out.print(i +" ");
	}

}
