package com.omsprog.algorithms.leetcode.medium.maximumsumofdistinctsubarrayswithlengthk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSumOfDistinctSubarraysWithLengthKTest {
    @Test
    void test() {
        MaximumSumOfDistinctSubarraysWithLengthK mSODSWLK = new MaximumSumOfDistinctSubarraysWithLengthK();
        assertEquals(15, mSODSWLK.maximumSubarraySum(new int[] {1,5,4,2,9,9,9}, 3));
        assertEquals(0, mSODSWLK.maximumSubarraySum(new int[] {4,4,4}, 3));
    }
}