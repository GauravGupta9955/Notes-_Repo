package codingquestion;

//find the second lowest digit from the arraylist
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class stream1 {
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(2,4,5,6,3,6,4,2,2345,56,43);
		Integer b =a.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println(b);
	}

}
