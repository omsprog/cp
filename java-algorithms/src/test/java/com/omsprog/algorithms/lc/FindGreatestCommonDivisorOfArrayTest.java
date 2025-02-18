package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindGreatestCommonDivisorOfArrayTest {
    @Test
    void test() {
        FindGreatestCommonDivisorOfArray fGC = new FindGreatestCommonDivisorOfArray();
        assertEquals(2, fGC.findGCD(new int[] {2,5,6,9,10}));
        assertEquals(1, fGC.findGCD(new int[] {7,5,6,8,3}));
        assertEquals(3, fGC.findGCD(new int[] {3,3}));
    }
}