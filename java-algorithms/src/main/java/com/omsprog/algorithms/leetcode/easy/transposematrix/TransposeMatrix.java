package com.omsprog.algorithms.leetcode.easy.transposematrix;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] response = new int[cols][rows];

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                response[col][row] = matrix[row][col];
            }
        }

        return response;
    }
}
