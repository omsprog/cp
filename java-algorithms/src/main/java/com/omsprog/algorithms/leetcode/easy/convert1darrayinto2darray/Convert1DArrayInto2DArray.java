package com.omsprog.algorithms.leetcode.easy.convert1darrayinto2darray;

public class Convert1DArrayInto2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m * n) return new int[0][0];

        int[][] newMatrix = new int[m][n];

        for(int i = 0; i < original.length; i++) {
            int rN = i / n;
            int cN = i % n;
            newMatrix[rN][cN] = original[i];
        }

        return newMatrix;
    }
}
