package com.omsprog.algorithms.lc;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorderListTest {
    @Test
    void test() {
        ReorderList rL = new ReorderList();
        ListNode root1 = TestUtil.buildLinkedList(new int[]{1,2,3,4,5});
        rL.reorderList(root1);
        assertTrue(TestUtil.isLinkedListValid(new int[] {1,5,2,4,3}, root1));
    }
}