package me.krios2146.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void lengthOfLongestSubstring_shouldReturn3() {
        String s = "pwwkew";
        int expected = 3;

        int actual = test.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring_shouldReturn3v2() {
        String s = "abcabcbb";
        int expected = 3;

        int actual = test.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring_shouldReturn1() {
        String s = "bbbbbbbb";
        int expected = 1;

        int actual = test.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring_shouldReturn1v2() {
        String s = "b";
        int expected = 1;

        int actual = test.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring_shouldReturn5() {
        String s = "a b-cccc";
        int expected = 5;

        int actual = test.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring_shouldReturn2() {
        String s = "aab";
        int expected = 2;

        int actual = test.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring_shouldReturn3v3() {
        String s = "dvdf";
        int expected = 3;

        int actual = test.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }
}