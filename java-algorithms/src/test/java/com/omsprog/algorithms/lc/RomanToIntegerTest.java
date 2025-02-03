package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    @Test
    void test() {
        RomanToInteger rTI = new RomanToInteger();
        assertEquals(3, rTI.romanToInt("III"));
        assertEquals(58, rTI.romanToInt("LVIII"));
        assertEquals(1994, rTI.romanToInt("MCMXCIV"));
    }
}