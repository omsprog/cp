package com.omsprog.algorithms.leetcode.medium.threesum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumTwoPointersTest {
    @Test
    void test() {
        ThreeSumTwoPointers tSTP = new ThreeSumTwoPointers();

        assertEquals(List.of(List.of(-1,-1,2), List.of(-1,0,1)), tSTP.threeSum(new int[] {-1,0,1,2,-1,-4}));
        assertEquals(List.of(), tSTP.threeSum(new int[] {0,1,1}));
        assertEquals(List.of(List.of(0,0,0)), tSTP.threeSum(new int[] {0,0,0}));
    }
}