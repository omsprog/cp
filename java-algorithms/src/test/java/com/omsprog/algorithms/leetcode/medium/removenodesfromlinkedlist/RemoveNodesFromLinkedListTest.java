package com.omsprog.algorithms.leetcode.medium.removenodesfromlinkedlist;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNodesFromLinkedListTest {
    @Test
    void test() {
        RemoveNodesFromLinkedList removeNodesFromLinkedList = new RemoveNodesFromLinkedList();
        assertTrue(TestUtil.isLinkedListValid(new int[] {13,8}, removeNodesFromLinkedList.removeNodes(TestUtil.buildLinkedList(new int[] {5,2,13,3,8}))));
        assertTrue(TestUtil.isLinkedListValid(new int[] {1,1,1,1}, removeNodesFromLinkedList.removeNodes(TestUtil.buildLinkedList(new int[] {1,1,1,1}))));
    }
}