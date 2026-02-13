package com.omsprog.algorithms.leetcode.easy.reshapethematrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReshapeTheMatrixTest {
    @Test
    void test() {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        assertArrayEquals(new int[][] {{1,2,3,4}}, reshapeTheMatrix.matrixReshape(new int[][] {{1, 2}, {3, 4}}, 1, 4));
        assertArrayEquals(new int[][] {{1,2},{3,4}}, reshapeTheMatrix.matrixReshape(new int[][] {{1, 2}, {3, 4}}, 2, 4));
    }
}