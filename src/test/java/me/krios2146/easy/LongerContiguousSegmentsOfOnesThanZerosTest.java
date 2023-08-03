package me.krios2146.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LongerContiguousSegmentsOfOnesThanZerosTest {

    private final LongerContiguousSegmentsOfOnesThanZeros test = new LongerContiguousSegmentsOfOnesThanZeros();

    @Test
    void checkZeroOnes_shouldReturnTrue() {
        String testString = "1101";

        assertTrue(test.checkZeroOnes(testString));
    }

    @Test
    void checkZeroOnes_shouldReturnFalse() {
        String testString = "111000";

        assertFalse(test.checkZeroOnes(testString));
    }

    @Test
    void checkZeroOnes_long_shouldReturnFalse() {
        String testString = "110100010";

        assertFalse(test.checkZeroOnes(testString));
    }

    @Test
    void checkZeroOnes_long_shouldReturnTrue() {
        String testString = "1101000101111001111110011111";

        assertTrue(test.checkZeroOnes(testString));
    }
}