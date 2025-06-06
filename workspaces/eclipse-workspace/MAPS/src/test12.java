
public class test12 {
    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";
        System.out.println("Longest Palindromic Substring of '" + s1 + "': " + longestPalindrome(s1));
        System.out.println("Longest Palindromic Substring of '" + s2 + "': " + longestPalindrome(s2));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        
        int start = 0, maxLength = 1;
        
        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        
        // Check for substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        
        // Check for lengths greater than 2
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = len;
                }
            }
        }
        
        return s.substring(start, start + maxLength);
    }
}
