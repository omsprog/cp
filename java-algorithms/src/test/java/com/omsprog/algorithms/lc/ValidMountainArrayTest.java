package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidMountainArrayTest {
    @Test
    void test() {
        ValidMountainArray vMA = new ValidMountainArray();
        assertFalse(vMA.validMountainArray(new int[]{2,1}));
        assertFalse(vMA.validMountainArray(new int[]{3,5,5}));
        assertTrue(vMA.validMountainArray(new int[]{0,3,2,1}));
    }
}