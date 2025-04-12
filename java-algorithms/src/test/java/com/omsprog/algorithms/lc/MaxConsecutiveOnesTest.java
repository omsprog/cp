package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {
    @Test
    void test() {
        MaxConsecutiveOnes mC = new MaxConsecutiveOnes();
        assertEquals(3, mC.findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
        assertEquals(2, mC.findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1}));
    }
}