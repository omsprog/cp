package com.omsprog.algorithms.leetcode.easy.reverselinkedlist.iterative;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListIterativeTest {
    @Test
    void test() {
        ReverseLinkedListIterative iterative = new ReverseLinkedListIterative();
        assertTrue(TestUtil.isLinkedListValid(new int[] {5,4,3,2,1}, iterative.reverseList(TestUtil.buildLinkedList(new int[] {1,2,3,4,5}))));
        assertTrue(TestUtil.isLinkedListValid(new int[] {2,1}, iterative.reverseList(TestUtil.buildLinkedList(new int[] {1,2}))));
        assertTrue(TestUtil.isLinkedListValid(new int[] {}, iterative.reverseList(TestUtil.buildLinkedList(new int[] {}))));
    }
}