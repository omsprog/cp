package com.omsprog.algorithms.leetcode.medium.lengthoflongestsubarraywithatmostkfrequency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubarrayWithAtMostKFrequencyTest {
    @Test
    void test() {
        LengthOfLongestSubarrayWithAtMostKFrequency lOLSWAMKF = new LengthOfLongestSubarrayWithAtMostKFrequency();
        assertEquals(6, lOLSWAMKF.maxSubarrayLength(new int[] {1,2,3,1,2,3,1,2}, 2));
        assertEquals(2, lOLSWAMKF.maxSubarrayLength(new int[] {1,2,1,2,1,2,1,2}, 1));
        assertEquals(4, lOLSWAMKF.maxSubarrayLength(new int[] {5,5,5,5,5,5,5}, 4));
    }
}