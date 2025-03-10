package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        Deque<ListNode> deque = new ArrayDeque<>();

        while(head != null) {
            deque.offer(head);
            head = head.next;
        }

        ListNode first = deque.removeFirst();
        ListNode last = null;

        boolean alternate = true;

        while(!deque.isEmpty()) {
            if(alternate) {
                last = deque.removeLast();
                first.next = last;
            } else {
                first = deque.removeFirst();
                last.next = first;
            }
            alternate = !alternate;
        }

        // 'alternate' is false when number of nodes is even
        // true when number of nodes is odd
        if(alternate) first.next = null;
        else last.next = null;
    }
}
