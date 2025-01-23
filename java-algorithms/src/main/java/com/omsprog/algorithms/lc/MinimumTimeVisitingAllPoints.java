package com.omsprog.algorithms.lc;

public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int optimal = 0;

        for(int i = 1; i < points.length; i++) {
            int[] initialPoint = points[i-1];
            int[] endPoint = points[i];

            int deltaX = Math.abs(endPoint[0] - initialPoint[0]);
            int deltaY = Math.abs(endPoint[1] - initialPoint[1]);

            int minimumDiagonal = Math.min(deltaX, deltaY);
            int maxAux = Math.max(deltaX, deltaY);
            int difference = minimumDiagonal + (maxAux - minimumDiagonal);

            optimal += difference;
        }

        return optimal;
    }
}
