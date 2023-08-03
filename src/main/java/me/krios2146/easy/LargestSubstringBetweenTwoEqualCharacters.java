package me.krios2146.easy;

public class LargestSubstringBetweenTwoEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        int longestRange = -1;
        // left pointer
        for (int i = 0; i < s.length(); i++) {
            char left = s.charAt(i);
            // right pointer
            for (int j = s.length() - 1; j > i; j--) {
                if (j - i <= longestRange) {
                    break;
                }
                char right = s.charAt(j);
                if (left == right) {
                    longestRange = j - i - 1;
                }
            }
        }
        return longestRange;
    }
}
