package StreamApi;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ToCountTheFrequencyofCharacterUsingStream {
	public static void main(String[] args) {
		String str="GauravKumar";
		
		Map<Object, Long> freqMap =str.chars().mapToObj(a->(char)a).
				collect(Collectors.groupingBy(c->c,Collectors.counting()));
				
		
		freqMap.entrySet().forEach(System.out::println);
				
		Map<Object, Long> freqMap1=str.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		freqMap.entrySet().forEach(System.out::println);
	}

}
