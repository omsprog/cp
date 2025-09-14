package com.omsprog.algorithms.leetcode.medium.minimumsizesubarraysum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySumTest {
    @Test
    void test(){
        MinimumSizeSubarraySum mSSSum = new MinimumSizeSubarraySum();
        assertEquals(2, mSSSum.minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
        assertEquals(1, mSSSum.minSubArrayLen(4, new int[] {1,4,4}));
        assertEquals(0, mSSSum.minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1}));
    }
}