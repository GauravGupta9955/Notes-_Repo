package codingquestion;

import java.util.Arrays;
import java.util.List;

public class Stream12 {
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(2,4,5,6,3,6,4,2,2345,56,43);
	   int b=a.stream().map(i->i*2).reduce(0, (s,e)->s+e);
	   System.out.println(b);
	}

}
