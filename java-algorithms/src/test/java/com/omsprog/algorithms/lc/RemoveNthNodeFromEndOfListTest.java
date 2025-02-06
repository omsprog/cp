package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {
    @Test
    void test() {
        ListNode l1n1 = new ListNode(1);
        ListNode l1n2 = new ListNode(2);
        ListNode l1n3 = new ListNode(3);
        ListNode l1n4 = new ListNode(4);
        ListNode l1n5 = new ListNode(5);

        l1n1.next = l1n2;
        l1n2.next = l1n3;
        l1n3.next = l1n4;
        l1n4.next = l1n5;

        RemoveNthNodeFromEndOfList rN = new RemoveNthNodeFromEndOfList();
        ListNode nR1 = rN.removeNthFromEnd(l1n1, 2);

        while(nR1 != null) {
            System.out.println(nR1.val);
            nR1 = nR1.next;
        }
    }
}