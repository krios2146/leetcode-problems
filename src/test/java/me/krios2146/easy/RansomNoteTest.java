package me.krios2146.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RansomNoteTest {

    private final RansomNote test = new RansomNote();

    @Test
    void canConstruct_shouldReturnTrue() {
        assertTrue(test.canConstruct("aaa", "asasas"));
    }

    @Test
    void canConstruct_shouldReturnFalse() {
        assertFalse(test.canConstruct("aaaa", "asasas"));
    }
}