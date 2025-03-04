package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {
    @Test
    void test() {
        PowerOfThree pOT = new PowerOfThree();
        assertTrue(pOT.isPowerOfThree(27));
        assertFalse(pOT.isPowerOfThree(0));
        assertFalse(pOT.isPowerOfThree(-1));
    }
}