package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {
    @Test
    void test() {
        PowerOfTwo pOT = new PowerOfTwo();
        assertTrue(pOT.isPowerOfTwo(1));
        assertTrue(pOT.isPowerOfTwo(2));
        assertFalse(pOT.isPowerOfTwo(3));
    }
}