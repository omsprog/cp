package com.omsprog.algorithms.lc;

public class DeleteTheMiddleNodeOfLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        // count the number of items in the list
        int count = 0;
        ListNode pointer = head;

        while(pointer != null) {
            count++;
            pointer = pointer.next;
        }

        if(count == 1)
            return null;

        int middle = count / 2 - 1; // Get one item before middle
        pointer = head;
        count = 0;
        while(count != middle) {
            count++;
            pointer = pointer.next;
        }
        pointer.next = pointer.next.next;

        return head;
    }
}
