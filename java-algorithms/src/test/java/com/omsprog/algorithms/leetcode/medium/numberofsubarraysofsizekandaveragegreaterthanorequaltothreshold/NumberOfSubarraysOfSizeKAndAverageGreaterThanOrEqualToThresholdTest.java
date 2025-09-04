package com.omsprog.algorithms.leetcode.medium.numberofsubarraysofsizekandaveragegreaterthanorequaltothreshold;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThresholdTest {
    @Test
    void test() {
        NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold nOSA = new NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold();
        assertEquals(3, nOSA.numOfSubarrays(new int[] {2,2,2,2,5,5,5,8}, 3, 4));
        assertEquals(6, nOSA.numOfSubarrays(new int[] {11,13,17,23,29,31,7,5,2,3}, 3, 5));
    }
}