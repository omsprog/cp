package com.omsprog.algorithms.leetcode.medium.findfirstandlastpositionofelementinsortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstAndLastPositionOfElementInSortedArrayTest {
    @Test
    void test() {
        FindFirstAndLastPositionOfElementInSortedArray fF = new FindFirstAndLastPositionOfElementInSortedArray();
        assertArrayEquals(new int[] {3,4}, fF.searchRange(new int[] {5,7,7,8,8,10}, 8));
        assertArrayEquals(new int[] {-1,-1}, fF.searchRange(new int[] {5,7,7,8,8,10}, 6));
        assertArrayEquals(new int[] {-1,-1}, fF.searchRange(new int[] {}, 6));
    }
}