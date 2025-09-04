package com.omsprog.algorithms.leetcode.easy.middleofthelinkedlist.fastandslow;

import com.omsprog.algorithms.lc.ListNode;

public class MiddleOfTheLinkedListFasAndSlow {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        // length is odd when fast.next is null
        // length is even when fast is null

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
