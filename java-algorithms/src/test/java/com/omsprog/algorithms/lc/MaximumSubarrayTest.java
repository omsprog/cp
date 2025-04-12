package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {
    @Test
    void test() {
        MaximumSubarray mS = new MaximumSubarray();
        assertEquals(6, mS.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        assertEquals(23, mS.maxSubArray(new int[] {5,4,-1,7,8}));
    }
}