package com.omsprog.algorithms.leetcode.medium.kradiussubarrayaverages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KRadiusSubarrayAveragesTest {
    @Test
    void test() {
        KRadiusSubarrayAverages kRSA = new KRadiusSubarrayAverages();
        assertArrayEquals(new int[] {-1,-1,-1,5,4,4,-1,-1,-1}, kRSA.getAverages(new int[] {7,4,3,9,1,8,5,2,6}, 3));
        assertArrayEquals(new int[] {100000}, kRSA.getAverages(new int[] {100000}, 0));
        assertArrayEquals(new int[] {-1}, kRSA.getAverages(new int[] {8}, 100000));
    }
}