package com.omsprog.algorithms.leetcode.easy.reshapethematrix;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int numElements = mat.length * mat[0].length;
        if(numElements != r * c) return mat;

        int[][] newMatrix = new int[r][c];

        for(int i = 0; i < numElements; i++) {
            int rN = i / c;
            int cN = i % c;
            int rO = i / mat[0].length;
            int cO = i % mat[0].length;

            newMatrix[rN][cN] = mat[rO][cO];
        }

        return newMatrix;
    }
}
