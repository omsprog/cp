package com.omsprog.algorithms.leetcode.easy.maximumareaoflongestdiagonalrectangle;

public class MaximumAreaOfLongestDiagonalRectangle {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal = 0;
        int area = 0;
        for (int[] dimension : dimensions) {
            int localDiagonal = dimension[0] * dimension[0] + dimension[1] * dimension[1];
            if (localDiagonal > maxDiagonal) {
                area = dimension[0] * dimension[1];
                maxDiagonal = localDiagonal;
            } else if (localDiagonal == maxDiagonal) {
                int localArea = dimension[0] * dimension[1];
                if (localArea > area) {
                    area = localArea;
                }
            }
        }
        return area;
    }
}
