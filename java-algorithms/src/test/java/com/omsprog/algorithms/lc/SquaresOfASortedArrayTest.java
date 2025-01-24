package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SquaresOfASortedArrayTest {
    @Test
    void test() {
        SquaresOfASortedArray sOSA = new SquaresOfASortedArray();
        assertArrayEquals(new int[] {0,1,9,16,100}, sOSA.sortedSquares(new int[] {-4,-1,0,3,10}));
        assertArrayEquals(new int[] {4,9,9,49,121}, sOSA.sortedSquares(new int[] {-7,-3,2,3,11}));
    }
}