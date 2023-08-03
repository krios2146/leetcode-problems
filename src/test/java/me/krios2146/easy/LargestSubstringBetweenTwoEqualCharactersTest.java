package me.krios2146.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestSubstringBetweenTwoEqualCharactersTest {

    private final LargestSubstringBetweenTwoEqualCharacters test = new LargestSubstringBetweenTwoEqualCharacters();

    @Test
    void maxLengthBetweenEqualCharacters_shouldReturn0() {
        String s = "aa";

        assertEquals(0, test.maxLengthBetweenEqualCharacters(s));
    }

    @Test
    void maxLengthBetweenEqualCharacters_shouldReturn2() {
        String s = "abca";

        assertEquals(2, test.maxLengthBetweenEqualCharacters(s));
    }

    @Test
    void maxLengthBetweenEqualCharacters_shouldReturnNegative() {
        String s = "cbzxy";

        assertEquals(-1, test.maxLengthBetweenEqualCharacters(s));
    }

    @Test
    void maxLengthBetweenEqualCharacters_shouldReturn7() {
        String s = "abcabdefagce";

        assertEquals(7, test.maxLengthBetweenEqualCharacters(s));
    }

    @Test
    void maxLengthBetweenEqualCharacters_shouldReturn13() {
        String s = "acqwertyaqwertyc";

        assertEquals(13, test.maxLengthBetweenEqualCharacters(s));
    }
}