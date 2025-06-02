import java.util.Arrays;

// How to find the second Largest digit in an array
public class findSecondLargestNumberinAnArray {
	public static void main(String[] args) {
		int num[] = {4,82,90,45,9,45,89,889,78};
		Arrays.sort(num);
		int len = num.length-1;
		int i = num[len-1];
		System.out.println(i);
	}

}
