package me.krios2146.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> chars = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            Integer times = chars.getOrDefault(c, 0);
            chars.put(c, times + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!chars.containsKey(c) || chars.get(c) == 0) {
                return false;
            }
            Integer left = chars.get(c);
            chars.put(c, left - 1);
        }

        return true;
    }
}
