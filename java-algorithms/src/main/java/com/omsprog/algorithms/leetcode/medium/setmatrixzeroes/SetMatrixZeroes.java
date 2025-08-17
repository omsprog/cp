package com.omsprog.algorithms.leetcode.medium.setmatrixzeroes;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        // Sets to remember which rows and columns should be zeroed
        Set<Integer> rowZeroMemory = new HashSet<>();
        Set<Integer> columnZeroMemory = new HashSet<>();

        // First pass: scan the matrix to find all zeroes
        // Record the row and column indices of each zero
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++) {
                if(matrix[row][column] == 0) {
                    rowZeroMemory.add(row);
                    columnZeroMemory.add(column);
                }
            }
        }

        // Second pass: update the matrix based on recorded zero positions
        // Set a cell to zero if its row or column was marked
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++) {
                if(rowZeroMemory.contains(row) || columnZeroMemory.contains(column))
                    matrix[row][column] = 0;
            }
        }
    }
}
