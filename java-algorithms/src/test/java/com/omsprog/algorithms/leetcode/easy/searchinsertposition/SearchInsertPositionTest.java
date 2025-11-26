package com.omsprog.algorithms.leetcode.easy.searchinsertposition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {
    @Test
    void test() {
        SearchInsertPosition sIP = new SearchInsertPosition();
        assertEquals(2, sIP.searchInsert(new int[] {1,4,5,6}, 5));
        assertEquals(1, sIP.searchInsert(new int[] {1,4,5,6}, 2));
        assertEquals(4, sIP.searchInsert(new int[] {1,4,5,6}, 7));
    }
}