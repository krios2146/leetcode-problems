package me.krios2146.medium;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0].length == 1) {
            return 0;
        }
        return findUniquePaths(0, 0, obstacleGrid);
    }

    private static int findUniquePaths(int x, int y, int[][] grid) {
        if (x == grid.length - 1 && y == grid[0].length - 1) {
            return 1;
        }
        if (isDownFree(x, y, grid) && isRightFree(x, y, grid)) {
            return findUniquePaths(x + 1, y, grid) + findUniquePaths(x, y + 1, grid);
        } else if (isDownFree(x, y, grid)) {
            return findUniquePaths(x + 1, y, grid);
        } else if (isRightFree(x, y, grid)) {
            return findUniquePaths(x, y + 1, grid);
        }
        return 0;
    }

    private static boolean isDownFree(int x, int y, int[][] grid) {
        // out of grid
        if (x + 1 > grid.length - 1) {
            return false;
        }
        // obstacle
        if (grid[x + 1][y] == 1) {
            return false;
        }
        return true;
    }

    private static boolean isRightFree(int x, int y, int[][] grid) {
        // out of grid
        if (y + 1 > grid[0].length - 1) {
            return false;
        }
        // obstacle
        if (grid[x][y + 1] == 1) {
            return false;
        }
        return true;
    }
}
