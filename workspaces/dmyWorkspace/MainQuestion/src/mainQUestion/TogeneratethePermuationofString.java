package mainQUestion;

public class TogeneratethePermuationofString {
	 public static void generatePermutations(String str, String current) {
	        if (str.isEmpty()) {
	            System.out.println(current);
	        } else {
	            for (int i = 0; i < str.length(); i++) {
	                char ch = str.charAt(i);
	                String rest = str.substring(0, i) + str.substring(i + 1);
	                generatePermutations(rest, current + ch);
	            }
	        }
}
}
