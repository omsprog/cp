package com.omsprog.algorithms.lc;

public class MiddleOfTheLinkedListOptimal {
    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        while(second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }

        return first;
    }
}
