package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest {
    @Test
    void test() {
        ZigzagConversion zC = new ZigzagConversion();
        assertEquals("PAHNAPLSIIGYIR", zC.convert("PAYPALISHIRING", 3));
        assertEquals("A", zC.convert("A", 2));
        assertEquals("AB", zC.convert("AB", 1));
    }
}