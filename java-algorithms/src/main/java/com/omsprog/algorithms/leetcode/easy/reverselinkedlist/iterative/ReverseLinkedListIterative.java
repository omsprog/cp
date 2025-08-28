package com.omsprog.algorithms.leetcode.easy.reverselinkedlist.iterative;

import com.omsprog.algorithms.lc.ListNode;

public class ReverseLinkedListIterative {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        ListNode previousNode = null;
        ListNode currentNode = head;
        ListNode nextNode = null;

        while(currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }
}
