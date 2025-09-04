package com.omsprog.algorithms.leetcode.medium.majorityelementii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementIITest {
    @Test
    void test() {
        MajorityElementII majorityElement = new MajorityElementII();
        assertEquals(List.of(3), majorityElement.majorityElement(new int[] {3,2,3}));
        assertEquals(List.of(1), majorityElement.majorityElement(new int[] {1}));
        assertEquals(List.of(1,2), majorityElement.majorityElement(new int[] {1,2}));
    }
}