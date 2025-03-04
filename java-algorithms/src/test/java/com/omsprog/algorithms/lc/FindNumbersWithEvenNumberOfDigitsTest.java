package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumbersWithEvenNumberOfDigitsTest {
    @Test
    void test() {
        FindNumbersWithEvenNumberOfDigits fN = new FindNumbersWithEvenNumberOfDigits();
        assertEquals(2, fN.findNumbers(new int[] {12,345,2,6,7896}));
        assertEquals(1, fN.findNumbers(new int[] {555,901,482,1771}));
    }
}