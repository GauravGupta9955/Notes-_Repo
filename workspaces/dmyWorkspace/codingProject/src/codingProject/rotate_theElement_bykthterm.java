package codingquestion;

public class rotate_theElement_bykthterm {
	public static void main(String[] args) {
		int num[]= {3,4,5,8,9,3,4,10,4,6,6};
		int length =num.length-1;
		
		for(int i =length -3 ;i<=length;i++) {
			System.out.print(num[i]+" ");
		}
		for(int i=0;i<=length-4;i++) {
			System.out.print(num[i]+" ");
		}
		
		
	}

}
