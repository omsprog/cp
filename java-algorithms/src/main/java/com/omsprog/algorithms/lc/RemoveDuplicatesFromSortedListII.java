package com.omsprog.algorithms.lc;

public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode newHead = null;
        ListNode newTail = null;

        while(head != null) {
            int currentValue = head.val;
            boolean hasDuplicates = false;
            while(head != null && head.next != null && head.next.val == currentValue) {
                hasDuplicates = true;
                head = head.next;
            }

            if(!hasDuplicates) {
                ListNode newNode = new ListNode(head.val);
                if(newHead == null) {
                    newTail = newNode;
                    newHead = newNode;
                } else {
                    newTail.next = newNode;
                    newTail = newTail.next;
                }
            }

            head = head.next;
        }

        return newHead;
    }
}
