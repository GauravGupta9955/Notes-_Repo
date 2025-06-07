package codingquestion;

import java.util.stream.IntStream;

public class Calculatetableof2usingStream {
	public static void main(String[] args) {
		int num=2;
		IntStream.range(1, 11).map(n->n*num).forEach(n->System.out.println(n));
	}

}
