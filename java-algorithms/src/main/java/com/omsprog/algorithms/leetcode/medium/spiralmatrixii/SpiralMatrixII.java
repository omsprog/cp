package com.omsprog.algorithms.leetcode.medium.spiralmatrixii;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int up = 0, right = 0, down = 0, left = 0;
        int sequence = 1;
        int expectedLength = n * n;

        while(true) {
            // right
            for(int i = left; i < n - right; i++) {
                matrix[up][i] = sequence;
                if(sequence == expectedLength) return matrix;
                ++sequence;
            }
            ++up;
            // down
            for(int i = up; i < n - down; i++) {
                matrix[i][n - 1 - right] = sequence;
                if(sequence == expectedLength) return matrix;
                ++sequence;
            }
            ++right;
            // left
            for(int i = n - 1 - right; i >= left; i--) {
                matrix[n - 1 - down][i] = sequence;
                if(sequence == expectedLength) return matrix;
                ++sequence;
            }
            ++down;
            // up
            for(int i = n - 1 - down; i >= up; i--) {
                matrix[i][left] = sequence;
                if(sequence == expectedLength) return matrix;
                ++sequence;
            }
            ++left;
        }
    }
}
