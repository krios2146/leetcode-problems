package me.krios2146.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {

    private final ReverseInteger test = new ReverseInteger();

    @Test
    public void testReversePositiveNumber() {
        int input = 123;
        int expectedOutput = 321;
        assertEquals(expectedOutput, test.reverse(input));
    }

    @Test
    public void testReverseNegativeNumber() {
        int input = -456;
        int expectedOutput = -654;
        assertEquals(expectedOutput, test.reverse(input));
    }

    @Test
    public void testReverseOverflow() {
        // This test case will test if the method handles overflow situations correctly
        int input = 1534236469;
        int expectedOutput = 0; // The reverse of this number would cause overflow for 32-bit signed integers
        assertEquals(expectedOutput, test.reverse(input));
    }
}