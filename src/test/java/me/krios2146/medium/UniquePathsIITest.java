package me.krios2146.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniquePathsIITest {

    private final UniquePathsII test = new UniquePathsII();

    @Test
    void uniquePathsWithObstacles_3x3_2ways() {
        int[][] grid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int expected = 2;

        int actual = test.uniquePathsWithObstacles(grid);

        assertEquals(expected, actual);
    }

    @Test
    void uniquePathsWithObstacles_4x4_3ways() {
        int[][] grid = new int[][]{{0, 0, 0, 0}, {0, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        int expected = 3;

        int actual = test.uniquePathsWithObstacles(grid);

        assertEquals(expected, actual);
    }

    @Test
    void uniquePathsWithObstacles_4x4_4ways() {
        int[][] grid = new int[][]{{0, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}};
        int expected = 4;

        int actual = test.uniquePathsWithObstacles(grid);

        assertEquals(expected, actual);
    }

    @Test
    void uniquePathsWithObstacles_4x4_2ways() {
        int[][] grid = new int[][]{{0, 0, 0, 0}, {1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}};
        int expected = 2;

        int actual = test.uniquePathsWithObstacles(grid);

        assertEquals(expected, actual);
    }

    @Test
    void uniquePathsWithObstacles_3x3_0ways() {
        int[][] grid = new int[][]{{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};
        int expected = 0;

        int actual = test.uniquePathsWithObstacles(grid);

        assertEquals(expected, actual);
    }

    @Test
    void uniquePathsWithObstacles_2x2_1way() {
        int[][] grid = new int[][]{{0, 1}, {0, 0}};
        int expected = 1;

        int actual = test.uniquePathsWithObstacles(grid);

        assertEquals(expected, actual);
    }
}