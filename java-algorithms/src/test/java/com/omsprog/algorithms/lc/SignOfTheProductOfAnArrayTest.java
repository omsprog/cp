package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignOfTheProductOfAnArrayTest {
    @Test
    void test() {
        SignOfTheProductOfAnArray sOP = new SignOfTheProductOfAnArray();
        assertEquals(1, sOP.arraySign(new int[] {-1,-2,-3,-4,3,2,1}));
        assertEquals(0, sOP.arraySign(new int[] {1,5,0,2,-3}));
        assertEquals(-1, sOP.arraySign(new int[] {-1,1,-1,1,-1}));
    }
}