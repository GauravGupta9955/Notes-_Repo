package javavenger;

public class Array {
public static void main(String[] args) {
	int num[]= {3,7,2,4};
	System.out.println(num[0]);
	int num1[]=new int[4];
	num[0]=7;
	num[1]=8;
	num[2]=9;
	num[3]=10;
	for(int i=0;i<4;i++) {
		System.out.println(num[i]);
	}
}
}
