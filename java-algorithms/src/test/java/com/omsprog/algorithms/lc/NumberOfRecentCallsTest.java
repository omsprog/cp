package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfRecentCallsTest {
    @Test
    void test() {
        NumberOfRecentCalls nRC = new NumberOfRecentCalls();
        assertEquals(1, nRC.ping(1));
        assertEquals(2, nRC.ping(100));
        assertEquals(3, nRC.ping(3001));
        assertEquals(3, nRC.ping(3002));
    }
}