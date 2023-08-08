package me.krios2146.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RichestCustomerWealthTest {

    private final RichestCustomerWealth test = new RichestCustomerWealth();

    @Test
    void maximumWealth_2x3() {
        int[][] accounts = new int[][]{{1, 2, 3}, {3, 2, 1}};
        int expected = 6;

        int actual = test.maximumWealth(accounts);

        assertEquals(expected, actual);
    }

    @Test
    void maximumWealth_3x2() {
        int[][] accounts = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        int expected = 10;

        int actual = test.maximumWealth(accounts);

        assertEquals(expected, actual);
    }

    @Test
    void maximumWealth_3x3() {
        int[][] accounts = new int[][]{{2, 8, 7}, {3, 7, 1}, {1, 9, 5}};
        int expected = 17;

        int actual = test.maximumWealth(accounts);

        assertEquals(expected, actual);
    }
}