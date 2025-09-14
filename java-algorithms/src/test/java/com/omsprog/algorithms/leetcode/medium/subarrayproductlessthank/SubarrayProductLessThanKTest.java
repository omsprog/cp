package com.omsprog.algorithms.leetcode.medium.subarrayproductlessthank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayProductLessThanKTest {
    @Test
    void test() {
        SubarrayProductLessThanK sPLTK = new SubarrayProductLessThanK();
        assertEquals(8, sPLTK.numSubarrayProductLessThanK(new int[] {10,5,2,6}, 100));
        assertEquals(0, sPLTK.numSubarrayProductLessThanK(new int[] {1,2,3}, 0));
    }
}