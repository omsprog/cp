package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    @Test
    void test() {
        RotateArray rA = new RotateArray();

        int[] originalArray1 = new int[] {1,2,3,4,5,6,7};
        rA.rotate(originalArray1, 3);
        assertArrayEquals(new int[] {5,6,7,1,2,3,4}, originalArray1);

        int[] originalArray2 = new int[] {-1,-100,3,99};
        rA.rotate(originalArray2, 2);
        assertArrayEquals(new int[] {3,99,-1,-100}, originalArray2);
    }
}