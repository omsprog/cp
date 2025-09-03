package com.omsprog.algorithms.leetcode.medium.deletenodesfromlinkedlistpresentinarray;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodesFromLinkedListPresentInArrayTest {
    @Test
    void test() {
        DeleteNodesFromLinkedListPresentInArray deleteNodes = new DeleteNodesFromLinkedListPresentInArray();
        assertTrue(TestUtil.isLinkedListValid(new int[] {4,5}, deleteNodes.modifiedList(new int[] {1,2,3}, TestUtil.buildLinkedList(new int[] {1,2,3,4,5}))));
        assertTrue(TestUtil.isLinkedListValid(new int[] {2,2,2}, deleteNodes.modifiedList(new int[] {1}, TestUtil.buildLinkedList(new int[] {1,2,1,2,1,2}))));
        assertTrue(TestUtil.isLinkedListValid(new int[] {1,2,3,4}, deleteNodes.modifiedList(new int[] {5}, TestUtil.buildLinkedList(new int[] {1,2,3,4}))));
    }
}