package krios2146.arrayshashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charsCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            Integer count = charsCount.getOrDefault(c, 0);
            charsCount.put(c, count + 1);
        }

        for (char c : t.toCharArray()) {
            Integer count = charsCount.get(c);

            if (count == null || count == 0) {
                return false;
            }

            charsCount.put(c, count - 1);
        }

        return true;
    }
}
