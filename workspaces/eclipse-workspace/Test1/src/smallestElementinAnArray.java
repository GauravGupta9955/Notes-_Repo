import java.util.Arrays;
//find the smallest element in an array.
public class smallestElementinAnArray {
public static void main(String[] args) {
	int []arr = {4,5,2,4,9,4,9};
	Arrays.sort(arr);
	for(int i :arr) {
		System.out.println(i);
		break;
	}
}
}
