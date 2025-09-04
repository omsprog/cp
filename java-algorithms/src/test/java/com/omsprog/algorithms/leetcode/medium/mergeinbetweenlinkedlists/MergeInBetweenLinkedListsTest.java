package com.omsprog.algorithms.leetcode.medium.mergeinbetweenlinkedlists;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeInBetweenLinkedListsTest {
    @Test
    void test() {
        MergeInBetweenLinkedLists mergeInBetweenLinkedLists = new MergeInBetweenLinkedLists();
        assertTrue(TestUtil.isLinkedListValid(new int[] {10,1,13,1000000,1000001,1000002,5}, mergeInBetweenLinkedLists.mergeInBetween(
                TestUtil.buildLinkedList(new int[] {10,1,13,6,9,5}),
                3,4,
                TestUtil.buildLinkedList(new int[] {1000000,1000001,1000002})
        )));
        assertTrue(TestUtil.isLinkedListValid(new int[] {0,1,1000000,1000001,1000002,1000003,1000004,6}, mergeInBetweenLinkedLists.mergeInBetween(
                TestUtil.buildLinkedList(new int[] {0,1,2,3,4,5,6}),
                2,5,
                TestUtil.buildLinkedList(new int[] {1000000,1000001,1000002,1000003,1000004})
        )));
    }
}