package com.omsprog.algorithms.leetcode.easy.minimumcommonvalue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCommonValueTest {
    @Test
    void test() {
        MinimumCommonValue minimumCommonValue = new MinimumCommonValue();
        assertEquals(2, minimumCommonValue.getCommon(new int[] {1, 2, 3}, new int[] {2, 4}));
        assertEquals(2, minimumCommonValue.getCommon(new int[] {1,2,3,6}, new int[] {2,3,4,5}));
    }
}