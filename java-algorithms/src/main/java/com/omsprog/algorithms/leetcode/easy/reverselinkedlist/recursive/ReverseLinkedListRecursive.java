package com.omsprog.algorithms.leetcode.easy.reverselinkedlist.recursive;

import com.omsprog.algorithms.lc.ListNode;

public class ReverseLinkedListRecursive {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
