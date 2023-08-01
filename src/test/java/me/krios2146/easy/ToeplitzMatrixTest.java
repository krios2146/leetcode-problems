package me.krios2146.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ToeplitzMatrixTest {

    private ToeplitzMatrix toeplitzMatrix;

    @BeforeEach
    public void setup() {
        toeplitzMatrix = new ToeplitzMatrix();
    }

    @Test
    void isToeplitzMatrix_4x4_shouldReturnTrue() {
        int[][] matrix = new int[4][4];
        matrix[0] = new int[]{1, 2, 3, 4};
        matrix[1] = new int[]{4, 1, 2, 3};
        matrix[2] = new int[]{3, 4, 1, 2};
        matrix[3] = new int[]{2, 3, 4, 1};

        assertTrue(toeplitzMatrix.isToeplitzMatrix(matrix));
    }

    @Test
    void isToeplitzMatrix_4x5_shouldReturnTrue() {
        int[][] matrix = new int[4][5];
        matrix[0] = new int[]{1, 2, 3, 4, 5};
        matrix[1] = new int[]{4, 1, 2, 3, 4};
        matrix[2] = new int[]{3, 4, 1, 2, 3};
        matrix[3] = new int[]{2, 3, 4, 1, 2};

        assertTrue(toeplitzMatrix.isToeplitzMatrix(matrix));
    }

    @Test
    void isToeplitzMatrix_3x5_shouldReturnTrue() {
        int[][] matrix = new int[3][5];
        matrix[0] = new int[]{1, 2, 3, 4, 5};
        matrix[1] = new int[]{4, 1, 2, 3, 4};
        matrix[2] = new int[]{3, 4, 1, 2, 3};

        assertTrue(toeplitzMatrix.isToeplitzMatrix(matrix));
    }

    @Test
    void isToeplitzMatrix_1x1_shouldReturnTrue() {
        int[][] matrix = new int[1][1];
        matrix[0] = new int[]{1};

        assertTrue(toeplitzMatrix.isToeplitzMatrix(matrix));
    }

    @Test
    void isToeplitzMatrix_1x5_shouldReturnTrue() {
        int[][] matrix = new int[1][5];
        matrix[0] = new int[]{1, 2, 3, 4, 5};

        assertTrue(toeplitzMatrix.isToeplitzMatrix(matrix));
    }

    @Test
    void isToeplitzMatrix_5x1_shouldReturnTrue() {
        int[][] matrix = new int[5][1];
        matrix[0] = new int[]{1};
        matrix[1] = new int[]{4};
        matrix[2] = new int[]{3};
        matrix[3] = new int[]{2};

        assertTrue(toeplitzMatrix.isToeplitzMatrix(matrix));
    }
}