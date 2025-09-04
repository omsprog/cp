package com.omsprog.algorithms.leetcode.easy.linkedlistcycle;

import com.omsprog.algorithms.lc.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {
    @Test
    void test() {
        LinkedListCycle lLC = new LinkedListCycle();
        ListNode l1n1 = new ListNode(1);
        ListNode l1n2 = new ListNode(2);
        l1n1.next = l1n2;
        assertFalse(lLC.hasCycle(l1n1));
        l1n2.next = l1n1;
        assertTrue(lLC.hasCycle(l1n1));
    }
}