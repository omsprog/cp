package com.omsprog.algorithms.leetcode.medium.spiralmatrixii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixIITest {
    @Test
    void test() {
        SpiralMatrixII spiralMatrixII= new SpiralMatrixII();
        assertArrayEquals(new int [][] {{1,2,3},{8,9,4},{7,6,5}}, spiralMatrixII.generateMatrix(3));
        assertArrayEquals(new int [][] {{1}}, spiralMatrixII.generateMatrix(1));
    }
}