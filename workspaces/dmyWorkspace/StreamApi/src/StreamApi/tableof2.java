package StreamApi;

import java.util.stream.IntStream;

public class tableof2 {
	public static void main(String[] args) {
		int n=2;
		IntStream.range(1, 11).map(a->a*n).forEach(System.out::println);
	}

}
