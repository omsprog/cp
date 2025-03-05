package com.omsprog.algorithms.lc;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {
    @Test
    void test() {
        SwapNodesInPairs sN = new SwapNodesInPairs();

        ListNode l1 = TestUtil.buildLinkedList(new int[] {1,2,3,4});
        ListNode l1r = sN.swapPairs(l1);
        assertTrue(TestUtil.isLinkedListValid(l1r, new int[]{2,1,4,3}));

        ListNode l2 = TestUtil.buildLinkedList(new int[] {1,2,3});
        ListNode l2r = sN.swapPairs(l2);
        assertTrue(TestUtil.isLinkedListValid(l2r, new int[]{2,1,3}));
    }
}