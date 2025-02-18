package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {
    @Test
    void test() {
        StringCompression sC = new StringCompression();
        char[] sCT1 = new char[] { 'a','a','b','b','c','c','c' };
        assertEquals(6, sC.compress(sCT1));
        assertArrayEquals(new char[] {'a','2','b','2','c','3','c'}, sCT1);
    }
}