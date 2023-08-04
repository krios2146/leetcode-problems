package me.krios2146.easy;

public class ValidBoomerang {
    private final int X = 0;
    private final int Y = 1;

    public boolean isBoomerang(int[][] points) {
        int pointsCount = points.length;

        int similarX = 0;
        int similarY = 0;
        int straightLineSegments = 0;
        for (int i = 0, j = i + 1; j < pointsCount; i++, j++) {
            int currentX = points[i][X];
            int nextX = points[j][X];

            int currentY = points[i][Y];
            int nextY = points[j][Y];

            if (currentX == nextX) {
                similarX++;
            }
            if (currentY == nextY) {
                similarY++;
            }
            // non distinct
            if (currentX == nextX && currentY == nextY) {
                return false;
            }
            // 45deg
            if (currentX == currentY && nextX == nextY) {
                straightLineSegments++;
            }
        }
        // straight lines checks
        if (similarX == pointsCount || similarY == pointsCount || straightLineSegments + 1 == pointsCount) {
            return false;
        }

        return true;
    }
}
