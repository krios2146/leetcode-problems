package me.krios2146.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubstringTest {

    private final LongestPalindromicSubstring test = new LongestPalindromicSubstring();

    @Test
    void longestPalindrome_shouldReturnAboba() {
        String s = "aboba";
        String expected = s;

        String actual = test.longestPalindrome(s);

        assertEquals(expected, actual);
    }

    @Test
    void longestPalindrome_shouldReturnBab() {
        String s = "babad";
        String expected = "bab";

        String actual = test.longestPalindrome(s);

        assertEquals(expected, actual);
    }

    @Test
    void longestPalindrome_shouldReturnBb() {
        String s = "cbbd";
        String expected = "bb";

        String actual = test.longestPalindrome(s);

        assertEquals(expected, actual);
    }
}