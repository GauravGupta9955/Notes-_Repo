import java.util.Arrays;

public class sortingofAnArray {
public static void main(String[] args) {
	int length;
	int num[]= {5,7,9,11,9,5,8};
	length =num.length-1;
	Arrays.sort(num);
	System.out.println(num[length]*num[length-1]);
	System.out.println(Arrays.toString(num));
	
}
}
