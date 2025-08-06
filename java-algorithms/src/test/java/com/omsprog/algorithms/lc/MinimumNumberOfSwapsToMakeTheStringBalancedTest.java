package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfSwapsToMakeTheStringBalancedTest {
    @Test
    void test() {
        MinimumNumberOfSwapsToMakeTheStringBalanced mN = new MinimumNumberOfSwapsToMakeTheStringBalanced();
        assertEquals(1, mN.minSwaps("[]]][[[]"));
        assertEquals(2, mN.minSwaps("]]][[["));
        assertEquals(1, mN.minSwaps("][]["));
        assertEquals(0, mN.minSwaps("[]"));
    }
}