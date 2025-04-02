package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void test() {
        BinarySearch bS = new BinarySearch();
        assertEquals(4, bS.search(new int[] {-1,0,3,5,9,12}, 9));
        assertEquals(-1, bS.search(new int[] {-1,0,3,5,9,12}, 2));
    }
}