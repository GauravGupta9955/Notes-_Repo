package StreamApi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheUniquenofromtheList {
	public static void main(String[] args) {
		List<Integer> numbers =Arrays.asList(2,3,2,3,5,2,0);
		Map<Object, Long> map= numbers.stream()
				.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		map.entrySet().stream().filter(a->a.getValue()==1).distinct().forEach(a->System.out.print(a.getKey()+" "));
		
		
	}

}
