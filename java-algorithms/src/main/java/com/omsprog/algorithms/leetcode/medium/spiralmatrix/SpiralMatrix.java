package com.omsprog.algorithms.leetcode.medium.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int expectedLength = rows * cols;
        int left = 0, up = 0, right = 0, down = 0;

        while(true) {
            // right
            for(int i = left; i < cols - right; i++) {
                result.add(matrix[up][i]);
                if(result.size() == expectedLength) return result;
            }
            ++up;
            // down
            for(int i = up; i < rows - down; i++) {
                result.add(matrix[i][cols - 1 - right]);
                if(result.size() == expectedLength) return result;
            }
            ++right;
            // left
            for(int i = cols - 1 - right; i >= left; i--) {
                result.add(matrix[rows - 1 - down][i]);
                if(result.size() == expectedLength) return result;
            }
            ++down;
            // up
            for(int i = rows - 1 - down; i >= up; i--) {
                result.add(matrix[i][left]);
                if(result.size() == expectedLength) return result;
            }
            ++left;
        }
    }
}
