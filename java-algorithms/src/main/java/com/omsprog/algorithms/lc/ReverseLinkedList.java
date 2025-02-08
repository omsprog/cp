package com.omsprog.algorithms.lc;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode previous = null;
        ListNode current = head;
        ListNode next = current.next;

        while(true) {
            current.next = previous;
            // move pointers
            previous = current;
            if(next == null) break;
            current = next;
            next = next.next;
        }

        head = current;

        return head;
    }
}
