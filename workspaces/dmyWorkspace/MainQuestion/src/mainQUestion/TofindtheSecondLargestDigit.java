package mainQUestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TofindtheSecondLargestDigit {
	public static void main(String[] args) {
	List<Integer> a = Arrays.asList(2,4,5,6,3,6,4,2,2345,56,43);
	Integer i=a.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(i);}
}
