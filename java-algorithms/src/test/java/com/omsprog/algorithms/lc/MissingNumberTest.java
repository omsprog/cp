package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {
    @Test
    void test() {
        MissingNumber mN = new MissingNumber();
        assertEquals(2, mN.missingNumber(new int[]{ 3, 0, 1 }));
        assertEquals(2, mN.missingNumber(new int[]{ 0, 1 }));
        assertEquals(8, mN.missingNumber(new int[]{ 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
    }
}