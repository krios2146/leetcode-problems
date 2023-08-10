package me.krios2146.medium;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            int start = row[0];
            int end = row[row.length - 1];

            if (target == start || target == end) {
                return true;
            }

            if (target > start && target < end) {
                return binarySearch(row, target);
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target || array[left] == target || array[right] == target) {
                return true;
            }

            if (target < array[mid]) {
                right = mid - 1;
            } else if (target > array[mid]) {
                left = mid + 1;
            } else {
                return false;
            }
        }
        return false;
    }
}
