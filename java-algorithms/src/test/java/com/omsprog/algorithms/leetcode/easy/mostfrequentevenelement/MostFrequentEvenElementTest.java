package com.omsprog.algorithms.leetcode.easy.mostfrequentevenelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostFrequentEvenElementTest {
    @Test
    void test() {
        MostFrequentEvenElement mFEE = new MostFrequentEvenElement();
        assertEquals(2, mFEE.mostFrequentEven(new int[] {0,1,2,2,4,4,1}));
        assertEquals(4, mFEE.mostFrequentEven(new int[] {4,4,4,9,2,4}));
        assertEquals(-1, mFEE.mostFrequentEven(new int[] {29,47,21,41,13,37,25,7}));
    }
}