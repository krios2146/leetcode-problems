package me.krios2146.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray test = new SearchInRotatedSortedArray();

    @Test
    public void search_shortArray() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int expected = 4;

        int actual = test.search(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void search_longArray() {
        int[] nums = new int[]{11, 12, 13, 14, 15, 16, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 0;
        int expected = 6;

        int actual = test.search(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void search_longArrayAnotherTarget() {
        int[] nums = new int[]{11, 12, 13, 14, 15, 16, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        int expected = 14;

        int actual = test.search(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void search_longArrayAnotherTarget2() {
        int[] nums = new int[]{11, 12, 13, 14, 15, 16, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 14;
        int expected = 3;

        int actual = test.search(nums, target);

        assertEquals(expected, actual);
    }
}