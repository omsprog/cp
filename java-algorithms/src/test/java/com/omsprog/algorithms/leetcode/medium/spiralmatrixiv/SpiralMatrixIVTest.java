package com.omsprog.algorithms.leetcode.medium.spiralmatrixiv;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixIVTest {
    @Test
    void test() {
        SpiralMatrixIV spiralMatrixIV = new SpiralMatrixIV();
        assertArrayEquals(new int[][] {{3,0,2,6,8},{5,0,-1,-1,1},{5,2,4,9,7}},
                spiralMatrixIV.spiralMatrix(3, 5, TestUtil.buildLinkedList(new int[] {3,0,2,6,8,1,7,9,4,2,5,5,0})));
        assertArrayEquals(new int[][] {{0,1,2,-1}},
                spiralMatrixIV.spiralMatrix(1, 4, TestUtil.buildLinkedList(new int[] {0,1,2})));
    }
}