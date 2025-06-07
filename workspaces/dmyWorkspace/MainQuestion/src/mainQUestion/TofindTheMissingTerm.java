package mainQUestion;

import java.util.List;
import java.util.stream.IntStream;

public class TofindTheMissingTerm {
	public static void main(String[] args) {
		
	
	 int[]n= {1,2,3,4,6};
	Integer miss=IntStream.of(n).sum();
	Integer sum=IntStream.range(0, 7).sum();
	Integer missingTerm=sum-miss;
	System.out.println(missingTerm);

}
}
