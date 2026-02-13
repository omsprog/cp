package com.omsprog.algorithms.leetcode.easy.intersectionoftwoarraysii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysIITest {
    @Test
    void test() {
        IntersectionOfTwoArraysII intersectionOfTwoArraysII = new IntersectionOfTwoArraysII();
        assertArrayEquals(new int[] {2,2}, intersectionOfTwoArraysII.intersect(new int[] {1,2,2,1}, new int[] {2,2}));
        assertArrayEquals(new int[] {4,9}, intersectionOfTwoArraysII.intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4}));
    }
}