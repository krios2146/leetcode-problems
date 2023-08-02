package me.krios2146.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfWordsYouCanTypeTest {

    private final MaximumNumberOfWordsYouCanType wordsYouCanType = new MaximumNumberOfWordsYouCanType();
    private String testText;

    @Test
    void canBeTypedWords_shouldReturn9() {
        testText = "at vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium";

        assertEquals(9, wordsYouCanType.canBeTypedWords(testText, "a"));
    }

    @Test
    void canBeTypedWords_shouldReturn1() {
        testText = "hello world";

        assertEquals(1, wordsYouCanType.canBeTypedWords(testText, "ad"));
    }

    @Test
    void canBeTypedWords_shouldReturn0() {
        testText = "leet code";

        assertEquals(0, wordsYouCanType.canBeTypedWords(testText, "e"));
    }

    @Test
    void canBeTypedWords_shouldReturn2() {
        testText = "leet code";

        assertEquals(2, wordsYouCanType.canBeTypedWords(testText, "a"));
    }

    @Test
    void canBeTypedWords_shouldReturn3() {
        testText = "leet code hello";

        assertEquals(3, wordsYouCanType.canBeTypedWords(testText, ""));
    }
}