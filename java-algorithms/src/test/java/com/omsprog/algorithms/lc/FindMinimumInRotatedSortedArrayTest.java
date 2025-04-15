package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {
    @Test
    void test() {
        FindMinimumInRotatedSortedArray fM = new FindMinimumInRotatedSortedArray();
        assertEquals(1, fM.findMin(new int[] {3,4,5,1,2}));
        assertEquals(0, fM.findMin(new int[] {4,5,6,7,0,1,2}));
        assertEquals(11, fM.findMin(new int[] {11,13,15,17}));
    }
}