package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheHighestAltitudeTest {
    @Test
    void test() {
        FindTheHighestAltitude fHA = new FindTheHighestAltitude();
        assertEquals(1, fHA.largestAltitude(new int[] {-5,1,5,0,-7}));
        assertEquals(0, fHA.largestAltitude(new int[] {-4,-3,-2,-1,4,3,2}));
    }
}