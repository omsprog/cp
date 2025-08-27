package com.omsprog.algorithms.leetcode.easy.adddigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {
    @Test
    void test() {
        AddDigits aD = new AddDigits();
        assertEquals(2, aD.addDigits(38));
        assertEquals(0, aD.addDigits(0));
    }
}