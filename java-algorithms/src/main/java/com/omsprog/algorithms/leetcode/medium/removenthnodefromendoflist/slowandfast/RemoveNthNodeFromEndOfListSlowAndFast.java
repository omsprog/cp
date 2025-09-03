package com.omsprog.algorithms.leetcode.medium.removenthnodefromendoflist.slowandfast;

import com.omsprog.algorithms.lc.ListNode;

public class RemoveNthNodeFromEndOfListSlowAndFast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        // move fast ptr
        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // remove first node
        if(fast == null)
            return head.next;

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
