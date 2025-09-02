package com.omsprog.algorithms.leetcode.medium.removenthnodefromendoflist;

import com.omsprog.algorithms.lc.ListNode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // calculate the length of the list
        int listLength = 0;
        ListNode ptr = head;
        while(ptr != null) {
            ptr = ptr.next;
            ++listLength;
        }

        int targetPosition = listLength - n;

        if(targetPosition == 0) return head.next;

        int currentPosition = 1;
        ptr = head;
        while(currentPosition != targetPosition) {
            ptr = ptr.next;
            ++currentPosition;
        }
        // skipping node
        ptr.next = ptr.next.next;
        return head;
    }
}