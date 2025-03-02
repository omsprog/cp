package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubarrayOf1AfterDeletingOneElementTest {
    @Test
    void test() {
        LongestSubarrayOf1AfterDeletingOneElement lS = new LongestSubarrayOf1AfterDeletingOneElement();
        assertEquals(3, lS.longestSubarray(new int[]{1,1,0,1}));
        assertEquals(5, lS.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
        assertEquals(2, lS.longestSubarray(new int[]{1,1,1}));
    }
}