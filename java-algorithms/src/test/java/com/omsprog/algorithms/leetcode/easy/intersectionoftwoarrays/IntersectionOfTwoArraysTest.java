package com.omsprog.algorithms.leetcode.easy.intersectionoftwoarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {
    @Test
    void test() {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        assertArrayEquals(new int[] {2}, intersectionOfTwoArrays.intersection(new int[] {1,2,2,1}, new int[] {2,2}));
        assertArrayEquals(new int[] {9,4}, intersectionOfTwoArrays.intersection(new int[] {4,9,5}, new int[] {9,4,9,8,4}));
    }
}