package com.omsprog.algorithms.leetcode.medium.sortmatrixbydiagonals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortMatrixByDiagonalsTest {
    @Test
    void test() {
        SortMatrixByDiagonals sMatrix = new SortMatrixByDiagonals();
        assertArrayEquals(new int[][] {{8,2,3},{9,6,7},{4,5,1}}, sMatrix.sortMatrix(new int[][] {{1,7,3},{9,8,2},{4,5,6}}));
        assertArrayEquals(new int[][] {{2,1},{1,0}}, sMatrix.sortMatrix(new int[][] {{0,1},{1,2}}));
    }
}