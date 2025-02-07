package com.omsprog.algorithms.lc;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;

        int numberOfElements = 0;
        ListNode pointer = head;

        // calculate the total number of elements
        for(int i = 0; pointer != null; i++) {
            ++numberOfElements;
            pointer = pointer.next;
        }

        int numberOfNodeToBeRemoved = numberOfElements - n;

        if (numberOfNodeToBeRemoved == 0)
            return head.next;

        pointer = head;

        for(int i = 1; i < numberOfNodeToBeRemoved;i++) {
            pointer = pointer.next;
        }

        pointer.next = pointer.next.next;

        return head;
    }
}