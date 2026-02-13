package com.omsprog.algorithms.leetcode.easy.maximum69number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum69NumberTest {
    @Test
    void test() {
        Maximum69Number max69Number = new Maximum69Number();
        assertEquals(9969, max69Number.maximum69Number(9669));
        assertEquals(9999, max69Number.maximum69Number(9996));
        assertEquals(9999, max69Number.maximum69Number(9999));
    }
}