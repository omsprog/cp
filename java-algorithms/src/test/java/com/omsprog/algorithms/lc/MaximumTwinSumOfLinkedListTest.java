package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTwinSumOfLinkedListTest {
    @Test
    void test() {
        MaximumTwinSumOfLinkedList mT = new MaximumTwinSumOfLinkedList();
        assertEquals(6, mT.pairSum(new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))))));
        assertEquals(7, mT.pairSum(new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3))))));
    }
}