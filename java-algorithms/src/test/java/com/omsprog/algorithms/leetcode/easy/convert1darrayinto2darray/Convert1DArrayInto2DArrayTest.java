package com.omsprog.algorithms.leetcode.easy.convert1darrayinto2darray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Convert1DArrayInto2DArrayTest {
    @Test
    void test() {
        Convert1DArrayInto2DArray c = new Convert1DArrayInto2DArray();
        assertArrayEquals(new int[][] {{1,2}, {3,4}}, c.construct2DArray(new int[] {1,2,3,4}, 2, 2));
        assertArrayEquals(new int[][] {{1,2,3}}, c.construct2DArray(new int[] {1,2,3}, 1, 3));
        assertArrayEquals(new int[][] {}, c.construct2DArray(new int[] {1,2}, 1, 1));
    }
}