package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLinkedListElementsTest {
    @Test
    void test() {
        RemoveLinkedListElements rL = new RemoveLinkedListElements();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));

        ListNode lr = rL.removeElements(l1, 6);
        int[] arr = new int[] {1,2,3,4,5};
        for(int ele : arr) {
            assertEquals(ele, l1.val);
            l1 = l1.next;
        }
    }
}