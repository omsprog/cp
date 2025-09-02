package com.omsprog.algorithms.leetcode.easy.reverselinkedlist.recursive;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListRecursiveTest {
    @Test
    void test() {
        ReverseLinkedListRecursive recursive = new ReverseLinkedListRecursive();
        recursive.reverseList(TestUtil.buildLinkedList(new int[] {1,2,3}));
        assertTrue(TestUtil.isLinkedListValid(new int[] {5,4,3,2,1}, recursive.reverseList(TestUtil.buildLinkedList(new int[] {1,2,3,4,5}))));
        assertTrue(TestUtil.isLinkedListValid(new int[] {2,1}, recursive.reverseList(TestUtil.buildLinkedList(new int[] {1,2}))));
        assertTrue(TestUtil.isLinkedListValid(new int[] {}, recursive.reverseList(TestUtil.buildLinkedList(new int[] {}))));
    }
}