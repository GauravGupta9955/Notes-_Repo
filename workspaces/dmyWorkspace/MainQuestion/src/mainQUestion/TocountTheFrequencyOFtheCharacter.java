package mainQUestion;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class TocountTheFrequencyOFtheCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.next();
		LinkedHashMap<Character, Integer> mapCount = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (mapCount.containsKey(str.charAt(i))) {
				mapCount.put(str.charAt(i), mapCount.get(str.charAt(i)) + 1);
			} else {
				mapCount.put(str.charAt(i), 1);
			}
		}
		mapCount.entrySet().forEach((a)->System.out.print(a.getKey().toString()+a.getValue().toString()));
		
		
	}

}
