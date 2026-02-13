package com.omsprog.algorithms.leetcode.easy.findtargetindicesaftersortingarray;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTargetIndicesAfterSortingArrayTest {
    @Test
    void test() {
        FindTargetIndicesAfterSortingArray findTargetIndices = new FindTargetIndicesAfterSortingArray();
        assertEquals(List.of(1,2), findTargetIndices.targetIndices(new int[] {1,2,5,2,3}, 2));
        assertEquals(List.of(3), findTargetIndices.targetIndices(new int[] {1,2,5,2,3}, 3));
        assertEquals(List.of(4), findTargetIndices.targetIndices(new int[] {1,2,5,2,3}, 5));
    }
}