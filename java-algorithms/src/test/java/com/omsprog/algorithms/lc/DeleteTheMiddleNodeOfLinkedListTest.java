package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteTheMiddleNodeOfLinkedListTest {
    @Test
    void test() {
        DeleteTheMiddleNodeOfLinkedList dMN = new DeleteTheMiddleNodeOfLinkedList();
        dMN.deleteMiddle(new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(7, new ListNode(1, new ListNode(2, new ListNode(6, null))))))));
    }
}