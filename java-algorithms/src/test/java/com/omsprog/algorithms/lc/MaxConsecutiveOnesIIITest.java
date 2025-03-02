package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesIIITest {
    @Test
    void test() {
        MaxConsecutiveOnesIII mC = new MaxConsecutiveOnesIII();
        assertEquals(6, mC.longestOnes(new int[] { 1,1,1,0,0,0,1,1,1,1,0 }, 2));
        assertEquals(10, mC.longestOnes(new int[] { 0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1 }, 3));
    }
}