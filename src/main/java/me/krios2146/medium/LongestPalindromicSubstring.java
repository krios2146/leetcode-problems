package me.krios2146.medium;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        String palindrome = "";

        int left = 0;
        int right = 1;

        while (left < s.length()) {
            char start = s.charAt(left);
            while (right < s.length()) {
                char end = s.charAt(right);
                if (start == end) {
                    String substring = s.substring(left, right + 1);
                    StringBuilder sb = new StringBuilder();
                    String reversedSubstring = sb.append(substring).reverse().toString();
                    if (reversedSubstring.equals(substring) && substring.length() > palindrome.length()) {
                        palindrome = substring;
                    }
                }
                right++;
            }
            left++;
            right = left + 1;
        }

        return palindrome.isEmpty() ? s.substring(0, 1) : palindrome;
    }
}
