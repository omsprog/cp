package com.omsprog.algorithms.leetcode.easy.transposematrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {
    @Test
    void test() {
        TransposeMatrix tM = new TransposeMatrix();
        assertArrayEquals(new int[][] {{1,4,7},{2,5,8},{3,6,9}}, tM.transpose(new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
        assertArrayEquals(new int[][] {{1,4},{2,5},{3,6}}, tM.transpose(new int[][] {{1,2,3},{4,5,6}}));
    }
}