package com.omsprog.algorithms.leetcode.medium.spiralmatrix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {
    @Test
    void test() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        assertEquals(List.of(1,2,3,6,9,8,7,4,5), spiralMatrix.spiralOrder(new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
        assertEquals(List.of(1,2,3,4,8,12,11,10,9,5,6,7), spiralMatrix.spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
}