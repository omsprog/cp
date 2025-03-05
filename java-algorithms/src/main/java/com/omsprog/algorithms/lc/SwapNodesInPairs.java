package com.omsprog.algorithms.lc;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode f = head;
        ListNode s = head.next;

        ListNode r  = swapPairs(s.next); // recursive call

        s.next = f;
        f.next = r;

        return s;
    }
}
