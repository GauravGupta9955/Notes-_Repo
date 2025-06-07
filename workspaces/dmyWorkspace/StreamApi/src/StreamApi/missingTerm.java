package StreamApi;

import java.util.stream.IntStream;

public class missingTerm {
	public static void main(String[] args) {
		int n[] = {1,3,4,5,6};
		int no=6;
		int value1=IntStream.of(n).sum();
		int value2=IntStream.rangeClosed(1, 6).sum();
		int missing=value2-value1;
		System.out.println(missing);
	}

}
