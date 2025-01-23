package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    @Test
    void test() {
        ReverseInteger rI = new ReverseInteger();
        assertEquals(321, rI.reverse(123));
        assertEquals(-321, rI.reverse(-123));
        assertEquals(21, rI.reverse(120));
    }
}