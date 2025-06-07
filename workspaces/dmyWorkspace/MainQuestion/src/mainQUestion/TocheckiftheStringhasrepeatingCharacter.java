package mainQUestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//String=aabbsddefffcc"
//output=aa,bb,dd,fff,cc
//output=fffaabbccdd
public class TocheckiftheStringhasrepeatingCharacter {
	public static void main(String[] args) {
		String input="aabbsddefffcc";
		StringBuilder str = new StringBuilder();
		int right=0;
		int left=0;
			while(right<input.length()) {
				if(input.charAt(left)==input.charAt(right)) {
					right++;
				}
				else {
					if(right-left>1) {
					str.append(input.substring(left, right)).append(",");
					}
					left=right;
				}	
		}
		
		System.out.println(str.toString().replaceAll("[^a-z A-z 0-9]", " "));
		
		String output=Arrays.stream(str.toString().split(",")).sorted((a,b)->b.length()-a.length())
				.collect(Collectors.joining());
		
		System.out.println(output);
	}

}
