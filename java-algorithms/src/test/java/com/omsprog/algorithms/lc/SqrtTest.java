package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {
    @Test
    void test() {
        Sqrt sqrt = new Sqrt();
        assertEquals(2, sqrt.mySqrt(4));
        assertEquals(2, sqrt.mySqrt(5));
        assertEquals(3, sqrt.mySqrt(9));
        assertEquals(4, sqrt.mySqrt(16));
        assertEquals(4, sqrt.mySqrt(17));
    }
}