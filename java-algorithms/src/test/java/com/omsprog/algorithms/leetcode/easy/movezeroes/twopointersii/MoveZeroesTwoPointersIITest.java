package com.omsprog.algorithms.leetcode.easy.movezeroes.twopointersii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTwoPointersIITest {
    @Test
    void test() {
        MoveZeroesTwoPointersII moveZeroesTwoPointersII = new MoveZeroesTwoPointersII();
        int[] arr1 = new int[] {0,1,0,3,12};
        moveZeroesTwoPointersII.moveZeroes(arr1);
        assertArrayEquals(new int[] {1,3,12,0,0}, arr1);
        int[] arr2 = new int[] {0};
        moveZeroesTwoPointersII.moveZeroes(arr2);
        assertArrayEquals(new int[] {0}, arr2);
    }
}