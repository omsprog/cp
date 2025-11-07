package com.omsprog.algorithms.leetcode.easy.defusethebomb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefuseTheBombTest {
    @Test
    void test() {
        DefuseTheBomb dTB = new DefuseTheBomb();
        assertArrayEquals(new int[] {12,10,16,13}, dTB.decrypt(new int[] {5,7,1,4}, 3));
        assertArrayEquals(new int[] {0,0,0,0}, dTB.decrypt(new int[] {1,2,3,4}, 0));
        assertArrayEquals(new int[] {12,5,6,13}, dTB.decrypt(new int[] {2,4,9,3}, -2));
    }
}