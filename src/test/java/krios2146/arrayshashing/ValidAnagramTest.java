package krios2146.arrayshashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {

    private final ValidAnagram underTest = new ValidAnagram();

    @Test
    void validAnagram_true() {
        String s = "anagram";
        String t = "nagaram";

        assertTrue(underTest.isAnagram(s, t));
    }

    @Test
    void invalidAnagram_false() {
        String s = "rat";
        String t = "car";

        assertFalse(underTest.isAnagram(s, t));
    }

    @Test
    void invalidAnagramWithDifferentNumberOfUsedLetters_false() {
        String s = "aacc";
        String t = "ccac";

        assertFalse(underTest.isAnagram(s, t));
    }

    @Test
    void anagramWithDifferentLengths_false() {
        String s = "listen";
        String t = "silentt";

        assertFalse(underTest.isAnagram(s, t));
    }

    @Test
    void anagramWithWhitespace_true() {
        String s = "hello world";
        String t = "world hello";

        assertTrue(underTest.isAnagram(s, t));
    }

}