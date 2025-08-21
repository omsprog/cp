package com.omsprog.algorithms.leetcode.easy.determinewhethermatrixcanbeobtainedbyrotation;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    private void rotate90(int[][] mat) {
        // transpose the matrix
        for(int row = 0; row < mat.length; row++) {
            for(int col = 0 + row; col < mat[row].length; col++) {
                int tmp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = tmp;
            }
        }

        // invert values in each row
        for(int row = 0; row < mat.length; row++) {
            int rowLength = mat[row].length;
            for(int col = 0 ; col < rowLength / 2; col++) {
                int tmp = mat[row][col];
                mat[row][col] = mat[row][rowLength -1 -col];
                mat[row][rowLength -1 -col] = tmp;
            }
        }
    }

    private boolean isSameMatrix(int[][] mat, int[][] target) {
        for(int row = 0; row < mat.length; row++) {
            for(int col = 0; col < mat[row].length; col++) {
                if(mat[row][col] != target[row][col]) return false;
            }
        }

        return true;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++) {
            if(isSameMatrix(mat, target)) return true;
            rotate90(mat);
        }
        return false;
    }
}
