package me.krios2146.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();

        int longestSubstring = 0;

        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (window.add(c)) {
                window.add(c);
                right++;
                longestSubstring = Math.max(longestSubstring, window.size());
            } else {
                window.remove(s.charAt(left));
                left++;
            }
        }

        return longestSubstring;
    }
}
