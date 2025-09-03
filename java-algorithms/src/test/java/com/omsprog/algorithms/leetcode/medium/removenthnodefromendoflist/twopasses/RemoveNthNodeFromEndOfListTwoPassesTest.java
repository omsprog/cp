package com.omsprog.algorithms.leetcode.medium.removenthnodefromendoflist.twopasses;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTwoPassesTest {
    @Test
    void test() {
        RemoveNthNodeFromEndOfListTwoPasses removeNthNodeFromEndOfListTwoPasses = new RemoveNthNodeFromEndOfListTwoPasses();
        assertTrue(TestUtil.isLinkedListValid(new int[] {1,2,3,5}, removeNthNodeFromEndOfListTwoPasses.removeNthFromEnd(TestUtil.buildLinkedList(new int[] {1,2,3,4,5}), 2)));
        assertNull(removeNthNodeFromEndOfListTwoPasses.removeNthFromEnd(TestUtil.buildLinkedList(new int[] {1}), 1));
        assertTrue(TestUtil.isLinkedListValid(new int[] {1}, removeNthNodeFromEndOfListTwoPasses.removeNthFromEnd(TestUtil.buildLinkedList(new int[] {1,2}), 1)));
    }
}