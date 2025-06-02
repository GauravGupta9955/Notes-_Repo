import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.stream.IntStream;

public class test349879674 {

    public static String longestUniqueSubstring(String s) {
        int start = 0, maxLength = 0;
        int startIndexOfMax = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                // Move start pointer only forward
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, end);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                startIndexOfMax = start;
            }
        }

        return s.substring(startIndexOfMax, startIndexOfMax + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcabcabbb";
        String result = longestUniqueSubstring(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }
}
