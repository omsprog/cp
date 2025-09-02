package com.omsprog.algorithms.leetcode.medium.removenthnodefromendoflist;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {
    @Test
    void test() {
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        assertTrue(TestUtil.isLinkedListValid(new int[] {1,2,3,5}, removeNthNodeFromEndOfList.removeNthFromEnd(TestUtil.buildLinkedList(new int[] {1,2,3,4,5}), 2)));
        assertNull(removeNthNodeFromEndOfList.removeNthFromEnd(TestUtil.buildLinkedList(new int[] {1}), 1));
        assertTrue(TestUtil.isLinkedListValid(new int[] {1}, removeNthNodeFromEndOfList.removeNthFromEnd(TestUtil.buildLinkedList(new int[] {1,2}), 1)));
    }
}