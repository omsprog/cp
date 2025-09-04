package com.omsprog.algorithms.leetcode.medium.mergenodesinbetweenzeros;

import com.omsprog.algorithms.lc.ListNode;

public class MergeNodesinBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode newHead = null;
        ListNode tail = null;
        int accum = 0;

        while(head != null) {
            if(head.val == 0 && accum != 0) {
                ListNode newNode = new ListNode(accum);
                if(newHead == null) {
                    newHead = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
                accum = 0;
            } else
                accum += head.val;

            head = head.next;
        }

        return newHead;
    }
}
