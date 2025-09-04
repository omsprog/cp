package com.omsprog.algorithms.leetcode.medium.rotateimage;

public class RotateImage {
    public void rotate(int[][] matrix) {
        for(int row = 0; row < matrix.length; row++) {
            for(int col = row; col < matrix[row].length; col++) {
                int tmp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = tmp;
            }
        }

        for(int row = 0; row < matrix.length; row++) {
            int rowLenght = matrix[row].length;
            for(int col = 0; col < rowLenght / 2; col++) {
                int tmp = matrix[row][col];
                matrix[row][col] = matrix[row][rowLenght - 1 - col];
                matrix[row][rowLenght - 1 - col] = tmp;
            }
        }
    }
}
