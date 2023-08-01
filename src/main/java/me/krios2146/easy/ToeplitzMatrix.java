package me.krios2146.easy;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[] currentRow = matrix[0];
        for (int i = 1; i < rows; i++) {
            int[] nextRow = matrix[i];
            for (int j = 0, k = 1; k < columns; j++, k++) {
                if (currentRow[j] != nextRow[k]) {
                    return false;
                }
            }
            currentRow = nextRow;
        }
        return true;
    }
}
