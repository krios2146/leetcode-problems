package me.krios2146.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RunningSumOfOneDimensionalArrayTest {

    private final RunningSumOfOneDimensionalArray test = new RunningSumOfOneDimensionalArray();

    @Test
    void runningSum_simpleArray() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{1, 3, 6, 10};

        int[] actual = test.runningSum(nums);

        assertArrayEquals(expected, actual);
    }

    @Test
    void runningSum_onlyOnesArray() {
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5};

        int[] actual = test.runningSum(nums);

        assertArrayEquals(expected, actual);
    }

    @Test
    void runningSum_randomArray() {
        int[] nums = new int[]{3, 1, 2, 10, 1};
        int[] expected = new int[]{3, 4, 6, 16, 17};

        int[] actual = test.runningSum(nums);

        assertArrayEquals(expected, actual);
    }
}