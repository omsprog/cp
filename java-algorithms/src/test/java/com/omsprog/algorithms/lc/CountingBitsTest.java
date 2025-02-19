package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingBitsTest {
    @Test
    void test() {
        CountingBits cB = new CountingBits();
        assertArrayEquals(new int[] {0,1,1}, cB.countBits(2));
        assertArrayEquals(new int[] {0,1,1,2,1,2}, cB.countBits(5));
    }
}