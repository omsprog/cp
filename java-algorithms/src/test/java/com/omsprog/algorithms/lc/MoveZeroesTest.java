package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {
    @Test
    void test() {
        MoveZeroes mZ = new MoveZeroes();
        int[] arr1 = new int[] {0,1,0,3,12};
        mZ.moveZeroes(arr1);
        assertArrayEquals(new int[] {1,3,12,0,0}, arr1);
    }
}