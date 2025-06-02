
/*Rotate the element by kth term
int num[]= {3,4,5,8,9,3};
output =9,3,3,4,5,8*/
public class rotatetheErrorbyKthelement {
	public static void main(String[] args) {
		int num[]= {3,4,5,8,9,3};
		int len = num.length-1;
		for(int i=(len-1);i<=len;i++)
			System.out.print(num[i]+",");
		for(int k=0;k<=(len-2);k++)
			System.out.print(num[k]+",");
		
	}
}
