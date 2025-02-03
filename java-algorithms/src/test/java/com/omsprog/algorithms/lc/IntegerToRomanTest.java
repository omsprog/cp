package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
    @Test
    void test() {
        IntegerToRoman iT = new IntegerToRoman();
        assertEquals("MMMDCCXLIX", iT.intToRoman(3749));
        assertEquals("LVIII", iT.intToRoman(58));
        assertEquals("MCMXCIV", iT.intToRoman(1994));
    }
}