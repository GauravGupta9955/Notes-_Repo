package javavenger;

public class arraycopy {

	public static void main(String[] args) {
		int a[]= {5,6,7,8};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
		for(int i:b) {
			System.out.println(i);
		}
		// TODO Auto-generated method stub

	}

}
