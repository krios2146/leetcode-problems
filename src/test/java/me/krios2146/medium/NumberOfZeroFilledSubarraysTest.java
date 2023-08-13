package me.krios2146.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfZeroFilledSubarraysTest {

    private final NumberOfZeroFilledSubarrays test = new NumberOfZeroFilledSubarrays();

    @Test
    void zeroFilledSubarray_length8_output6() {
        int[] array = new int[]{1, 3, 0, 0, 2, 0, 0, 4};
        long expected = 6;

        long actual = test.zeroFilledSubarray(array);

        assertEquals(expected, actual);
    }

    @Test
    void zeroFilledSubarray_length1_output0() {
        int[] array = new int[]{1};
        long expected = 0;

        long actual = test.zeroFilledSubarray(array);

        assertEquals(expected, actual);
    }

    @Test
    void zeroFilledSubarray_length6_output9() {
        int[] array = new int[]{0, 0, 0, 2, 0, 0};
        long expected = 9;

        long actual = test.zeroFilledSubarray(array);

        assertEquals(expected, actual);
    }
}