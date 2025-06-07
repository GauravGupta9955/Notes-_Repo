package mainQUestion;

/**Add commentMore actions
 * Input :{"nat","bat","ate","eat","tea","tan"}
 * output:{{"ate","eat","tea"},{"nat","tan"},{"bat"}}
 * 
 * Contraints words in string array will not consists of any numeric and alpha
 * numeric values
 * 
 * Word in string array will be of lower case
 * 
 * words will not be blank
 */

import java.util.*;

public class WaptogetOutputfromINput {

    public static void main(String[] args) {
        String[] str = {"nat", "bat", "ate", "eat", "tea", "tan"};

        // Map to group anagrams by their sorted form
        Map<String, List<String>> map = new HashMap<>();

        for (String word : str) {
            String sorted = sortedWord(word);

            // If key already exists, add word to list; else create new list
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        // Convert map values (lists of anagrams) to a single list
        List<List<String>> result = new ArrayList<>(map.values());

        // Print the result
        System.out.println(result);
    }

    private static String sortedWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
