package com.omsprog.algorithms.leetcode.medium.reverselinkedlistii;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListIITest {
    @Test
    void test() {
        ReverseLinkedListII reverseLinkedListII = new ReverseLinkedListII();
        assertTrue(TestUtil.isLinkedListValid(new int[] {1,4,3,2,5}, reverseLinkedListII.reverseBetween(TestUtil.buildLinkedList(new int[] {1,2,3,4,5}),2,4)));
        assertTrue(TestUtil.isLinkedListValid(new int[] {5}, reverseLinkedListII.reverseBetween(TestUtil.buildLinkedList(new int[] {5}),1,1)));
    }
}