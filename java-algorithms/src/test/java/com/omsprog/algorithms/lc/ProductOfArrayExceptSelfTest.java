package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {
    @Test
    void test() {
        ProductOfArrayExceptSelf pOA = new ProductOfArrayExceptSelf();

        assertArrayEquals(new int[] {24,12,8,6}, pOA.productExceptSelf(new int[] { 1,2,3,4 }));
        assertArrayEquals(new int[] {0,0,9,0,0}, pOA.productExceptSelf(new int[] { -1,1,0,-3,3 }));
    }
}