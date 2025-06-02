package CodingQuestion;

import java.util.stream.IntStream;

public class WaptoFindMissingTerm {
	public static void main(String[] args) {
		int []n= {1,2,3,4,6};
		int SumEquals=IntStream.of(n).sum();
		int rangeEquals=IntStream.range(0, 7).sum();
		int missingterm=rangeEquals-SumEquals;
		System.out.println(missingterm);
	}

}
