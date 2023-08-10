package me.krios2146.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Search2DMatrixTest {

    private final Search2DMatrix test = new Search2DMatrix();

    @Test
    void searchMatrix_true() {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;

        assertTrue(test.searchMatrix(matrix, target));
    }

    @Test
    void searchMatrix_false() {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;

        assertFalse(test.searchMatrix(matrix, target));
    }

    @Test
    void searchMatrix_singleTrue() {
        int[][] matrix = new int[][]{{1}};
        int target = 1;

        assertTrue(test.searchMatrix(matrix, target));
    }
}