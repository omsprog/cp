package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedListTest {
    @Test
    void test() {
        OddEvenLinkedList oE = new OddEvenLinkedList();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode lr = oE.oddEvenList(l1);
        int[] r = new int[] {1,3,5,2,4};
        for(int i = 0; i < r.length; i++) {
            int ele = r[i];
            assertEquals(ele, lr.val);
            lr = lr.next;
        }
    }
}