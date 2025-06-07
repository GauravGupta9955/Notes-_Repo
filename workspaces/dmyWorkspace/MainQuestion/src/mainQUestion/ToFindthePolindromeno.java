package mainQUestion;

import java.util.Scanner;

public class ToFindthePolindromeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome Number.");
        } else {
            System.out.println(num + " is NOT a Palindrome Number.");
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;         // get last digit
            sum = sum * 10 + digit; // append digit to reversed
            num = num / 10;               // remove last digit
        }

        return original == sum;
    }
}

