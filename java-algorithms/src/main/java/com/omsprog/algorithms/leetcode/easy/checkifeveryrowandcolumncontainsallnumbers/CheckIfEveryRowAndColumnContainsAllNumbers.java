package com.omsprog.algorithms.leetcode.easy.checkifeveryrowandcolumncontainsallnumbers;

public class CheckIfEveryRowAndColumnContainsAllNumbers {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        boolean[][] rows = new boolean[n][n];
        boolean[][] cols = new boolean[n][n];

        for(int r = 0; r < matrix.length; r++) {
            for(int c = 0; c < matrix[r].length; c++) {
                int val = matrix[r][c];
                rows[r][val - 1] = true;
                cols[c][val - 1] = true;
            }
        }

        // verifying missing values in rows and cols
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(rows[i][j] == false || cols[i][j] == false)
                    return false;
            }
        }

        return true;
    }
}
